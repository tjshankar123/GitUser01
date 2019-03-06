import org.testng.annotations.Test;

public class DataProviderTestClass {
	
	@Test (dataProvider = "data-provider", dataProviderClass = DataProviderDifferentClass.class)
	public void testMethod(String data) {
		System.out.println("Data is: " + data);
	}

}
