package daysevenhomework;

import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
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
		String firstLead = driver.findElementByXPath("(//a[@class='linktext'])[4]").getText();
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		driver.findElementByXPath("//a[text()='Delete']").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//label[contains(text(),'Lead ID')]/following::input[1]").sendKeys(firstLead);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		String msg = "No records to display";
		Thread.sleep(5000);
		String noRecordMessage = driver.findElementByXPath("//div[text()='No records to display']").getText();
		System.out.println(noRecordMessage);
		if (noRecordMessage.equalsIgnoreCase(msg))
			System.out.println("No records Found Message displayed");
		else
			System.out.println("Records Found - Delete Failed");
		driver.close();
	}

}
