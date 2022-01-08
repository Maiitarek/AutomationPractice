package Steps;

import Pages.SuperClass;
import Pages.authenticateUser;
import Pages.createNewUser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class MyStepdefs1 {

    createNewUser user = new createNewUser();
    authenticateUser authUser = new authenticateUser();
    SuperClass base = new SuperClass();

    @Given("a user is navigated to the automation practices URL")
    public void reachURL() {
        user.reachURL();

    }

    @Then("the user is created successfully")
    public void passNewUserData() throws InterruptedException {
        user.passNewUserData();
    }

    @Given("a user clicks on the sign in button")
    public void redirectToHomepage() {
        authUser.reachURL();


    }

    @Then("the user is authenticated successfully")
    public void passUserData() throws InterruptedException {
        authUser.passUserData();
    }

    @Then("the user clicks on blouses in the women category")
    public void selectBlouses() {
        authUser.selectBlouses();

    }

    @Then("the user selects desired product")
    public void selectProduct() {
        authUser.selectProduct();
    }

    @Then("the user proceeds with the checkout procedure")
    public void proceedToCheckout() {
        authUser.proceedToCheckout();
    }

    @Then("the user selects bank wire payment")
    public void selectPayment() {
        authUser.selectPayment();
    }

    @Then("the user verifies that the order was placed successfully")
    public void validateOrder() {
        authUser.validateOrder();
    }
}
