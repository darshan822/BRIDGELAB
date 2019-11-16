import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.Utility;

class MonthpaymentTest {

	@Test
	void test1() {
		assertEquals(0.16094543591610028,Utility.calculatePayment(100,2,1.5));
	}
	@Test
	void test2() {
		assertEquals(1.2500003859766562,Utility.calculatePayment(1000,2,1.5));
		
	}
	

}
