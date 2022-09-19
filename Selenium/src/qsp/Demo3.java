package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		String Key = "webdriver.chrome.driver";
		  String Value = "./software/chromedriver.exe";
		  System.setProperty(Key,Value);
		  ChromeDriver driver = new ChromeDriver();
		  Thread.sleep(2000);
	      driver.close();
		  driver.quit();
     }

}
