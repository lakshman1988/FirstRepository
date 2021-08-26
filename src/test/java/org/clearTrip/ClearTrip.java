package org.clearTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\Workspace\\ClearTripPractise\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/?&utm_source=google&utm_medium=cpc&utm_campaign=BR_Cleartrip-Desktab|Main_E|clear%20trip|e&dxid=CjwKCAjwmeiIBhA6EiwA-uaeFQle90UbOzzxzs5dqTXDxikCn5yzTLhxjQx1RcrrzlhAOQ5-cOZxbRoC_AgQAvD_BwE&gclid=CjwKCAjwmeiIBhA6EiwA-uaeFQle90UbOzzxzs5dqTXDxikCn5yzTLhxjQx1RcrrzlhAOQ5-cOZxbRoC_AgQAvD_BwE");
		WebElement element = driver.findElement(By.xpath("//button[@class='flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 c-pointer pr-2 pl-3 pt-2 pb-2 ba br-4 h-8 c-neutral-900']"));
		element.click();
	}

}
