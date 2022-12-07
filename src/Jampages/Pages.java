package Jampages;

import org.openqa.selenium.By;

public class Pages {
	public static final By SIGNIN_BUTTON = By.id("login-button");
	public static final By EMAIL_FIELD = By.xpath("//input[@name='username']");
	public static final By PASSWORD_FIELD = By.xpath("//input[@name='password']");
	public static final By PRODUCT_SELECT = By.xpath("//*[@class='product-card relative']");
	public static final By OKE_BUTTON = By.xpath("//*[contains(text(),'OKE')]");
	public static final By NANTI_BUTTON = By.xpath("//*[contains(text(),'Nanti Saja')]");
	public static final By BUY_NOW = By.xpath("//*[contains(text(),'Beli sekarang')]");
	public static final By CLOSE_BUTTON = By.xpath("//*[@data-id='CLOSE']");
	public static final By SEARCH_BAR = By.xpath("//*[@aria-label='search-input']");
	public static final By KERANJANG_BUTTON = By.xpath("//*[@class='w-1-2 mr-4']");
	public static final By LIHAT_KERANJANG = By.xpath("//*[contains(text(),'LIHAT KERANJANG')]");
	public static final By LANJUTKAN = By.xpath("//*[contains(text(),'Lanjutkan')]");
	public static final By SHIPPING_METHOD = By.xpath("//*[@aria-label='Choose shipping method']");
	public static final By COURIER = By.xpath("//*[contains(text(),'JNE')]");
	public static final By CHOOSE_PAYMENT = By.xpath("//div/button[contains(text(),'Pilih Pembayaran')]");
	public static final By NOTFOUND_MESSAGE = By.xpath("//*[contains(text(),'Udah nyari tapi gak ketemu :(')]");
	
}