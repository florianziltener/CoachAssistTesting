package ch.cnlab.fussball.coachassist.test.entities.teams;

import junit.framework.Assert;
import android.test.AndroidTestCase;
import ch.cnlab.fussball.coachassist.vos.team.Club;

public class ClubTest extends AndroidTestCase {
	private String clubName;
	private String clubLocation;
	private String defaultColor;
	private String clubUrl;
	private String sponsorUrl;

	protected void setUp() throws Exception {
		super.setUp();
		clubName = "FC Test";
		clubLocation = "Testhausen";
		defaultColor = "Blau-Rot";
		clubUrl = "http://www.club.ch";
		sponsorUrl = "http://www.sponsor.ch";
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testDefaultConstructor() {
		Club club = new Club();
		Assert.assertNotNull(club);
	}

	public void testNameConstructor() {
		Club club = new Club(clubName);
		Assert.assertNotNull(club);
		Assert.assertEquals(clubName, club.getName());
	}

	public void testCompleteConstructor() {
		Club club = new Club(clubName,clubLocation,defaultColor,clubUrl,sponsorUrl);
		Assert.assertNotNull(club);
		Assert.assertEquals(clubName, club.getName());
		Assert.assertEquals(clubLocation, club.getLocation());
		Assert.assertEquals(defaultColor, club.getDefaultColor());
		Assert.assertEquals(clubUrl, club.getClubUrl());
		Assert.assertEquals(sponsorUrl, club.getSponsorUrl());
	}
	
	public void testEquals(){
		Club clubA1 = new Club(clubName);
		Club clubA2 = clubA1;
		Club clubB = new Club(clubName);
		Assert.assertTrue(clubA1.equals(clubA2));
		Assert.assertFalse(clubA1.equals(clubB));
	}
	
	public void testToString() {
		Club club = new Club(clubName);
		Assert.assertEquals(clubName, club.toString());
	}

}
