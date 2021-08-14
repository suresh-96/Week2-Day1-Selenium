package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login
{
	public static void main(String[] args) 
	{
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 WebElement Webuser = driver.findElement(By.id("username"));
		 Webuser.sendKeys("demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		 driver.findElementByXPath("//*[@id=\"ext-gen41\"]/ul/li[2]/div/div/div/div/div/a").click();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElementByXPath("//*[@id=\"left-content-column\"]/div[1]/div[2]/ul/li[2]/a").click();
		 driver.findElement( By.id("createLeadForm_companyName")).sendKeys("Aezion Technologies");
		 driver.findElement( By.id("createLeadForm_firstName")).sendKeys("Suresh");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("B");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 WebElement drop1 =driver.findElement(By.id("createLeadForm_dataSourceId"));
		 Select drpdwn1 =new Select(drop1);
		 drpdwn1.selectByVisibleText("Employee");
		 WebElement drop2 =driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		 Select drpdwn2 =new Select(drop2);
		 drpdwn2.selectByVisibleText("Pay Per Click Advertising");
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("SURESH");
		 driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("BALA");
		 driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
		 
		 
		 driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("200000");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Quality");
		 WebElement drop3 =driver.findElement(By.id("createLeadForm_industryEnumId"));
		 Select drpdwn3 =new Select(drop3);
		 drpdwn3.selectByIndex(2);
		 driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("1500");
		 WebElement drop4 =driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		 Select drpdwn4 =new Select(drop4);
		 drpdwn4.selectByIndex(2);
		 driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("12345");
		 driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("BS");
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("LEARNING SELENIUM");
		 driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("CLASS FROM TEAST LEAF");
		 driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		 driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("002");
		 driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1234567890");
		 driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("04256");
		 driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("JOHN");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sureshbala128@gmail.com");
		 driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Suresh");
		 driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("sureshbala");
		 driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("13 car street");
		 driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Erode");
		 WebElement drop5 =driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select drpdwn5 =new Select(drop5);
		 drpdwn5.selectByIndex(5);
		 
		 driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("638315");
		 WebElement drop6 =driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		 Select drpdwn6 =new Select(drop6);
		 drpdwn6.selectByIndex(4);
		 driver.findElement(By.name("submitButton")).click();
		 
		 
		 
		 
		 
		 
		 }

	
	}
	
