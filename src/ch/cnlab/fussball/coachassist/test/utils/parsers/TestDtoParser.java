package ch.cnlab.fussball.coachassist.test.utils.parsers;

import android.test.AndroidTestCase;
import ch.cnlab.fussball.coachassist.utils.dtos.ClubDto;
import ch.cnlab.fussball.coachassist.utils.parsers.DtoParser;
import ch.cnlab.fussball.coachassist.vos.team.Club;
import ch.cnlab.fussball.coachassist.vos.team.Team;

public class TestDtoParser extends AndroidTestCase {
	private DtoParser dtoParser;

	protected void setUp() throws Exception {
		super.setUp();
		dtoParser = new DtoParser();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testGetClubDto() {
		String name = "Test team";
		Team team = new Team(name, new Club("Test club"));
		//ClubDto clubDto = dtoParser.getClubDto(team);
		//assertEquals(name, clubDto.getName());
	}
	
}
