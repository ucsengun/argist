Feature:

  Scenario: Evimdeki Psikolog Romantik İlişkiler Topluluğuna Katıl Fonksiyonu Doğrulaması #1
    Given "https://www.evimdekipsikolog.com/" websitesine eriş.
    When Anasayfa üst sekmedeki topluluk butonuna tıkla.
    And Romantik İlişkiler başlığı altındaki Katıl butonuna tıkla.
    Then Açılan sayfanın evimdeki psikologlar websitesinin romantik ilişkiler topluluğu ödeme sayfasıyla ilgili sayfanın yüklendiğini kontrol et..


