package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo14FB {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		WebElement ele=driver.findElement(By.id("month"));
		Select s=new Select(ele);
		Thread.sleep(2000);
		List<WebElement>options=s.getOptions();
		int count=options.size();
		System.out.println(count);
		for(WebElement we:options)
		{
			String t=we.getText();
			System.out.println(t);
		}
	}

}
