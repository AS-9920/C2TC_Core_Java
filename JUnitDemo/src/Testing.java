import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
public class Testing 
{
	@Test									// Test annotation for testing
	//@RepeatedTest(10)	   //For Testing multiple times 
	void sum()					       //method for sum of two number
	{
	int a=5;
	int b=6;
	System.out.println(a+b);
	}
	
	int square(int p)    		//method for square number 
	{
		return p*p;
	}
	int countA(String word)
	{
	int count=0;
	for(int i=0;i<word.length();i++)
	{
	if(word.charAt(i)=='a' || word.charAt(i)=='A')
	{
	count++;
	}
	}
	return count;
	}
}
