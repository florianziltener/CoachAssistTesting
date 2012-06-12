package ch.cnlab.fussball.coachassist.test.faking.daos.match;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ch.cnlab.fussball.coachassist.vos.match.Pitch;

import com.j256.ormlite.dao.BaseDaoImpl;

public class FakePitchDaoImpl extends BaseDaoImpl<Pitch, Integer> implements FakePitchDao {

	List<Pitch> pitches = new ArrayList<Pitch>();
	static int id = 0;
	
	public FakePitchDaoImpl() throws SQLException {
		super(null, Pitch.class);
	}
	
	@Override
	public int create(Pitch pitch) {
		pitch.setId(id);
		id++;
		pitches.add(pitch);
		return 1;
	}
	
	public List<Pitch> queryForAll() {
		return pitches;
	}

	public int delete(Pitch pitch) {
		pitches.remove(pitch);
		return 1;
	}
	
	public int update(Pitch pitch) {
		return 1;
	}
	
	public List<Pitch> queryForEq(String name, Object value) {
		List<Pitch> tempPitches = new ArrayList<Pitch>();
		for (Pitch pitch : pitches) {
			if(pitch.getId() == (Integer) value) {
				tempPitches.add(pitch);
			}
		}
		return tempPitches;
	}
	
	
}
