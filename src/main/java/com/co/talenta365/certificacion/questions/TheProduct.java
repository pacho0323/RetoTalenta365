package com.co.talenta365.certificacion.questions;

import com.co.talenta365.certificacion.interactions.WaitElement;
import com.co.talenta365.certificacion.userinterface.BuyProductUserInterface;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheProduct implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		actor.attemptsTo(WaitElement.forATime(3000));
		return Text.of(BuyProductUserInterface.PRODUCTADDED).viewedBy(actor).asString();
	}

	public static TheProduct addedIs() {
		return new TheProduct();
	}
}
