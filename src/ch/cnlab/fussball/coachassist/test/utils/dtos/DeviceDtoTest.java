package ch.cnlab.fussball.coachassist.test.utils.dtos;

import android.test.AndroidTestCase;
import ch.cnlab.fussball.coachassist.utils.dtos.DeviceDto;

public class DeviceDtoTest extends AndroidTestCase {
	private String dateString;

	protected void setUp() throws Exception {
		super.setUp();
		dateString = "January 1, 2012, 00:00:00 GMT";
	}

	public void testGetBluetooth_mac() throws Exception {
		DeviceDto fixture = new DeviceDto();
		fixture.setBluetooth_mac("test");
		String result = fixture.getBluetooth_mac();
		assertEquals("test", result);
	}

	public void testGetClub_id() throws Exception {
		DeviceDto fixture = new DeviceDto();
		fixture.setClub_id("test");
		String result = fixture.getClub_id();
		assertEquals("test", result);
	}

	public void testGetCreated_at() throws Exception {
		DeviceDto fixture = new DeviceDto();
		fixture.setCreated_at(dateString);
		String result = fixture.getCreated_at();
		assertEquals(dateString, result);
	}

	public void testGetFirmware() throws Exception {
		DeviceDto fixture = new DeviceDto();
		fixture.setFirmware("test");
		String result = fixture.getFirmware();
		assertEquals("test", result);
	}

	public void testGetId() throws Exception {
		DeviceDto fixture = new DeviceDto();
		fixture.setId(32);
		int result = fixture.getId();
		assertNotNull(result);
		assertEquals(32, result);
	}

	public void testGetMake() throws Exception {
		DeviceDto fixture = new DeviceDto();
		fixture.setMake("test");
		String result = fixture.getMake();
		assertEquals("test", result);
	}

	public void testGetName() throws Exception {
		DeviceDto fixture = new DeviceDto();
		fixture.setName("test");
		String result = fixture.getName();
		assertEquals("test", result);
	}

	public void testGetPurchase_date() throws Exception {
		DeviceDto fixture = new DeviceDto();
		fixture.setPurchase_date(dateString);
		String result = fixture.getPurchase_date();
		assertEquals(dateString, result);
	}

	public void testGetSerial_number() throws Exception {
		DeviceDto fixture = new DeviceDto();
		fixture.setSerial_number("test");
		String result = fixture.getSerial_number();
		assertEquals("test", result);
	}

	public void testGetUpdated_at() throws Exception {
		DeviceDto fixture = new DeviceDto();
		fixture.setUpdated_at(dateString);
		String result = fixture.getUpdated_at();
		assertEquals(dateString, result);
	}

	public void testSetBluetooth_mac() throws Exception {
		DeviceDto fixture = new DeviceDto();
		fixture.setBluetooth_mac("test");
		String result = fixture.getBluetooth_mac();
		assertEquals("test", result);
	}

	public void testSetClub_id() throws Exception {
		DeviceDto fixture = new DeviceDto();
		fixture.setClub_id("test");
		String result = fixture.getClub_id();
		assertEquals("test", result);
	}

	public void testSetCreated_at() throws Exception {
		DeviceDto fixture = new DeviceDto();
		fixture.setCreated_at(dateString);
		String result = fixture.getCreated_at();
		assertEquals(dateString, result);
	}

	public void testSetFirmware() throws Exception {
		DeviceDto fixture = new DeviceDto();
		fixture.setFirmware("test");
		String result = fixture.getFirmware();
		assertEquals("test", result);
	}

	public void testSetId() throws Exception {
		DeviceDto fixture = new DeviceDto();
		fixture.setId(32);
		int result = fixture.getId();
		assertNotNull(result);
		assertEquals(32, result);
	}

	public void testSetMake() throws Exception {
		DeviceDto fixture = new DeviceDto();
		fixture.setMake("test");
		String result = fixture.getMake();
		assertEquals("test", result);
	}

	public void testSetName() throws Exception {
		DeviceDto fixture = new DeviceDto();
		fixture.setName("test");
		String result = fixture.getName();
		assertEquals("test", result);
	}

	public void testSetPurchase_date() throws Exception {
		DeviceDto fixture = new DeviceDto();
		fixture.setPurchase_date(dateString);
		String result = fixture.getPurchase_date();
		assertEquals(dateString, result);
	}

	public void testSetSerial_number() throws Exception {
		DeviceDto fixture = new DeviceDto();
		fixture.setSerial_number("test");
		String result = fixture.getSerial_number();
		assertEquals("test", result);
	}

	public void testSetUpdated_at() throws Exception {
		DeviceDto fixture = new DeviceDto();
		fixture.setUpdated_at(dateString);
		String result = fixture.getUpdated_at();
		assertEquals(dateString, result);
	}

}