package test1.test1;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Unit test for simple App.
 */
public class AppTest {
	
	public static void main() throws Exception{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\poornima.p\\eclipse-workspace\\test1\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	}

}