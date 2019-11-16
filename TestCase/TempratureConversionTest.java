import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.Utility;

class TempratureConversionTest {

	@Test
	void test1() {//value=5
		double res=Utility.convert();
		assertEquals(41.0,res);
		
	}
	@Test
void test2() {
		double res=Utility.convert();//6
		assertEquals(42.8,res);
		
	}
	@Test
void test3() {
		double res=Utility.convert();//10
		assertEquals(50.0,res);
	
}


}
