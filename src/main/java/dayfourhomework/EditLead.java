package dayfourhomework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//label[text()='Email Address:']/following::div[1]/input").sendKeys("Adhitya");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		String resultingLead = driver.getTitle();
		System.out.println(resultingLead);
		if (resultingLead.equalsIgnoreCase("View Lead | opentaps CRM"))
		{
			System.out.println("Title Matches");
		}
		else
		{
			System.out.println("Title does not match");
		}
		driver.findElementByXPath("//a[text()='Edit']").click();
		driver.findElementByXPath("//span[text()='Company Name']/following::input[1]").clear();
		String str = "Change_CompanyName";
		driver.findElementByXPath("//span[text()='Company Name']/following::input[1]").sendKeys(str);
		driver.findElementByXPath("//input[@value='Update']").click();
		String companyName = driver.findElementByXPath("//span[text()='Company Name']/following::span[1]").getText();
		if(companyName.contains(str))
		{
			System.out.println("Changed name Appears");
		}
		else
		{
			System.out.println("Changed name does not Appear");
		}
		driver.close();
	}

}
