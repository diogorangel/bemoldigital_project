package br.com.teste.practice.utilitarios;

import java.io.IOException;

import br.com.bradesco.automacaocartoes.annotations.AfterAll;
import br.com.bradesco.automacaocartoes.annotations.BeforeAll;
import br.com.bradesco.automacaocartoes.core.DriverFactory;
import br.com.bradesco.automacaocartoes.core.GeradorDeRelatorio;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;




/**************************************************************
 * CONFIGURA��O DO QUE EXECUTAR ANTES E DEPOIS DE UMA FEATURE *
 * E DO QUE EXECUTAR ANTES E DEPOIS DE UM CEN�RIO             *
 **************************************************************/



public class SetUpTearDown {

	@BeforeAll
	public static void setUpBeforeTest() throws IOException {
	}

	@Before(order = 1)
	public void setUpBeforeClass(Scenario scenario) throws Exception {
		GeradorDeRelatorio.criarPdf(scenario);
	}

	@After(order = 1)
	public void tearDownAfterClass(Scenario scenario) throws Exception {

		if (scenario.isFailed()) {
			if (DriverFactory.driverWebExiste() != null) {
				UtilsWeb.tirarScreenshot("Cen�rio falhou! Esta � �ltima tela web apresentada");
			}
		}
		DriverFactory.fecharApp();
		GeradorDeRelatorio.fecharPdf();
	}

	@AfterAll
	public static void tearDownAfterTest() throws IOException {
		DriverFactory.killDriver();
		}

}