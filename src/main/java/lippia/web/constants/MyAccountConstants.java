package lippia.web.constants;

public class MyAccountConstants {
    public static final String BUTTON_SINGOUT = "xpath://a[contains(text(),'Sign out')]";
    public static final String BUTTON_MYACCOUNT = "xpath://a[contains(text(),'My Account')]";
    public static final String INPUT_USER = "xpath://input[@id='username']";
    public static final String INPUT_PASSWORD = "xpath://input[@id='password']";
    public static final String BUTTON_LOGIN = "xpath://*[@name='login']";
    public static final String BUTTON_PEDIDOS = "xpath://*[contains(text(),'Orders')]";
    public static final String LISTA_PEDIDOS = "xpath://*[@class='order']";
    public static final String BUTTON_VIEW = "xpath://a[contains(text(),'View')]";
    public static final String TEXT_DETAILS_PRODUCTS = "xpath://h2[contains(text(),'Order Details')]";
    public static final String TEXT_DETAILS_NUMBER_PRODUCT = "xpath://p[contains(text(),'Order')]";
    public static final String TEXT_DETAILS_DIRECCION_ENVIO = "xpath://a[contains(@href,'/my-account/edit-address')][contains(text(),'shipping')]";
    public static final String TEXT_DETAIL_BILLING = "xpath://h3[contains(text(),'Billing Address')]";
    public static final String BUTTON_DETAIL_BILLING_EDIT = "xpath://a[contains(@href,'/my-account/edit-address/billing')]";
    public static final String TEXT_DETAIL_BILLING_ADDRESS = "xpath://h3[contains(text(),'Billing Address')]";
    public static final String BUTTON_EDITAR_PASSWORD = "xpath://a[contains(@href,'/my-account/edit-account')][contains(text(),'edit your password')]";
    public static final String TEXT_VALIDATE_FIRST_NAME = "xpath://*[contains(text(),'First name')]";
    public static final String TEXT_VALIDATE_DASHBOARD = "xpath://*[contains(text(),'Login')]";




}