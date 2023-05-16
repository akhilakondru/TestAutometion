package swiggyBaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilClass.UtilClass;

public class BaseClass extends UtilClass {
	
	public static WebDriver driver;

	@BeforeMethod
	public void start() throws Exception {

		File file = new File("D:\\Practice\\akhila-workspace\\TestAutomation\\config.properties");
		FileInputStream fileInput = new FileInputStream(file);
		Properties pro = new Properties();
		pro.load(fileInput);
		String browser = pro.getProperty("browser");
		System.out.println("pro..."+pro);
		System.out.println("browse..."+browser);
		String url = pro.getProperty("url");
		System.out.println("url..."+url);

		if (browser.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.swiggy.com/?utm_source=Google-Sok&utm_medium=CPC&utm_campaign=perf_food_nu_google_search_sok_narm_brand_v1_v2_march23_brand_em&gclid=Cj0KCQjwpPKiBhDvARIsACn-gzA7blkprqDMtQBA1phCVBuSyiFFouAmCMUEMqf-uEIcLfjsl8Jyw5gaAn-yEALw_wcB;");
		} else if (browser.contentEquals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
			driver.get(url);

		} else if (browser.contentEquals("edge")) {

			WebDriverManager.edgedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
			driver.get(url);

			driver.manage().window().maximize();
			driver.get(url);
		}

	}

	@AfterMethod
	public void closeUp() {
		driver.quit();
	}

}
