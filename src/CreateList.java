import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;


public class CreateList {
	
	public static void RetBr(WebDriver myC, String n) throws InterruptedException {
		Thread.sleep(2000);
		myC.findElement((By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/a/span"))).click();
		myC.findElement((By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/ul/li[11]/a"))).click();
		Thread.sleep(2000);
		myC.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[1]/div[1]/div[3]/div[1]/span/a")).click();
		Thread.sleep(2000);
		myC.findElement(By.xpath("//input[@id='name']")).sendKeys(n);
		Thread.sleep(2000);
		myC.findElement(By.cssSelector("button.btn.choose-asset")).click();
		myC.findElement(By.xpath("/html/body/div[2]/div/div/div/div[3]/div/div/div[3]/div/div[1]/div/div/div[2]/div/div/div[4]/div/div/div/a")).click();
		myC.findElement(By.xpath("/html/body/div[2]/div/div/div/div[3]/div/div/div[4]/button[2]")).click();
		Thread.sleep(2000);
		WebElement wb=myC.findElement(By.xpath("//div[@class='modal-footer']"));
		WebElement dupButton = wb.findElement(By.id("save_information"));
		dupButton.click();
		Thread.sleep(3000);
				
		
	}
}
	
	
		
		
		                       

	

