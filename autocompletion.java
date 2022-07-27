package learning;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autocompletion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\seleniumproject\\drivers\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://jqueryui.com/autocomplete/");
		driver.manage().window().maximize();
		
		WebElement input = driver.findElementByXPath("//*[@id=\"tags\"]");
		input.sendKeys("s");
		Thread.sleep(4000);
		
		List<WebElement> list = driver.findElementsByXPath("//*[@id=\"tags\"]/li");
		int size = list.size();
		System.out.println(size);
		
		for (WebElement webElement : list) {

			if (webElement.getText().equals("JavaScript")) {

				webElement.click();

				break;
			}
		}
		
		

	}

}
