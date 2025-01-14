package obsqurainterface;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableDemo extends ObsBase

{
	public void ColShow()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> tab1=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[5]"));
		for(WebElement list:tab1)
		{
			System.out.println(list.getText());
		}
	}
	public void RowShow()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement row6=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[6]"));
		System.out.println(row6.getText());
	}
	
	public void CellShow() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement cell2=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[4]//td[2]"));
		System.out.println(cell2.getText());
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TableDemo tabledemo=new TableDemo();
		tabledemo.initialize_Browse();
		//tabledemo.ColShow();
		//tabledemo.RowShow();
		tabledemo.CellShow();
		//tabledemo.driver_QuitandClose();
	}

}
