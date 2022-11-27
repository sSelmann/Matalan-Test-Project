package Case_70_75.StepDefinitions;

import Case_70_75.Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_LoginSteps {
    DialogContent dc=new DialogContent();

    @Given("Navigate to Matalan.co.uk")
    public void navigateToBasqar() {
        GWD.getDriver().get("https://www.matalan.co.uk/");
        GWD.getDriver().manage().window().maximize();
    }

}
