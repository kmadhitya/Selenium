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

public class TrainsSortedOne {

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
		WebElement columntable = driver.findElementByXPath("//table[@class='DataTable DataTableHeader TrainList TrainListHeader']");
		List<WebElement> column = columntable.findElements(By.tagName("td"));
		System.out.println("Total number of columns: "+column.size());		
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
		System.out.println("List 1 size: "+list1.size());
		System.out.println("Trains List before Sorting: "+list1);
		Collections.sort(list1);
		System.out.println("Trains List after Sorting through Collections: "+list1);
		driver.findElementByXPath("//a[text()='Train Name']").click();
		List<String> list2 = new ArrayList<String>();
		for (int j=1; j<=rows.size()-1; j++)
		{
			String eachTrainName = driver.
					findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr["+j+"]/td[2]/a").
					getText();
			list2.add(eachTrainName);
		}
		System.out.println("List 2 size: "+list2.size());
		System.out.println("Trains List after cliscking on Tains header: "+list2);
		if(list1.equals(list2))
		{
			System.out.println("Trains are Sorted Correctly");
		}
		else
		{
			System.out.println("Trains are not sorted correctly");
		}
		
		
		driver.close();
	}
}
