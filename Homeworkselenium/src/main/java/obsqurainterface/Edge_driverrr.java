package obsqurainterface;


	
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
	// import org.openqa.selenium.edge.EdgeDriver;
public class Edge_driverrr {
		WebDriver driver;
		public void initialize_Browser()
		{
		driver= new EdgeDriver();//loading the driver
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();
		}

		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			Edge_driverrr edgedriverrr =new Edge_driverrr();
			edgedriverrr.initialize_Browser();
	}}


