package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Documents/Selenium/Select.html");
		WebElement ele=driver.findElement(By.id("empire"));
		Select s=new Select(ele);
		Thread.sleep(2000);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByValue("K");
		Thread.sleep(2000);
		s.selectByVisibleText("poori");
		Thread.sleep(2000);
		s.deselectAll();
	}

}
