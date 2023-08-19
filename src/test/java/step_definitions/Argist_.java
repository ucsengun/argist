package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
        
    }

    @And("hemen kayıt ol butonuna tıkla.")
    public void hemenKayıtOlButonunaTıkla() {
        
    }

    @Then("açılan sayfanın kayıt olma sayfası olduğunu kontrol et.")
    public void açılanSayfanınKayıtOlmaSayfasıOlduğunuKontrolEt() {
        
    }

    @And("açılan pencerede randevu yönetimi özelliğini incele butonuna tıkla.")
    public void açılanPenceredeRandevuYönetimiÖzelliğiniInceleButonunaTıkla() {
        
    }

    @And("açılan pencerede servis yönetimi özelliğini incele butonuna tıkla.")
    public void açılanPenceredeServisYönetimiÖzelliğiniInceleButonunaTıkla() {
        
    }

    @And("açılan pencerede e-mağaza yönetimi özelliğini incele butonuna tıkla.")
    public void açılanPenceredeEMağazaYönetimiÖzelliğiniInceleButonunaTıkla() {
        
    }

    @And("açılan pencerede stok yönetimi özelliğini incele butonuna tıkla.")
    public void açılanPenceredeStokYönetimiÖzelliğiniInceleButonunaTıkla() {
        
    }

    @And("açılan pencerede teklif yönetimi özelliğini incele butonuna tıkla.")
    public void açılanPenceredeTeklifYönetimiÖzelliğiniInceleButonunaTıkla() {
    }
}
