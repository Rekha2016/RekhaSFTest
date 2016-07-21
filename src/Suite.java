import org.openqa.selenium.WebDriver;

public class Suite {
	public static void main(String[] args) throws InterruptedException {
		Login lg = new Login();
		WebDriver myC = lg.testl();
		String na = "Random123p";
		CreateList.RetBr(myC, na);
		System.out.println("List Created!");
		boolean ret = CreateListVal.RetBrVal(myC, na);
		if (ret){
			System.out.println("Name Validation Passed!");
		}else{
			System.out.println("Validation Failed!");
		}
		String n = RenAdd.RetList(myC);
		CreateList.RetBr(myC, na);
		System.out.println("List Renamed and Original list added back --"+ n);
		AddPrspct.Ad(myC, n);
		SendEmail.se(myC, n);
		System.out.println("Email sent!");
	}
}
