package ch.cnlab.fussball.coachassist.test.models.match;

import java.util.ArrayList;

import android.test.AndroidTestCase;
import ch.cnlab.fussball.coachassist.models.ModelController;
import ch.cnlab.fussball.coachassist.models.UserModel;
import ch.cnlab.fussball.coachassist.models.match.PitchModel;
import ch.cnlab.fussball.coachassist.test.faking.databasehelper.FakeDatabasehelper;
import ch.cnlab.fussball.coachassist.test.faking.databasehelper.FakeDatabasehelperForException;
import ch.cnlab.fussball.coachassist.vos.match.Pitch;

public class PitchModelTest extends AndroidTestCase {
    private FakeDatabasehelper fakeDatabasehelper;
    private FakeDatabasehelperForException fakeDatabasehelperForException;
    private ModelController modelController;

    protected void setUp() throws Exception {
        super.setUp();
        fakeDatabasehelper = new FakeDatabasehelper(getContext());
        fakeDatabasehelperForException = new FakeDatabasehelperForException(getContext());
        modelController = ModelController.getInstance();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGetInstance() {
        PitchModel pitchModel = modelController.getPitchModel(getContext());
        assertNotNull(pitchModel);
        PitchModel pitchModel2 = modelController.getPitchModel(getContext());
        assertEquals(pitchModel, pitchModel2);
    }

    public void testCreatePitch() {
        PitchModel pitchModel = modelController.getPitchModel(getContext());
        pitchModel.setHelper(fakeDatabasehelper);
        Pitch pitch = new Pitch("test");
        pitchModel.createPitch(pitch);
        ArrayList<Pitch> pitches = pitchModel.getPitchesWithoutCnlabId();
        assertEquals(pitch, pitches.get(0));
    }

    public void testGetPitchesExceptionHandling() {
        PitchModel pitchModel = modelController.getPitchModel(getContext());
        pitchModel.setHelper(fakeDatabasehelperForException);
        assertEquals(0, pitchModel.getPitchesWithoutCnlabId().size());
    }

    public void testIdInDb() {
        PitchModel pitchModel = modelController.getPitchModel(getContext());
        pitchModel.setHelper(fakeDatabasehelper);
        Pitch pitch = new Pitch("test");
        pitchModel.createPitch(pitch);
        assertTrue(pitchModel.checkIdInDatabase(1));
        assertFalse(pitchModel.checkIdInDatabase(99999));
    }

    public void testPitchUpdate() {
        PitchModel pitchModel = modelController.getPitchModel(getContext());
        pitchModel.setHelper(fakeDatabasehelper);
        Pitch pitch = new Pitch("test");
        pitchModel.createPitch(pitch);
        pitchModel.updatePitch(pitch);
        ArrayList<Pitch> pitches = pitchModel.getPitchesWithoutCnlabId();
        assertEquals(pitch, pitches.get(0));
    }

}
