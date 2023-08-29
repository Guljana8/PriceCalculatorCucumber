package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class CheckIconPage extends CommonMethods {
    @FindBy(id = "ghost-check-icon")
    public WebElement checkIconId;

    @FindBy(xpath = "//i[@class='fas fa-check']")
    public WebElement checkIcon;

    @FindBy(xpath = "(//i[@class='fas fa-check'])[1]")
    public WebElement checkIcon1;

    @FindBy(xpath = "(//i[@class='fas fa-check'])[2]")
    public WebElement checkIcon2;

    @FindBy(xpath = "(//i[@class='fas fa-check'])[3]")
    public WebElement checkIcon3;

    @FindBy(xpath = "(//i[@class='fas fa-check'])[4]")
    public WebElement checkIcon4;

    @FindBy(xpath = "(//i[@class='fas fa-check'])[5]")
    public WebElement checkIcon5;

    @FindBy(xpath = "(//i[@class='fas fa-check'])[6]")
    public WebElement checkIcon6;

    public CheckIconPage() {
        PageFactory.initElements(driver, this);
    }
}
