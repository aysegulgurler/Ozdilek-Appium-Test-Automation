import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class BasePage extends BaseTest {


    @Step("<int> saniye kadar bekle")
    public void waitForsecond(int s) throws InterruptedException {
        Thread.sleep(1000 * s);
    }

    @Step("<id> elementin sayfada gorunur oldugunu kontrol et")//giriş yapılıyor
    public void findByelement(String id) {
        MobileElement element = appiumDriver.findElement(By.id("com.ozdilek.ozdilekteyim:id/ivSplash"));
        if (element.isDisplayed()) {
            System.out.println("Kontrol edilen element görünür oldu");
        } else {
            System.out.println("Kontrol edilen element Görünür olmadı");
        }
    }
    @Step("<int> saniye kadar bekle")
    public void waitForsecond1(int s) throws InterruptedException {
        Thread.sleep(1000 * s);
    }

    @Step("Xpath <xpath> li alisverise basla butonuna tikla")//alışverişe başla butonu kontrol ediliyor
    public void clickAlisverisByxpath(String xpath) {
        appiumDriver.findElement(By.xpath(xpath)).click();
        MobileElement alisveris = appiumDriver.findElement(By.id(xpath));
        if (alisveris.isDisplayed()) {
            alisveris.click();
        } else {
            System.out.println("Kontrol edilen element Görünür olmadı");
        }
    }
    @Step("<int> saniye kadar bekle")
    public void waitForsecond2(int s) throws InterruptedException {
        Thread.sleep(1000 * s);}

    @Step("Xpath <xpath> li kategoriler sayfasini ac")//Kategoriler kontrol ediyor
    public void clickKategoriByxpath(String xpath) {
        appiumDriver.findElement(By.xpath(xpath)).click();
        MobileElement kategori = appiumDriver.findElement(By.id(xpath));
        if (kategori.isDisplayed()) {
            kategori.click();
        } else {
            System.out.println("Kontrol edilen element Görünür olmadı");
        }
    }
    @Step("<int> saniye kadar bekle")
    public void waitForsecond3(int s) throws InterruptedException {
        Thread.sleep(1000 * s);}

    @Step("Xpath <xpath> li kadin elementini bul ve tıkla")//Pantolon kategorisi seçiliyor
    public void clickKadinByxpath(String xpath) {
        appiumDriver.findElement(By.xpath(xpath)).click();
    }
    @Step("<int> saniye kadar bekle")
    public void waitForsecond4(int s) throws InterruptedException {
        Thread.sleep(1000 * s);}

    @Step("Xpath <xpath> li pantolon elementine tikla")//Pantolon kategorisi seçiliyor
    public void clickPantolonByxpath(String xpath) {
        appiumDriver.findElement(By.xpath(xpath)).click();

    }
    @Step("<int> saniye kadar bekle")
    public void waitForsecond5(int s) throws InterruptedException {
        Thread.sleep(1000 * s);}

    @Step("Sayfayi asagi dogru kaydir")
    public void swipeUp() {
            final int ANIMATION_TIME = 200; // ms
            final int PRESS_TIME = 200; // ms
            int edgeBorder = 10; // better avoid edges
            PointOption pointOptionStart, pointOptionEnd;
            // init screen variables
            Dimension dims = appiumDriver.manage().window().getSize();
            System.out.println("Telefon Ekran Boyutu " + dims);
            // init start point = center of screen
            pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);
            System.out.println("Baslangic noktasi " + pointOptionStart);
            pointOptionEnd = PointOption.point(dims.width / 6, dims.height / 10);
            System.out.println("Bitis noktasi " + pointOptionEnd);
            for (byte i = 0; i < 2; i++) {


                try {
                    new TouchAction(appiumDriver)
                            .press(pointOptionStart)
                            // a bit more reliable when we add small wait
                            .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
                            .moveTo(pointOptionEnd)
                            .release().perform();
                } catch (Exception e) {
                    System.err.println("swipeScreen(): TouchAction FAILED\n" + e.getMessage());
                    return;
                }

                // always allow swipe action to complete
                try {
                    Thread.sleep(ANIMATION_TIME);
                } catch (InterruptedException e) {
                    // ignore
                }
            }
        }
    @Step("<int> saniye kadar bekle")
    public void waitForsecond6(int s) throws InterruptedException {
        Thread.sleep(1000 * s);}
    @Step("Rastgele urun secimi yap")//Pantolon kategorisinden rastgele ürün seçimi
    public void random1(){
        List<MobileElement> elements = appiumDriver.findElements(By.xpath("//*[@resource-id='com.ozdilek.ozdilekteyim:id/imageView']"));
        Random ran = new Random();
        int ranInt = ran.nextInt(elements.size());
        elements.get(ranInt).click();
    }
    @Step("<int> saniye kadar bekle")
    public void waitForsecond7(int s) throws InterruptedException {
        Thread.sleep(1000 * s);}

    @Step("Xpath <xpath> li elementi favorilere ekle ve kontrol et")//Ürün detay sayfası kontrol ediliyor
    public void clickUrunByxpath(String xpath) {
        appiumDriver.findElement(By.xpath(xpath)).click();
        MobileElement urun = appiumDriver.findElement(By.id(xpath));
        if (urun.isDisplayed()) {
            urun.click();
        } else {
            System.out.println("Kontrol edilen element Görünür olmadı");
        }
    }
    @Step("<int> saniye kadar bekle")
    public void waitForsecond8(int s) throws InterruptedException {
        Thread.sleep(1000 * s);}

    @Step("Xpath <xpath> li elementi favorilere ekle")//Urunu favorilere ekle
    public void clickPantolonFavByxpath(String xpath) {
        appiumDriver.findElement(By.xpath(xpath)).click();
    }
    @Step("<int> saniye kadar bekle")
    public void waitForsecond9(int s) throws InterruptedException {
        Thread.sleep(1000 * s);}

    @Step("Xpath <xpath> li elementin icine text yaz")//kullanıcı adı yaz
    public void clickGirisKullaniciAdiByxpath(String xpath) {
        appiumDriver.findElement(By.xpath(xpath)).sendKeys("text");
    }
    @Step("<int> saniye kadar bekle")
    public void waitForsecond10(int s) throws InterruptedException {
        Thread.sleep(1000 * s);}

    @Step("Xpath <xpath> li elementin icine sifre yaz")//sifre yaz
    public void clickGiriSifreByxpath(String xpath) {
        appiumDriver.findElement(By.xpath(xpath)).sendKeys("12345");
    }
    @Step("<int> saniye kadar bekle")
    public void waitForsecond11(int s) throws InterruptedException {
        Thread.sleep(1000 * s);}

    @Step("Xpath <xpath> li geri elementine kere tikla")//geri
    public void clickGeriByxpath(String xpath) {
        for (int i = 0; i < 2; i++) {
            appiumDriver.findElement(By.xpath("xpath")).click();
        }
    }
    @Step("<int> saniye kadar bekle")
    public void waitForsecond12(int s) throws InterruptedException {
        Thread.sleep(1000 * s);}

    @Step("Rastgele urun secimi yine yap")//Pantolon kategorisinden rastgele ürün seçimi 2
    public void random2(){
        List<MobileElement> elements = appiumDriver.findElements(By.xpath("//*[@resource-id='com.ozdilek.ozdilekteyim:id/imageView']"));
        Random ran = new Random();
        int ranInt = ran.nextInt(elements.size());
        elements.get(ranInt).click();
    }
    @Step("<int> saniye kadar bekle")
    public void waitForsecond13(int s) throws InterruptedException {
        Thread.sleep(1000 * s);}

    @Step("Xpath <xpath> li elementi sepete ekle")//sepete ekle
    public void clickSepeteEkleByxpath(String xpath) {
        appiumDriver.findElement(By.xpath(xpath)).click();
    }
    @Step("<int> saniye kadar bekle")
    public void waitForsecond14(int s) throws InterruptedException {
        Thread.sleep(1000 * s);}
}




