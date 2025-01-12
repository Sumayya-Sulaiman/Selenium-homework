package obsqurainterface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Mozillaaaaaa 
{
	WebDriver driver;
	public void initialize_Browserr()
	{
	driver= new FirefoxDriver();//loading the driver
	driver.get("https://selenium.qabible.in/");
	driver.manage().window().maximize();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mozillaaaaaa mozillaaaaa =new Mozillaaaaaa();
		mozillaaaaa.initialize_Browserr();
}

}

