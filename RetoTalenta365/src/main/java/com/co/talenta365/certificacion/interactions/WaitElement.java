package com.co.talenta365.certificacion.interactions;

import java.util.logging.Logger;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class WaitElement implements Interaction {
	private long time;
	private Logger logg;

	public WaitElement(long time) {
		this.time = time;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			logg.info(e.getMessage());
			
		}

	}

	public static WaitElement forATime(long time) {
		return Tasks.instrumented(WaitElement.class, time);
	}
}
