package learning;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assingment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\seleniumproject\\drivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        
        WebElement username = driver.findElementById("txtUsername");
        username.sendKeys("Admin");
        
        WebElement password = driver.findElementById("txtPassword");
        password.sendKeys("admin123");
        
       WebElement login =  driver.findElementById("btnLogin");
       login.click();
       
       WebElement admin = driver.findElementByXPath("//*[@id=\'menu_admin_viewAdminModule\']/b");
       admin.click();
       WebElement add = driver.findElementById("btnAdd");
       add.click();
       
       WebElement user = driver.findElementById("systemUser_userType");
       Select drop1 = new Select(user);
       drop1.selectByIndex(0);
       
       WebElement name = driver.findElementById("systemUser_employeeName_empName");
       name.sendKeys("Goutam Ganesh");
       
       WebElement username1 = driver.findElementById("systemUser_userName");
       username1.sendKeys("Yuktha.sri");
       
       WebElement status = driver.findElementById("systemUser_status");
       Select drop2 = new Select(status);
       drop2.selectByValue("1");
       
       WebElement password1 = driver.findElementById("systemUser_password");
       password1.sendKeys("Yukthasri_2022");
       
       WebElement confirm = driver.findElementById("systemUser_confirmPassword");
       confirm.sendKeys("Yukthasri_2022");
       

       WebElement save = driver.findElementByXPath("//*[@id=\'btnSave\']");
       save.click();
       
       Thread.sleep(3000);
       
      
       
       WebElement admintab = driver.findElementByXPath("//*[@id=\'menu_admin_viewAdminModule\']/b");
       admintab.click();
       
       
       WebElement text = driver.findElementById("searchSystemUser_userName");
       text.sendKeys("Yuktha.sri");
       
       WebElement search = driver.findElementById("searchBtn");
       search.click();
       
       
         
	}

}
