package dayeightprojectwork;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindHighPricedZoomCar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.zoomcar.com/chennai");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//a[@class='search']").click();
		driver.findElementByXPath("//div[text()='Popular Pick-up points']/following::div[1]").click();
		driver.findElementByXPath("//button[text()='Next']").click();
		
		Thread.sleep(2000);
		Date date = new Date();
		DateFormat sdf = new SimpleDateFormat("dd");
		
		String today = sdf.format(date);
		System.out.println("today: "+today);
		
		// Convert to integer and add 1 to it
		int tomorrow = Integer.parseInt(today)+1;

		// Print tomorrow's date
		System.out.println("tomorrow: "+tomorrow);

		driver.findElementByXPath("//div[contains(text(),'"+tomorrow+"')]").click();
		
		driver.findElementByXPath("//button[text()='Next']").click();
		
		String startDate = driver.findElementByXPath("//div[text()='PICKUP TIME']/following::div[2]").getText();
		System.out.println(startDate);
		
		driver.findElementByXPath("//button[text()='Done']").click();
		
		Thread.sleep(2000);
		
		List<WebElement> listOfCars = driver.findElementsByXPath("//div[@class='car-listing']");
		
		System.out.println("Total Number of Cars: "+listOfCars.size());
		
		List<Integer> listOfPrice = new ArrayList<Integer>();
				
		for (int i=1; i<=listOfCars.size(); i++)
		{
			String text = driver.findElementByXPath("(//div[@class='price'])["+i+"]").getText();
			String replaceAll = text.replaceAll("\\D", "");
			int parseInt = Integer.parseInt(replaceAll);
			listOfPrice.add(parseInt);
		}
		System.out.println(listOfPrice);
		
		Integer max = Collections.max(listOfPrice);
		
		System.out.println(max);
		
		int indexOfMax = listOfPrice.indexOf(max)+1;
		
		System.out.println(indexOfMax);
		
		String vehicle = driver.
				findElementByXPath("(//div[@class='price'])["+indexOfMax+"]/ancestor::div[2]/preceding-sibling::div[1]/h3").
				getText();
		
		System.out.println("highest value brand: "+vehicle);
		driver.
		findElementByXPath("((//div[@class='price'])["+indexOfMax+"])/following-sibling::button[text()='BOOK NOW']").
		click();
		driver.close();
	}

}
