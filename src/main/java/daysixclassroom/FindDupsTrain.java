package daysixclassroom;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindDupsTrain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='txtStationFrom']").clear();
		driver.findElementByXPath("//input[@id='txtStationFrom']").sendKeys("MS",Keys.TAB);
		driver.findElementByXPath("//input[@id='txtStationTo']").clear();
		driver.findElementByXPath("//input[@id='txtStationTo']").sendKeys("TPJ",Keys.TAB);
		Thread.sleep(3000);
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("Total number of rows: "+rows.size());
		List<String> list1 = new ArrayList<String>();
		for (int i=1;i<=rows.size();i++)
		{
			if(i!=23)
			{
				String eachTrainName = driver.
						findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr["+i+"]/td[2]/a").
						getText();
				list1.add(eachTrainName);
			}
		}
		int totalTrainNames = list1.size();
		System.out.println("Total trains are: "+totalTrainNames);
		
		Set<String> trainsSet = new LinkedHashSet<String>();
		for (int k=1; k<=rows.size(); k++)
		{
			if(k!=23)
			{
				String eachTrainNum = driver.
						findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr["+k+"]/td[2]/a").
						getText();
				trainsSet.add(eachTrainNum);
			}
			
		}
		int totalTrainsThruSet = trainsSet.size();
		System.out.println("Total number of unique trains are: "+totalTrainsThruSet);
		if (totalTrainsThruSet==totalTrainNames)
		{
			System.out.println("No repeating of Train names or dups");
		}
		else
		{
			System.out.println("Train Names are repeating. Duplicate names are present");
		}
		
		driver.close();
	}

}
