package ch.cnlab.fussball.coachassist.test.utils.dtos;

import android.test.AndroidTestCase;
import ch.cnlab.fussball.coachassist.utils.dtos.PeopleDto;

public class PeopleDtoTest extends AndroidTestCase {
	private String firstName;
	private String lastName;
	private String dateString;

	protected void setUp() throws Exception {
		super.setUp();
		firstName = "Hans";
		lastName = "Test";
		dateString = "January 1, 2012, 00:00:00 GMT";
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testPeopleDto() throws Exception {
		PeopleDto result = new PeopleDto(firstName, lastName);
		assertNotNull(result);
		assertEquals(0, result.getId());
		assertEquals(null, result.getCreated_at());
		assertEquals(null, result.getUpdated_at());
		assertEquals(firstName, result.getFirst_name());
		assertEquals(lastName, result.getLast_name());
	}

	public void testGetCreated_at() throws Exception {
		PeopleDto fixture = new PeopleDto(firstName, lastName);
		fixture.setCreated_at(dateString);
		String result = fixture.getCreated_at();
		assertEquals(dateString, result);
	}

	public void testGetFirst_name() throws Exception {
		PeopleDto fixture = new PeopleDto(firstName, lastName);
		String result = fixture.getFirst_name();
		assertEquals(firstName, result);
	}

	public void testGetId() throws Exception {
		PeopleDto fixture = new PeopleDto(firstName, lastName);
		fixture.setId(1);
		int result = fixture.getId();
		assertEquals(1, result);
	}

	public void testGetLast_name() throws Exception {
		PeopleDto fixture = new PeopleDto(firstName, lastName);
		String result = fixture.getLast_name();
		assertEquals(lastName, result);
	}

	public void testGetUpdated_at() throws Exception {
		PeopleDto fixture = new PeopleDto(firstName, lastName);
		fixture.setUpdated_at(dateString);
		String result = fixture.getUpdated_at();
		assertEquals(dateString, result);
	}

	public void testSetCreated_at() throws Exception {
		PeopleDto fixture = new PeopleDto(firstName, lastName);
		fixture.setCreated_at(dateString);
		String result = fixture.getCreated_at();
		assertEquals(dateString, result);
	}

	public void testSetFirst_name() throws Exception {
		PeopleDto fixture = new PeopleDto(firstName, lastName);
		String result = fixture.getFirst_name();
		assertEquals(firstName, result);
	}

	public void testSetId() throws Exception {
		PeopleDto fixture = new PeopleDto(firstName, lastName);
		fixture.setId(1);
		int result = fixture.getId();
		assertEquals(1, result);
	}

	public void testSetLast_name() throws Exception {
		PeopleDto fixture = new PeopleDto(firstName, lastName);
		String result = fixture.getLast_name();
		assertEquals(lastName, result);
	}

	public void testSetUpdated_at() throws Exception {
		PeopleDto fixture = new PeopleDto(firstName, lastName);
		fixture.setUpdated_at(dateString);
		String result = fixture.getUpdated_at();
		assertEquals(dateString, result);
	}

}