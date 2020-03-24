package com.co.talenta365.certificacion.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.co.talenta365.certificacion.userinterface.CreateUserUserInterface;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class EnterOptLogin implements Task {
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(CreateUserUserInterface.OPTLOGIN));

	}

	public static EnterOptLogin inAdvantage() {
		return instrumented(EnterOptLogin.class);

	}

}
