package ch.cnlab.fussball.coachassist.test.utils.dtos;

import android.test.AndroidTestCase;

import ch.cnlab.fussball.coachassist.utils.dtos.LeagueDto;

public class LeagueDtoTest extends AndroidTestCase {
	private String name;
	private String dateString;

	protected void setUp() throws Exception {
		super.setUp();
		name = "Test League";
		dateString = "January 1, 2012, 00:00:00 GMT";
	}

	public void testLeagueDto() throws Exception {
		LeagueDto result = new LeagueDto(name);
		assertNotNull(result);
		assertEquals(name, result.getName());
		assertEquals(0, result.getId());
		assertEquals(null, result.getUrl());
		assertEquals(null, result.getCreated_at());
		assertEquals(null, result.getUpdated_at());
	}

	public void testGetCreated_at() throws Exception {
		LeagueDto fixture = new LeagueDto(name);
		fixture.setCreated_at(dateString);
		String result = fixture.getCreated_at();
		assertEquals(dateString, result);
	}

	public void testGetId() throws Exception {
		LeagueDto fixture = new LeagueDto(name);
		fixture.setId(1);
		int result = fixture.getId();
		assertEquals(1, result);
	}

	public void testGetName() throws Exception {
		LeagueDto fixture = new LeagueDto(name);
		String result = fixture.getName();
		assertEquals(name, result);
	}

	public void testGetUpdated_at() throws Exception {
		LeagueDto fixture = new LeagueDto(name);
		fixture.setUpdated_at(dateString);
		String result = fixture.getUpdated_at();
		assertEquals(dateString, result);
	}

	public void testGetUrl() throws Exception {
		LeagueDto fixture = new LeagueDto(name);
		fixture.setUrl("www.test.ch");
		String result = fixture.getUrl();
		assertEquals("www.test.ch", result);
	}

	public void testSetCreated_at() throws Exception {
		LeagueDto fixture = new LeagueDto(name);
		fixture.setCreated_at(dateString);
		String result = fixture.getCreated_at();
		assertEquals(dateString, result);
	}

	public void testSetId() throws Exception {
		LeagueDto fixture = new LeagueDto(name);
		fixture.setId(1);
		int result = fixture.getId();
		assertEquals(1, result);
	}

	public void testSetName() throws Exception {
		LeagueDto fixture = new LeagueDto("asdf");
		fixture.setName(name);
		String result = fixture.getName();
		assertEquals(name, result);
	}

	public void testSetUpdated_at() throws Exception {
		LeagueDto fixture = new LeagueDto(name);
		fixture.setUpdated_at(dateString);
		String result = fixture.getUpdated_at();
		assertEquals(dateString, result);
	}

	public void testSetUrl() throws Exception {
		LeagueDto fixture = new LeagueDto(name);
		fixture.setUrl("www.test.ch");
		String result = fixture.getUrl();
		assertEquals("www.test.ch", result);
	}
}