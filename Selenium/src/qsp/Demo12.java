package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Documents/Selenium/Select.html");
		WebElement ele=driver.findElement(By.id("empire"));
		Select s=new Select(ele);
		boolean b=s.isMultiple();
		if(b)
		{
			System.out.println("multi select dd");
		}
		else
		{
			System.out.println("not a multi select dd");
		
		}
	}

}
