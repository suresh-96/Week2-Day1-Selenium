package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook 
{
	public static void main(String[] args) 
	{
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
		 driver.findElement(By.name("firstname")).sendKeys("suresh");
		 driver.findElement(By.name("lastname")).sendKeys("krishnan");
		 driver.findElement(By.name("reg_email__")).sendKeys("sureshbmpg@gmail.com");
		 driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sureshbmpg@gmail.com");
		 driver.findElement(By.id("password_step_input")).sendKeys("sureshkrishnan");
		  WebElement drop5 =driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]"));
		 Select drpdwn5 =new Select(drop5);
		 drpdwn5.selectByVisibleText("27");
		 WebElement drop2 =driver.findElement(By.id("month"));
		 Select drpdwn2 =new Select(drop2);
		 drpdwn2.selectByIndex(2);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 WebElement drop3 =driver.findElement(By.id("year"));
		 Select drpdwn3 =new Select(drop3);
		 drpdwn3.selectByVisibleText("1995");
		 WebElement radio1 =driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label"));
		 radio1.click();
		 driver.findElement(By.name("websubmit")).click();
	}

}
