package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		 String Key = "webdriver.chrome.driver";
		  String Value = "./software/chromedriver.exe";
		  System.setProperty(Key,Value);
		  ChromeDriver driver = new ChromeDriver();


	}

}
