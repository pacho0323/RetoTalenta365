package com.co.talenta365.certificacion.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class BuyProductUserInterface {
	private BuyProductUserInterface() {

	}

	public static final Target BTNCATEGORY = Target.the("BUTTON CATEGORY")
			.locatedBy("//div[@class='container ']/div/div/div/span[.='{0}']/parent::div");
	public static final Target BTNPRODUCT = Target.the("BUTTON PRODUCT")
			.locatedBy("//div[@class=\"cell categoryRight\"]/ul/li/p[1]/a[.='{0}']");
	public static final Target BTNADDPRODUCT = Target.the("BUTTON ADD PRODUCT").located(By.name("save_to_cart"));
	public static final Target PRODUCTADDED = Target.the("PRODUCT ADD")
			.locatedBy("/html/body/header/nav/ul/li[2]/ul/li//h3");

}
