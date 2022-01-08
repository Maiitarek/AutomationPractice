package Pages;

public class authenticateUserObjects extends SuperClass {

    String signInBtn="//div[@class='header_user_info']/a";
    String email="//input[@id='email']";
    String passwd="//input[@id='passwd']";
    String submitLogin="//button[@id='SubmitLogin']";
    String signOutBtn="//a[@class='logout']";

   // String women = "//a[@title='Women']";
    String blouses ="//a[@title='Blouses']";
    String imgDisplayed ="//img[@title='Blouse']";

    String addToCartBtn ="//p[@id='add_to_cart']";
    String proceedToCheckout = "//a[@title='Proceed to checkout']";
    String continueCheckout = "//a[@class='button btn btn-default standard-checkout button-medium']";
    String submitCheckout = "//button[@name='processAddress']";
    String agreeToTerms = "//input[@id='cgv']";
    String checkout = "//button[@name='processCarrier']";

    String bankwire = "//a[@title='Pay by bank wire']";
    String confirmOrder = "//button[@class='button btn btn-default button-medium']";
    String backToOrders = "//a[@title='Back to orders']";

    String myAccount= "//a[@title='View my customer account']";
    String orderHistory = "//a[@title='Orders']";
    String invoice= "//tr[@class='first_item ']";

}
