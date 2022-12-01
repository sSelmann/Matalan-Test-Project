package Case_70_75.Runners;


import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        features = {"src/test/java/Case_70_75/FeatureFiles"},
        glue = {"Case_70_75/StepDefinitions"}
)
public class Runner extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void writeExtentReport() {
        ExtentService.getInstance().setSystemInfo("User Name", "Selman Tanis");
        ExtentService.getInstance().setSystemInfo("Application Name", "Matalan.co.uk");
        ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name").toString());
        ExtentService.getInstance().setSystemInfo("Department", "QA");
    }

}
