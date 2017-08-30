package cucumber.runtime.java8.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Sarangj on 30/08/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/cucumber/",
        format={
                "json:target/cucumber/wikipedia.json",
                "html:target/cucumber/wikipedia.html",
                "pretty"
        },
        tags={"~@ignored"},
        glue={"cucumber.runtime.java8.test.stepdefinitions"}
)
public class RunCucumbertests {
        public RunCucumbertests(){

        }
}
