package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class PencilPage extends CommonMethods {

    @FindBy(xpath = "(//i[@class='fas fa-pencil-alt'])[1]")
    public WebElement pencil1;
    @FindBy(xpath = "(//i[@class='fas fa-pencil-alt'])[2]")
    public WebElement pencil2;

    @FindBy(xpath = "(//i[@class='fas fa-pencil-alt'])[3]")
    public WebElement pencil3;

    @FindBy(xpath = "(//i[@class='fas fa-pencil-alt'])[5]")
    public WebElement pencil5;



    public PencilPage() {
        PageFactory.initElements(driver, this);
    }
}
