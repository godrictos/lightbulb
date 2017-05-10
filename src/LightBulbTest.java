import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LightBulbTest {
LightBulb myBulb;
	@Before
	public void setUp() throws Exception {
		myBulb=new LightBulb(40);
	}

	@Test
	public void test() {
	
		
		
		myBulb.addPower(60);
		assertEquals(100,myBulb.getWatts());
		//check
	}

}



		
	








