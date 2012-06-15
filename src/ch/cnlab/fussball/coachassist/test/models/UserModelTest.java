package ch.cnlab.fussball.coachassist.test.models;

import android.test.AndroidTestCase;
import ch.cnlab.fussball.coachassist.models.ModelController;
import ch.cnlab.fussball.coachassist.models.UserModel;
import ch.cnlab.fussball.coachassist.test.faking.databasehelper.FakeDatabasehelper;
import ch.cnlab.fussball.coachassist.test.faking.databasehelper.FakeDatabasehelperForException;
import ch.cnlab.fussball.coachassist.vos.User;

public class UserModelTest extends AndroidTestCase {
	private FakeDatabasehelper fakeDatabasehelper;
	private FakeDatabasehelperForException fakeDatabasehelperForException;
    private ModelController modelController;

	protected void setUp() throws Exception {
		super.setUp();
		fakeDatabasehelper = new FakeDatabasehelper(getContext());
		fakeDatabasehelperForException = new FakeDatabasehelperForException(getContext());
        modelController = ModelController.getInstance();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testGetInstance() {
		UserModel userModel = modelController.getUserModel(getContext());
		assertNotNull(userModel);
		UserModel userModel2 = modelController.getUserModel(getContext());
		assertEquals(userModel, userModel2);
	}

	public void testCreateUser() {
		UserModel userModel = modelController.getUserModel(getContext());
		User user = new User("test@test.ch", "1234");
		userModel.setHelper(fakeDatabasehelper);
		userModel.createUser(user);
		User user2 = userModel.getUser();
		assertEquals(user, user2);
	}
	
	public void testGetNoUser() {
		UserModel userModel = modelController.getUserModel(getContext());
		userModel.setHelper(fakeDatabasehelper);
		User user = userModel.getUser();
		assertNull(user);
	}

	public void testGetUserExceptionHandling() {
		UserModel userModel = modelController.getUserModel(getContext());
		userModel.setHelper(fakeDatabasehelperForException);
		assertNull(userModel.getUser());
	}
	
	public void testUserUpdate() {
		UserModel userModel = modelController.getUserModel(getContext());
		userModel.setHelper(fakeDatabasehelper);
		User user = userModel.getUser();
		userModel.updateUser(user);
		User user2 = userModel.getUser();
		assertEquals(user, user2);
	}

}
