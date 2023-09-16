package Flyaway.Project1;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport extends ConstantsFile {
	ExtentReports extent;
	public void Configreport() {
		String path=ConstantsFile.Reportpath;
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setReportName("FlyAwayProject");
		reporter.config().setDocumentTitle("Test Results");
		extent =new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Bindu P");
	}
	public void CreateTest() {
		extent.createTest("My Test Execution");
	}
	public void FlushTest() {
		extent.flush();
	}
}
