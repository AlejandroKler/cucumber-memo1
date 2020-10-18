package com.memo.cucumber;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Assert;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/cucumber")
public class MainTest {

    private RealTimeCovidCenter covidCenter;

    @Before
    public void before() {
        covidCenter = new RealTimeCovidCenter();
    }

    @Given("A country with name {string} with {int} hab and {int} cases")
    public void a_country_with_name_with_hab_and_cases(String countryName, Integer hab, Integer cases) {
        covidCenter.createCountry(countryName, hab);
        covidCenter.addCases(countryName, cases);
    }

    @When("I remove {int} cases to country {string}")
    public void i_remove_cases_to_country(Integer cases, String countryName) {
        covidCenter.removeCases(countryName, cases);
    }

    @When("I add {int} cases to country {string}")
    public void i_add_cases_to_country(Integer cases, String countryName) {
        covidCenter.addCases(countryName, cases);
    }

    @Then("Should be {int} cases in {string}")
    public void should_be_cases_in_country(Integer cases, String countryName) {
        Assert.assertEquals(cases, covidCenter.getCountryCases(countryName), 0);
    }

    @Then("Country cases per hab of {string} should be {double}")
    public void country_cases_per_hab_should_be(String countryName, double casesPerHab) {
        Assert.assertEquals(casesPerHab, covidCenter.getCountryCasesPerHab(countryName), 0);
    }

}
