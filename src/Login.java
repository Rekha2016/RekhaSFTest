import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {
	
	public WebDriver testl() {
		System.setProperty("webdriver.chrome.driver", "C:\\Kuts\\Selenium\\eclipse\\chromedriver.exe");
		WebDriver myCa = new ChromeDriver ();
		myCa.get("https://pi.pardot.com");
		myCa.manage().window().maximize();
		myCa.findElement(By.xpath("//input[@name='email_address']")).sendKeys("pardot.applicant@pardot.com");
		myCa.findElement(By.xpath("//input[@name='password']")).sendKeys("Applicant2012");
		myCa.findElement(By.xpath("//input[@class='btn btn-primary btn-block']")).click();
		System.out.println("User Logged into Pardot!"); 
		return myCa;
	}
	
	
}
