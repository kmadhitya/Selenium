package daythreeclassroom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SecondMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		WebElement ddIndus = driver.findElementByXPath("//span[text()='Industry']/following::select[1]");
		
		Select indObj = new Select(ddIndus);
		//String value = "Retail";
		//indObj.selectByVisibleText(value);
		List<WebElement> allOpt = indObj.getOptions();
		for(WebElement eachOption : allOpt)
		{
			
			
			if(eachOption.getText().startsWith("R"))
			{
				i++;
				if(i==2)
				{
					System.out.println(eachOption.getText());
					eachOption.click();
					break;
					
				}
			}
		}
		driver.findElementById("createLeadForm_companyName").sendKeys("Company");
		//driver.close();
	}

}
