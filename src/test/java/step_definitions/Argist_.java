package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.argist_POM;
import utilities.DriverClass;

public class Argist_ {

    argist_POM ar = new argist_POM();
    @Given("argist websitesine eriş.")
    public void websitesineEriş() {
        DriverClass.getDriver().get("https://argist.com/");

    }

    @When("üst menüde yer alan tüm özellikler butonuna tıkla.")
    public void üstMenüdeYerAlanTümÖzelliklerButonunaTıkla() {
        ar.clickMethod(ar.getOzellikler());
    }

    @And("açılan pencerede satış yönetimi özelliğini incele butonuna tıkla.")
    public void açılanPenceredeSatışYönetimiÖzelliğiniInceleButonunaTıkla() {
        ar.clickMethod(ar.getSatisYonetimiOzelligi());
    }

    @And("hemen kayıt ol butonuna tıkla.")
    public void hemenKayıtOlButonunaTıkla() {
        ar.clickMethod(ar.getKayitOlButonu());
    }

    @Then("açılan sayfanın kayıt olma sayfası olduğunu kontrol et.")
    public void açılanSayfanınKayıtOlmaSayfasıOlduğunuKontrolEt() {
        Assert.assertTrue(ar.getKayitOlSayfasiDogrulama().isDisplayed());

    }

    @And("açılan pencerede randevu yönetimi özelliğini incele butonuna tıkla.")
    public void açılanPenceredeRandevuYönetimiÖzelliğiniInceleButonunaTıkla() {
        ar.clickMethod(ar.getRandevuYonetimi());

    }

    @And("açılan pencerede servis yönetimi özelliğini incele butonuna tıkla.")
    public void açılanPenceredeServisYönetimiÖzelliğiniInceleButonunaTıkla() {
       ar.clickMethod(ar.getTeknikServisYazilimi());

    }

    @And("açılan pencerede e-mağaza yönetimi özelliğini incele butonuna tıkla.")
    public void açılanPenceredeEMağazaYönetimiÖzelliğiniInceleButonunaTıkla() {
        ar.clickMethod(ar.geteMagazaYonetimi());

    }

    @And("açılan pencerede stok yönetimi özelliğini incele butonuna tıkla.")
    public void açılanPenceredeStokYönetimiÖzelliğiniInceleButonunaTıkla() {
        ar.clickMethod(ar.getStokYonetimi());

    }

    @And("açılan pencerede teklif yönetimi özelliğini incele butonuna tıkla.")
    public void açılanPenceredeTeklifYönetimiÖzelliğiniInceleButonunaTıkla() {
        ar.clickMethod(ar.getTeklifYonetimi());

    }

    @And("ücretsiz emağazanı aç butonuna tıkla.")
    public void ücretsizEmağazanıAçButonunaTıkla() {
        ar.clickMethod(ar.getUcretsizEmagazaniAc());
    }

    @Then("açılan sayfanın hesap oluşturma sayfası olduğunu kontrol et.")
    public void açılanSayfanınHesapOluşturmaSayfasıOlduğunuKontrolEt() {
        Assert.assertTrue(ar.getUcretsizEmagazaniAcDogrulama().isDisplayed());

    }

    @And("ücretsiz fiyat teklifi butonuna tıkla.")
    public void ücretsizFiyatTeklifiButonunaTıkla() {
        ar.clickMethod(ar.getUcretsizFiyatTeklifi());
    }
}
