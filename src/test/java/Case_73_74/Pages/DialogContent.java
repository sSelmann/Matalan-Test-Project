package Case_73_74.Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.text.Utilities;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//a[contains(text(),'Trending')])[9]")
    private WebElement trending;  //homepage

    @FindBy(xpath = "(//a[contains(text(),'£5 & Under Baby')])[6]")
    private WebElement underBaby5Pounds;  //trending

    @FindBy(xpath = "//div[@class='results__detail__price u-font-wb u-mar-t-tiny@sm-down']//span")
    private List<WebElement> productPrice;  // £5 & Under Baby

    private WebElement myElement;
    private List<WebElement> myElements;


    public void findAndClick(String strElement) {
        switch (strElement) {
            case "underBaby5Pounds": myElement = underBaby5Pounds; break;
        }

        clickFunction(myElement);
    }

    public void findAndMoveToElement(String strElement){
        switch (strElement){
            case "trending": myElement = trending; break;
        }
        moveToElement(myElement);
    }

    public void findAndGetText(String strElement){
        switch (strElement)
        {
            case "productPrice": myElements = productPrice; break;
        }

        for (WebElement list: myElements) {
            String fiyat =list.getText().substring(1);
            double doubleDeger = Double.parseDouble(fiyat);
            if (doubleDeger >5.00) {
                System.out.println("5 pound fiyatından fazla fiyatta satılan ürün var");
            }
        }

    }


}