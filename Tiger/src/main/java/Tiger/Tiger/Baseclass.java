package Tiger.Tiger;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.Tiger.pom.LoginPage;



 public class Baseclass {
	   static {
		   System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	   }
	   
	   public FileLibrary f = new FileLibrary();
	   public static WebDriver d;
	   
	   @BeforeTest 
	   public void openBrowser()
	   {
		   System.out.println("open Browser");
		   d = new ChromeDriver();
		   d.manage().window().maximize();
		   d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   }
	   
	   @AfterTest
	   public void closeBrowser()
	   {
		   System.out.println("close Browser");
		   
		   
	   }
	   
	   @BeforeMethod
	   public void login() throws IOException
	   {
		   System.out.println("LOGIN");
		   String url =f.getPropertyData("url");
		   String u = f.getPropertyData("un");
		   String p = f.getPropertyData("pw");
		   d.get(url);
		   LoginPage l = new LoginPage(d);
		   l.setLogin(u, p);
	   }
	   
	   @AfterMethod
	   public void logout()
	   {
		   
	   }
 
}
