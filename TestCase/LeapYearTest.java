import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.Utility;
class LeapYearTest {

	@Test
	void test0() {
		boolean res = Utility.checkLeapYear(2019);
		assertEquals(false, res);
	}
	@Test
	void test1() {
		boolean res = Utility.checkLeapYear(2016);
		assertEquals(true,res);
	}
	@Test
	void test2() {
		boolean res = Utility.checkLeapYear(2020);
		assertEquals(true,res);
	}
	@Test
	void test3() {
		boolean res = Utility.checkLeapYear(400);
		assertEquals(true,res);
	}

}
