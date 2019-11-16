import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.Utility;

class BinaryConversionTest {

	@Test
	void test() {
		String res=Utility.decToinary(100);
		assertEquals("1100100", res);	
	}
	@Test
	void test1() {
		String res=Utility.decToinary(70);
		assertEquals("1000110", res);	
	}
	@Test
	void test2() {
		String res=Utility.decToinary(10);
		assertEquals("1010", res);	
	}
	@Test
	void test3() {
		String res=Utility.decToinary(116);
		assertEquals("1110100", res);	
	}

}
