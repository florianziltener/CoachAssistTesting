package ch.cnlab.fussball.coachassist.test.models.team;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.j256.ormlite.dao.ForeignCollection;

import android.test.AndroidTestCase;
import ch.cnlab.fussball.coachassist.models.team.AssignmentModel;
import ch.cnlab.fussball.coachassist.test.faking.databasehelper.FakeDatabasehelper;
import ch.cnlab.fussball.coachassist.test.faking.databasehelper.FakeDatabasehelperForException;
import ch.cnlab.fussball.coachassist.vos.match.GameType;
import ch.cnlab.fussball.coachassist.vos.match.Match;
import ch.cnlab.fussball.coachassist.vos.match.Weather;
import ch.cnlab.fussball.coachassist.vos.team.Assignment;
import ch.cnlab.fussball.coachassist.vos.team.Club;
import ch.cnlab.fussball.coachassist.vos.team.Player;
import ch.cnlab.fussball.coachassist.vos.team.Team;

public class AssignmentModelTest extends AndroidTestCase {
	private FakeDatabasehelper fakeDatabasehelper;
	private FakeDatabasehelperForException fakeDatabasehelperForException;
	private Club club;
	private Team teamA;
	private Team teamB;
	private Player playerA;
	private Player playerB;
	private Match match;

	protected void setUp() throws Exception {
		super.setUp();
		fakeDatabasehelper = new FakeDatabasehelper(getContext());
		fakeDatabasehelperForException = new FakeDatabasehelperForException(getContext());
		club = new Club("Test Club");
		teamA = new Team("teamA", club);
		teamB = new Team("teamB", club);
		playerA = new Player("Hans", "Test", teamA);
		playerB = new Player("Karl", "Test", teamB);
		match = new Match("1234", teamA, teamB, new Date(), Weather.Rain, GameType.indoor);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testGetInstance() {
		AssignmentModel assignmentModel = AssignmentModel.getInstance(getContext());
		assertNotNull(assignmentModel);
		AssignmentModel assignmentModel2 = AssignmentModel.getInstance(getContext());
		assertEquals(assignmentModel, assignmentModel2);
	}

	public void testCreateAssignment() {
		AssignmentModel assignmentModel = AssignmentModel.getInstance(getContext());
		assignmentModel.setHelper(fakeDatabasehelper);
		Assignment assignment = new Assignment(playerA, match, 1, new Date());
		assignmentModel.createAssignment(assignment);
		Assignment assignment2 = assignmentModel.getAssignmentOfPlayerByMatch(playerA, match);
		assertEquals(assignment, assignment2);
	}

	public void testGetAssignmentsExceptionHandling() {
		AssignmentModel assignmentModel = AssignmentModel.getInstance(getContext());
		assignmentModel.setHelper(fakeDatabasehelperForException);
		assertNull(assignmentModel.getAssignmentOfPlayerByMatch(playerB, match));
	}

	@SuppressWarnings("unchecked")
	public void testGetAssignments() {
		AssignmentModel assignmentModel = AssignmentModel.getInstance(getContext());
		assignmentModel.setHelper(fakeDatabasehelper);
		Assignment assignment1 = new Assignment(playerA, match, 1, new Date());
		Assignment assignment2 = new Assignment(playerB, match, 1, new Date());
		assignmentModel.createAssignment(assignment1);
		assignmentModel.createAssignment(assignment2);
		Assignment assignment3 = assignmentModel.getAssignmentOfPlayerByMatch(playerA, match);
		assertEquals(assignment1, assignment3);
		Assignment assignment4 = assignmentModel.getAssignmentOfPlayerByMatch(playerB, match);
		assertEquals(assignment2, assignment4);
	}
	
	public void testGetAssignmentsNull() {
		AssignmentModel assignmentModel = AssignmentModel.getInstance(getContext());
		assignmentModel.setHelper(fakeDatabasehelper);
		Assignment assignment = new Assignment(playerA, match, 1, new Date());
		assignmentModel.createAssignment(assignment);
		Assignment assignment2 = assignmentModel.getAssignmentOfPlayerByMatch(playerA, match);
		assertEquals(assignment, assignment2);
	}

	public void testAssignmentUpdate() {
		AssignmentModel assignmentModel = AssignmentModel.getInstance(getContext());
		assignmentModel.setHelper(fakeDatabasehelper);
		Assignment assignment = new Assignment(playerA, match, 1, new Date());
		assignmentModel.createAssignment(assignment);
		assignmentModel.updateAssignment(assignment);
		Assignment assignment2 = assignmentModel.getAssignmentOfPlayerByMatch(playerA, match);
		assertEquals(assignment, assignment2);
	}



}
