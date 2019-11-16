import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.Utility;

class CalenderTest {

	@Test
	void test() {
		int res=Utility.dayOfWeek(30,03,1995);
		assertEquals(4,res);
	}
	@Test
	void test1() {
		int res=Utility.dayOfWeek(30,03,1997);
		assertEquals(0,res);
		
	}

}
