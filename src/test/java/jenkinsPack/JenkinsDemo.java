package jenkinsPack;
import cucumber.api.java.en.Given;

public class JenkinsDemo {
	@Given("^Build a job in jenkins$")
	public void build_a_job_in_jenkins() throws Throwable {
		System.out.println("Test Build");
	}
}
