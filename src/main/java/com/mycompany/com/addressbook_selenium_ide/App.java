package com.mycompany.com.addressbook_selenium_ide;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;
/**
 * Hello world!
 *
 */
public class App 
{
	@Test
	
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver","C:\\DevopsChromedriver\\chromedriver.exe");
    	ChromeOptions chromeOptions = new ChromeOptions();
    	//chromeOptions.addAgruments("--headless");
    	 WebDriver driver = new ChromeDriver(chromeOptions);

    	 System.out.println("Hi, Welcome to session on Selenium WebDriver");


    	 driver.get("http://15.206.88.40:8888/");

    	 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); //implicit wait for 3s 
    	 driver.findElement(By.className("v-button")).click();
    	 driver.findElement(By.id("gwt-uid-5")).sendKeys("Edureka1");
    	 driver.findElement(By.id("gwt-uid-7")).sendKeys("DevOps-Jenkins");
    	 driver.findElement(By.id("gwt-uid-9")).sendKeys("9834562709");
    	 driver.findElement(By.id("gwt-uid-11")).sendKeys("Devops@edureka.com");
    	 driver.findElement(By.id("gwt-uid-13")).sendKeys("01/01/2015");
    	 driver.findElement(By.className("v-button-primary")).click();
    	// Thread.sleep(5000);
    	 driver.quit();
    }
}
