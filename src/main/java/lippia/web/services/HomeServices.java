package lippia.web.services;


import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.HomeConstants;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import static lippia.web.constants.HomeConstants.*;
import static lippia.web.constants.HomeConstants.XPATH_PAYMENT_COUPON_MESSAGE;



public class HomeServices extends ActionManager {
    public static void closeAds() {
        WebDriver driver = DriverManager.getDriverInstance();
        try {
            WebElement iframe1 = getElement(HomeConstants.XPATH_AD_IFRAME1);
            if (iframe1.isDisplayed()) {
                driver.switchTo().frame(iframe1);
                try {
                    getElement(HomeConstants.XPATH_AD_CLOSE_BUTTON).click();
                } catch (Exception e) {
                    WebElement iframe2 = getElement(HomeConstants.XPATH_AD_IFRAME2);
                    driver.switchTo().frame(iframe2);
                    click(HomeConstants.XPATH_AD_CLOSE_BUTTON);
                }
                driver.switchTo().defaultContent();
            }
        } catch (Exception e) {
            System.out.println("NO ADS!");
        }
    }
    public static void clickearCheckOut(String btn){
        WebActionManager.click(XPATH_CHECKOUT_PROCEEDTOCHECKOUT_BUTTON,true);
    }
    public static void clickDescription() {
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

    public static void clickReview() {
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

    public static void sliders() {
        try {
            List<WebElement> locators = WebActionManager.getElements(SLIDERS);
            for (WebElement locator : locators) {
                Assert.assertTrue(locator.isEnabled());
            }
        } catch (NoSuchElementException e) {
            System.out.println("NoSuchElementException: " + e.getMessage());
        }
    }

    public static void validacionDeElementos() {
        try {
            List<WebElement> elementos = WebActionManager.getElements(PRIMER_ARRAIVALS, SEGUNDO_ARRAIVALS, TERCER_ARRAIVALS);
            for (WebElement elemento : elementos) {
                Assert.assertTrue(elemento.isEnabled());
            }
        } catch (NoSuchElementException e) {
            System.out.println("NoSuchElementException: " + e.getMessage());
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

    public static void mapsHome(String button) {
        Map<String, String> buttons = new HashMap<>();
        buttons.put("Shop", BUTTON_SHOP);
        buttons.put("Home", BUTTON_HOME);
        buttons.put("Arraival", TERCER_ARRAIVALS);
        buttons.put("Agregar al carrito",AGREGARR_CARRITO_BUTTON);
        buttons.put("Articulos",ARTICULOS_BUTTON);
        buttons.put("Proceder al pago",CHECKOUT_BUTTON);
        buttons.put("transferencia",METHODPAY_BUTTON);
        buttons.put("Add to Basket",XPATH_HOME_ADDTOBASKET_BUTTON);
        buttons.put("Proceed to Checkout",XPATH_CHECKOUT_PROCEEDTOCHECKOUT_BUTTON);
        buttons.put("Place Order",XPATH_PAYMENT_PLACEORDER_BUTTON);

        WebActionManager.click(buttons.get(button), false);

    }

    public static void clickArrivalImage(int order) {
        click(XPATH_HOME_ARRIVAL_CONTAINER + "/div[" + order + "]");
    }

    private static String getUrl() {
        return DriverManager.getDriverInstance().getCurrentUrl();
    }

    private static WebElement getAddToBasket() {
        return getElement(XPATH_HOME_ADDTOBASKET_BUTTON);
    }

    public static void verifyArrival() {
        Assert.assertTrue(getUrl().matches("https://practice.automationtesting.in/product/(.*)/"));
        Assert.assertEquals(getAddToBasket().getText(), "ADD TO BASKET");
    }

    public static void verifyAddToBasketMenuItem() {
        ActionManager.waitVisibility(XPATH_HOME_BASKETMENUITEM_SPAN);
        WebElement menuItem = getElement(XPATH_HOME_BASKETMENUITEM_SPAN);
        Assert.assertTrue(menuItem.getText().matches("1 Item"));
    }

    public static void clickMenuItemLinkToCheckoutPage() {
        WebActionManager.click(XPATH_HOME_BASKETMENUITEM_ANCHOR);
    }

    public static void verifyTotalAndSubtotalOnCheckoutPage() {
        WebElement total = getElement(XPATH_CHECKOUT_TOTAL);
        double totalValue = Double.parseDouble(total.getText().substring(1));
        WebElement subtotal = getElement(XPATH_CHECKOUT_SUBTOTAL);
        double subtotalValue = Double.parseDouble(subtotal.getText().substring(1));
        Assert.assertTrue(totalValue > 0);
        Assert.assertTrue(subtotalValue > 0);
        Assert.assertTrue(totalValue > subtotalValue);
    }



    public static void fillBillingDetails(String firstName, String lastName, String email, String phone,
                                          String country,String address, String city,String state,String zipcode) throws InterruptedException {

        setInput(HomeConstants.XPATH_PAYMENT_BILLINGFORM_FIRSTNAME, firstName);
        setInput(HomeConstants.XPATH_PAYMENT_BILLINGFORM_LASTNAME, lastName);

        setInput(HomeConstants.XPATH_PAYMENT_BILLINGFORM_EMAIL, email);
        setInput(HomeConstants.XPATH_PAYMENT_BILLINGFORM_PHONE, phone);


        click(XPATH_PAYMENT_BILLINGFORM_COUNTRY);
        click(XPATH_PAYMENT_BILLINGFORM_COUNTRYITEM_START+(country) + "']");

        setInput(XPATH_PAYMENT_BILLINGFORM_ADDRESS,address);
        setInput(XPATH_PAYMENT_BILLINGFORM_CITY,city);

        click(XPATH_PAYMENT_BILLINGFORM_STATE);
        click(XPATH_PAYMENT_BILLINGFORM_COUNTRYITEM_START+(state) + "']");

        setInput(XPATH_PAYMENT_BILLINGFORM_POSTCODE, zipcode);
    }

    public static void selectPaymentGateway() {
        try {
            Robot robot = new Robot();
            robot.delay(5);
            robot.mouseWheel(3);
            robot.delay(4);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

        int i = (int) (Math.random() * 3);
        INDEX_PAYMENTGATEWAY[0] = i;
        click(LOCATORS_PAYMENTGATEWAY[i]);
    }

    public static void verifyCoupon() {
        String couponValue = VALUE_PAYMENT_COUPON;
        WebElement showCouponForm = getElement(XPATH_PAYMENT_COUPON_SHOW);
        new Actions(DriverManager.getDriverInstance()).moveToElement(showCouponForm).perform();
        click(XPATH_PAYMENT_COUPON_SHOW);
        setInput(XPATH_PAYMENT_COUPON_INPUT, couponValue);
        click(XPATH_PAYMENT_COUPON_SUBMIT);
        ActionManager.waitVisibility(XPATH_PAYMENT_COUPON_MESSAGE);
        WebElement couponMessage = getElement(XPATH_PAYMENT_COUPON_MESSAGE);
        Assert.assertEquals(couponMessage.getText(), "Coupon \"" + couponValue + "\" does not exist!");
    }

    public static void verifyDetailsInPaymentGatewayPage() {
        validateBillingDetails();
        validateAdditionalDetails();
        validatePaymentGateways();
    }
    private static void validatePaymentGateways() {
        WebElement radio = getElement(LOCATORS_PAYMENTGATEWAY[INDEX_PAYMENTGATEWAY[0]]);
        Assert.assertEquals(radio.getAttribute("selected"), "true");
    }

    private static void validateBillingDetails() {
        WebElement company = getElement(HomeConstants.XPATH_PAYMENT_BILLINGFORM_COMPANY);
        WebElement addressDetail = getElement(HomeConstants.XPATH_PAYMENT_BILLINGFORM_ADDRESSDETAIL);

        Assert.assertTrue(company.isDisplayed());
        Assert.assertTrue(addressDetail.isDisplayed());
    }

    private static void validateAdditionalDetails() {
        WebElement additional = getElement(HomeConstants.XPATH_PAYMENT_ADDITIONALDETAILS);
        Assert.assertTrue(additional.isDisplayed());
    }

    public static void verifyOrderConfirmationPage() {
        ActionManager.waitVisibility(XPATH_CONFIRMATION_BILLING_TOTAL);
        WebElement orderNumber = getElement(XPATH_CONFIRMATION_ORDERNUMBER);
        Assert.assertTrue(Integer.parseInt(orderNumber.getText()) > 0);
        if (getElement(XPATH_CONFIRMATION_PAYMENTMETHOD).getText().equals("Direct Bank Transfer")) {
            WebElement bankHeader = getElement(XPATH_CONFIRMATION_BANKDETAILS_HEADER);
            Assert.assertTrue(bankHeader.isDisplayed());
        }
        WebElement totalBilling = getElement(XPATH_CONFIRMATION_BILLING_TOTAL);
        Assert.assertTrue(totalBilling.isDisplayed());
    }

}