package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Demo4 {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver d = new FirefoxDriver();
	d.get("https://www.amazon.com");
	String title = d.getTitle();
	System.out.println(title);
	String URL=d.getCurrentUrl();
	System.out.println(URL);
	String src = d.getPageSource();
	System.out.println(src);
	}

}
