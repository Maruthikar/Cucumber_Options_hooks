package stepdefinitionfile;

import io.cucumber.java.en.*;

public class Background_Tags {
	

@Given("I visit the website as Guest user")
public void i_visit_the_website_as_guest_user() {
	
	 System.out.println("Visit the Website as Guest User");
}

@When("I select the desktops option from the categories")
public void i_select_the_desktops_option_from_the_categories() {
	 System.out.println("select the desktops option from the categories");
}

@And("I click on mac Icon from the desktops dropdown")
public void i_click_on_mac_icon_from_the_desktops_dropdown() {
	System.out.println("click on mac Icon from the desktops dropdown");
    
}

@Then("I should see the mac page loaded")
public void i_should_see_the_mac_page_loaded() {
	System.out.println("should see the mac page loaded");
}

@And("I should add the mac items into the cart or wish list")
public void i_should_add_the_mac_items_into_the_cart_or_wish_list() {
	System.out.println("should add the mac items into the cart or wish list");
}



@When("I select the phones and pdas option from the categories")
public void i_select_the_phones_and_pdas_option_from_the_categories() {
	System.out.println("select the phones and pdas option from the categories");
}



@And("I click on any phone or pdas products")
public void i_click_on_any_phone_or_pdas_products() {
	System.out.println("click on any phone or pdas products");
}

@Then("I should see the products features and reviews")
public void i_should_see_the_products_features_and_reviews() {
	System.out.println("should see the products features and reviews");
}

@And("I should add the product into wish list")
public void i_should_add_the_product_into_wish_list() {
	System.out.println("should add the product into wish list");
}

@When("I select the camera option from the categories")
public void i_select_the_camera_option_from_the_categories() {
	System.out.println("select the camera option from the categories");
}

@And("It should open all products of cameras")
public void it_should_open_all_products_of_cameras() {

	System.out.println("should open all products of cameras");
	}

@Then("I should add the product to wish list")
public void i_should_add_the_product_to_wish_list() {
	System.out.println("should add the product to wish list");
}

@And("I should open the wish list to confirm")
public void i_should_open_the_wish_list_to_confirm() {
	System.out.println("should open the wish list to confirm");
}

@When("I click on the shopping cart it should open the cart")
public void i_click_on_the_shopping_cart_it_should_open_the_cart() {
	System.out.println("click on the shopping cart it should open the cart");
}

@And("I should see the total products added into the shopping cart")
public void i_should_see_the_total_products_added_into_the_shopping_cart() {
	System.out.println("should see the total products added into the shopping cart");
}

@Then("I should remove the unwanted products")
public void i_should_remove_the_unwanted_products() {
	System.out.println("should remove the unwanted products");
}
@And("I should checkout or buy the products")
public void i_should_checkout_or_buy_the_products() {
	System.out.println("should checkout or buy the products");
}


}
