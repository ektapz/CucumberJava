package StepDefinition;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Exampledatatable.feature",glue= {"StepDefinition"},
monochrome=true,
//plugin= {"pretty","html:target/HTMLReports"}
//plugin= {"pretty","json:target/Jsonreports/report.json"}
//plugin= {"pretty","junit:target/junitreports/report.xml"}
plugin= { "pretty","html:target/HTMLReports",
		"junit:target/JUnitReports/report.xml",
		"json:target/JSONReports/report.json"}
		)
public class testRunner {
	
	

}
