package PomRepo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGenerateStaleElementException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	            System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				driver.get("https:/www.google.in/");
	 
				WebElement element = driver.findElement(By.id("q"));
	            element.sendKeys("rahul");
	            driver.navigate().refresh();
	            element.sendKeys("raz");
	
	
	
	
	
	
	
	
	}

}
