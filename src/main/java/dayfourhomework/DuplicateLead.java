package dayfourhomework;

import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
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
		String firstLeadName = driver.findElementByXPath("(//a[@class='linktext'])[6]").getText();
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		String msg = "Duplicate Lead";
		String duplicateLeadmsg = driver.findElementByXPath("//div[text()='Duplicate Lead']").getText();
		if (duplicateLeadmsg.equalsIgnoreCase(msg))
			System.out.println("Title 'Duplicate Lead' Message displayed - Passed");
		else
			System.out.println("'Duplicate Lead' Message does not appear - Failed");
		driver.findElementByXPath("//input[@value='Create Lead']").click();
		
		String duplicateLeadName = driver.
				findElementByXPath("//span[text()='First name']/following::span[1]").
				getText();
		if (duplicateLeadName.equalsIgnoreCase(firstLeadName))
			System.out.println("Duplicate Lead Name verified - Passed");
		else
			System.out.println("Duplicate Lead Name is different - Failed");
		driver.close();
	}

}
