package ch.cnlab.fussball.coachassist.test.utils.dtos;

import android.test.AndroidTestCase;
import ch.cnlab.fussball.coachassist.utils.dtos.MembershipsDto;

public class MembershipsDtoTest extends AndroidTestCase {
	private String role;
	private String dateString;
	private int clubId;
	private int personId;

	protected void setUp() throws Exception {
		super.setUp();
		role = "Player";
		dateString = "January 1, 2012, 00:00:00 GMT";
		clubId = 22;
		personId = 33;
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testMembershipsDto() throws Exception {
		MembershipsDto result = new MembershipsDto(clubId, personId);
		assertNotNull(result);
		assertEquals(0, result.getId());
		assertEquals(role, result.getRole());
		assertEquals(null, result.getStart());
		assertEquals(null, result.getCreated_at());
		assertEquals(null, result.getUpdated_at());
		assertEquals(clubId, result.getClub_id());
		assertEquals(0, result.getDefault_jersey_number());
		assertEquals(null, result.getFinish());
		assertEquals(0, result.getLeague_id());
		assertEquals(personId, result.getPerson_id());
	}

	public void testGetClub_id() throws Exception {
		MembershipsDto fixture = new MembershipsDto(1, 1);
		fixture.setId(1);
		int result = fixture.getClub_id();
		assertEquals(1, result);
	}

	public void testGetCreated_at() throws Exception {
		MembershipsDto fixture = new MembershipsDto(1, 1);
		fixture.setCreated_at(dateString);
		String result = fixture.getCreated_at();
		assertEquals(dateString, result);
	}

	public void testGetDefault_jersey_number() throws Exception {
		MembershipsDto fixture = new MembershipsDto(1, 1);
		fixture.setDefault_jersey_number(1);
		int result = fixture.getDefault_jersey_number();
		assertEquals(1, result);
	}

	public void testGetFinish() throws Exception {
		MembershipsDto fixture = new MembershipsDto(1, 1);
		fixture.setFinish(dateString);
		String result = fixture.getFinish();
		assertEquals(dateString, result);
	}

	public void testGetId() throws Exception {
		MembershipsDto fixture = new MembershipsDto(1, 1);
		fixture.setId(1);
		int result = fixture.getId();
		assertEquals(1, result);
	}

	public void testGetLeague_id() throws Exception {
		MembershipsDto fixture = new MembershipsDto(1, 1);
		fixture.setLeague_id(1);
		int result = fixture.getLeague_id();
		assertEquals(1, result);
	}

	public void testGetPerson_id() throws Exception {
		MembershipsDto fixture = new MembershipsDto(1, 1);
		int result = fixture.getPerson_id();
		assertEquals(1, result);
	}

	public void testGetRole() throws Exception {
		MembershipsDto fixture = new MembershipsDto(1, 1);
		String result = fixture.getRole();
		assertEquals(role, result);
	}

	public void testGetStart() throws Exception {
		MembershipsDto fixture = new MembershipsDto(1, 1);
		fixture.setStart(dateString);
		String result = fixture.getStart();
		assertEquals(dateString, result);
	}

	public void testGetUpdated_at() throws Exception {
		MembershipsDto fixture = new MembershipsDto(1, 1);
		fixture.setUpdated_at(dateString);
		String result = fixture.getUpdated_at();
		assertEquals(dateString, result);
	}

	public void testSetClub_id() throws Exception {
		MembershipsDto fixture = new MembershipsDto(1, 1);
		fixture.setClub_id(clubId);
		int result = fixture.getClub_id();
		assertEquals(clubId, result);
	}

	public void testSetCreated_at() throws Exception {
		MembershipsDto fixture = new MembershipsDto(1, 1);
		fixture.setCreated_at(dateString);
		String result = fixture.getCreated_at();
		assertEquals(dateString, result);
	}

	public void testSetDefault_jersey_number() throws Exception {
		MembershipsDto fixture = new MembershipsDto(1, 1);
		fixture.setDefault_jersey_number(1);
		int result = fixture.getDefault_jersey_number();
		assertEquals(1, result);
	}

	public void testSetFinish() throws Exception {
		MembershipsDto fixture = new MembershipsDto(1, 1);
		fixture.setFinish(dateString);
		String result = fixture.getFinish();
		assertEquals(dateString, result);
	}

	public void testSetId() throws Exception {
		MembershipsDto fixture = new MembershipsDto(1, 1);
		fixture.setId(1);
		int result = fixture.getId();
		assertEquals(1, result);
	}

	public void testSetLeague_id() throws Exception {
		MembershipsDto fixture = new MembershipsDto(1, 1);
		fixture.setLeague_id(1);
		int result = fixture.getLeague_id();
		assertEquals(1, result);
	}

	public void testSetPerson_id() throws Exception {
		MembershipsDto fixture = new MembershipsDto(1, 1);
		fixture.setPerson_id(personId);
		int result = fixture.getPerson_id();
		assertEquals(personId, result);
	}

	public void testSetRole() throws Exception {
		MembershipsDto fixture = new MembershipsDto(1, 1);
		fixture.setRole("Not player");
		String result = fixture.getRole();
		assertEquals("Not player", result);
	}

	public void testSetStart() throws Exception {
		MembershipsDto fixture = new MembershipsDto(1, 1);
		fixture.setStart(dateString);
		String result = fixture.getStart();
		assertEquals(dateString, result);
	}

	public void testSetUpdated_at() throws Exception {
		MembershipsDto fixture = new MembershipsDto(1, 1);
		fixture.setUpdated_at(dateString);
		String result = fixture.getUpdated_at();
		assertEquals(dateString, result);
	}
}