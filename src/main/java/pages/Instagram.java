package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Base.base;

public class Instagram extends base {
	
	public void openurl()
	{
		driver.get("https://www.instagram.com/");
	}
	
	public void loginToInstagram() {
		try {
		
			WebElement username= driver.findElement(By.xpath("//input[@aria-label=\"Phone number, username, or email\"]"));
			username.sendKeys("");
			Thread.sleep(2000);
			WebElement Password= driver.findElement(By.xpath("//input[@aria-label=\"Password\"]"));
			Password.sendKeys("");
			Thread.sleep(2000);
			WebElement login= driver.findElement(By.xpath("//button//div[contains(text(),\"Log in\")]"));
			login.click();
			Thread.sleep(8000);
			
			WebElement NotNow =driver.findElement(By.xpath("//button[contains(text(),\"Not Now\")]"));
			JavascriptExecutor jsh = (JavascriptExecutor) driver;
			jsh.executeScript("arguments[0].click();",NotNow);
			Thread.sleep(5000);
			
			WebElement NotNow2 =driver.findElement(By.xpath("//button[contains(text(),\"Not Now\")]"));
			
			jsh.executeScript("arguments[0].click();",NotNow2);
			Thread.sleep(5000);
			
			WebElement profile =driver.findElement(By.xpath("//div[contains(text(),\"Profile\")]"));
		
			jsh.executeScript("arguments[0].click();",profile);
			Thread.sleep(3000);
			
			WebElement following =driver.findElement(By.xpath("//*[contains(text(),\" following\")]"));
			jsh.executeScript("arguments[0].click();",following);
			Thread.sleep(5000);
			
			 Robot robot = new Robot();
			 
			 Thread.sleep(2000);  // sleep has only been used to showcase each event separately	
	         robot.keyPress(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);	
	         robot.keyPress(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);	
	         robot.keyPress(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);	
	         robot.keyPress(KeyEvent.VK_TAB);	
	         robot.keyRelease(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);
	         robot.keyPress(KeyEvent.VK_ENTER);	
	         robot.keyRelease(KeyEvent.VK_ENTER);	
	         Thread.sleep(4000);
	         robot.keyPress(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);	
	         robot.keyPress(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);	
	         robot.keyPress(KeyEvent.VK_TAB);	
	         robot.keyRelease(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);	
	         robot.keyPress(KeyEvent.VK_ENTER);	
	         robot.keyRelease(KeyEvent.VK_ENTER);	
	         Thread.sleep(4000);
	         robot.keyPress(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);	
	         robot.keyPress(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);	
	         robot.keyPress(KeyEvent.VK_TAB);	
	         robot.keyRelease(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);
	         robot.keyPress(KeyEvent.VK_ENTER);	
	         robot.keyRelease(KeyEvent.VK_ENTER);	
	         Thread.sleep(4000);
	         robot.keyPress(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);	
	         robot.keyPress(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);	
	         robot.keyPress(KeyEvent.VK_TAB);	
	         robot.keyRelease(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);
	         robot.keyPress(KeyEvent.VK_ENTER);	
	         robot.keyRelease(KeyEvent.VK_ENTER);	
	         Thread.sleep(4000);
	         robot.keyPress(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);	
	         robot.keyPress(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);	
	         robot.keyPress(KeyEvent.VK_TAB);	
	         robot.keyRelease(KeyEvent.VK_TAB);	
	         robot.keyPress(KeyEvent.VK_ENTER);	
	         robot.keyRelease(KeyEvent.VK_ENTER);	
	         Thread.sleep(2000);
	         robot.keyPress(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);	
	         robot.keyPress(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);	
	         robot.keyPress(KeyEvent.VK_TAB);	
	         robot.keyRelease(KeyEvent.VK_TAB);	
	         robot.keyPress(KeyEvent.VK_ENTER);	
	         robot.keyRelease(KeyEvent.VK_ENTER);	
	         Thread.sleep(2000);
	         robot.keyPress(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);	
	         robot.keyPress(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);	
	         robot.keyPress(KeyEvent.VK_TAB);	
	         robot.keyRelease(KeyEvent.VK_TAB);	
	         robot.keyPress(KeyEvent.VK_ENTER);	
	         robot.keyRelease(KeyEvent.VK_ENTER);	
	         Thread.sleep(2000);
	         robot.keyPress(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);	
	         robot.keyPress(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);	
	         robot.keyPress(KeyEvent.VK_TAB);	
	         robot.keyRelease(KeyEvent.VK_TAB);	
	         robot.keyPress(KeyEvent.VK_ENTER);	
	         robot.keyRelease(KeyEvent.VK_ENTER);	
	         Thread.sleep(2000);
	         robot.keyPress(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);	
	         robot.keyPress(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);	
	         robot.keyPress(KeyEvent.VK_TAB);	
	         robot.keyRelease(KeyEvent.VK_TAB);	
	         robot.keyPress(KeyEvent.VK_ENTER);	
	         robot.keyRelease(KeyEvent.VK_ENTER);	
	         Thread.sleep(2000);
	         robot.keyPress(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);	
	         robot.keyPress(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);	
	         robot.keyPress(KeyEvent.VK_TAB);	
	         robot.keyRelease(KeyEvent.VK_TAB);	
	         robot.keyPress(KeyEvent.VK_ENTER);	
	         robot.keyRelease(KeyEvent.VK_ENTER);	
	         Thread.sleep(2000);
	         robot.keyPress(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);	
	         robot.keyPress(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);	
	         robot.keyPress(KeyEvent.VK_TAB);	
	         robot.keyRelease(KeyEvent.VK_TAB);	
	         robot.keyPress(KeyEvent.VK_ENTER);	
	         robot.keyRelease(KeyEvent.VK_ENTER);	
	         Thread.sleep(2000);
	         robot.keyPress(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);	
	         robot.keyPress(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);	
	         robot.keyPress(KeyEvent.VK_TAB);	
	         robot.keyRelease(KeyEvent.VK_TAB);	
	         robot.keyPress(KeyEvent.VK_ENTER);	
	         robot.keyRelease(KeyEvent.VK_ENTER);	
	         Thread.sleep(2000);
	         robot.keyPress(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);	
	         robot.keyPress(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);	
	         robot.keyPress(KeyEvent.VK_TAB);	
	         robot.keyRelease(KeyEvent.VK_TAB);	
	         robot.keyPress(KeyEvent.VK_ENTER);	
	         robot.keyRelease(KeyEvent.VK_ENTER);	
	         Thread.sleep(2000);
	         robot.keyPress(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);	
	         robot.keyPress(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);	
	         robot.keyPress(KeyEvent.VK_TAB);	
	         robot.keyRelease(KeyEvent.VK_TAB);	
	         robot.keyPress(KeyEvent.VK_ENTER);	
	         robot.keyRelease(KeyEvent.VK_ENTER);	
	         Thread.sleep(2000);
	         robot.keyPress(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);	
	         robot.keyPress(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);	
	         robot.keyPress(KeyEvent.VK_TAB);	
	         robot.keyRelease(KeyEvent.VK_TAB);	
	         robot.keyPress(KeyEvent.VK_ENTER);	
	         robot.keyRelease(KeyEvent.VK_ENTER);	
	         Thread.sleep(2000);
	         robot.keyPress(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);	
	         robot.keyPress(KeyEvent.VK_TAB);	
	         Thread.sleep(2000);	
	         robot.keyPress(KeyEvent.VK_TAB);	
	         robot.keyRelease(KeyEvent.VK_TAB);	
	         robot.keyPress(KeyEvent.VK_ENTER);	
	         robot.keyRelease(KeyEvent.VK_ENTER);	
	         
	         
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		Instagram IG=new Instagram();
		IG.driverSetup();
		IG.openurl();
		IG.loginToInstagram();
		IG.closeBrowser();
	}
	

}
