package ch.cnlab.fussball.coachassist.test.faking.daos.team;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ch.cnlab.fussball.coachassist.vos.team.PlayPosition;

import com.j256.ormlite.dao.BaseDaoImpl;

public class FakePlayPositionDaoImpl extends BaseDaoImpl<PlayPosition, Integer> implements FakePlayPositionDao {

	List<PlayPosition> playPositons = new ArrayList<PlayPosition>();
	static int id = 0;
	
	public FakePlayPositionDaoImpl() throws SQLException {
		super(null, PlayPosition.class);
	}
	
	@Override
	public int create(PlayPosition playPositon) {
		playPositon.setId(id);
		id++;
		playPositons.add(playPositon);
		return 1;
	}
	
	public List<PlayPosition> queryForAll() {
		return playPositons;
	}

	public int delete(PlayPosition playPositon) {
		playPositons.remove(playPositon);
		return 1;
	}
	
	public int update(PlayPosition playPositon) {
		return 1;
	}
	
	public List<PlayPosition> queryForEq(String name, Object value) {
		List<PlayPosition> tempPlayPositiones = new ArrayList<PlayPosition>();
		for (PlayPosition playPositon : playPositons) {
			if(playPositon.getId() == (Integer) value) {
				tempPlayPositiones.add(playPositon);
			}
		}
		return tempPlayPositiones;
	}
	
	
}
