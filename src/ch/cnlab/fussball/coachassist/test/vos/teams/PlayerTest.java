package ch.cnlab.fussball.coachassist.test.vos.teams;

import junit.framework.Assert;
import android.test.AndroidTestCase;
import ch.cnlab.fussball.coachassist.vos.team.Club;
import ch.cnlab.fussball.coachassist.vos.team.PlayPosition;
import ch.cnlab.fussball.coachassist.vos.team.Player;
import ch.cnlab.fussball.coachassist.vos.team.Team;

public class PlayerTest extends AndroidTestCase {
	private String firstName;
	private String lastName;
	private int jerseyNumber;
	private PlayPosition playPosition;
	private Club club;
	private Team team;

	protected void setUp() throws Exception {
		super.setUp();
		firstName = "Hans";
		lastName = "Hansen";
		jerseyNumber = 15;
		playPosition = new PlayPosition("Defense");
		club = new Club("FC Test");
		team = new Team("FC Test", club);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testDefaultConstructor() {
		Player player = new Player();
		Assert.assertNotNull(player);
	}

	public void testNameNumberConstructor() {
		Player player = new Player(firstName, lastName, team, jerseyNumber);
		Assert.assertNotNull(player);
		Assert.assertEquals(firstName, player.getFirstName());
		Assert.assertEquals(lastName, player.getLastName());
		Assert.assertEquals(jerseyNumber, player.getJerseyNumber());
		Assert.assertEquals(team.getName(), player.getTeam().getName());
	}
	
	public void testFullConstructor() {
		Player player = new Player(firstName, lastName, team, jerseyNumber,playPosition);
		Assert.assertNotNull(player);
		Assert.assertEquals(firstName, player.getFirstName());
		Assert.assertEquals(lastName, player.getLastName());
		Assert.assertEquals(jerseyNumber, player.getJerseyNumber());
		Assert.assertEquals(team.getName(), player.getTeam().getName());
		Assert.assertEquals(playPosition.getName(), player.getPlayPosition().getName());
	}

}
