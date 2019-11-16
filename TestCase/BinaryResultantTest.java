import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.Utility;

class BinaryResultantTest {

	@Test
	void test() {
		boolean res=Utility.isPowerOfTwo(Utility.swapNibbles(10));
		assertEquals(false,res);
	}
	@Test
	void test1() {
		boolean res=Utility.isPowerOfTwo(Utility.swapNibbles(100));
		assertEquals(false,res);
	}
	@Test
	void test2() {
		boolean res=Utility.isPowerOfTwo(Utility.swapNibbles(2));
		assertEquals(true,res);
	}

}
