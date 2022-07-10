package codingAssessment;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static codingAssessment.CeilingFan.OFF;


class CeilingFanTest {
	
	@Test
	void testPullSpeedCord() {
		
		CeilingFan fan1 = new CeilingFan();
		
		assertEquals("clockwise", fan1.getDirection());
		assertEquals(OFF, fan1.getSpeed());

		fan1.pullSpeedCord();
		assertEquals(1, fan1.getSpeed());
		assertEquals("clockwise", fan1.getDirection());
		System.out.println(fan1.toString());

		fan1.pullSpeedCord();
		assertEquals(2, fan1.getSpeed());
		assertEquals("clockwise", fan1.getDirection());

		fan1.pullSpeedCord();
		assertEquals(3, fan1.getSpeed());
		assertEquals("clockwise", fan1.getDirection());

		fan1.pullSpeedCord();
		assertEquals(OFF, fan1.getSpeed());
		assertEquals("clockwise", fan1.getDirection());
	}

	@Test
	void testPullDirectionCord() {
		
		CeilingFan fan1 = new CeilingFan();

		assertEquals("clockwise", fan1.getDirection());
		assertEquals(OFF, fan1.getSpeed());

		fan1.pullDirectionCord();
		assertEquals("antiClockwise", fan1.getDirection());
		assertEquals(OFF, fan1.getSpeed());

		fan1.pullSpeedCord();
		assertEquals(1, fan1.getSpeed());
		assertEquals("antiClockwise", fan1.getDirection());

		fan1.pullSpeedCord();
		assertEquals(2, fan1.getSpeed());
		assertEquals("antiClockwise", fan1.getDirection());

		fan1.pullSpeedCord();
		assertEquals(3, fan1.getSpeed());
		assertEquals("antiClockwise", fan1.getDirection());

		fan1.pullSpeedCord();
		assertEquals(OFF, fan1.getSpeed());
		assertEquals("antiClockwise", fan1.getDirection());
		
		fan1.pullDirectionCord();
		assertEquals("clockwise", fan1.getDirection());
		assertEquals(OFF, fan1.getSpeed());
		
		fan1.pullSpeedCord();
		assertEquals(1, fan1.getSpeed());
		assertEquals("clockwise", fan1.getDirection());
		
		fan1.pullSpeedCord();
		fan1.pullDirectionCord();
		assertEquals(2, fan1.getSpeed());
		assertEquals("antiClockwise", fan1.getDirection());
	}

}
