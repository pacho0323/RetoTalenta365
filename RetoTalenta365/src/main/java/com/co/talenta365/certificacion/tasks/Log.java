package com.co.talenta365.certificacion.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.co.talenta365.certificacion.models.User;
import com.co.talenta365.certificacion.userinterface.LogInUserInterface;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Log implements Task {
	private String username;
	private String password;

	public Log(User user) {
		username = user.getUsername();
		password = user.getPassword();
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
				Enter.theValue(username).into(LogInUserInterface.LBLUSERNAME),
				Enter.theValue(password).into(LogInUserInterface.LBLPASSWORD), 
				Click.on(LogInUserInterface.LBLSIGNIN));
	}

	public static Log in(User user) {
		return instrumented(Log.class, user);

	}
}
