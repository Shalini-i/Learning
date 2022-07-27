package learning;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swaglabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\seleniumproject\\drivers\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement id = driver.findElementById("user-name");
		id.sendKeys("standard_user");
		
		WebElement password = driver.findElementById("password");
		password.sendKeys("secret_sauce");
		
		WebElement login = driver.findElementById("login-button");
		login.click();
		
		WebElement add = driver.findElementByXPath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
		add.click();
		
		WebElement cart = driver.findElementByXPath("//*[@id=\"shopping_cart_container\"]/a");
		cart.click();
		
		WebElement checkout = driver.findElementById("checkout");
		checkout.click();
		WebElement name = driver.findElementById("first-name");
		name.sendKeys("shalini");
		WebElement last = driver.findElementById("last-name");
		last.sendKeys("i");
		WebElement postal  = driver.findElementById("postal-code");
		postal.sendKeys("75038");
		
		WebElement button = driver.findElementById("continue");
		button.click();
		
		WebElement finish = driver.findElementById("finish");
		finish.click();
		

	}

}
