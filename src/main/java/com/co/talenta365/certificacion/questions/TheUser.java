package com.co.talenta365.certificacion.questions;

import com.co.talenta365.certificacion.userinterface.CreateUserUserInterface;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheUser implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(CreateUserUserInterface.USER).viewedBy(actor).asString();
	}

	public static TheUser is() {
		return new TheUser();
	}
}
