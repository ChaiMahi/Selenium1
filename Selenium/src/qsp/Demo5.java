package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("https://www.flipkart.com");
		String title = d.getTitle();
		System.out.println(title);

}
}
