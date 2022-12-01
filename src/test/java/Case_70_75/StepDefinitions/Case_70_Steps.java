package Case_70_75.StepDefinitions;

import Case_70_75.Pages.BodyContent;
import Case_70_75.Pages.Parent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class Case_70_Steps {

    BodyContent bd=new BodyContent();

    @And("Verify that the delivery charge of the product is FREE")
    public void verifyThatTheDeliveryChargeOfTheProductIsFREE(DataTable elements) throws InterruptedException {
        bd.findAndWaitUnvisible("loadSpinner");
        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++){
            bd.findAndContainsText(listElement.get(i).get(0), listElement.get(i).get(1));

        }

    }
}
