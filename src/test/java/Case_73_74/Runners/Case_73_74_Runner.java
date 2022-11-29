package Case_73_74.Runners;


import com.aventstack.extentreports.service.ExtentService;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

@CucumberOptions
        (
                tags = "@SmokeTest",
                features = {"src/test/java/Case_73_74/FeatureFiles/"},
                glue = {"Case_73_74.StepDefinitions"},
                plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"},
                monochrome = true,
                dryRun = false
        )
@Listeners({ExtentITestListenerClassAdapter.class})
public class Case_73_74_Runner extends AbstractTestNGCucumberTests
{
    @BeforeClass(alwaysRun = true)


    @AfterClass
    public void writeExtentReport() {

        ExtentService.getInstance().setSystemInfo("User Name", "Bahadır Kaya");
        ExtentService.getInstance().setSystemInfo("Application Name", "matalan.co.uk");
        ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name").toString());
        ExtentService.getInstance().setSystemInfo("Department", "QA");
        ExtentService.getInstance().setSystemInfo("Ek Satır", "");
    }
}
