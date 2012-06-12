package ch.cnlab.fussball.coachassist.test.faking.daos.team;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ch.cnlab.fussball.coachassist.vos.team.Club;

import com.j256.ormlite.dao.BaseDaoImpl;

public class FakeClubDaoImpl extends BaseDaoImpl<Club, Integer> implements FakeClubDao {

	List<Club> clubs = new ArrayList<Club>();
	static int id = 0;
	
	public FakeClubDaoImpl() throws SQLException {
		super(null, Club.class);
	}
	
	@Override
	public int create(Club club) {
		club.setId(id);
		id++;
		clubs.add(club);
		return 1;
	}
	
	public List<Club> queryForAll() {
		return clubs;
	}

	public int delete(Club club) {
		clubs.remove(club);
		return 1;
	}
	
	public int update(Club club) {
		return 1;
	}
	
	public List<Club> queryForEq(String name, Object value) {
		List<Club> tempClubes = new ArrayList<Club>();
		for (Club club : clubs) {
			if(club.getId() == (Integer) value) {
				tempClubes.add(club);
			}
		}
		return tempClubes;
	}
	
	
}
