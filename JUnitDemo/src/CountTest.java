import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountTest 
{
//	@Test
//	void test() 
//	{
//		Testing t = new Testing();
//		int Result = t.square(4);
//		assertEquals(16, Result);
//	}
	@Test
	void test()
	{
		Testing t = new Testing();
		int output = t.countA("Adarsh");     //counting number of a 
		assertEquals(2, output);
	}
}
