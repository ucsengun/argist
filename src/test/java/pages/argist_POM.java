package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;


    public class argist_POM extends MyMethods {
        public argist_POM() {
            PageFactory.initElements(DriverClass.getDriver(), this);
        }

        @FindBy(xpath = "//a[@title='Tüm Özelliklerini İncele']")
        private WebElement ozellikler;

        @FindBy(css= "a[title='Özelliği İncele'][href='https://argist.com/satis-yonetimi/']")
        private WebElement satisYonetimiOzelligi;

        @FindBy(css = "a[title='Özelliği İncele'][href='https://argist.com/randevu-yonetimi/']")
        private WebElement randevuYonetimi;

        @FindBy(css = "a[title='Özelliği İncele'][href='https://argist.com/teknik-servis-yazilimi/']")
        private WebElement teknikServisYazilimi;
        @FindBy(xpath = "(//a[@title='Özelliği İncele'])[4]")
        private WebElement eMagazaYonetimi;

        @FindBy(xpath = "(//a[@title='Özelliği İncele'])[5]")
        private WebElement stokYonetimi;

        @FindBy(xpath = "(//a[@title='Özelliği İncele'])[6]")
        private WebElement teklifYonetimi;

        @FindBy(xpath = "//a[@title='Hemen Kayıt Ol']")
        private WebElement kayitOlButonu;
        public WebElement getOzellikler() {
            return ozellikler;
        }

        public WebElement getSatisYonetimiOzelligi() {
            return satisYonetimiOzelligi;
        }

        public WebElement getRandevuYonetimi(){
            return randevuYonetimi;
        }
        public WebElement getTeknikServisYazilimi(){
            return teknikServisYazilimi;
        }

        public WebElement geteMagazaYonetimi(){
            return eMagazaYonetimi;
        }

        public WebElement getStokYonetimi() {
            return stokYonetimi;
        }

        public WebElement getTeklifYonetimi() {
            return teklifYonetimi;
        }

        public WebElement getKayitOlButonu(){
            return kayitOlButonu;
        }
    }
