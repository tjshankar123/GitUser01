package web.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrowser {
		
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "C://Users//tjsha_lfek1mv//Downloads//chromedriver_win32/chromedriver.exe");
			
			WebDriver driver =new ChromeDriver();
			driver.get("http://facebook.com"); //URL in the browser
			
			/*
			driver.findElement(By.className("input text")).sendKeys("helloworld");
			driver.findElement(By.id("email")).sendKeys("This is my first code");
			driver.findElement(By.name("pass")).sendKeys("123456");
			driver.findElement(By.linkText("Forgot account?")).click();
			*/

			driver.findElement(By.cssSelector("#email")).sendKeys("emailaddress");
			driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("password");
			driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
			
		}
	
}
