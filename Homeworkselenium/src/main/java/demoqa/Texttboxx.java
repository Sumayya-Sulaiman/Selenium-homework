package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Texttboxx extends Basic
{
	
	public void texttBox()
	{
		driver.navigate().to("https://demoqa.com/text-box");
		WebElement test1=driver.findElement(By.cssSelector("input#userName"));
		test1.sendKeys("hai");
		
		WebElement test2=driver.findElement(By.cssSelector("//button [@id='submit']"));
		test2.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Texttboxx texttboxx =new Texttboxx ();
		texttboxx.initialize_Browser();
		texttboxx.texttBox();
		//texttboxx.driver_QuitandClose();
		

	}

}
