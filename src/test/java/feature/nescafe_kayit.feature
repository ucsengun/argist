Feature: nescafe kayit

  Scenario: Kayıt Formunu Geçerli Bir Biçimde Doldur
    Given Nescafe turkiye websitesine eriş.
    When Üst menüde bulunan Profil logosuna tıkla.
    And Kayıt Ol seçeneğine tıkla.
    And Gelen formu doldururken tüm değerleri geçerli bir şekilde doldur.
    And Üye ol butonuna tıkla.
    Then Kontrol et.