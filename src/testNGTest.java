import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class testNGTest {
	public class SimpleTest
	{
	    @Test
	    public void Test1() {
	        System.out.println("Test1() Method.");
	    }
	    
	    @Test
	    public void Test2() {
	        System.out.println("Test2() Method.");
	    }	
	}
	 
	public class SimpleTestFactory
	{
	    @Factory
	    public Object[] factoryMethod() {
	        return new Object[] { new SimpleTest(), new SimpleTest() };
	    }
	}
}
