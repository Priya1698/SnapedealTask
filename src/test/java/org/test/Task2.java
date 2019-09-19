package org.test;

import java.util.Set;

import org.openqa.selenium.WebElement;


public class Task2 extends Task {
public static void main(String[] args) throws Throwable {
	browserLaunch();
webBage("https://www.snapdeal.com");
scrShot("D:\\Priya\\Screenshots.img1.png");
WebElement enter = findIdBath("inputValEnter");
textValue(enter, getData(1, 0));
scrShot("D:\\Priya\\Screenshots.img2.png");
WebElement search = findXpath("//button[@class='searchformButton col-xs-4 rippleGrey']");
btnClick(search);
WebElement mb = findXpath("(//img[@class='product-image '])[4]");
btnClick(mb);
scrShot("D:\\Priya\\Screenshots.img3.png");
String pa1 = parentWindow();
Set<String> allWindow = allWindow();
for (String x : allWindow) {
	if(!pa1.equals(x)) {
		driver.switchTo().window(x);
	}
	
}
Thread.sleep(3000);WebElement add = findXpath("(//span[@class='intialtext'])[2]");
btnClick(add);
scrShot("D:\\Priya\\Screenshots.img4.png");
Thread.sleep(3000);
WebElement cart = findXpath("//div[@class='cartInner']");
btnClick(cart);
scrShot("D:\\Priya\\Screenshots.img5.png");
Thread.sleep(3000);
WebElement addno = findXpath("//div[@id='CS1']");
btnClick(addno);
scrShot("D:\\Priya\\Screenshots.img6.png");
Thread.sleep(3000);
WebElement proceed = findXpath("//input[@class='btn btn-xl rippleWhite cart-button']");
btnClick(proceed);
scrShot("D:\\Priya\\Screenshots.img7.png");
WebElement mail = findIdBath("username");
textValue(mail, getData(1, 1));
scrShot("D:\\Priya\\Screenshots.img8.png");
Thread.sleep(3000);
WebElement con = findXpath("//button[@id='login-continue']");
scrShot("D:\\Priya\\Screenshots.img9.png");
}
}
