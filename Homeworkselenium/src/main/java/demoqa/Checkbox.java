package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Checkbox extends Basic {
	
	public void checkBoxx()
	{
		driver.navigate().to("https://demoqa.com/checkbox");
		WebElement check1=driver.findElement(By.cssSelector("div.check-box-tree-wrapper"));
		check1.click();
		WebElement check2=driver.findElement(By.cssSelector("div#adplus-anchor"));
		check2.click();
		WebElement check3=driver.findElement(By.cssSelector("input#tree-node-documents"));
		check3.click();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Checkbox checkbox =new Checkbox();
		checkbox.initialize_Browser();
		checkbox.checkBoxx();
		//checkbox.driver_QuitandClose();
		

	}

}
