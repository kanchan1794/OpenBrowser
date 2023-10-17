package PageObjectClasses;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        WebDriver driver;
		        System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome");

        //chromeoptions options = new chromeoptions();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        driver = new ChromeDriver(options);

        // Launch Website
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        Assert.assertTrue("page title is not correct",driver.getTitle().equals("google"));
        
		/*
		 * driver.findElement(By.id("login_username_input")).sendKeys(
		 * "superadmin@myorganization");
		 * driver.findElement(By.id("loging_password_input")).sendKeys("Admin@123");
		 * driver.findElement(By.id("login_submit_button")).click();
		 */


		

	}

}
