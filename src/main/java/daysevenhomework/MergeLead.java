package daysevenhomework;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Merge Leads']").click();
		driver.findElementByXPath("//span[text()='From Lead']/following::a[1]").click();
		Set<String> windowHandleslist1 = driver.getWindowHandles();
		
		List<String> list1 = new ArrayList<String>(windowHandleslist1);
		
		String mainWindow = list1.get(0);
		String fromLeadWindow = list1.get(1);
		String fromLead = "Company7";
		String toLead = "Company8";
		driver.switchTo().window(fromLeadWindow);
		driver.findElementByXPath("//label[contains(text(),'First name')]/following::input[1]").sendKeys(fromLead);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		driver.switchTo().window(mainWindow);
		driver.findElementByXPath("//span[text()='To Lead']/following::a[1]").click();
		Set<String> windowHandleslist2 = driver.getWindowHandles();
		List<String> list2 = new ArrayList<String>(windowHandleslist2);
		String toLeadWindow = list2.get(1);
		driver.switchTo().window(toLeadWindow);
		driver.findElementByXPath("//label[contains(text(),'First name')]/following::input[1]").sendKeys(toLead);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		driver.switchTo().window(mainWindow);
		driver.findElementByXPath("//a[text()='Merge']").click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//Checking for the FirstName after Merge
		String firstNameAfterMerge = driver.findElementByXPath("//span[text()='First name']/following::span[1]").getText();
		if (firstNameAfterMerge.equals(toLead))
		{
			System.out.println("First Name is looking correct");
		}
		else
		{
			System.out.println("Seems something wrong....");
		}
		
		//Checking if 1st record on the merge is available
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("((//label[text()='First name:'])[3]/following::input)[1]").sendKeys(fromLead);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		String msg = "No records to display";
		Thread.sleep(5000);
		String noRecordMessage = driver.findElementByXPath("//div[text()='No records to display']").getText();
		
		if (noRecordMessage.equalsIgnoreCase(msg))
			System.out.println("No records Found Message displayed - Merge Successful");
		else
			System.out.println("Records Found - Merge Failed");
		driver.close();
		
		
		

	}

}
