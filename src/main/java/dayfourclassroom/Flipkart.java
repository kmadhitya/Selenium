package dayfourclassroom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//button[text()='✕']").click();
		WebElement homeAndFurn = driver.findElementByXPath("//span[text()='Home & Furniture']");
		Actions builder = new Actions(driver);
		builder.moveToElement(homeAndFurn).perform();
		driver.findElementByXPath("//a[text()='Paintings']").click();		

	}

}
