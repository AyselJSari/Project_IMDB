package com.imdb.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/Features",
        glue = "com/imdb/step_definitions",
        dryRun = false,
        tags = "@release",
        publish = true

)

public class CucumberRunner {
}
