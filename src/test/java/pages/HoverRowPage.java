package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class HoverRowPage extends CommonMethods {

    @FindBy(xpath = "(//div[@class='flex-grow flex flex-col'])[1]")
    public WebElement action1;
   /* @FindBy(xpath = "//div[@class='flex-grow flex flex-col']")
    public WebElement basePrice;*/

    @FindBy (xpath = "(//div[@class='w-16'])[2]")
    public WebElement action2;

    @FindBy (xpath = "(//div[@class='w-16'])[3]")
    public WebElement action3;

    @FindBy (xpath = "(//div[@class='w-16'])[4]")
    public WebElement action4;

    @FindBy(xpath = "(//div[@class='w-16'])[5]")
    public WebElement action5;


    public HoverRowPage() {
        PageFactory.initElements(driver, this);
    }
}
