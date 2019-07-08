package jenkinsPack;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","json:target/cucumber.json"}
		)
public class TestRunner {
  @Test
  public void f() {
  }
}
