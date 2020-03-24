package com.co.talenta365.certificacion.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class LogInUserInterface {
	private LogInUserInterface() {

	}

	public static final Target LBLUSERNAME = Target.the("USERNAME").located(By.name("username"));
	public static final Target LBLPASSWORD = Target.the("PASSWORD").located(By.name("password"));
	public static final Target LBLSIGNIN = Target.the("USERNAME").located(By.id("sign_in_btnundefined"));
}
