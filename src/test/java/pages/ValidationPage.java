package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class ValidationPage extends CommonMethods {

    @FindBy(xpath = "//span[@class='font-bold']")
    public WebElement totalSum;

    @FindBy(xpath = "//p[text()=' This label is too short! ']")
    public WebElement actualErrorMsg;

    @FindBy(xpath = "//p[text()=' Cannot be negative! ']")
    public WebElement valueErrorMsg;



    public ValidationPage() {
        PageFactory.initElements(driver, this);
    }
}
