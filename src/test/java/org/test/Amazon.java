package org.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Amazon extends Task {
	public static void main(String[] args) throws Throwable {
		browserLaunch();
		webBage("https://www.amazon.in");
		WebElement entr = findIdBath("twotabsearchtextbox");
		textValue(entr, "one plus 7");
		WebElement search = findXpath("(//input[@type='submit'])[1]");
		btnClick(search);
		List<WebElement> allmobiles = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	for (WebElement mobilesare : allmobiles) {
		String text = mobilesare.getText();
		System.out.println(text);
		
	}
	/*WebElement mobile3 = allmobiles.get(2);
	String windowHandle = driver.getWindowHandle();
	JavascriptExecutor je = (JavascriptExecutor) driver;
	Thread.sleep(2000);
	je.executeScript("arguments[0].click()", mobile3);
	Thread.sleep(2000);
	Set<String> allWindow = allWindow();
	for (String x : allWindow) {
		if(!windowHandle.equals(x)) {
			driver.switchTo().window(x);
	}

}
	WebElement addcart = findXpath("//input[@id='add-to-cart-button']");
	je.executeScript("arguments[0].click()", addcart);
	
	scrShot("D:\\Priya\\Screenshots\\img1.png");*/
	Set<WebElement> ps = new HashSet<WebElement>(); 
	ps.addAll(allmobiles);
	JavascriptExecutor je = (JavascriptExecutor) driver;

	int count = 0;
	for (WebElement y : ps) {
	count++;
	if(count<=3) {
		je.executeScript("arguments[0].click()", y);
	}
	
	}
	Set<String> allWindows = allWindow();
	
	int ct = 0;
	for (String z : allWindows) {
	count++;
	if(count==3) {
	driver.switchTo().window(z);
	System.out.println(z);
	scrShot("D:\\Priya\\Screenshots\\img2.png");
	}
}
   Thread.sleep(3000);
   List<String> li = new ArrayList<String>();
   li.addAll(allWindows);
   for (int i = 0; i < li.size(); i++) {
	if(i==1) {
		String secwindow = li.get(i);
		driver.switchTo().window(secwindow);
		System.out.println(secwindow);
		scrShot("D:\\Priya\\Screenshots\\window3.png");
	}
}
	}
	}