package br.com.teste.tools.runners;

import org.junit.runner.RunWith;

import br.com.bradesco.automacaocartoes.core.ExtendedCucumberRunner;
import br.com.teste.practice.utilitarios.SetUpTearDown;
import io.cucumber.junit.CucumberOptions;

@RunWith(ExtendedCucumberRunner.class)
@CucumberOptions(

		plugin = { "pretty", 
				"html:target/cucumber-report", 
				"junit:target/cucumber-report/junitResult.xml",
				"json:target/cucumber-report/jsonResult.json" },
				stepNotifications = true, 
				
				useFileNameCompatibleName = true, 
				
				strict = true, 
				
		features = {"src/test/resources/features/Automacao_Bemodigital.feature"},
		
		glue = {"br.com.teste.tools.steps", "br.com.teste.practice.utilitarios" }, 
		
		//tags = {"@Automacao_TesteI"}
		tags = {"@Automacao_TesteII"}
		
)

public class AutomacaoTest extends SetUpTearDown {

}