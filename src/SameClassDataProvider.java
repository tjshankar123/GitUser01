import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SameClassDataProvider {
	
	@DataProvider(name = "data-provider")
	//The first array represents a data set where as the second array contains the parameter values.
	public Object[][] sameClassDataProviderMethod(){
		return new Object[][] {{"data one"}, {"data two"}};  
	}
	
	@Test(dataProvider = "data-provider")
	public void testMethod(String data) {
		System.out.println("Data is " + data);
	}
	

}