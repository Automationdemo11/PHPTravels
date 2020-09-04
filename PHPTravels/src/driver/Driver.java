package driver;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import configuration.Configuration;
import libraries.CommonLibraries;
import libraries.XLs_reader;

public class Driver {
	
	public CommonLibraries lib;
	public XLs_reader xl;
	
	@BeforeSuite
	public void initialize()
	{
		lib= new CommonLibraries();
		xl= new XLs_reader(Configuration.testDataPath);
		//Other project level initializers
	}
	
	@AfterSuite
	public void tearDown()
	{
		//Project level closers
		
	}

}