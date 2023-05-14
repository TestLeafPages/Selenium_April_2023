package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/main/java/features/Login.feature"},
				 glue = {"steps","hooks"}, 
				 tags = "not @Smoke", 
				 publish = true, 
				 monochrome = true
				)
/*
 * "@Smoke" -> Only Smoke cases
 * "@Smoke or @Regression" -> Either Smoke or Regression cases
 * "@Smoke and @Regression" -> Run only the scenarios with both Smoke & Regression
 * "not @Smoke" -> Exclude @Smoke
 */
public class RunTest extends AbstractTestNGCucumberTests{

}
