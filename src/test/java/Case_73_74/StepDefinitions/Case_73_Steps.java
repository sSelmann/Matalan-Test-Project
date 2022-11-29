package Case_73_74.StepDefinitions;

import Case_73_74.Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import java.util.List;

public class Case_73_Steps {

    DialogContent dc = new DialogContent();

    @Given("web sitesine gidilir")
    public void webSitesineGidilir()
    {
        GWD.getDriver().manage().window().maximize();
        GWD.getDriver().get("https://www.matalan.co.uk/");
    }

    @And("trending kategorisine gelinir")
    public void trendingKategorisineGelinir(DataTable elements)
    {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
        {
            dc.findAndMoveToElement(listElement.get(i));
        }
    }

    @And("Bes Pound & Under Baby kategorisine tıklanılır")
    public void BesPoundUnderBabyKategorisineTıklanılır(DataTable elements)
    {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
        {
            dc.findAndClick(listElement.get(i));
        }
    }

    @And("Ürünlerin fiyatlarının beş pound veya altında olduğu doğrulanır")
    public void ürünlerinFiyatlarınınBeşPoundVeyaAltındaOlduğuDoğrulanır(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
        {
            dc.findAndGetText(listElement.get(i));
        }
    }
}
