package ch.cnlab.fussball.coachassist.test.models.match;

import java.util.Date;
import java.util.List;

import android.test.AndroidTestCase;
import ch.cnlab.fussball.coachassist.models.ModelController;
import ch.cnlab.fussball.coachassist.models.match.MatchModel;
import ch.cnlab.fussball.coachassist.test.faking.databasehelper.FakeDatabasehelper;
import ch.cnlab.fussball.coachassist.test.faking.databasehelper.FakeDatabasehelperForException;
import ch.cnlab.fussball.coachassist.vos.match.GameType;
import ch.cnlab.fussball.coachassist.vos.match.Match;
import ch.cnlab.fussball.coachassist.vos.match.Weather;
import ch.cnlab.fussball.coachassist.vos.team.Club;
import ch.cnlab.fussball.coachassist.vos.team.Team;

public class MatchModelTest extends AndroidTestCase {
    private FakeDatabasehelper fakeDatabasehelper;
    private FakeDatabasehelperForException fakeDatabasehelperForException;
    private Club club;
    private Team teamA;
    private Team teamB;
    private ModelController modelController;

    protected void setUp() throws Exception {
        super.setUp();
        fakeDatabasehelper = new FakeDatabasehelper(getContext());
        fakeDatabasehelperForException = new FakeDatabasehelperForException(getContext());
        club = new Club("Test Club");
        teamA = new Team("teamA", club);
        teamB = new Team("teamB", club);
        modelController = ModelController.getInstance();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGetInstance() {
        MatchModel matchModel = modelController.getMatchModel(getContext());
        assertNotNull(matchModel);
        MatchModel matchModel2 = modelController.getMatchModel(getContext());
        assertEquals(matchModel, matchModel2);
    }

    public void testCreateMatch() {
        MatchModel matchModel = modelController.getMatchModel(getContext());
        matchModel.setHelper(fakeDatabasehelper);
        Match match = new Match("1234", teamA, teamB);
        matchModel.createMatch(match);
        List<Match> matches = matchModel.getAllMatchs();
        assertEquals(match, matches.get(0));
    }

    public void testGetMatchsExceptionHandling() {
        MatchModel matchModel = modelController.getMatchModel(getContext());
        matchModel.setHelper(fakeDatabasehelperForException);
        assertEquals(0, matchModel.getAllMatchs().size());
    }

    public void testGetUpcomingMatchs() {
        MatchModel matchModel = modelController.getMatchModel(getContext());
        matchModel.setHelper(fakeDatabasehelper);
        Match match = new Match("1234", teamA, teamB);
        match.setIsRecorded(false);
        matchModel.createMatch(match);
        List<Match> matches = matchModel.getUpcomingMatchs();
        assertEquals(match, matches.get(0));
    }

    public void testGetCompletedMatchs() {
        MatchModel matchModel = modelController.getMatchModel(getContext());
        matchModel.setHelper(fakeDatabasehelper);
        Match match = new Match("1234", teamA, teamB);
        match.setIsRecorded(true);
        matchModel.createMatch(match);
        List<Match> matches = matchModel.getCompletedMatchs();
        assertEquals(match, matches.get(0));
    }

    public void testMatchUpdate() {
        MatchModel matchModel = modelController.getMatchModel(getContext());
        matchModel.setHelper(fakeDatabasehelper);
        Match match = new Match("1234", teamA, teamB);
        matchModel.createMatch(match);
        matchModel.updateMatch(match);
        List<Match> matches = matchModel.getAllMatchs();
        assertEquals(match, matches.get(0));
    }

    public void testMatchDelete() {
        MatchModel matchModel = modelController.getMatchModel(getContext());
        matchModel.setHelper(fakeDatabasehelper);
        Match match1 = new Match("1234", teamA, teamB, new Date(), Weather.Rainy, GameType.indoor);
        Match match2 = new Match("41234", teamB, teamA, new Date(), Weather.Rainy, GameType.indoor);
        matchModel.createMatch(match1);
        matchModel.createMatch(match2);
        List<Match> matchs = matchModel.getAllMatchs();
        assertEquals(match1, matchs.get(0));
        assertEquals(match2, matchs.get(1));
        assertEquals(2, matchs.size());
        matchModel.deleteMatch(match1);
        assertEquals(1, matchModel.getAllMatchs().size());
        matchModel.deleteMatch(match2);
        assertEquals(0, matchModel.getAllMatchs().size());
    }

}
