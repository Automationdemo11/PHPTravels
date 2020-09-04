package libraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import configuration.Configuration;

public class CommonLibraries {
	
	public WebDriver launchBrowser(String browerName)
	{
		WebDriver dr=null;		
		switch(browerName)
		{
			case "Chrome":
				System.setProperty("webdriver.chrome.driver", Configuration.chromePath);
				dr= new ChromeDriver();
				break;
			case "Firefox":
				//Add gecko driver path for firefox driver
				dr= new FirefoxDriver();
				break;
				
			//Add more cases for other browsers	
		
		}
		dr.manage().window().maximize();
		//navigateTohomePage(dr);
		dr.manage().timeouts().implicitlyWait(Configuration.implicitWait, TimeUnit.SECONDS);
		
		return dr;
	}
}