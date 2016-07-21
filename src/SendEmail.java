import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class SendEmail {

	
		public static void se(WebDriver myC, String m)throws InterruptedException {
			myC.findElement((By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/a/span"))).click();
			myC.findElement((By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/ul/li[7]/a"))).click();
			myC.findElement((By.xpath("/html/body/div[2]/div[1]/div/div/div[2]/div[1]/div[1]/div[3]/div[1]/span/a"))).click();
			Thread.sleep(3000);
			myC.findElement((By.xpath("/html/body/div[2]/div/div/div/div[1]/div[1]/div/div/div[2]/div/form/div/div[2]/div[2]/div/input"))).sendKeys(m);
			myC.findElement((By.xpath("/html/body/div[2]/div/div/div/div[1]/div[1]/div/div/div[2]/div/form/div/div[2]/div[5]/div/div/button"))).click();
			myC.findElement((By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/div[3]/div/div[1]/div/div[1]/div[2]/div/div/div[4]/div/div/div/a"))).click();
			Thread.sleep(1000);
			myC.findElement((By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/div[3]/div/div[2]/div/div[3]/div/div/div/div/div/div/div[1]/h4"))).click();
			myC.findElement((By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/div[4]/button[2]"))).click();
			myC.findElement((By.xpath("/html/body/div[2]/div/div/div/div[1]/div[1]/div/div/div[2]/div/form/div/div[2]/div[6]/div/label[2]/input"))).click();
			myC.findElement((By.xpath("/html/body/div[2]/div/div/div/div[1]/div[1]/div/div/div[2]/div/form/div/div[3]/a"))).click();
			Thread.sleep(2000);
			myC.findElement((By.xpath("/html/body/div[2]/div/div/div/div[1]/div[7]/div/div/div[2]/div/div[2]/ul/li[1]/img"))).click();
			myC.findElement((By.xpath("/html/body/div[2]/div/div/div/div[1]/div[7]/div/div/div[3]/button[1]"))).click();
			Thread.sleep(2000);
			myC.findElement((By.xpath("/html/body/div[2]/div/div/div/div[1]/div[6]/div/div[2]/div/button"))).click();
			Thread.sleep(2000);
			myC.findElement((By.xpath("/html/body/div[1]/div/div/div/ul[2]/li[1]/a/span"))).click();
			myC.findElement((By.xpath("/html/body/div[1]/div/div/div/ul[2]/li[1]/ul/li[8]/a"))).click();
			myC.close();
		}
		
		
		
}
