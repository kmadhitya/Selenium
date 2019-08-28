package dayfourhomework;

import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxCheckedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://erail.in");		
		driver.manage().window().maximize();
		boolean uncheckedbox = driver.findElementByXPath("//td[@id='tdToOnly']//input[1]").isSelected();		
		if(uncheckedbox==false)
			System.out.println("Checkbox unchecked");
		else
			System.out.println("Checked");		
		boolean checkedcheckbox = driver.
				findElementByXPath("//label[contains(text(),'Sort on Date')]/following-sibling::input").isSelected();
		if(checkedcheckbox==false)
			System.out.println("Checkbox unchecked");
		else
			System.out.println("Checked");

	}

}
