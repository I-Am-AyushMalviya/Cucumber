package stepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before("@DataParamaterization")
	public void beforeDataParametrization() {
		System.out.println("Before Data Parameterization");
	}
	@After("@DataParamaterization")
	public void afterDataParameterization() {
		System.out.println("After Data Parameterization");
	}
}
