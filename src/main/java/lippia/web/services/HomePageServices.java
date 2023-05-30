package lippia.web.services;


import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.HomeConstants;
import org.openqa.selenium.*;
import org.testng.Assert;
import static lippia.web.constants.HomeConstants.*;
import java.awt.*;
import java.util.List;
import java.util.NoSuchElementException;

public class HomePageServices extends ActionManager {

    public static void clickShop(){
        WebActionManager.waitVisibility(BUTTON_SHOP).click();
    }

    public static void clickHome(){
        WebActionManager.waitVisibility(BUTTON_HOME).click();
    }

    public static void clickDescription(){
        waitVisibility(REVIEWS_BUTTON);
        try {
            Robot robot = new Robot();
            robot.delay(2);
            robot.mouseWheel(6);
            robot.delay(5);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

    }

    public static void clickReview(){
        waitVisibility(REVIEWS_BUTTON);
        try {
            Robot robot = new Robot();
            robot.delay(2);
            robot.mouseWheel(6);
            robot.delay(5);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        WebActionManager.click(REVIEWS_BUTTON, false);
        }

    public static void sliders(){
        try {
            List<WebElement> locators = WebActionManager.getElements(SLIDERS);
            for (WebElement locator : locators) {
                Assert.assertTrue(locator.isEnabled());
                int i = 0;
                i++;
                System.out.println(i);
            }
        }catch (NoSuchElementException e){
            System.out.println("Los sliders no pudieron ser encontrados: ");
            e.printStackTrace();
        }
    }


    public static void scrollAndClickElement(){
        WebActionManager.click(HomeConstants.TERCER_ARRAIVALS,false);
    }

    public static void validacionDeElementos(){
        try {
            List<WebElement> elementos = WebActionManager.getElements(PRIMER_ARRAIVALS,SEGUNDO_ARRAIVALS,TERCER_ARRAIVALS);
            for (WebElement elemento : elementos) {
                Assert.assertTrue(elemento.isEnabled());
                int i = 0;
                i++;
                System.out.println(i);
            }
        }catch (NoSuchElementException e){
             System.out.println("Los arraivals no pudieron ser encontrados: ");
                e.printStackTrace();
            }
        }

    public static void validarDescription() {
            Assert.assertTrue(WebActionManager.isEnabled(DESCRIPTION_TEXT,
                    "El boton no pudo ser encontrado: "));

    }

    public static void validarReviews() {
            Assert.assertTrue(WebActionManager.isPresent(REVIEWS_TEXT,
                    "El boton no pudo ser encontrado: "));

    }

}
