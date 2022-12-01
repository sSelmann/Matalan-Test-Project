Feature: Delivery Functionality

  Scenario: As a user, search for "Kids Navy High Top Trainer" and add the product to your bag. then click the payment button. When I select “click & collect” the delivery should be FREE.
    Given Navigate to Matalan.co.uk
    When Search
      | searchInput | Kids Navy High Top Trainer |
    Then Click on the element in the Body Content
      | firstSearchResult |
    And Click on the element in the Body Content
      | selectSize     |
      | size4Option    |
      | addToBagButton |
      | checkOut       |
    Then Send value on the element in the Body Content
      | emailInput | tester@live.co |
    And Click on the element in the Body Content
      | continueSecurelyButton |
    And Click on the element in the Body Content
      | homeDelivery            |
      | clickAndCollectDeliveryButton |
    And Verify that the delivery charge of the product is FREE
      | deliveryAmount | FREE |