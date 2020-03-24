package com.co.talenta365.certificacion.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.co.talenta365.certificacion.models.Product;
import com.co.talenta365.certificacion.userinterface.BuyProductUserInterface;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

	public class Buy implements Task {
		private String category;
		private String products;

		public Buy(Product product) {
			category = product.getCategory();
			products = product.getProducts();
		}

		@Override
		public <T extends Actor> void performAs(T actor) {


			actor.attemptsTo(
					MoveMouse.to(BuyProductUserInterface.BTNCATEGORY.of(category)),
					Click.on(BuyProductUserInterface.BTNCATEGORY.of(category)),
					Click.on(BuyProductUserInterface.BTNPRODUCT.of(products)),
					Click.on(BuyProductUserInterface.BTNADDPRODUCT)
					);
		}

		public static Buy aProduct(Product product) {
			return instrumented(Buy.class, product);

		}
	}

