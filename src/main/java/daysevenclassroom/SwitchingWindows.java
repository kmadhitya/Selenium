package daysevenclassroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindows {
	public static void main(String[] args) throws InterruptedException {
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
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("Window Handle Names are: ");
		for (String wHandle : windowHandles)
		{
			System.out.println(wHandle);
		}
		List<String> list = new ArrayList<String>(windowHandles);
		String firstWindow = list.get(0);
		String secondWindow = list.get(1);
		//driver.switchTo().window(secondWindow);
		//Set<String> windowHandles = driver.getWindowHandles();
		int size = windowHandles.size();
		//List<String> listOfWindowHandles = new ArrayList<String>(windowhandles);
		for (int i = size-1; i>0 ; i--)
		{
		String currentWindow = list.get(i);
		driver.switchTo().window(currentWindow);
		driver.close();
		}
		/*driver.findElementByXPath("//label[contains(text(),'First name')]/following::input[1]").sendKeys("Company");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		driver.switchTo().window(firstWindow);
		System.out.println("Title of current/main browser is: "+driver.getTitle());*/
	}

}
