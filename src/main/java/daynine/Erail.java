package daynine;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

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
		System.out.println(rows.size());
		WebElement columntable = driver.findElementByXPath("//table[@class='DataTable DataTableHeader TrainList TrainListHeader']");
		List<WebElement> column = columntable.findElements(By.tagName("td"));
		System.out.println(column.size());
		int lastrow = rows.size();
		int size1 = table.findElements(By.tagName("tr")).size();
		String lasttrain = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr["+(lastrow-1)+"]/td[1]/a").getText();
		System.out.println(lasttrain);
		WebElement lastrow1 = table.findElements(By.tagName("tr")).get(size1-1);
		String lasttrainnum = lastrow1.findElements(By.tagName("td")).get(0).getText();
		System.out.println(lasttrainnum);
		//abhuvan1987@gmail.com
		//dhivyavijaya@gmail.com

	}

}
