package com.co.talenta365.certificacion.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class CreateUserUserInterface {
	private CreateUserUserInterface() {

	}

	public static final Target OPTLOGIN = Target.the("OPTION LOGIN").locatedBy("//a[@data-ng-click=\"login('loginMiniTitle')\"]");

	public static final Target BTNCREATEACCOUNT = Target.the("BOTON CREAR CUENTA")
			.locatedBy("//a[.='CREATE NEW ACCOUNT']");

	public static final Target LBLUSERNAME = Target.the("USERNAME").located(By.name("usernameRegisterPage"));
	public static final Target LBLPASSWORD = Target.the("PASSWORD").located(By.name("passwordRegisterPage"));
	public static final Target LBLCONFIRMPASSWORD = Target.the("CONFIRMPASSWORD")
			.located(By.name("confirm_passwordRegisterPage"));
	public static final Target LBLEMAIL = Target.the("EMAIL").located(By.name("emailRegisterPage"));
	public static final Target LBLFIRSTNAME = Target.the("FIRSTNAME").located(By.name("first_nameRegisterPage"));
	public static final Target LBLLASTNAME = Target.the("LASTNAME").located(By.name("last_nameRegisterPage"));
	public static final Target LBLPHONENUMBER = Target.the("PHONENUMBER").located(By.name("phone_numberRegisterPage"));
	public static final Target LBLCOUNTRY = Target.the("COUNTRY").located(By.name("countryListboxRegisterPage"));
	public static final Target OPTCOUNTRY = Target.the("OPTION COUNTRY")
			.locatedBy("//select[@name=\"countryListboxRegisterPage\"]/option[.='{0}']");
	public static final Target LBLCITY = Target.the("CITY").located(By.name("cityRegisterPage"));
	public static final Target LBLADDRESS = Target.the("ADDRESS").located(By.name("addressRegisterPage"));
	public static final Target LBLSTATE = Target.the("STATE").located(By.name("state_/_province_/_regionRegisterPage"));
	public static final Target LBLPOSTALCODE = Target.the("POSTAL CODE").located(By.name("postal_codeRegisterPage"));

	public static final Target CHIAGREE = Target.the("IAGREE").located(By.name("i_agree"));
	public static final Target BTNREGISTER = Target.the("BUTTON REGISTER").located(By.id("register_btnundefined"));

	public static final Target USER = Target.the("USER CREATE").locatedBy("//a[@id=\"menuUserLink\"]/span");

}
