package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args)throws InterruptedException {
		// Initialize the WebDriver
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL 
		driver.get("http://leaftaps.com/opentaps/");
		
		//Max the window
		driver.manage().window().maximize();
		
		Thread.sleep(1500);		
		
		//enter username:
		driver.findElement(By.id("username")).sendKeys("demoCSR");
		
		//enter Password:
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click on login
		driver.findElement(By.className("decorativeSubmit")).click();
		//click on CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on Account tab
		driver.findElement(By.linkText("Accounts")).click();
		//Click on the "Create Account" 
		driver.findElement(By.linkText("Create Account")).click();
		//enter acc name
		driver.findElement(By.className("inputBox")).sendKeys("testLeaf");
		//description 
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		//Select "ComputerSoftware" as the industry
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select Source = new Select(industry);
		Source.selectByVisibleText("Computer Software");
		//Select "S-Corporation" as ownership
		WebElement owner = driver.findElement(By.name("ownershipEnumId"));
		Select ownership = new Select(owner);
		ownership.selectByVisibleText("S-Corporation");
		//Select "Employee" as the source
		WebElement result = driver.findElement(By.id("dataSourceId"));
		Select r = new Select(result);
		r.selectByValue("LEAD_EMPLOYEE");
		//Select "eCommerce Site Internal Campaign" as the marketing campaign
		WebElement site = driver.findElement(By.id("marketingCampaignId"));
		Select a = new Select(site);
		a.selectByIndex(5);
		//Select "Texas" as the state/province
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select b = new Select(site);
		b.selectByValue("TX");
		//Click the "Create Account" button
		driver.findElement(By.name("submitButton")).click();
				//get title
		String title = driver.getTitle();
		if(title.contains("lead")) {
			System.out.println("Account name is displayed correctly");
		}
		else
		{
			System.out.println("Account name is displayed wrongly");
		}
		
		Thread.sleep(2000);
		//close window
	driver.close();
		
		
		
		
		

	}

}
