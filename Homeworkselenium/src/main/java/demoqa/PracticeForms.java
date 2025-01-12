package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PracticeForms  extends Basic {
	
	public void praciceForm()
	{
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		WebElement check1=driver.findElement(By.id("firstName"));
		check1.sendKeys("Malu");
		WebElement check2=driver.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
		check2.sendKeys("9857830302");
		WebElement check3=driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
		check3.click();
		WebElement check4=driver.findElement(By.cssSelector("label[for='gender-radio-2']"));
		check4.click();
			
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PracticeForms practiseform =new  PracticeForms();
		 practiseform.initialize_Browser();
		 practiseform.praciceForm();
		// practiseform.driver_QuitandClose();
	}

}
