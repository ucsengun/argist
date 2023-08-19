Feature:

  Scenario:
    Given "https://www.argist.com/" websitesine eriş.
    When sayfa üst sekmedeki topluluk butonuna tıkla.
    And Romantik İlişkiler başlığı altındaki Katıl butonuna tıkla.
    Then Açılan sayfanın evimdeki psikologlar websitesinin romantik ilişkiler topluluğu ödeme sayfasıyla ilgili sayfanın yüklendiğini kontrol et..



  Scenario:
    Given
    When Üst menüde bulunan Profil logosuna tıkla.
    And Kayıt Ol seçeneğine tıkla.
    And Gelen formu doldururken tüm değerleri geçerli bir şekilde doldur.
    And Üye ol butonuna tıkla.
    Then Kontrol et.
