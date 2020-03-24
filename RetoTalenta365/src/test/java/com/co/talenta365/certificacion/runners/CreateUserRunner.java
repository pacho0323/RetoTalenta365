package com.co.talenta365.certificacion.runners;

import static cucumber.api.SnippetType.CAMELCASE;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/reto_talenta365.feature", 
glue="com/co/talenta365/certificacion/stepdefinitions", 
//tags = "@createUser",
snippets=CAMELCASE)
public class CreateUserRunner {

}
