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
        private WebElement email;

        @FindBy(xpath ="//input[@id='gigya-password-43351943385770020']")
        private WebElement sifre;
        @FindBy(xpath = "//input[@value='Giriş Yap']")
        private WebElement girisYapButonu;

        @FindBy(xpath = "//span[@data-bound-to='password'][normalize-space()='Bu alan zorunlu']")
        private WebElement sifreBosBirakilamazHatasi;

        @FindBy(xpath = "//span[@data-bound-to='loginID'][normalize-space()='Bu alan zorunlu']")
        private WebElement emailBosBirakilamazHatasi;

        @FindBy(css = "#gigya-profile-form > section.grid-container.gigya-form-wrapper-mobile > div > div:nth-child(4) > div > div > div")
        private WebElement emailGecersizHatasi;
        public WebElement getTopluluk() {
            return topluluk;
        }

        public WebElement getRomantikİliskiler() {
            return romantikİliskiler;
        }

        public WebElement getEmail(){
            return email;
        }
        public WebElement getSifre(){
            return sifre;
        }

        public WebElement getGirisYapButonu(){
            return girisYapButonu;
        }

        public WebElement getSifreBosBirakilamazHatasi() {
            return sifreBosBirakilamazHatasi;
        }

        public WebElement getEmailBosBirakilamazHatasi() {
            return emailBosBirakilamazHatasi;
        }

        public WebElement getEmailGecersizHatasi(){
            return emailGecersizHatasi;
        }
    }
}
