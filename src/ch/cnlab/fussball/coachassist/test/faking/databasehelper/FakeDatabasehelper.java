package ch.cnlab.fussball.coachassist.test.faking.databasehelper;

import java.sql.SQLException;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import ch.cnlab.fussball.coachassist.test.faking.daos.FakeUserDaoImpl;
import ch.cnlab.fussball.coachassist.test.faking.daos.match.FakeMatchDaoImpl;
import ch.cnlab.fussball.coachassist.test.faking.daos.match.FakePitchDaoImpl;
import ch.cnlab.fussball.coachassist.test.faking.daos.team.FakeAssignmentDaoImpl;
import ch.cnlab.fussball.coachassist.test.faking.daos.team.FakeClubDaoImpl;
import ch.cnlab.fussball.coachassist.test.faking.daos.team.FakeLeagueDaoImpl;
import ch.cnlab.fussball.coachassist.test.faking.daos.team.FakePlayPositionDaoImpl;
import ch.cnlab.fussball.coachassist.test.faking.daos.team.FakePlayerDaoImpl;
import ch.cnlab.fussball.coachassist.test.faking.daos.team.FakeTeamDaoImpl;
import ch.cnlab.fussball.coachassist.vos.User;
import ch.cnlab.fussball.coachassist.vos.match.Match;
import ch.cnlab.fussball.coachassist.vos.match.Pitch;
import ch.cnlab.fussball.coachassist.vos.team.Assignment;
import ch.cnlab.fussball.coachassist.vos.team.Club;
import ch.cnlab.fussball.coachassist.vos.team.League;
import ch.cnlab.fussball.coachassist.vos.team.PlayPosition;
import ch.cnlab.fussball.coachassist.vos.team.Player;
import ch.cnlab.fussball.coachassist.vos.team.Team;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;

public class FakeDatabasehelper extends OrmLiteSqliteOpenHelper {
	private FakeUserDaoImpl fakeUserDaoImpl;
	private FakePitchDaoImpl fakePitchDaoImpl;
	private FakeMatchDaoImpl fakeMatchDaoImpl;
	private FakeAssignmentDaoImpl fakeAssignmentDaoImpl;
	private FakeClubDaoImpl fakeClubDaoImpl;
	private FakeLeagueDaoImpl fakeLeagueDaoImpl;
	private FakePlayerDaoImpl fakePlayerDaoImpl;
	private FakePlayPositionDaoImpl fakePlayPositionDaoImpl;
	private FakeTeamDaoImpl fakeTeamDaoImpl;

	public FakeDatabasehelper(final Context context) {
		super(context, null, null, 1);
	}

	@Override
	public void onCreate(SQLiteDatabase arg0, ConnectionSource arg1) {
		// do nothing
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, ConnectionSource arg1, int arg2, int arg3) {
		// do nothing
	}

	@SuppressWarnings("unchecked")
	@Override
	public <D extends Dao<T, ?>, T> D getDao(Class<T> clazz) {
		try {
			if (clazz == User.class) {
				if (fakeUserDaoImpl == null) {
					fakeUserDaoImpl = new FakeUserDaoImpl();
				}
				return (D) fakeUserDaoImpl;
			} else if (clazz == Pitch.class) {
				if (fakePitchDaoImpl == null) {
					fakePitchDaoImpl = new FakePitchDaoImpl();
				}
				return (D) fakePitchDaoImpl;
			} else if (clazz == Match.class) {
				if (fakeMatchDaoImpl == null) {
					fakeMatchDaoImpl = new FakeMatchDaoImpl();
				}
				return (D) fakeMatchDaoImpl;
			} else if (clazz == Assignment.class) {
				if (fakeAssignmentDaoImpl == null) {
					fakeAssignmentDaoImpl = new FakeAssignmentDaoImpl();
				}
				return (D) fakeAssignmentDaoImpl;
			} else if (clazz == Club.class) {
				if (fakeClubDaoImpl == null) {
					fakeClubDaoImpl = new FakeClubDaoImpl();
				}
				return (D) fakeClubDaoImpl;
			} else if (clazz == League.class) {
				if (fakeLeagueDaoImpl == null) {
					fakeLeagueDaoImpl = new FakeLeagueDaoImpl();
				}
				return (D) fakeLeagueDaoImpl;
			} else if (clazz == Player.class) {
				if (fakePlayerDaoImpl == null) {
					fakePlayerDaoImpl = new FakePlayerDaoImpl();
				}
				return (D) fakePlayerDaoImpl;
			} else if (clazz == PlayPosition.class) {
				if (fakePlayPositionDaoImpl == null) {
					fakePlayPositionDaoImpl = new FakePlayPositionDaoImpl();
				}
				return (D) fakePlayPositionDaoImpl;
			} else if (clazz == Team.class) {
				if (fakeTeamDaoImpl == null) {
					fakeTeamDaoImpl = new FakeTeamDaoImpl();
				}
				return (D) fakeTeamDaoImpl;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
