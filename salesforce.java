package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class salesforce
{
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 WebElement Webuser = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/div/div/form/div[1]/div/div[1]/div/div/input"));
		 Webuser.sendKeys("SURESH");
		 driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/div/div/form/div[1]/div/div[2]/div/div/input")).sendKeys("Krishnan");
		 driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/div/div/form/div[2]/div/div[1]/div/div/input")).sendKeys("sureshbala128@gmail.com");
		 WebElement drop1 =driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/div/div/form/div[2]/div/div[2]/div/div/select"));
		 Select drpdwn1 =new Select(drop1);
		 drpdwn1.selectByVisibleText("IT Manager");	
		 driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/div/div/form/div[3]/div/div[1]/div/div/input")).sendKeys("Code snypers");
		 WebElement drop2 =driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/div/div/form/div[3]/div/div[2]/div/div/select"));
		 Select drpdwn2 =new Select(drop2);
		 drpdwn1.selectByIndex(1);
		 driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/div/div/form/div[4]/div/div[1]/div/div/input")).sendKeys("1234567896");
		 driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/div/div/form/div[5]/div/div[1]")).click();
	driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/div/div/form/div[13]/button")).click();
	 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.close();
	}
	

}
