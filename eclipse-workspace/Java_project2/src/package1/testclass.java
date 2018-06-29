package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testclass {
		public static void main (String[] args) {
			System.out.println("Testing Selenium");
				System.setProperty("webdriver.ie.driver", "C:\\Users\\poornima.p\\eclipse-workspace\\Java_project1\\Drivers\\IEDriverServer.exe");
				WebDriver driver =new InternetExplorerDriver();
				driver.get("http://thedemosite.co.uk/addauser.php");
				driver.navigate();
				System.out.println(driver.getTitle());
				WebElement txtboxUsername = driver.findElement(By.name("username"));	
				txtboxUsername.sendKeys("User1");
				WebElement txtboxPassword = driver.findElement(By.name("password"));
				txtboxPassword.sendKeys("Pass1");
				WebElement btnSave = driver.findElement(By.name("FormsButton2"));
				btnSave.click();
		}		
}
