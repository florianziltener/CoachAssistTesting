package ch.cnlab.fussball.coachassist.test.faking.daos.team;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ch.cnlab.fussball.coachassist.vos.team.League;

import com.j256.ormlite.dao.BaseDaoImpl;

public class FakeLeagueDaoImpl extends BaseDaoImpl<League, Integer> implements FakeLeagueDao {
	List<League> leagues = new ArrayList<League>();
	static int id = 0;
	
	public FakeLeagueDaoImpl() throws SQLException {
		super(null, League.class);
	}
	
	@Override
	public int create(League league) {
		league.setId(id);
		id++;
		leagues.add(league);
		return 1;
	}
	
	public List<League> queryForAll() {
		return leagues;
	}

	public int delete(League league) {
		leagues.remove(league);
		return 1;
	}
	
	public int update(League league) {
		return 1;
	}
	
	public List<League> queryForEq(String name, Object value) {
		List<League> tempLeaguees = new ArrayList<League>();
		for (League league : leagues) {
			if(league.getId() == (Integer) value) {
				tempLeaguees.add(league);
			}
		}
		return tempLeaguees;
	}
	
	
}
