import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
features = {"C:/Users/ThiyagaN/Documents/EclipseNeon2/eclipse/workspace/pocParallel/src/test/resources/features/parallel2.feature"},
plugin = {"html:target/cucumber-parallel/2.html", "json:target/cucumber-parallel/2.json"},
monochrome = true,
 tags = {"@parallel"}, glue = { "steps" })
public class Parallel02IT {
}
