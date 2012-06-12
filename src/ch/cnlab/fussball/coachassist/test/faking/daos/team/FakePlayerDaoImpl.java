package ch.cnlab.fussball.coachassist.test.faking.daos.team;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ch.cnlab.fussball.coachassist.vos.team.Assignment;
import ch.cnlab.fussball.coachassist.vos.team.Player;

import com.j256.ormlite.dao.BaseDaoImpl;

public class FakePlayerDaoImpl extends BaseDaoImpl<Player, Integer> implements FakePlayerDao {
	List<Player> players = new ArrayList<Player>();
	static int id = 0;
	
	public FakePlayerDaoImpl() throws SQLException {
		super(null, Player.class);
	}
	
	@Override
	public int create(Player player) {
		player.setId(id);
		id++;
		players.add(player);
		return 1;
	}
	
	public List<Player> queryForAll() {
		return players;
	}

	public int delete(Player player) {
		players.remove(player);
		return 1;
	}
	
	public int update(Player player) {
		return 1;
	}
	
	public int refresh(Player player) {
		return 1;
	}
	
	public List<Player> queryForEq(String name, Object value) {
		List<Player> tempPlayeres = new ArrayList<Player>();
		for (Player player : players) {
			if(player.getId() == (Integer) value) {
				tempPlayeres.add(player);
			}
		}
		return tempPlayeres;
	}
	
	
}
