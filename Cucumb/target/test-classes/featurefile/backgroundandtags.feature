@all
Feature: Feature to test Amazon Search Functionality
				Searching of various categories should be possible along with product search


Background:
Given I visit the website as Guest user


@SmokeTest
Scenario: Search for the products under categories Desktops,laptops,tablets,software

When I select the desktops option from the categories
And  I click on mac Icon from the desktops dropdown
Then I should see the mac page loaded
And  I should add the mac items into the cart or wish list

@Sanitorytest
Scenario:  Search for the products under categories phones and pdas

When I select the phones and pdas option from the categories
And  I click on any phone or pdas products
Then I should see the products features and reviews
And  I should add the product into wish list


@Regressiontest
Scenario: Search for the products under categories cameras

When I select the camera option from the categories
And It should open all products of cameras
Then I should add the product to wish list
And I should open the wish list to confirm

@Smoketest @sanitoryTest
Scenario: search for shopping cart and buy and remove the products

When I click on the shopping cart it should open the cart
And I should see the total products added into the shopping cart
Then I should remove the unwanted products
And I should checkout or buy the products