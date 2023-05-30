package lippia.web.services;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.ShopConstants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import static lippia.web.constants.ShopConstants.*;
import java.awt.*;
import java.util.List;

public class ShopService extends ActionManager{


    private static final String FILTER_BY_PRICE_LABEL = "xpath://*[@id='woocommerce_price_filter-2']/h4";

    public static void verifyPage() {
        Assert.assertTrue( ActionManager.waitPresence( FILTER_BY_PRICE_LABEL ).isDisplayed(),
                "El elemento no pudo ser encontrado: ");
    }

    public static void selectDropdownByValue() {
        List<WebElement> drop = WebActionManager.getElements(DROPDOWN_PRICE_VALUE);
        for (WebElement drops : drop) {
            int i = 0;
            i++;
            Select select = new Select(drops);
            select.selectByValue("price-desc");
            System.out.println(i);
        }
    }

    public static void selectDropdownByValue1() {
        List<WebElement> drop = WebActionManager.getElements(DROPDOWN_PRICE_VALUE);
        for (WebElement drops : drop) {
            int i = 0;
            i++;
            Select select = new Select(drops);
            select.selectByValue("price");
            System.out.println(i);
        }
    }


    public static void verifyPriceOrderHigh () {
            Assert.assertTrue(ActionManager.waitPresence(DROPDOWN_OPTIONS_PRICE_HIGH).isDisplayed()
                    , "El elemento no pudo ser encontrado: ");
        }

        public static void verifyPriceLow () {
            Assert.assertTrue(ActionManager.waitPresence(DROPDOWN_OPTIONS_PRICE_LOW).isDisplayed()
                    , "El elemento no pudo ser encontrado: ");
        }

        public static void clickReadMore () {
            waitVisibility(READMORE_PRODUCT_BUTTON);
            try {
                Robot robot = new Robot();
                robot.delay(3);
                robot.mouseWheel(6);
                robot.delay(3);
            } catch (AWTException e) {
                throw new RuntimeException(e);
            }
            WebActionManager.click(READMORE_PRODUCT_BUTTON, false);
        }


        public static void sinStock () {
            Assert.assertTrue(ActionManager.waitPresence(ShopConstants.SIN_STOCK_VALIDATE
                    , "El elemento no pudo ser encontrado").isDisplayed());
        }
}
