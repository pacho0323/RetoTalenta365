package com.co.talenta365.certificacion.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

import com.co.talenta365.certificacion.models.User;
import com.co.talenta365.certificacion.userinterface.CreateUserUserInterface;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Create implements Task {
	private String username;
	private String password;
	private String confirmpassword;
	private String email;
	private String firtsName;
	private String lastName;
	private String phone;
	private String country;
	private String city;
	private String address;
	private String state;
	private String postalCode;

	public Create(User user) {
		username = user.getUsername();
		password = user.getPassword();
		confirmpassword = user.getConfirmpassword();
		email = user.getEmail();
		firtsName = user.getFirtsName();
		lastName = user.getLastName();
		phone = user.getPhone();
		country = user.getCountry();
		city = user.getCity();
		address = user.getAddress();
		state = user.getState();
		postalCode = user.getPostalCode();

	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				WaitUntil.the(CreateUserUserInterface.BTNCREATEACCOUNT, isClickable()),
				Click.on(CreateUserUserInterface.BTNCREATEACCOUNT),
				Enter.theValue(username).into(CreateUserUserInterface.LBLUSERNAME),
				Enter.theValue(password).into(CreateUserUserInterface.LBLPASSWORD),
				Enter.theValue(confirmpassword).into(CreateUserUserInterface.LBLCONFIRMPASSWORD),
				Enter.theValue(email).into(CreateUserUserInterface.LBLEMAIL),
				Enter.theValue(firtsName).into(CreateUserUserInterface.LBLFIRSTNAME),
				Enter.theValue(lastName).into(CreateUserUserInterface.LBLLASTNAME),
				Enter.theValue(phone).into(CreateUserUserInterface.LBLPHONENUMBER),
				Click.on(CreateUserUserInterface.LBLCOUNTRY),
				Click.on(CreateUserUserInterface.OPTCOUNTRY.of(country)),
				Enter.theValue(city).into(CreateUserUserInterface.LBLCITY),
				Enter.theValue(address).into(CreateUserUserInterface.LBLADDRESS),
				Enter.theValue(state).into(CreateUserUserInterface.LBLSTATE),
				Enter.theValue(postalCode).into(CreateUserUserInterface.LBLPOSTALCODE),
				Click.on(CreateUserUserInterface.CHIAGREE),
				Click.on(CreateUserUserInterface.BTNREGISTER)
				);
	}

	public static Create user(User user) {
		return instrumented(Create.class, user);

	}
}
