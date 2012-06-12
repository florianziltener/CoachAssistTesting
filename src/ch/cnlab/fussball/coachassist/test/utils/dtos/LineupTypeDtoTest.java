package ch.cnlab.fussball.coachassist.test.utils.dtos;

import java.util.ArrayList;

import android.test.AndroidTestCase;
import ch.cnlab.fussball.coachassist.utils.dtos.LineupTypeDto;
import ch.cnlab.fussball.coachassist.utils.dtos.PositionDto;

public class LineupTypeDtoTest extends AndroidTestCase{
	
	private String name;
	private String dateString;

	protected void setUp() throws Exception {
		super.setUp();
		name = "lineup";
		dateString = "January 1, 2012, 00:00:00 GMT";
	}
	
	public void testGetCreated_at()
		throws Exception {
		LineupTypeDto fixture = new LineupTypeDto();
		fixture.setCreated_at(dateString);
		String result = fixture.getCreated_at();
		assertEquals(dateString, result);
	}

	
	public void testGetId()
		throws Exception {
		LineupTypeDto fixture = new LineupTypeDto();
		fixture.setId(2);
		Number result = fixture.getId();
		assertNotNull(result);
		assertEquals(2, result.byteValue());
	}

	
	public void testGetLineup_type_positions()
		throws Exception {
		LineupTypeDto fixture = new LineupTypeDto();
		ArrayList<PositionDto> positionDtos = new ArrayList<PositionDto>();
		fixture.setLineup_type_positions(positionDtos);
		ArrayList<PositionDto> result = fixture.getLineup_type_positions();

		assertNotNull(result);
		assertEquals(0, result.size());
		
		PositionDto positionDto = new PositionDto();
		positionDtos.add(positionDto);
		fixture.setLineup_type_positions(positionDtos);

		ArrayList<PositionDto> result2 = fixture.getLineup_type_positions();
		assertEquals(1, result2.size());
	}

	
	public void testGetName()
		throws Exception {
		LineupTypeDto fixture = new LineupTypeDto();
		fixture.setName(name);
		String result = fixture.getName();
		assertEquals(name, result);
	}

	public void testGetUpdated_at()
		throws Exception {
		LineupTypeDto fixture = new LineupTypeDto();
		fixture.setUpdated_at(dateString);
		String result = fixture.getUpdated_at();
		assertEquals(dateString, result);
	}
	
	public void testSetCreated_at()
			throws Exception {
			LineupTypeDto fixture = new LineupTypeDto();
			fixture.setCreated_at(dateString);
			String result = fixture.getCreated_at();
			assertEquals(dateString, result);
		}

		
		public void testSetId()
			throws Exception {
			LineupTypeDto fixture = new LineupTypeDto();
			fixture.setId(2);
			Number result = fixture.getId();
			assertNotNull(result);
			assertEquals(2, result.byteValue());
		}

		
		public void testSetLineup_type_positions()
			throws Exception {
			LineupTypeDto fixture = new LineupTypeDto();
			ArrayList<PositionDto> positionDtos = new ArrayList<PositionDto>();
			fixture.setLineup_type_positions(positionDtos);
			ArrayList<PositionDto> result = fixture.getLineup_type_positions();

			assertNotNull(result);
			assertEquals(0, result.size());
			
			PositionDto positionDto = new PositionDto();
			positionDtos.add(positionDto);
			fixture.setLineup_type_positions(positionDtos);

			ArrayList<PositionDto> result2 = fixture.getLineup_type_positions();
			assertEquals(1, result2.size());
		}

		
		public void testSetName()
			throws Exception {
			LineupTypeDto fixture = new LineupTypeDto();
			fixture.setName(name);
			String result = fixture.getName();
			assertEquals(name, result);
		}

		public void testSetUpdated_at()
			throws Exception {
			LineupTypeDto fixture = new LineupTypeDto();
			fixture.setUpdated_at(dateString);
			String result = fixture.getUpdated_at();
			assertEquals(dateString, result);
		}

}