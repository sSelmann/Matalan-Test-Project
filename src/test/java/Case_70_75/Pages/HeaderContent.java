package Case_70_75.Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HeaderContent extends Parent{

    public HeaderContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="//input[@title='Search - Enter Keyword or Product Code']")
    private WebElement searchInput;

    @FindBy(css = "button[data-action='submit_search']")
    private WebElement searchButton;

    WebElement myElement;
    public void findAndSend(String strElement, String value){
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "searchInput" : myElement =searchInput; break;

        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){
        switch (strElement)
        {
            case "searchButton" : myElement =searchButton; break;


        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            //case "dashboard" : myElement =dashboard; break;

        }

        verifyContainsText(myElement,text);
    }


    public void SearchAndDelete(String searchText){

        //scrollUp()
        findAndSend("searchInput", searchText); // aranacak kelimeyi kutucuğa gönder
        findAndClick("searchButton"); // arama butonuna bas

        //waitUntilLoading();

        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBe(By.cssSelector("div[fxlayoutalign='center center'][class='control-full']"),"Search"));


        findAndClick("deleteButton");// silme butonua bas
        findAndClick("deleteDialogBtn");// dilogdaki silme butonuna bas
    }













}
