package steps;

import pages.*;

public class PageInitializer {
    public static HoverRowPage hoverRowPage;
    public static CheckIconPage checkIconPage;
    public static LabelPage labelPage;
    public static PencilPage pencilPage;

    public static RemoveIconPage removeIconPage;
    public static ValidationPage validatePage;
    public static ValuePage valuePage;

    public static void initializePageObject(){

        hoverRowPage = new HoverRowPage();
        checkIconPage = new CheckIconPage();
        labelPage = new LabelPage();
        pencilPage =new PencilPage();
        removeIconPage = new RemoveIconPage();
        validatePage = new ValidationPage();
        valuePage = new ValuePage();

    }
}
