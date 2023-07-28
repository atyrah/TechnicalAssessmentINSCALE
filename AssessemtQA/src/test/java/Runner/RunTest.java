package Runner;


import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

        features={"src/test/resources/features/Technical Assessment Questions.feature"},
        glue = "INSCALE",
        tags={"@Q1"}
)
public class RunTest{




}
