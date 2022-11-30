Feature: Login Functionality

  Scenario: Navigate to Matalan.co.uk

    Given Navigate to Matalan.co.uk
    When search
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

