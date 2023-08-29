package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LabelPage extends CommonMethods {


    @FindBy(id = "ghost-label-input")
    public WebElement label;

    @FindBy(xpath = "(//div[@class='flex-grow flex flex-col']//input)[1]")
    public WebElement label5;

    public LabelPage() {
        PageFactory.initElements(driver, this);
    }
}
