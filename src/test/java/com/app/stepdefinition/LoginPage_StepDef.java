package com.app.stepdefinition;

import java.util.Map;

import com.app.base.BaseClass;
import com.app.locator.Locator_LoginPage;
import com.app.pageexe.PageExe;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class LoginPage_StepDef extends PageExe {

	@Given("launch the url")
	public void launch_the_url() {
		browserlaunch();
		getUrl();
	    }

	@When("fillin the form details")
	public void fillin_the_form_details(DataTable data) {
		
		 Map<String, String> map = data.asMap(String.class, String.class);
		 firstname(map.get("firstname"));
		 lastname(map.get("lastname"));
		 email(map.get("email"));
	    }




}
