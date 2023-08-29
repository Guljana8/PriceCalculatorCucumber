package steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.CommonMethods;

public class Hooks extends CommonMethods {
    @Before
    public  void preCondition(){
        openBrowserAndApplication();
    }

    @After
    public void postCondition(Scenario scenario){
        byte[] pic;
        if(scenario.isFailed()){
            //screenshot of failed test cases will be saved in the failed folder
            pic =  takeScreenshot("failed/" + scenario.getName());
        }else {
            //screenshot of passed test cases will be saved in passed folder
            pic = takeScreenshot("passed/" + scenario.getName());
        }

        //to attach the screenshot in our report
        scenario.attach(pic, "image/png", scenario.getName());
        closeTheBrowser();

    }

}
