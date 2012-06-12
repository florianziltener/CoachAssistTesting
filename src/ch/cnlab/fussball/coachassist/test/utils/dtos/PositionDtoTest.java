package ch.cnlab.fussball.coachassist.test.utils.dtos;

import android.test.AndroidTestCase;
import ch.cnlab.fussball.coachassist.utils.dtos.PositionDto;

public class PositionDtoTest extends AndroidTestCase {

	public void testGetCreated_at() throws Exception {
		PositionDto fixture = new PositionDto();
		String dateString = "January 1, 2012, 00:00:00 GMT";
		fixture.setCreated_at(dateString);
		String result = fixture.getCreated_at();
		assertEquals(dateString, result);
	}

	public void testGetId() throws Exception {
		PositionDto fixture = new PositionDto();
		fixture.setId(32);
		Number result = fixture.getId();
		assertNotNull(result);
		assertEquals(32, result);
	}

	public void testGetPlay_position() throws Exception {
		PositionDto fixture = new PositionDto();
		String pos = "Middle field";
		fixture.setPlay_position(pos);
		String result = fixture.getPlay_position();
		assertEquals(pos, result);
	}

	public void testGetUpdated_at() throws Exception {
		PositionDto fixture = new PositionDto();
		String dateString = "January 1, 2012, 00:00:00 GMT";
		fixture.setUpdated_at(dateString);
		String result = fixture.getUpdated_at();
		assertEquals(dateString, result);
	}

	public void testSetCreated_at() throws Exception {
		PositionDto fixture = new PositionDto();
		String dateString = "January 1, 2012, 00:00:00 GMT";
		fixture.setCreated_at(dateString);
		String result = fixture.getCreated_at();
		assertEquals(dateString, result);
	}

	public void testSetId() throws Exception {
		PositionDto fixture = new PositionDto();
		fixture.setId(32);
		Number result = fixture.getId();
		assertNotNull(result);
		assertEquals(32, result);
	}

	public void testSetPlay_position() throws Exception {
		PositionDto fixture = new PositionDto();
		String pos = "Middle field";
		fixture.setPlay_position(pos);
		String result = fixture.getPlay_position();
		assertEquals(pos, result);
	}

	public void testSetUpdated_ats() throws Exception {
		PositionDto fixture = new PositionDto();
		String dateString = "January 1, 2012, 00:00:00 GMT";
		fixture.setUpdated_at(dateString);
		String result = fixture.getUpdated_at();
		assertEquals(dateString, result);
	}

}