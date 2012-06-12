package ch.cnlab.fussball.coachassist.test.utils;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.NoSuchAlgorithmException;

import android.test.AndroidTestCase;
import ch.cnlab.fussball.coachassist.utils.AeSimpleSHA;

public class TestAeSimpleSHA extends AndroidTestCase {
	
	public void testSha1() throws NoSuchAlgorithmException, UnsupportedEncodingException {
		String message = "testMessage";
		String expectedSha = "d2581121a80ea419e91878d321100cc99dfb21db";
		String shaMessage = AeSimpleSHA.SHA1(message);
		assertNotSame(message, shaMessage);
		assertEquals(expectedSha, shaMessage);
	}
	
	public void testPrivateConstructor() throws IllegalArgumentException, InstantiationException,
			IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		@SuppressWarnings("rawtypes")
		Constructor constructor = AeSimpleSHA.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		constructor.newInstance();
	}
}
