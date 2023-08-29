package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class RemoveIconPage extends CommonMethods{

    @FindBy(xpath = "(//i[@class='fas fa-trash-alt'])[4]")
    public WebElement trashIcon;

    public RemoveIconPage() {
        PageFactory.initElements(driver, this);
    }
}
