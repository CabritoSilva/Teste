package juniTest;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(features = {"src/test/resources/Funcionalidades"}, //pasta..
	glue = {"AcessoSite"}, //pacote..
	plugin = {"pretty","html:target/cucumber"})
	
public class TestRunner 

{

}

		

