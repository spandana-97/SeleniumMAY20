package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class TC001_CreateLead {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps");
	// Enter Username
	driver.findElementById("username").sendKeys("demosalesmanager");
	// Enter Password
	driver.findElementById("password").sendKeys("crmsfa");
	// Click Login Button
	driver.findElementByClassName("decorativeSubmit").click();
	// Click CRM/SFA Link
	driver.findElementByLinkText("CRM/SFA").click();
	// Click Leads Link
	driver.findElementByLinkText("Leads").click();
	// Click Create Lead Link
	driver.findElementByLinkText("Create Lead").click();
	// Enter Company Name
	driver.findElementById("createLeadForm_companyName").sendKeys("Beyontec");
	//Enter First Name
	driver.findElementById("createLeadForm_firstName").sendKeys("Spandana");
	//Enter Last Name
	driver.findElementById("createLeadForm_lastName").sendKeys("Todupunuri");
	//select value as employee in source using SelectbyVisible text
	WebElement Source = driver.findElementById("createLeadForm_dataSourceId");
	Select dropDown= new Select(Source);
	dropDown.selectByVisibleText("Employee");
	//select value as pay per click advertsing using SelectbyIndex
	WebElement MarketingCampaign=driver.findElementById("createLeadForm_marketingCampaignId");
	Select dropDown1= new Select (MarketingCampaign);
	dropDown1.selectByValue("9001");
	//select value as corporation in ownership field using selectbyIndex
	WebElement Ownership=driver.findElementById("createLeadForm_ownershipEnumId");
	Select dropdown2= new Select (Ownership);
	dropdown2.selectByIndex(5);
	//select value as India in country field using Singlebyvisibile text
	WebElement Country=driver.findElementById("createLeadForm_generalCountryGeoId");
	Select dropDown3=new Select(Country);
	dropDown3.selectByVisibleText("India");
	// click create lead
	driver.findElementByClassName("smallSubmit").click();
	// Title of the page
	String pageTitle = driver.getTitle();
	System.out.println("pagetitle " +pageTitle);
	
	
	
	
	
	
	// click on create Lead button
	//driver.findElementByClassName("smallSubmit").click();
}
}
