package dayeightprojectwork;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookLike {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String tl = "TestLeaf";
		driver.findElementById("email").sendKeys("kmadhitya87@gmail.com");
		driver.findElementById("pass").sendKeys("Chennai@1");
		driver.findElementByXPath("//input[@value='Log In']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//input[@placeholder='Search'])[1]").sendKeys(tl);
		
		Thread.sleep(2000);
		driver.findElementByXPath("(//button[@type='submit'])[1]/i").click();
		
		Thread.sleep(2000);
		driver.findElementByXPath("(//div[text()='Places'])[1]").click();
		Thread.sleep(2000);
		String text = driver.findElementByXPath("(//span[@class='_1wu_'])[1]/a").getText();
		
		if (text.equals(tl))
		{
			System.out.println("TestLeaf text is displayed correclty - Passed: "+text);
		}
		else
		{
			System.out.println("TestLeaf text is not displayed correclty - Failed: "+text);
		}
		
		String lk = "Like";	
		String lkd = "Liked";
		Thread.sleep(2000);
		String text2 = driver.findElementByXPath("(//button[@type='submit']//i)[3]").getText();
		
		if (text2.equals(lk))
		{
			driver.findElementByXPath("(//button[@type='submit']//i)[3]").click();
		}
		else if (text2.equals(lkd))
		{
			System.out.println("Already Liked");
		}
		
		driver.findElementByXPath("(//span[@class='_1wu_'])[1]/a").click();
		
		String title = driver.getTitle();
		
		if(title.contains("TestLeaf"))
		{
			System.out.println("TestLeaf title is displayed correclty - Passed: "+title);
		}
		else
		{
			System.out.println("TestLeaf title is not displayed correclty - Failed: "+title);
		}
		Thread.sleep(2000);
		String totalLiked = driver.findElementByXPath("//span[text()='Community']/ancestor::div[1]/following-sibling::div[1]/div/div[2]/div").getText();
		System.out.println(totalLiked);
		
		driver.close();

	}

}
