package daythreehomework;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcRegister {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
		driver.findElementByLinkText("click here").click();
		driver.findElementByXPath("//body//app-root//app-home//app-header/div[1]/div[3]/a/i").click();
		//driver.findElementByXPath("//button[text()='LOGIN']").click();
		//driver.findElementByXPath("(//span[text()='AGENT LOGIN'])[2]").click();
		//driver.findElementByXPath("//a[text()='Sign up']").click();
		
		Thread.sleep(5000);
		//driver.switchTo().frame("google_osd_static_frame");
		driver.findElementByXPath("//a[text()=' REGISTER ']").click();
		//driver.findElementByXPath("div[@class='multibutton']//a[1]").click();
		//driver.findElementByXPath("//body/app-root/app-home/div[2]/app-login//div/div[2]/div/div/a[1]").click();
		
		driver.findElementById("userName").sendKeys("Adhitya1");
		driver.findElementById("usrPwd").sendKeys("pwdpwd@1");
		driver.findElementById("cnfUsrPwd").sendKeys("pwdpwd@1");
		
		WebElement securityQ = driver.findElementByXPath("//label[text()='Select Security Question']");
		Select secQdd = new Select(securityQ);
		//List<WebElement> secQoptions = secQdd.getOptions();
		////label[contains(text(),'Security Question')]/ancestor::div[1]/following-sibling::div[1]/p-dropdown/div[1]/div[4]//li[1]
		secQdd.selectByVisibleText("What is your pet name?");
		driver.findElementByXPath("//label[contains(text(),'Security Answer')]/ancestor::div[1]/following-sibling::div[1]/input").sendKeys("Johny");
		WebElement selectPrefL = driver.findElementByXPath("//label[text()='Select Preferred Language']");
		Select selPL = new Select(selectPrefL);
		selPL.selectByVisibleText("English");
		
		driver.findElementById("firstName").sendKeys("FName");
		driver.findElementById("M");
		driver.findElementByXPath("//label[contains(text(),'Date Of Birth')]/ancestor::div[1]/following-sibling::div[1]//input").sendKeys("20-08-1994");
		WebElement selectOc = driver.findElementByXPath("//label[text()='Select Occupation']");
		Select selO = new Select(selectOc);
		selO.selectByVisibleText("PRIVATE");
		driver.findElementByXPath("//label[contains(text(),'Email')]/ancestor::div[1]/following-sibling::div[1]//input").sendKeys("test@test.com");
		driver.findElementByXPath("//label[contains(text(),'ISD-Mobile')]/ancestor::div[1]/following-sibling::div[2]//input").sendKeys("9090909090");

	}

}
