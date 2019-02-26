package runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\AAAA\\workspace\\Cucumberwithjava\\src\\main\\java\\feature\\login.feature",
glue={"stepDefination"},
format ={"pretty","html:test-output"}
)
public class TestRunner {
	
	

}
