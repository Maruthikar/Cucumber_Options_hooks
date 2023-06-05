package testrunnerfile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ={"D:\\Eclipse\\Cucumb\\src\\test\\resources\\featurefile"},
glue= {"stepdefinitionfile","hooks"},
	plugin= {"pretty","html:target/login.html"})



public class Runnerfile {
	
	

}


