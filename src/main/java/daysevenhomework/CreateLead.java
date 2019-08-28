package daysevenhomework;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		for (int i=31; i<=35; i++)
		{
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Company"+i);
		driver.findElementById("createLeadForm_firstName").sendKeys("Company"+i);
		driver.findElementById("createLeadForm_lastName").sendKeys("Company_LastName"+i);
		driver.findElementByXPath("//span[text()='E-Mail Address']/following::input[1]").sendKeys("kmadhitya" +i+ "@selenium.com");
		
		//driver.findElementByName("submitButton").click();
		WebElement marketingcampaign = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd = new Select(marketingcampaign);
		List<WebElement> alloptions = dd.getOptions();
		int size = alloptions.size();
		dd.selectByIndex(size-1);
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select ind = new Select(industry);
		ind.selectByVisibleText("Computer Software");
		driver.findElementByName("submitButton").click();
		}
		driver.close();

	}

}
