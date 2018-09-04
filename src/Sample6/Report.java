package Sample6;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Report {

	public static void main(String[] args) {
		ExtentReports r=new ExtentReports("./Reports/amazonrepo.html");
		ExtentTest s = r.startTest("Testname");
		s.log(LogStatus.PASS, "my test is passed");
		s.log(LogStatus.FAIL,"my test is faied");
		s.log(LogStatus.INFO, "some info");
		String img = s.addScreenCapture("E:\\Project\\Amazon1\\failedphot\\demoMon Aug 20 11-35-28 IST 2018.png");
		s.log(LogStatus.FAIL,img);
		r.flush();

	}

}
