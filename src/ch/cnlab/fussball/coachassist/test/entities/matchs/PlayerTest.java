//package ch.cnlab.fussball.coachassist.test.entities.matchs;
//
//import java.text.DateFormat;
//import java.util.Date;
//
//import android.test.AndroidTestCase;
//import ch.cnlab.fussball.coachassist.entities.teams.Assignment;
//import ch.cnlab.fussball.coachassist.entities.teams.PlayPosition;
//import ch.cnlab.fussball.coachassist.entities.teams.Player;
//import ch.cnlab.fussball.coachassist.entities.teams.Team;
//
//import com.j256.ormlite.dao.ForeignCollection;
//
///**
// * The class <code>PlayerTest</code> contains tests for the class
// * <code>{@link Player}</code>.
// * 
// * @generatedBy CodePro at 5/29/12 9:13 PM
// * @author FlorianZiltener
// * @version $Revision: 1.0 $
// */
//public class PlayerTest extends AndroidTestCase {
//	/**
//	 * Run the Player() constructor test.
//	 * 
//	 * @throws Exception
//	 * 
//	 * @generatedBy CodePro at 5/29/12 9:13 PM
//	 */
//
//	public void testPlayer_1() throws Exception {
//
//		Player result = new Player();
//
//		// add additional test code here
//		assertNotNull(result);
//		assertEquals(0, result.getId());
//		assertEquals(null, result.getCreatedAt());
//		assertEquals(null, result.getUpdatedAt());
//		assertEquals(null, result.getFirstName());
//		assertEquals(null, result.getLastName());
//		assertEquals(0, result.getJerseyNumber());
//		assertEquals(null, result.getPlayPosition());
//		assertEquals(null, result.getTeam());
//		assertEquals(null, result.getAssignments());
//		assertEquals(0, result.getCnlabId());
//	}
//
//	/**
//	 * Run the Player(String,String,Team) constructor test.
//	 * 
//	 * @throws Exception
//	 * 
//	 * @generatedBy CodePro at 5/29/12 9:13 PM
//	 */
//
//	public void testPlayer_2() throws Exception {
//		String firstName = "";
//		String lastName = "";
//		Team team = new Team();
//
//		Player result = new Player(firstName, lastName, team);
//
//		// add additional test code here
//		assertNotNull(result);
//		assertEquals(0, result.getId());
//		assertEquals(null, result.getCreatedAt());
//		assertEquals(null, result.getUpdatedAt());
//		assertEquals("", result.getFirstName());
//		assertEquals("", result.getLastName());
//		assertEquals(0, result.getJerseyNumber());
//		assertEquals(null, result.getPlayPosition());
//		assertEquals(null, result.getAssignments());
//		assertEquals(0, result.getCnlabId());
//	}
//
//	/**
//	 * Run the Player(String,String,Team,int) constructor test.
//	 * 
//	 * @throws Exception
//	 * 
//	 * @generatedBy CodePro at 5/29/12 9:13 PM
//	 */
//
//	public void testPlayer_3() throws Exception {
//		String firstName = "";
//		String lastName = "";
//		Team team = new Team();
//		int jerseyNumber = 1;
//
//		Player result = new Player(firstName, lastName, team, jerseyNumber);
//
//		// add additional test code here
//		assertNotNull(result);
//		assertEquals(0, result.getId());
//		assertEquals(null, result.getCreatedAt());
//		assertEquals(null, result.getUpdatedAt());
//		assertEquals("", result.getFirstName());
//		assertEquals("", result.getLastName());
//		assertEquals(1, result.getJerseyNumber());
//		assertEquals(null, result.getPlayPosition());
//		assertEquals(null, result.getAssignments());
//		assertEquals(0, result.getCnlabId());
//	}
//
//	/**
//	 * Run the Player(String,String,Team,int,PlayPosition) constructor test.
//	 * 
//	 * @throws Exception
//	 * 
//	 * @generatedBy CodePro at 5/29/12 9:13 PM
//	 */
//
//	public void testPlayer_4() throws Exception {
//		String firstName = "";
//		String lastName = "";
//		Team team = new Team();
//		int jerseyNumber = 1;
//		PlayPosition playPosition = new PlayPosition();
//
//		Player result = new Player(firstName, lastName, team, jerseyNumber, playPosition);
//
//		// add additional test code here
//		assertNotNull(result);
//		assertEquals(0, result.getId());
//		assertEquals(null, result.getCreatedAt());
//		assertEquals(null, result.getUpdatedAt());
//		assertEquals("", result.getFirstName());
//		assertEquals("", result.getLastName());
//		assertEquals(1, result.getJerseyNumber());
//		assertEquals(null, result.getAssignments());
//		assertEquals(0, result.getCnlabId());
//	}
//
//	/**
//	 * Run the boolean equals(Object) method test.
//	 * 
//	 * @throws Exception
//	 * 
//	 * @generatedBy CodePro at 5/29/12 9:13 PM
//	 */
//
//	public void testEquals_1() throws Exception {
//		Player fixture = new Player("", "", new Team(), 1);
//		fixture.setUpdatedAt(new Date());
//		fixture.setCreatedAt(new Date());
//		fixture.setPlayPosition(new PlayPosition());
//		fixture.setCnlabId(1);
//		Object player = null;
//
//		boolean result = fixture.equals(player);
//
//		// add additional test code here
//		assertEquals(false, result);
//	}
//
//	/**
//	 * Run the boolean equals(Object) method test.
//	 * 
//	 * @throws Exception
//	 * 
//	 * @generatedBy CodePro at 5/29/12 9:13 PM
//	 */
//
//	public void testEquals_2() throws Exception {
//		Player fixture = new Player("", "", new Team(), 1);
//		fixture.setUpdatedAt(new Date());
//		fixture.setCreatedAt(new Date());
//		fixture.setPlayPosition(new PlayPosition());
//		fixture.setCnlabId(1);
//		Object player = new Object();
//
//		boolean result = fixture.equals(player);
//
//		// add additional test code here
//		assertEquals(false, result);
//	}
//
//	/**
//	 * Run the boolean equals(Object) method test.
//	 * 
//	 * @throws Exception
//	 * 
//	 * @generatedBy CodePro at 5/29/12 9:13 PM
//	 */
//
//	public void testEquals_3() throws Exception {
//		Player fixture = new Player("", "", new Team(), 1);
//		fixture.setUpdatedAt(new Date());
//		fixture.setCreatedAt(new Date());
//		fixture.setPlayPosition(new PlayPosition());
//		fixture.setCnlabId(1);
//		Object player = new Player("", "", new Team(), 1);
//
//		boolean result = fixture.equals(player);
//
//		// add additional test code here
//		assertEquals(true, result);
//	}
//
//	/**
//	 * Run the boolean equals(Object) method test.
//	 * 
//	 * @throws Exception
//	 * 
//	 * @generatedBy CodePro at 5/29/12 9:13 PM
//	 */
//	public void testEquals_4() throws Exception {
//		Player fixture = new Player("", "", new Team(), 1);
//		fixture.setUpdatedAt(new Date());
//		fixture.setCreatedAt(new Date());
//		fixture.setPlayPosition(new PlayPosition());
//		fixture.setCnlabId(1);
//		Object player = new Player("", "", new Team(), 1);
//
//		boolean result = fixture.equals(player);
//
//		// add additional test code here
//		assertEquals(true, result);
//	}
//
//	/**
//	 * Run the ForeignCollection<Assignment> getAssignments() method test.
//	 * 
//	 * @throws Exception
//	 * 
//	 * @generatedBy CodePro at 5/29/12 9:13 PM
//	 */
//	public void testGetAssignments_1() throws Exception {
//		Player fixture = new Player("", "", new Team(), 1);
//		fixture.setUpdatedAt(new Date());
//		fixture.setCreatedAt(new Date());
//		fixture.setPlayPosition(new PlayPosition());
//		fixture.setCnlabId(1);
//
//		ForeignCollection<Assignment> result = fixture.getAssignments();
//
//		// add additional test code here
//		assertEquals(null, result);
//	}
//
//	/**
//	 * Run the int getCnlabId() method test.
//	 * 
//	 * @throws Exception
//	 * 
//	 * @generatedBy CodePro at 5/29/12 9:13 PM
//	 */
//
//	public void testGetCnlabId_1() throws Exception {
//		Player fixture = new Player("", "", new Team(), 1);
//		fixture.setUpdatedAt(new Date());
//		fixture.setCreatedAt(new Date());
//		fixture.setPlayPosition(new PlayPosition());
//		fixture.setCnlabId(1);
//
//		int result = fixture.getCnlabId();
//
//		// add additional test code here
//		assertEquals(1, result);
//	}
//
//	/**
//	 * Run the Date getCreatedAt() method test.
//	 * 
//	 * @throws Exception
//	 * 
//	 * @generatedBy CodePro at 5/29/12 9:13 PM
//	 */
//
//	public void testGetCreatedAt_1() throws Exception {
//		Player fixture = new Player("", "", new Team(), 1);
//		fixture.setUpdatedAt(new Date());
//		fixture.setCreatedAt(new Date());
//		fixture.setPlayPosition(new PlayPosition());
//		fixture.setCnlabId(1);
//
//		Date result = fixture.getCreatedAt();
//
//		// add additional test code here
//		assertNotNull(result);
//		assertEquals(DateFormat.getInstance().format(new Date(1338318834498L)), DateFormat.getInstance().format(result));
//		assertEquals(1338318834498L, result.getTime());
//	}
//
//	/**
//	 * Run the String getFirstName() method test.
//	 * 
//	 * @throws Exception
//	 * 
//	 * @generatedBy CodePro at 5/29/12 9:13 PM
//	 */
//
//	public void testGetFirstName_1() throws Exception {
//		Player fixture = new Player("", "", new Team(), 1);
//		fixture.setUpdatedAt(new Date());
//		fixture.setCreatedAt(new Date());
//		fixture.setPlayPosition(new PlayPosition());
//		fixture.setCnlabId(1);
//
//		String result = fixture.getFirstName();
//
//		// add additional test code here
//		assertEquals("", result);
//	}
//
//	/**
//	 * Run the int getId() method test.
//	 * 
//	 * @throws Exception
//	 * 
//	 * @generatedBy CodePro at 5/29/12 9:13 PM
//	 */
//
//	public void testGetId_1() throws Exception {
//		Player fixture = new Player("", "", new Team(), 1);
//		fixture.setUpdatedAt(new Date());
//		fixture.setCreatedAt(new Date());
//		fixture.setPlayPosition(new PlayPosition());
//		fixture.setCnlabId(1);
//
//		int result = fixture.getId();
//
//		// add additional test code here
//		assertEquals(0, result);
//	}
//
//	/**
//	 * Run the int getJerseyNumber() method test.
//	 * 
//	 * @throws Exception
//	 * 
//	 * @generatedBy CodePro at 5/29/12 9:13 PM
//	 */
//
//	public void testGetJerseyNumber_1() throws Exception {
//		Player fixture = new Player("", "", new Team(), 1);
//		fixture.setUpdatedAt(new Date());
//		fixture.setCreatedAt(new Date());
//		fixture.setPlayPosition(new PlayPosition());
//		fixture.setCnlabId(1);
//
//		int result = fixture.getJerseyNumber();
//
//		// add additional test code here
//		assertEquals(1, result);
//	}
//
//	/**
//	 * Run the String getLastName() method test.
//	 * 
//	 * @throws Exception
//	 * 
//	 * @generatedBy CodePro at 5/29/12 9:13 PM
//	 */
//
//	public void testGetLastName_1() throws Exception {
//		Player fixture = new Player("", "", new Team(), 1);
//		fixture.setUpdatedAt(new Date());
//		fixture.setCreatedAt(new Date());
//		fixture.setPlayPosition(new PlayPosition());
//		fixture.setCnlabId(1);
//
//		String result = fixture.getLastName();
//
//		// add additional test code here
//		assertEquals("", result);
//	}
//
//	/**
//	 * Run the PlayPosition getPlayPosition() method test.
//	 * 
//	 * @throws Exception
//	 * 
//	 * @generatedBy CodePro at 5/29/12 9:13 PM
//	 */
//
//	public void testGetPlayPosition_1() throws Exception {
//		Player fixture = new Player("", "", new Team(), 1);
//		fixture.setUpdatedAt(new Date());
//		fixture.setCreatedAt(new Date());
//		fixture.setPlayPosition(new PlayPosition());
//		fixture.setCnlabId(1);
//
//		PlayPosition result = fixture.getPlayPosition();
//
//		// add additional test code here
//		assertNotNull(result);
//		assertEquals(null, result.toString());
//		assertEquals(null, result.getName());
//		assertEquals(0, result.getId());
//	}
//
//	/**
//	 * Run the Team getTeam() method test.
//	 * 
//	 * @throws Exception
//	 * 
//	 * @generatedBy CodePro at 5/29/12 9:13 PM
//	 */
//
//	public void testGetTeam_1() throws Exception {
//		Player fixture = new Player("", "", new Team(), 1);
//		fixture.setUpdatedAt(new Date());
//		fixture.setCreatedAt(new Date());
//		fixture.setPlayPosition(new PlayPosition());
//		fixture.setCnlabId(1);
//
//		Team result = fixture.getTeam();
//
//		// add additional test code here
//		assertNotNull(result);
//		assertEquals(null, result.toString());
//		assertEquals(null, result.getName());
//		assertEquals(0, result.getId());
//		assertEquals(null, result.getCreatedAt());
//		assertEquals(null, result.getUpdatedAt());
//		assertEquals(0, result.getCnlabId());
//		assertEquals(null, result.getClub());
//		assertEquals(null, result.getPlayers());
//		assertEquals(null, result.getLeague());
//	}
//
//	/**
//	 * Run the Date getUpdatedAt() method test.
//	 * 
//	 * @throws Exception
//	 * 
//	 * @generatedBy CodePro at 5/29/12 9:13 PM
//	 */
//
//	public void testGetUpdatedAt_1() throws Exception {
//		Player fixture = new Player("", "", new Team(), 1);
//		fixture.setUpdatedAt(new Date());
//		fixture.setCreatedAt(new Date());
//		fixture.setPlayPosition(new PlayPosition());
//		fixture.setCnlabId(1);
//
//		Date result = fixture.getUpdatedAt();
//
//		// add additional test code here
//		assertNotNull(result);
//		assertEquals(DateFormat.getInstance().format(new Date(1338318834465L)), DateFormat.getInstance().format(result));
//		assertEquals(1338318834465L, result.getTime());
//	}
//
//	/**
//	 * Run the int hashCode() method test.
//	 * 
//	 * @throws Exception
//	 * 
//	 * @generatedBy CodePro at 5/29/12 9:13 PM
//	 */
//
//	public void testHashCode_1() throws Exception {
//		Player fixture = new Player("", "", new Team(), 1);
//		fixture.setUpdatedAt(new Date());
//		fixture.setCreatedAt(new Date());
//		fixture.setPlayPosition(new PlayPosition());
//		fixture.setCnlabId(1);
//
//		int result = fixture.hashCode();
//
//		// add additional test code here
//		assertEquals(0, result);
//	}
//
//	/**
//	 * Run the void setCnlabId(int) method test.
//	 * 
//	 * @throws Exception
//	 * 
//	 * @generatedBy CodePro at 5/29/12 9:13 PM
//	 */
//
//	public void testSetCnlabId_1() throws Exception {
//		Player fixture = new Player("", "", new Team(), 1);
//		fixture.setUpdatedAt(new Date());
//		fixture.setCreatedAt(new Date());
//		fixture.setPlayPosition(new PlayPosition());
//		fixture.setCnlabId(1);
//		int cnlabId = 1;
//
//		fixture.setCnlabId(cnlabId);
//
//		// add additional test code here
//	}
//
//	/**
//	 * Run the void setCreatedAt(Date) method test.
//	 * 
//	 * @throws Exception
//	 * 
//	 * @generatedBy CodePro at 5/29/12 9:13 PM
//	 */
//
//	public void testSetCreatedAt_1() throws Exception {
//		Player fixture = new Player("", "", new Team(), 1);
//		fixture.setUpdatedAt(new Date());
//		fixture.setCreatedAt(new Date());
//		fixture.setPlayPosition(new PlayPosition());
//		fixture.setCnlabId(1);
//		Date createdAt = new Date();
//
//		fixture.setCreatedAt(createdAt);
//
//		// add additional test code here
//	}
//
//	/**
//	 * Run the void setFirstName(String) method test.
//	 * 
//	 * @throws Exception
//	 * 
//	 * @generatedBy CodePro at 5/29/12 9:13 PM
//	 */
//
//	public void testSetFirstName_1() throws Exception {
//		Player fixture = new Player("", "", new Team(), 1);
//		fixture.setUpdatedAt(new Date());
//		fixture.setCreatedAt(new Date());
//		fixture.setPlayPosition(new PlayPosition());
//		fixture.setCnlabId(1);
//		String firstName = "";
//
//		fixture.setFirstName(firstName);
//
//		// add additional test code here
//	}
//
//	/**
//	 * Run the void setJerseyNumber(int) method test.
//	 * 
//	 * @throws Exception
//	 * 
//	 * @generatedBy CodePro at 5/29/12 9:13 PM
//	 */
//
//	public void testSetJerseyNumber_1() throws Exception {
//		Player fixture = new Player("", "", new Team(), 1);
//		fixture.setUpdatedAt(new Date());
//		fixture.setCreatedAt(new Date());
//		fixture.setPlayPosition(new PlayPosition());
//		fixture.setCnlabId(1);
//		int jerseyNumber = 1;
//
//		fixture.setJerseyNumber(jerseyNumber);
//
//		// add additional test code here
//	}
//
//	/**
//	 * Run the void setLastName(String) method test.
//	 * 
//	 * @throws Exception
//	 * 
//	 * @generatedBy CodePro at 5/29/12 9:13 PM
//	 */
//
//	public void testSetLastName_1() throws Exception {
//		Player fixture = new Player("", "", new Team(), 1);
//		fixture.setUpdatedAt(new Date());
//		fixture.setCreatedAt(new Date());
//		fixture.setPlayPosition(new PlayPosition());
//		fixture.setCnlabId(1);
//		String lastName = "";
//
//		fixture.setLastName(lastName);
//
//		// add additional test code here
//	}
//
//	/**
//	 * Run the void setPlayPosition(PlayPosition) method test.
//	 * 
//	 * @throws Exception
//	 * 
//	 * @generatedBy CodePro at 5/29/12 9:13 PM
//	 */
//
//	public void testSetPlayPosition_1() throws Exception {
//		Player fixture = new Player("", "", new Team(), 1);
//		fixture.setUpdatedAt(new Date());
//		fixture.setCreatedAt(new Date());
//		fixture.setPlayPosition(new PlayPosition());
//		fixture.setCnlabId(1);
//		PlayPosition playPosition = new PlayPosition();
//
//		fixture.setPlayPosition(playPosition);
//
//		// add additional test code here
//	}
//
//	/**
//	 * Run the void setTeam(Team) method test.
//	 * 
//	 * @throws Exception
//	 * 
//	 * @generatedBy CodePro at 5/29/12 9:13 PM
//	 */
//
//	public void testSetTeam_1() throws Exception {
//		Player fixture = new Player("", "", new Team(), 1);
//		fixture.setUpdatedAt(new Date());
//		fixture.setCreatedAt(new Date());
//		fixture.setPlayPosition(new PlayPosition());
//		fixture.setCnlabId(1);
//		Team team = new Team();
//
//		fixture.setTeam(team);
//
//		// add additional test code here
//	}
//
//	/**
//	 * Run the void setUpdatedAt(Date) method test.
//	 * 
//	 * @throws Exception
//	 * 
//	 * @generatedBy CodePro at 5/29/12 9:13 PM
//	 */
//
//	public void testSetUpdatedAt_1() throws Exception {
//		Player fixture = new Player("", "", new Team(), 1);
//		fixture.setUpdatedAt(new Date());
//		fixture.setCreatedAt(new Date());
//		fixture.setPlayPosition(new PlayPosition());
//		fixture.setCnlabId(1);
//		Date updatedAt = new Date();
//
//		fixture.setUpdatedAt(updatedAt);
//
//		// add additional test code here
//	}
//
//	/**
//	 * Run the String toString() method test.
//	 * 
//	 * @throws Exception
//	 * 
//	 * @generatedBy CodePro at 5/29/12 9:13 PM
//	 */
//
//	public void testToString_1() throws Exception {
//		Player fixture = new Player("", "", new Team(), 1);
//		fixture.setUpdatedAt(new Date());
//		fixture.setCreatedAt(new Date());
//		fixture.setPlayPosition(new PlayPosition());
//		fixture.setCnlabId(1);
//
//		String result = fixture.toString();
//
//		// add additional test code here
//		// An unexpected exception was thrown in user code while executing this
//		// test:
//		// java.lang.StringIndexOutOfBoundsException: String index out of range:
//		// 1
//		// at java.lang.String.substring(String.java:1934)
//		// at
//		// ch.cnlab.fussball.coachassist.entities.teams.Player.toString(Player.java:145)
//		assertNotNull(result);
//	}
//
//	/**
//	 * Perform pre-test initialization.
//	 * 
//	 * @throws Exception
//	 *             if the initialization fails for some reason
//	 * 
//	 * @generatedBy CodePro at 5/29/12 9:13 PM
//	 */
//	public void setUp() throws Exception {
//		// add additional set up code here
//	}
//
//	/**
//	 * Perform post-test clean-up.
//	 * 
//	 * @throws Exception
//	 *             if the clean-up fails for some reason
//	 * 
//	 * @generatedBy CodePro at 5/29/12 9:13 PM
//	 */
//	public void tearDown() throws Exception {
//		// Add additional tear down code here
//	}
//
//}