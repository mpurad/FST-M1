import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/features",
        glue = {"stepDefinitions"},
        tags = "@SmokeTest",
//        tags = "@SimpleAlert or @ConfirmAlert"
        plugin = {"html: test-reports"},
        monochrome = true
)
public class ActivitiesRunner {
}
