package ch.cnlab.fussball.coachassist.test.faking.daos;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ch.cnlab.fussball.coachassist.vos.User;

import com.j256.ormlite.dao.BaseDaoImpl;

public class FakeUserDaoImpl extends BaseDaoImpl<User, Integer> implements FakeUserDao {

	List<User> users = new ArrayList<User>();
	
	public FakeUserDaoImpl() throws SQLException {
		super(null, User.class);
	}
	
	@Override
	public int create(User user) {
		users.add(user);
		return 1;
	}
	
	public List<User> queryForAll() {
		return users;
	}

	public int delete(User user) {
		users.remove(user);
		return 1;
	}
	
	public int update(User user) {
		return 1;
	}
	
	
}
