package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {
	public static void main(String[] args) {
		 String Key = "webdriver.chrome.driver";
		  String Value = "./software/chromedriver.exe";
		  System.setProperty(Key,Value);
		  ChromeDriver driver = new ChromeDriver();
		  String Key1 = "webdriver.gecko.driver";
		  String Value1 = "./software/geckodriver.exe";
		  System.setProperty(Key1,Value1);
		  FirefoxDriver d1= new FirefoxDriver();
	}

}
