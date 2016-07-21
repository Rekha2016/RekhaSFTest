import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import org.openqa.selenium.support.ui.Select;

public class AddPrspct {
	
	public static void Ad(WebDriver myC, String n)throws InterruptedException {
		Thread.sleep(1000);
		myC.findElement((By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/a/span"))).click();
		Thread.sleep(1000);
		myC.findElement((By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/ul/li[1]"))).click();
		Thread.sleep(3000);
		myC.findElement((By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/div[3]/div[1]/span/a"))).click();
		//myC.findElement((By.id("pr_link_create"))).click();
		Thread.sleep(2000);
		myC.findElement((By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/div[1]/div/form/div[2]/div/input"))).sendKeys("R1Test1123");
		myC.findElement((By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/div[1]/div/form/div[4]/div/input"))).sendKeys("R1Test1123@test.com");
		myC.findElement((By.id("campaign_id"))).sendKeys("Adil Yellow Jackets");
		myC.findElement((By.id("profile_id"))).sendKeys("Adil Yellow Jackets");
		myC.findElement((By.id("score"))).sendKeys("1");
		myC.findElement((By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/div[1]/div/form/div[20]/h4/i"))).click();
		myC.findElement((By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/div[1]/div/form/div[20]/div/div/div/div/div[1]/a/div/b"))).click();
		Thread.sleep(2000);
		//System.out.println("" + n);
		WebElement xy=myC.findElement((By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/div[1]/div/form/div[20]/div/div/div/div/div[1]/div/div/input")));
		xy.sendKeys(n);
		xy.sendKeys(Keys.TAB);
		myC.findElement((By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/div[1]/div/form/div[21]/input"))).click();
		Thread.sleep(5000);
		System.out.println("Prospect Added");
		
		
	}
}
	
	
	
	

