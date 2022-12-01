package Case_70_75.StepDefinitions;

import Case_70_75.Pages.HeaderContent;
import Case_70_75.Pages.BodyContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

public class Case_75_Steps {
    HeaderContent dc=new HeaderContent();
    BodyContent bc=new BodyContent();

    @Given("Navigate to Matalan.co.uk")
    public void navigateToBasqar() {
        GWD.getDriver().get("https://matalan.co.uk");
        GWD.getDriver().manage().window().maximize();
    }

    @Then("Search")
    public void search(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++){
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));

        }
        dc.findAndClick("searchButton");
    }

    @Then("Click on the element in the Body Content")
    public void clickOnTheElementInTheResultContent(DataTable elements) throws InterruptedException {

        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            bc.findAndClick(listElement.get(i));
        }

    }

    @Then("Send value on the element in the Body Content")
    public void sendValueOnTheElementInTheBodyContent(DataTable elements) {

        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++){
            bc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));

        }

    }


    @And("Verify the delivery charge of the product")
    public void getTextFromBodyContent(DataTable elements) throws InterruptedException {

        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++){
            bc.findAndContainsText(listElement.get(i).get(0), listElement.get(i).get(1));

        }

    }
}
