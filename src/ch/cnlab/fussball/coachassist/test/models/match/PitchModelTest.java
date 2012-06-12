package ch.cnlab.fussball.coachassist.test.models.match;

import java.util.ArrayList;

import android.test.AndroidTestCase;
import ch.cnlab.fussball.coachassist.models.UserModel;
import ch.cnlab.fussball.coachassist.models.match.PitchModel;
import ch.cnlab.fussball.coachassist.test.faking.databasehelper.FakeDatabasehelper;
import ch.cnlab.fussball.coachassist.test.faking.databasehelper.FakeDatabasehelperForException;
import ch.cnlab.fussball.coachassist.vos.match.Pitch;

public class PitchModelTest extends AndroidTestCase {
	FakeDatabasehelper fakeDatabasehelper;
	FakeDatabasehelperForException fakeDatabasehelperForException;

	protected void setUp() throws Exception {
		super.setUp();
		fakeDatabasehelper = new FakeDatabasehelper(getContext());
		fakeDatabasehelperForException = new FakeDatabasehelperForException(getContext());
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testGetInstance() {
		PitchModel pitchModel = PitchModel.getInstance(getContext());
		assertNotNull(pitchModel);
		PitchModel pitchModel2 = PitchModel.getInstance(getContext());
		assertEquals(pitchModel, pitchModel2);
	}

	public void testCreatePitch() {
		PitchModel pitchModel = PitchModel.getInstance(getContext());
		pitchModel.setHelper(fakeDatabasehelper);
		Pitch pitch = new Pitch("test");
		pitchModel.createPitch(pitch);
		ArrayList<Pitch> pitches = pitchModel.getPitchesWithoutCnlabId();
		assertEquals(pitch, pitches.get(0));
	}

	public void testGetPitchesExceptionHandling() {
		PitchModel pitchModel = PitchModel.getInstance(getContext());
		pitchModel.setHelper(fakeDatabasehelperForException);
		assertEquals(0, pitchModel.getPitchesWithoutCnlabId().size());
	}

	public void testIdInDb() {
		PitchModel pitchModel = PitchModel.getInstance(getContext());
		pitchModel.setHelper(fakeDatabasehelper);
		Pitch pitch = new Pitch("test");
		pitchModel.createPitch(pitch);
		assertTrue(pitchModel.checkIdInDatabase(1));
		assertFalse(pitchModel.checkIdInDatabase(99999));
	}

	public void testPitchUpdate() {
		PitchModel pitchModel = PitchModel.getInstance(getContext());
		pitchModel.setHelper(fakeDatabasehelper);
		Pitch pitch = new Pitch("test");
		pitchModel.createPitch(pitch);
		pitchModel.updatePitch(pitch);
		ArrayList<Pitch> pitches = pitchModel.getPitchesWithoutCnlabId();
		assertEquals(pitch, pitches.get(0));
	}

}
