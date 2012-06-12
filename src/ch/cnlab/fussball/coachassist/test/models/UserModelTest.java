package ch.cnlab.fussball.coachassist.test.models;

import android.test.AndroidTestCase;
import ch.cnlab.fussball.coachassist.models.UserModel;
import ch.cnlab.fussball.coachassist.test.faking.databasehelper.FakeDatabasehelper;
import ch.cnlab.fussball.coachassist.test.faking.databasehelper.FakeDatabasehelperForException;
import ch.cnlab.fussball.coachassist.vos.User;

public class UserModelTest extends AndroidTestCase {
	FakeDatabasehelper fakeDatabasehelper;
	FakeDatabasehelperForException fakeDatabasehelperForException;

	protected void setUp() throws Exception {
		super.setUp();
		fakeDatabasehelper = new FakeDatabasehelper(getContext());
		fakeDatabasehelperForException = new FakeDatabasehelperForException(getContext());
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testGetInstance() {
		UserModel userModel = UserModel.getInstance(getContext());
		assertNotNull(userModel);
		UserModel userModel2 = UserModel.getInstance(getContext());
		assertEquals(userModel, userModel2);
	}

	public void testCreateUser() {
		UserModel userModel = UserModel.getInstance(getContext());
		User user = new User("test@test.ch", "1234");
		userModel.setHelper(fakeDatabasehelper);
		userModel.createUser(user);
		User user2 = userModel.getUser();
		assertEquals(user, user2);
	}
	
	public void testGetNoUser() {
		UserModel userModel = UserModel.getInstance(getContext());
		userModel.setHelper(fakeDatabasehelper);
		User user = userModel.getUser();
		assertNull(user);
	}

	public void testGetUserExceptionHandling() {
		UserModel userModel = UserModel.getInstance(getContext());
		userModel.setHelper(fakeDatabasehelperForException);
		assertNull(userModel.getUser());
	}
	
	public void testUserUpdate() {
		UserModel userModel = UserModel.getInstance(getContext());
		userModel.setHelper(fakeDatabasehelper);
		User user = userModel.getUser();
		userModel.updateUser(user);
		User user2 = userModel.getUser();
		assertEquals(user, user2);
	}

}
