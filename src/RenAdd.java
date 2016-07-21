import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RenAdd {
	

	public static String RetList(WebDriver myC)throws InterruptedException {
					
			WebElement wx=myC.findElement(By.xpath("//div[@class='modal-footer']"));
			
			WebElement ClButton = wx.findElement(By.linkText("Cancel"));
			ClButton.click();
			
			myC.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[1]/div[3]/div[2]/div/table/tbody/tr[1]/td[2]/a")).click();
			myC.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/ul/li[1]/a")).click();
			Thread.sleep(2000);
			String oname=myC.findElement(By.xpath("//input[@id='name']")).getAttribute("value");
			myC.findElement(By.xpath("//input[@id='name']")).sendKeys("_updated");
			//String name=myC.findElement(By.xpath("//input[@id='name']")).getAttribute("value");
			//System.out.println("" + name);
			Thread.sleep(2000);
			
			
			WebElement wb=myC.findElement(By.xpath("//div[@class='modal-footer']"));
			WebElement dupButton = wb.findElement(By.id("save_information"));
			dupButton.click();
			return oname;
			
		
	}
		
	}