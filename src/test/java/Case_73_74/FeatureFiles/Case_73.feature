Feature: Matalan.co.uk case_73

  @SmokeTest
  Scenario: Matalan.co.uk websitesine gidilir, Trending kategorisinin altındaki £5 & Under Baby alt kategorisine tıklanılır ve
  ilk sayfada çıkan tüm ürünlerin £5 ve altında olduğu doğrulanır.

    Given web sitesine gidilir
    And trending kategorisine gelinir
      | trending |
    And Bes Pound & Under Baby kategorisine tıklanılır
      | underBaby5Pounds |
    And Ürünlerin fiyatlarının beş pound veya altında olduğu doğrulanır
      | productPrice |
