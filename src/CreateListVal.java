import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CreateListVal {
	

	public static boolean RetBrVal(WebDriver myC, String no) throws InterruptedException {
		CreateList.RetBr(myC, no);
		Thread.sleep(2000);
		WebElement vm=myC.findElement(By.id("error_for_name"));
		if (vm.isDisplayed()){
			
			return true;
			
		} else {
			return false;
		}
		
		
		
	}

}
