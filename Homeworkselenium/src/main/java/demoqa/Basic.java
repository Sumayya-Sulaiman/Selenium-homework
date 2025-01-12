package demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class Basic {

		WebDriver driver;
		public void initialize_Browser()
		{
		driver= new ChromeDriver();//loading the driver
			//driver=new EdgeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();

		}
		public void driver_QuitandClose()
		{
			//driver.close();
			driver.quit();
		}

		public static void main(String[] args) 
		{
			 // TODO Auto-generated method stub
	Basic basic =new Basic();
	basic.initialize_Browser();
	}

}

