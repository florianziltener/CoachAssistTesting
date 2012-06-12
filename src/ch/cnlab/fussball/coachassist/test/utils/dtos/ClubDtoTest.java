package ch.cnlab.fussball.coachassist.test.utils.dtos;

import java.util.ArrayList;

import android.test.AndroidTestCase;

import ch.cnlab.fussball.coachassist.utils.dtos.ClubDto;
import ch.cnlab.fussball.coachassist.utils.dtos.MembershipsDto;

public class ClubDtoTest extends AndroidTestCase {

	private String name;
	private String dateString;
	private String defaultColor;
	private String clubUrl;
	private String sponsorUrl;
	private String clubLogo;
	private String sponsorLogo;

	protected void setUp() throws Exception {
		super.setUp();
		name = "Test League";
		dateString = "January 1, 2012, 00:00:00 GMT";
		defaultColor = "blue";
		clubUrl = "www.test.ch";
		sponsorUrl = "www.test2.ch";
		clubLogo = "club_logo";
		sponsorLogo = "sponsor_logo";
	}

	public void testClubDtoOne() throws Exception {
		ClubDto result = new ClubDto(name, defaultColor, clubUrl, sponsorUrl);
		assertNotNull(result);
		assertEquals(name, result.getName());
		assertEquals(0, result.getId());
		assertEquals(null, result.getCreated_at());
		assertEquals(null, result.getUpdated_at());
		assertEquals(null, result.getClub_logo());
		assertEquals(clubUrl, result.getClub_url());
		assertEquals(defaultColor, result.getDefault_color());
		assertEquals(null, result.getMemberships());
		assertEquals(null, result.getSponsor_logo());
		assertEquals(sponsorUrl, result.getSponsor_url());
	}

	public void testClubDtoTwo() throws Exception {
		ClubDto result = new ClubDto(clubLogo, clubUrl, dateString, defaultColor, name, sponsorLogo, sponsorUrl,
				dateString);
		assertNotNull(result);
		assertEquals(name, result.getName());
		assertEquals(0, result.getId());
		assertEquals(null, result.getCreated_at());
		assertEquals(null, result.getUpdated_at());
		assertEquals(clubLogo, result.getClub_logo());
		assertEquals(clubUrl, result.getClub_url());
		assertEquals(defaultColor, result.getDefault_color());
		assertEquals(null, result.getMemberships());
		assertEquals(sponsorLogo, result.getSponsor_logo());
		assertEquals(sponsorUrl, result.getSponsor_url());
	}

	public void testGetClub_logo() throws Exception {
		ClubDto fixture = new ClubDto(name, defaultColor, clubUrl, sponsorUrl);
		fixture.setClub_logo(clubLogo);
		String result = fixture.getClub_logo();
		assertEquals(clubLogo, result);
	}

	public void testGetClub_url() throws Exception {
		ClubDto fixture = new ClubDto(name, defaultColor, clubUrl, sponsorUrl);
		String result = fixture.getClub_url();
		assertEquals(clubUrl, result);
	}

	public void testGetCreated_at() throws Exception {
		ClubDto fixture = new ClubDto(name, defaultColor, clubUrl, sponsorUrl);
		fixture.setCreated_at(dateString);
		String result = fixture.getCreated_at();
		assertEquals(dateString, result);
	}

	public void testGetDefault_color() throws Exception {
		ClubDto fixture = new ClubDto(name, defaultColor, clubUrl, sponsorUrl);
		String result = fixture.getDefault_color();
		assertEquals(defaultColor, result);
	}

	public void testGetId() throws Exception {
		ClubDto fixture = new ClubDto(name, defaultColor, clubUrl, sponsorUrl);
		fixture.setId(1);
		int result = fixture.getId();
		assertEquals(1, result);
	}

	public void testGetMemberships() throws Exception {
		ClubDto fixture = new ClubDto(name, defaultColor, clubUrl, sponsorUrl);
		fixture.setClub_logo("");
		fixture.setSponsor_logo("");
		fixture.setCreated_at("");
		fixture.setUpdated_at("");
		fixture.setId(1);
		ArrayList<MembershipsDto> membershipsDtos = new ArrayList<MembershipsDto>();
		fixture.setMemberships(membershipsDtos);

		ArrayList<MembershipsDto> result = fixture.getMemberships();
		assertNotNull(result);
		assertEquals(0, result.size());

		MembershipsDto membershipsDto = new MembershipsDto(1, 1);
		membershipsDtos.add(membershipsDto);

		fixture.setMemberships(membershipsDtos);
		ArrayList<MembershipsDto> result2 = fixture.getMemberships();
		assertEquals(1, result2.size());
	}

	public void testGetName() throws Exception {
		ClubDto fixture = new ClubDto(name, defaultColor, clubUrl, sponsorUrl);
		String result = fixture.getName();
		assertEquals(name, result);
	}

	public void testGetSponsor_logo() throws Exception {
		ClubDto fixture = new ClubDto(name, defaultColor, clubUrl, sponsorUrl);
		fixture.setSponsor_logo(sponsorLogo);
		String result = fixture.getSponsor_logo();
		assertEquals(sponsorLogo, result);
	}

	public void testGetSponsor_url() throws Exception {
		ClubDto fixture = new ClubDto(name, defaultColor, clubUrl, sponsorUrl);
		String result = fixture.getSponsor_url();
		assertEquals(sponsorUrl, result);
	}

	public void testGetUpdated_at() throws Exception {
		ClubDto fixture = new ClubDto(name, defaultColor, clubUrl, sponsorUrl);
		fixture.setUpdated_at(dateString);
		String result = fixture.getUpdated_at();
		assertEquals(dateString, result);
	}

	public void testSetClub_logo() throws Exception {
		ClubDto fixture = new ClubDto(name, defaultColor, clubUrl, sponsorUrl);
		fixture.setClub_logo(clubLogo);
		String result = fixture.getClub_logo();
		assertEquals(clubLogo, result);
	}

	public void testSetClub_url() throws Exception {
		ClubDto fixture = new ClubDto(name, defaultColor, "wrong url", sponsorUrl);
		fixture.setClub_url(clubUrl);
		String result = fixture.getClub_url();
		assertEquals(clubUrl, result);
	}

	public void testSetCreated_at() throws Exception {
		ClubDto fixture = new ClubDto(name, defaultColor, clubUrl, sponsorUrl);
		fixture.setCreated_at(dateString);
		String result = fixture.getCreated_at();
		assertEquals(dateString, result);
	}

	public void testSetDefault_color() throws Exception {
		ClubDto fixture = new ClubDto(name, "wrong color", clubUrl, sponsorUrl);
		fixture.setDefault_color(defaultColor);
		String result = fixture.getDefault_color();
		assertEquals(defaultColor, result);
	}

	public void testSetId() throws Exception {
		ClubDto fixture = new ClubDto(name, defaultColor, clubUrl, sponsorUrl);
		fixture.setId(1);
		int result = fixture.getId();
		assertEquals(1, result);
	}

	public void testSetMemberships() throws Exception {
		ClubDto fixture = new ClubDto(name, defaultColor, clubUrl, sponsorUrl);
		fixture.setClub_logo("");
		fixture.setSponsor_logo("");
		fixture.setCreated_at("");
		fixture.setUpdated_at("");
		fixture.setId(1);
		ArrayList<MembershipsDto> membershipsDtos = new ArrayList<MembershipsDto>();
		fixture.setMemberships(membershipsDtos);

		ArrayList<MembershipsDto> result = fixture.getMemberships();
		assertNotNull(result);
		assertEquals(0, result.size());

		MembershipsDto membershipsDto = new MembershipsDto(1, 1);
		membershipsDtos.add(membershipsDto);

		fixture.setMemberships(membershipsDtos);
		ArrayList<MembershipsDto> result2 = fixture.getMemberships();
		assertEquals(1, result2.size());
	}

	public void testSetName() throws Exception {
		ClubDto fixture = new ClubDto("wrong name", defaultColor, clubUrl, sponsorUrl);
		fixture.setName(name);
		String result = fixture.getName();
		assertEquals(name, result);
	}

	public void testSetSponsor_logo() throws Exception {
		ClubDto fixture = new ClubDto(name, defaultColor, clubUrl, sponsorUrl);
		fixture.setSponsor_logo(sponsorLogo);
		String result = fixture.getSponsor_logo();
		assertEquals(sponsorLogo, result);
	}

	public void testSetSponsor_url() throws Exception {
		ClubDto fixture = new ClubDto(name, defaultColor, clubUrl, "wrong url");
		fixture.setSponsor_url(sponsorUrl);
		String result = fixture.getSponsor_url();
		assertEquals(sponsorUrl, result);
	}

	public void testSetUpdated_at() throws Exception {
		ClubDto fixture = new ClubDto(name, defaultColor, clubUrl, sponsorUrl);
		fixture.setUpdated_at(dateString);
		String result = fixture.getUpdated_at();
		assertEquals(dateString, result);
	}
}