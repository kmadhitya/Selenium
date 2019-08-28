package daysixclassroom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrainsSortedOrNot {

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
		driver.findElementById("chkSelectDateOnly").click();
		Thread.sleep(3000);
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("Total number of rows: "+rows.size());
		WebElement columntable = driver.findElementByXPath("//table[@class='DataTable DataTableHeader TrainList TrainListHeader']");
		List<WebElement> column = columntable.findElements(By.tagName("td"));
		System.out.println("Total number of columns: "+column.size());		
		ArrayList<String> list1 = new ArrayList<String>();		
		
		for (int i=1;i<=rows.size();i++)
		{
			list1.add(driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr["+i+"]/td[2]/a").getText().toString());
		}
		System.out.println(list1);
		System.out.println("Size before sorting: "+list1.size());
		Collections.sort(list1);
		System.out.println(list1);
		int totalTrainNames = list1.size();
		System.out.println("Size after sorting: "+list1.size());
		Set<String> trainsSet = new LinkedHashSet<String>();
		for (int k=1; k<=rows.size(); k++)
		{
			String eachTrainNum = driver.
					findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr["+k+"]/td[1]/a").
					getText();
			trainsSet.add(eachTrainNum);
		}
		System.out.println("Train Numbers through Set: "+trainsSet);
		int totalTrains = trainsSet.size();
		System.out.println("Total number of trains: "+totalTrains);
		if (totalTrains==totalTrainNames)
		{
			System.out.println("Unique");
		}
		else
		{
			System.out.println("Not Unique");
		}
		
		
		
		
		/*for(WebElement eachElement : rows)
		{
			String text = eachElement.findElements(By.tagName("td")).get(1).getText();
			list.add(text);
		}*/
		
		driver.close();

	}

}
