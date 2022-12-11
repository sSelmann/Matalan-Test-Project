Feature: The nearest stores

  Scenario: As a user, I should be able to see the nearest stores after selecting the product's delivery type as "click to collect".
    Given Navigate to Matalan.co.uk
    When Go to the "Shirts" products in the "Men" Category
    Then Choose random product and add to cart
    And Navigate to the cart Click "Continue To Checkout"
    Then Select "click to collect" and proceed to the next step
    And Typing the sn14 postcode in the "Find your nearest store" input and clicking the find store button
    Then Select the nearest store and verify





