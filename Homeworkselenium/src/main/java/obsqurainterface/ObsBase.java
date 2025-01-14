package obsqurainterface;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	public class ObsBase {
		WebDriver driver;
		public void initialize_Browse()
		{
		//driver= new ChromeDriver();//loading the driver
			driver=new EdgeDriver();
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();

		}
		public void driver_QuitandClose()
		{
			//driver.close();
			driver.quit();
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	ObsBase base =new ObsBase();
	base.initialize_Browse();
	}

	}
