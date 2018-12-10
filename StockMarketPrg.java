import java.io.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class StockMarketPrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.exe", "./TestData/.exe");
		WebDrivaer driver=new WebDriver();
				
		driver.findElement(By.xpath('//span[@text()=Stock]'));
		
		System.out.println("Hello");

	}

}
