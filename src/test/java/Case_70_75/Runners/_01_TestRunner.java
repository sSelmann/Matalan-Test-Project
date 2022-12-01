package Case_70_75.Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/Case_75.feature"},   // buraya feature files ın path i verilecek.
        glue = {"Case_70_75/StepDefinitions"}       // Step definitions ın klasörü yazılıyor.
)
public class _01_TestRunner extends AbstractTestNGCucumberTests {

}
