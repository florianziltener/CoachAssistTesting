package ch.cnlab.fussball.coachassist.test.faking.daos.match;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ch.cnlab.fussball.coachassist.vos.match.Match;

import com.j256.ormlite.dao.BaseDaoImpl;

public class FakeMatchDaoImpl extends BaseDaoImpl<Match, Integer> implements FakeMatchDao {

	List<Match> matches = new ArrayList<Match>();
	static int id = 0;
	
	public FakeMatchDaoImpl() throws SQLException {
		super(null, Match.class);
	}
	
	@Override
	public int create(Match match) {
		match.setId(id);
		id++;
		matches.add(match);
		return 1;
	}
	
	public List<Match> queryForAll() {
		return matches;
	}

	public int delete(Match match) {
		matches.remove(match);
		return 1;
	}
	
	public int update(Match match) {
		return 1;
	}
	
	public List<Match> queryForEq(String name, Object value) {
		List<Match> tempMatches = new ArrayList<Match>();
		for (Match match : matches) {
			if(match.getIsRecorded() == value) {
				tempMatches.add(match);
			}
		}
		return tempMatches;
	}
	
	
}
