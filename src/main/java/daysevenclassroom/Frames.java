package daysevenclassroom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		/*driver.findElementByXPath("//input[@title='Search']").sendKeys("w3schools");
		driver.findElementByXPath("//input[1][@value='Google Search']").click();
		driver.findElementByLinkText("w3schools").click();*/
		
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		
		Thread.sleep(2000);
		String name = "Adhitya";
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.sendKeys(name);
		alert.accept();
		
		String text = driver.findElementByXPath("//body/p").getText();
		
		if (text.contains(name))
		{
			System.out.println("The text contains the entered name: "+name);
		}
		else
		{
			System.out.println("The text does not contain the entered name: "+name);
		}
		
		//driver.switchTo().defaultContent();
		
		

	}

}
