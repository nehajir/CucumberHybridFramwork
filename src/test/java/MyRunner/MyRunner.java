package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\eclipse-workspace\\Tutorial_Ninja\\src\\test\\resources\\features\\login.feature",
                  glue= {"stepdefinations"},
                  publish=true,
                  plugin= {"pretty","html:target/htmlReport/cucumberreport.html"}
                		   )
public class MyRunner 
{

}
