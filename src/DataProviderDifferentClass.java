import org.testng.annotations.DataProvider;

public class DataProviderDifferentClass {
	@DataProvider(name = "data-provider")
	public Object[][] dataProviderMethod(){
		return new Object[][] {{"data one"}, {"data two"}, {"data three"}};
	}

}
