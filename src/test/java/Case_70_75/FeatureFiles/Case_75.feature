Feature: Delivery Functionality

  Scenario: As a user, search for "Broken Stitch Andersen Gray Suit Jacket" then add it to your bag. Verify that the home delivery is FREE at check out.

    Given Navigate to Matalan.co.uk
    When Search
      | searchInput | Broken Stitch Andersen Gray Suit Jacket |
    Then Click on the element in the Body Content
      | firstSearchResult |
    And Click on the element in the Body Content
      | selectSize     |
      | option2        |
      | addToBagButton |
      | checkOut       |
    Then Send value on the element in the Body Content
      | emailInput | tester@live.co |
    And Click on the element in the Body Content
      | continueSecurelyButton |
    And Click on the element in the Body Content
      | homeDelivery |
    And Verify the delivery charge of the product
    | deliveryAmount | FREE |

