package Case_70_75.Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BodyContent extends Parent{

    public BodyContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    WebElement myElement;

    @FindBy(css="div[class*='search-results__item']")
    private WebElement firstSearchResult;

    @FindBy(id="gtm-add")
    private WebElement addToBagButton;

    @FindBy(css="div[data-behavior='product_variant_selector']>div")
    private WebElement selectSize;

    @FindBy(css="a[rel='853224']")
    private WebElement chest38Option;

    @FindBy(css="a[rel='824981']")
    private WebElement size4Option;

    @FindBy(xpath="(//a[text()='Checkout'])[1]")
    private WebElement checkOut;

    @FindBy(css="input[name='account[email]']")
    private WebElement emailInput;

    @FindBy(css="button[data-behavior='continue_button']")
    private WebElement continueSecurelyButton;

    @FindBy(xpath="//input[@id='home_delivery']/..")
    private WebElement homeDelivery;

    @FindBy(xpath="//input[@id='click_and_collect']/..")
    private WebElement clickAndCollectDeliveryButton;

    @FindBy(css="dl[data-ui='bag-linecount__shipping'] dd")
    private WebElement deliveryAmount;

    @FindBy(className="o_load-spinner")
    private WebElement loadSpinner;


    public void findAndSend(String strElement, String value){
        switch (strElement)
        {
            case "emailInput" : myElement =emailInput; break;

        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){
        switch (strElement)
        {
            case "firstSearchResult" : myElement =firstSearchResult; break;
            case "addToBagButton" : myElement =addToBagButton; break;
            case "selectSize" : myElement =selectSize; break;
            case "chest38Option" : myElement =chest38Option; break;
            case "checkOut" : myElement =checkOut; break;
            case "continueSecurelyButton" : myElement =continueSecurelyButton; break;
            case "homeDelivery" : myElement =homeDelivery; break;
            case "clickAndCollectDeliveryButton" : myElement =clickAndCollectDeliveryButton; break;
            case "size4Option" : myElement =size4Option; break;


        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "deliveryAmount" : myElement =deliveryAmount; break;

        }

        verifyContainsText(myElement,text);
    }

    public void findAndWaitUnvisible(String strElement){
        switch (strElement)
        {
            case "loadSpinner" : myElement =loadSpinner; break;

        }

        waitInvisibilityOfElement(myElement);
    }

}
