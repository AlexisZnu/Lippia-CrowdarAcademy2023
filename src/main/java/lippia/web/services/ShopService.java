package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.HomeConstants;
import lippia.web.constants.ShopConstants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static java.lang.Double.parseDouble;
import static lippia.web.constants.ShopConstants.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ShopService extends ActionManager {


    public static void selectDropdownByValue(String drop) {
        WebActionManager.setDropdownByValue(DROPDOWN_PRICE_VALUE, drop);
    }


    public static void verifyPriceOrderHigh(String drops) {
        Assert.assertTrue(ActionManager.waitPresence(DROPDOWN_OPTIONS_PRICE_HIGH, drops).isDisplayed()
                , "El elemento no pudo ser encontrado: ");
    }

    public static void verifyPriceLow() {
        Assert.assertTrue(ActionManager.waitPresence(DROPDOWN_OPTIONS_PRICE_POPULARITY).isDisplayed()
                , "El elemento no pudo ser encontrado: ");
    }

    public static void clickReadMore() {
        waitVisibility(READMORE_PRODUCT_BUTTON);
        try {
            Robot robot = new Robot();
            robot.delay(3);
            robot.mouseWheel(6);
            robot.delay(3);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        WebActionManager.waitVisibility(READMORE_PRODUCT_BUTTON).click();
    }


    public static void sinStock() {
        Assert.assertTrue(ActionManager.waitPresence(ShopConstants.SIN_STOCK_VALIDATE
                , "El elemento no pudo ser encontrado").isDisplayed());
    }

    public static void clickAddToBasketNumber(int number) {
        try {
            Robot robot = new Robot();
            robot.delay(5);
            robot.mouseWheel(6);
            robot.delay(4);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        click(ShopConstants.XPATH_SHOP_PRODUCTITEMS_XPATH + "[" + getAddToBasketIndexes().get(number - 1) + "]/a[2]");
    }

    private static List<Integer> getAddToBasketIndexes() {
        int productsQuantity = getElements(ShopConstants.XPATH_SHOP_PRODUCTITEMS_XPATH).size();
        List<Integer> indexes = new ArrayList<>();
        for (int i = 1; i <= productsQuantity; i++) {
            String text = getElement(ShopConstants.XPATH_SHOP_PRODUCTITEMS_XPATH + "[" + i + "]/a[2]").getText();
            if (text.matches("ADD TO BASKET")) {
                indexes.add(i);
            }
        }
        return indexes;
    }

    public static void selectCountryInBillingForm(String country) {
        click(ShopConstants.XPATH_PAYMENT_BILLINGFORM_COUNTRY);
        click(HomeConstants.XPATH_PAYMENT_BILLINGFORM_COUNTRYITEM_START + country + "']");
    }

    public static void verifyTaxesPercentage(int percentage) {
        WebElement subtotal = getElement(ShopConstants.XPATH_PAYMENT_SUBTOTAL);
        double subtotalNumber = parseDouble(subtotal.getText().substring(1));
        WebElement taxes = getElement(ShopConstants.XPATH_PAYMENT_TAX);
        double taxesNumber = parseDouble(taxes.getText().substring(1));
        if (percentage == 5) {
            WebElement finalTaxes = (WebElement) ActionManager.getWait().until(driver -> {
                WebElement newTaxes = getElement(ShopConstants.XPATH_PAYMENT_TAX);
                double newTaxesNumber = parseDouble(newTaxes.getText().substring(1));
                if (taxesNumber != newTaxesNumber) {
                    return newTaxes;
                }
                return false;
            });
            double finalTaxesNumber = parseDouble(finalTaxes.getText().substring(1));
            Assert.assertEquals((int) (finalTaxesNumber * 100 / subtotalNumber), percentage);
        } else {
            Assert.assertEquals((int) (taxesNumber * 100 / subtotalNumber), percentage);
        }
    }
}
