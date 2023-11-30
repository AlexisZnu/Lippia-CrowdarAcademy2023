package lippia.web.constants;

public class HomeConstants {
    public static final String XPATH_AD_IFRAME1 = "xpath:/html/ins/*/*[contains(@id, 'aswift_') and not(contains(@id, 'host'))]";
    public static final String XPATH_AD_IFRAME2 = "xpath://*[@id='ad_iframe']";
    public static final String XPATH_AD_CLOSE_BUTTON = "xpath://*[@id='dismiss-button']";
    public static final String BUTTON_SHOP = "xpath://a[contains(@href, '//practice.automationtesting.in/shop/')][contains(text(),'Shop')]";
    public static final String BUTTON_HOME = "xpath://a[text()='Home']";
    public static final String SLIDERS = "xpath://*[@class='n2-ss-slide-background-image n2-ss-slide-fill n2-ow']";
    public static final String PRIMER_ARRAIVALS = "xpath://*[@class='col3-1 first sub_column sub_column_1-0-2-0 sub_column_post_22']";
    public static final String SEGUNDO_ARRAIVALS = "xpath://*[@class='col3-1 sub_column sub_column_1-0-2-1 sub_column_post_22']";
    public static final String TERCER_ARRAIVALS = "xpath://*[@class='col3-1 last sub_column sub_column_1-0-2-2 sub_column_post_22']";
    public static final String DESCRIPTION_TEXT = "xpath://*[contains(text(),'Product Description')]";
    public static final String REVIEWS_BUTTON = "xpath://li[@class='reviews_tab']";
    public static final String REVIEWS_TEXT = "xpath://h2[contains(text(),'Product Description')]";
    public static final String  AGREGARR_CARRITO_BUTTON = "xpath://a[@data-product_id='169']";
    public static final String  ARTICULOS_BUTTON = "xpath://a[@class='wpmenucart-contents empty-wpmenucart-visible']";
    public static final String  CHECKOUT_BUTTON = "xpath://a[@class='checkout-button button alt wc-forward']";
    public static final String  METHODPAY_BUTTON = "xpath://*[@id='payment_method_ppec_paypal']";
    public static final String XPATH_HOME_ARRIVAL_CONTAINER = "xpath:/html/body/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div/div/div[2]";
    public static final String XPATH_HOME_ADDTOBASKET_BUTTON = "xpath:/html/body/div[1]/div[2]/div/div/div/div[2]/form/button";
    public static final String XPATH_HOME_BASKETMENUITEM_SPAN = "xpath://*[@id=\"wpmenucartli\"]/a/span[text()='1 item']";
    public static final String XPATH_HOME_BASKETMENUITEM_ANCHOR = "xpath://*[@id=\"wpmenucartli\"]/a";
    public static final String XPATH_CHECKOUT_TOTAL = "xpath://td[@data-title='Total']/strong/span";
    public static final String XPATH_CHECKOUT_SUBTOTAL = "xpath://td[@data-title='Subtotal']/span";
    public static final String XPATH_CHECKOUT_PROCEEDTOCHECKOUT_BUTTON = "xpath://a[@class='checkout-button button alt wc-forward']";
    public static final String XPATH_PAYMENT_BILLINGFORM_FIRSTNAME = "xpath://*[@id=\"billing_first_name\"]";
    public static final String XPATH_PAYMENT_BILLINGFORM_LASTNAME = "xpath://*[@id=\"billing_last_name\"]";
    public static final String XPATH_PAYMENT_BILLINGFORM_COMPANY = "xpath://*[@id=\"billing_company\"]";
    public static final String XPATH_PAYMENT_BILLINGFORM_EMAIL = "xpath://*[@id=\"billing_email\"]";
    public static final String XPATH_PAYMENT_BILLINGFORM_PHONE = "xpath://*[@id=\"billing_phone\"]";
    public static final String XPATH_PAYMENT_BILLINGFORM_COUNTRY = "xpath://*[@id=\"s2id_billing_country\"]/a";
    public static final String XPATH_PAYMENT_BILLINGFORM_COUNTRYITEM_START = "xpath://div[text()='";
    public static final String XPATH_PAYMENT_BILLINGFORM_ADDRESS = "xpath://*[@id=\"billing_address_1\"]";
    public static final String XPATH_PAYMENT_BILLINGFORM_ADDRESSDETAIL = "xpath://*[@id=\"billing_address_2\"]";
    public static final String XPATH_PAYMENT_BILLINGFORM_CITY = "xpath://*[@id=\"billing_city\"]";
    public static final String XPATH_PAYMENT_BILLINGFORM_STATE = "xpath://*[@id=\"s2id_billing_state\"]/a";
    public static final String XPATH_PAYMENT_BILLINGFORM_POSTCODE = "xpath://*[@id=\"billing_postcode\"]";
    public static final String XPATH_PAYMENT_DIRECTGATEWAY = "xpath://*[@id=\"payment_method_bacs\"]";
    public static final String XPATH_PAYMENT_CHECKGATEWAY = "xpath://*[@id=\"payment_method_cheque\"]";
    public static final String XPATH_PAYMENT_CASHGATEWAY = "xpath://*[@id=\"payment_method_cod\"]";
    public static final String XPATH_PAYMENT_PAYPALGATEWAY = "xpath://*[@id=\"payment_method_ppec_paypal\"]";
    public static final int[] INDEX_PAYMENTGATEWAY = {0};
    public static final String[] LOCATORS_PAYMENTGATEWAY = {
            XPATH_PAYMENT_DIRECTGATEWAY,
            XPATH_PAYMENT_CHECKGATEWAY,
            XPATH_PAYMENT_CASHGATEWAY,
            XPATH_PAYMENT_PAYPALGATEWAY
    };
    public static final String VALUE_PAYMENT_COUPON = "4567";
    public static final String XPATH_PAYMENT_COUPON_SHOW = "xpath://a[@class='showcoupon']";
    public static final String XPATH_PAYMENT_COUPON_INPUT = "xpath://*[@id=\"coupon_code\"]";
    public static final String XPATH_PAYMENT_COUPON_SUBMIT = "xpath://input[@name='apply_coupon']";
    public static final String XPATH_PAYMENT_COUPON_MESSAGE = "xpath://*[contains(text(),'Coupon')]";
    public static final String XPATH_PAYMENT_ADDITIONALDETAILS = "xpath://*[@id=\"order_comments\"]";
    public static final String XPATH_PAYMENT_PLACEORDER_BUTTON = "xpath://*[@id=\"place_order\"]";
    public static final String XPATH_CONFIRMATION_BILLING_TOTAL = "xpath://table[contains(@class,'shop_table')]/tfoot/tr[4]/td/span";
    public static final String XPATH_CONFIRMATION_ORDERNUMBER = "xpath://*[contains(text(),'Order Number')]/strong";
    public static final String XPATH_CONFIRMATION_PAYMENTMETHOD = "xpath://li[@class='method']/strong";
    public static final String XPATH_CONFIRMATION_BANKDETAILS_HEADER = "xpath://h2[contains(text(),'Bank')]";

}
