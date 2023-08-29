package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class ValuePage extends CommonMethods {

    @FindBy(id = "base-value-input")
    public WebElement baseValueInput;

    @FindBy(id = "ghost-value-input")
    public WebElement valueInput;

    @FindBy(xpath = "//input[@class='text-right focus:border-black focus:text-black']")
    public WebElement negativeValue;

    @FindBy(xpath = "//input[@class='text-right focus:border-black focus:text-black']")
    public WebElement newInputValue;




    public ValuePage() {
        PageFactory.initElements(driver, this);
    }
}
