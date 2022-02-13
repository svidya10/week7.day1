package runner;

import base.BaseClass;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;


@CucumberOptions (features = "src/main/java/features"
, glue = "pages"
, monochrome = true
, dryRun = false
, snippets = SnippetType.CAMELCASE)
public class RunnerSN extends BaseClass{

}


