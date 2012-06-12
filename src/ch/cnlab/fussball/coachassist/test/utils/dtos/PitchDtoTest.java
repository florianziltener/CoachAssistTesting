package ch.cnlab.fussball.coachassist.test.utils.dtos;

import android.test.AndroidTestCase;
import ch.cnlab.fussball.coachassist.utils.dtos.PitchDto;

public class PitchDtoTest extends AndroidTestCase {
	private String name;
	private String dateString;
	private String pitchType;

	protected void setUp() throws Exception {
		super.setUp();
		name = "Testfield";
		dateString = "January 1, 2012, 00:00:00 GMT";
		pitchType = "sand";
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testPitchDto() throws Exception {
		PitchDto result = new PitchDto(name);
		assertNotNull(result);
		assertEquals(name, result.getName());
		assertEquals(0, result.getId());
		assertEquals(null, result.getCreated_at());
		assertEquals(null, result.getUpdated_at());
		assertEquals(null, result.getPitch_type());
		assertEquals(null, result.getVertex_1_latitude());
		assertEquals(null, result.getVertex_1_longitude());
		assertEquals(null, result.getVertex_2_latitude());
		assertEquals(null, result.getVertex_2_longitude());
		assertEquals(null, result.getVertex_3_latitude());
		assertEquals(null, result.getVertex_3_longitude());
		assertEquals(null, result.getVertex_4_latitude());
		assertEquals(null, result.getVertex_4_longitude());
	}

	public void testGetCreated_at() throws Exception {
		PitchDto fixture = new PitchDto(name);
		fixture.setCreated_at(dateString);
		String result = fixture.getCreated_at();
		assertEquals(dateString, result);
	}

	public void testGetId() throws Exception {
		PitchDto fixture = new PitchDto(name);
		fixture.setId(1);
		int result = fixture.getId();
		assertEquals(1, result);
	}

	public void testGetName() throws Exception {
		PitchDto fixture = new PitchDto(name);
		String result = fixture.getName();
		assertEquals(name, result);
	}

	public void testGetPitch_type() throws Exception {
		PitchDto fixture = new PitchDto(name);
		fixture.setPitch_type(pitchType);
		String result = fixture.getPitch_type();
		assertEquals(pitchType, result);
	}

	public void testGetUpdated_at() throws Exception {
		PitchDto fixture = new PitchDto(name);
		fixture.setUpdated_at(dateString);
		String result = fixture.getUpdated_at();
		assertEquals(dateString, result);
	}

	public void testGetVertex_1_latitude() throws Exception {
		PitchDto fixture = new PitchDto(name);
		fixture.setVertex_1_latitude("1");
		String result = fixture.getVertex_1_latitude();
		assertEquals("1", result);
	}

	public void testGetVertex_1_longitude() throws Exception {
		PitchDto fixture = new PitchDto(name);
		fixture.setVertex_1_longitude("1");
		String result = fixture.getVertex_1_longitude();
		assertEquals("1", result);
	}

	public void testGetVertex_2_latitude() throws Exception {
		PitchDto fixture = new PitchDto(name);
		fixture.setVertex_2_latitude("2");
		String result = fixture.getVertex_2_latitude();
		assertEquals("2", result);
	}

	public void testGetVertex_2_longitude_1() throws Exception {
		PitchDto fixture = new PitchDto(name);
		fixture.setVertex_2_longitude("2");
		String result = fixture.getVertex_2_longitude();
		assertEquals("2", result);
	}

	public void testGetVertex_3_latitude() throws Exception {
		PitchDto fixture = new PitchDto(name);
		fixture.setVertex_3_latitude("3");
		String result = fixture.getVertex_3_latitude();
		assertEquals("3", result);
	}

	public void testGetVertex_3_longitude() throws Exception {
		PitchDto fixture = new PitchDto(name);
		fixture.setVertex_3_longitude("3");
		String result = fixture.getVertex_3_longitude();
		assertEquals("3", result);
	}

	public void testGetVertex_4_latitude() throws Exception {
		PitchDto fixture = new PitchDto(name);
		fixture.setVertex_4_latitude("4");
		String result = fixture.getVertex_4_latitude();
		assertEquals("4", result);
	}

	public void testGetVertex_4_longitude_1() throws Exception {
		PitchDto fixture = new PitchDto(name);
		fixture.setVertex_4_longitude("4");
		String result = fixture.getVertex_4_longitude();
		assertEquals("4", result);
	}

	public void testSetCreated_at() throws Exception {
		PitchDto fixture = new PitchDto(name);
		fixture.setCreated_at(dateString);
		String result = fixture.getCreated_at();
		assertEquals(dateString, result);
	}

	public void testSetId() throws Exception {
		PitchDto fixture = new PitchDto(name);
		fixture.setId(1);
		int result = fixture.getId();
		assertEquals(1, result);
	}

	public void testSetName() throws Exception {
		PitchDto fixture = new PitchDto("wrong string");
		fixture.setName(name);
		String result = fixture.getName();
		assertEquals(name, result);
	}

	public void testSetPitch_type_1() throws Exception {
		PitchDto fixture = new PitchDto(name);
		fixture.setPitch_type(pitchType);
		String result = fixture.getPitch_type();
		assertEquals(pitchType, result);
	}

	public void testSetUpdated_at_1() throws Exception {
		PitchDto fixture = new PitchDto(name);
		fixture.setUpdated_at(dateString);
		String result = fixture.getUpdated_at();
		assertEquals(dateString, result);
	}

	public void testSetVertex_1_latitude() throws Exception {
		PitchDto fixture = new PitchDto(name);
		fixture.setVertex_1_latitude("1");
		String result = fixture.getVertex_1_latitude();
		assertEquals("1", result);
	}

	public void testSetVertex_1_longitude() throws Exception {
		PitchDto fixture = new PitchDto(name);
		fixture.setVertex_1_longitude("1");
		String result = fixture.getVertex_1_longitude();
		assertEquals("1", result);
	}

	public void testSetVertex_2_latitude() throws Exception {
		PitchDto fixture = new PitchDto(name);
		fixture.setVertex_2_latitude("2");
		String result = fixture.getVertex_2_latitude();
		assertEquals("2", result);
	}

	public void testSetVertex_2_longitude_1() throws Exception {
		PitchDto fixture = new PitchDto(name);
		fixture.setVertex_2_longitude("2");
		String result = fixture.getVertex_2_longitude();
		assertEquals("2", result);
	}

	public void testSetVertex_3_latitude() throws Exception {
		PitchDto fixture = new PitchDto(name);
		fixture.setVertex_3_latitude("3");
		String result = fixture.getVertex_3_latitude();
		assertEquals("3", result);
	}

	public void testSetVertex_3_longitude() throws Exception {
		PitchDto fixture = new PitchDto(name);
		fixture.setVertex_3_longitude("3");
		String result = fixture.getVertex_3_longitude();
		assertEquals("3", result);
	}

	public void testSetVertex_4_latitude() throws Exception {
		PitchDto fixture = new PitchDto(name);
		fixture.setVertex_4_latitude("4");
		String result = fixture.getVertex_4_latitude();
		assertEquals("4", result);
	}

	public void testSetVertex_4_longitude_1() throws Exception {
		PitchDto fixture = new PitchDto(name);
		fixture.setVertex_4_longitude("4");
		String result = fixture.getVertex_4_longitude();
		assertEquals("4", result);
	}
}