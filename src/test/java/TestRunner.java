import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/feature",glue ="stepdef",plugin= {"pretty","json:target/cucumber.json"})


public class TestRunner extends AbstractTestNGCucumberTests {
}
