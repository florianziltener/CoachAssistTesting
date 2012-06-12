package ch.cnlab.fussball.coachassist.test.faking.daos.team;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ch.cnlab.fussball.coachassist.vos.team.Assignment;

import com.j256.ormlite.dao.BaseDaoImpl;

public class FakeAssignmentDaoImpl extends BaseDaoImpl<Assignment, Integer> implements FakeAssignmentDao {

	List<Assignment> assignments = new ArrayList<Assignment>();
	static int id = 0;
	
	public FakeAssignmentDaoImpl() throws SQLException {
		super(null, Assignment.class);
	}
	
	@Override
	public int create(Assignment assignment) {
		assignment.setId(id);
		id++;
		assignments.add(assignment);
		return 1;
	}
	
	public List<Assignment> queryForAll() {
		return assignments;
	}

	public int delete(Assignment assignment) {
		assignments.remove(assignment);
		return 1;
	}
	
	public int update(Assignment assignment) {
		return 1;
	}
	
	public int refresh(Assignment assignment) {
		return 1;
	}
	
	public List<Assignment> queryForEq(String name, Object value) {
		List<Assignment> tempAssignmentes = new ArrayList<Assignment>();
		for (Assignment assignment : assignments) {
			if(assignment.getId() == (Integer) value) {
				tempAssignmentes.add(assignment);
			}
		}
		return tempAssignmentes;
	}
	
	
}
