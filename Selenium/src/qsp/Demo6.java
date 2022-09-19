package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Documents/Selenium/Demo3.html");
			Thread.sleep(2000);
		//WebElement ele=driver.findElement(By.tagName("a"));//
		driver.findElement(By.tagName("a")).click();
		//ele.click();//

	}

}
