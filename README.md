# argist

# Proje Yapısı

src: Bu, testle ilgili kod ve kaynakların depolandığı kaynak dizinidir.

test: Bu dizin, testle ilgili tüm kod ve kaynakları içerir.

java: Test sınıfları ve yardımcı sınıflar için Java kaynak kodu dizinidir.

feature: Bu dizin, insanlar tarafından okunabilir bir biçimde test senaryolarını tanımladığınız Gherkin özellik dosyalarını içerir.

pages: Sayfa Nesnesi sınıfları burada saklanır. Her sınıf bir web sayfasını temsil eder ve o sayfadaki öğelerle etkileşimde bulunmak için yöntemler içerir.

runners: Test koşucuları burada saklanır. Bu sınıflar Cucumber testlerini yapılandırır ve çalıştırır.

step_definitions: Adım tanımlama sınıfları buraya yerleştirilir. Bu sınıflar, özellik dosyalarında tanımlanan adımları uygulamak için gerçek kodu içerir.

utilities: WebDriver yönetimi ve yapılandırma okuma gibi çeşitli test görevlerine yardımcı olan yardımcı sınıflar burada saklanır.

xml_files: Testlerde kullanılan XML dosyaları varsa buraya yerleştirilebilir.

resources: Bu dizin, testler için gerekli olmayan Java olmayan kaynakları içerir, örneğin TestNG yapılandırma dosyaları (testng.xml), test veri dosyaları (TestData.xlsx) ve daha fazlası.

reports: Bu dizin, test çerçevesi veya araçları tarafından oluşturulan test raporlarını saklamak için kullanılır.

drivers: Tarayıcı otomasyonu için gereken web tarayıcı sürücüsü yürütülebilir dosyalarını (örneğin, chromedriver, geckodriver) içerir.

pom.xml: Bu, bağımlılıkları ve diğer proje ayarlarını belirten Maven projesi yapılandırma dosyasıdır.

README.md: Proje hakkında bilgi veren ve kullanım talimatları sağlayan bir belge dosyasıdır.
