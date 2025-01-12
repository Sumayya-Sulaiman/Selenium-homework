package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Radiooo extends Basic {
	
	
	public void radioButton()
	{
		driver.navigate().to("https://demoqa.com/radio-button");
		
		WebElement check1=driver.findElement(By.cssSelector("label[for=impressiveRadio]"));
		check1.click();
	}
	
	
	public void isSelected()
	{
		driver.navigate().to("https://demoqa.com/radio-button");
		WebElement check1=driver.findElement(By.cssSelector("label[for=impressiveRadio]"));
		check1.click();
		if(check1.isSelected()) {
			System.out.println("already selected");
		}
		else {
			check1.click();
			System.out.println("select");
		}
	}
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Radiooo radioo=new Radiooo();
		radioo.initialize_Browser();
		radioo.radioButton();
		//radioo.driver_QuitandClose();
	}

	
}
