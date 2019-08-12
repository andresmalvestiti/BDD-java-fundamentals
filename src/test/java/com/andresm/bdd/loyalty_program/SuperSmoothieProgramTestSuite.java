package com.andresm.bdd.loyalty_program;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "classpath:features/loyalty_cards",
        glue = "com.andresm.bdd"
)
public class SuperSmoothieProgramTestSuite {
}
