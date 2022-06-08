package br.com.teste.tools.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import br.com.bradesco.automacaocartoes.core.DriverFactory;
import br.com.teste.practice.utilitarios.UtilsWeb;
import br.com.teste.tools.pagesweb.DetalhesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

@SuppressWarnings({ "unused" })
public class AutomacaoSteps extends UtilsWeb {

	public static WebDriver driverWeb = DriverFactory.getDriverWeb();

	DetalhesPage Page= new DetalhesPage(driverWeb);
	
	@Given("Acessar Site Busca CEP Correrio {string}")
	public void site_correio (String site) throws InterruptedException {
		abrirUrl("https://buscacepinter.correios.com.br/app/endereco/index.php");
		System.out.println("Site Informado");
		maximizarPaginaWeb();
		espera(4);
		esperaElemento(Page.logoSite, 60);
		Assert.assertTrue(elementoExiste(Page.logoSite));
	}
	
	@Given("Acessar o site Trivago {string}")
	public void site_trivago (String site) throws InterruptedException {
		abrirUrl("https://www.trivago.com.br/");
		System.out.println("Site Informado");
		maximizarPaginaWeb();
		espera(4);
		esperaElemento(Page.logoSite, 60);
		Assert.assertTrue(elementoExiste(Page.logoSite));
	}
	
	@Given("Realizar a busca com o valor Lojas Bemol {string} {string}")
	public void cliente_novo_practice(String CEP, String Loja) throws InterruptedException {
		esperaElemento(Page.botaoBuscar, 60);
		esperaElemento(Page.cepEndereco, 60);
		Assert.assertTrue(elementoExiste(Page.botaoBuscar));
		Assert.assertTrue(elementoExiste(Page.cepEndereco));
		Page.digitarCEP(CEP);
		espera(2);
		Page.buscarCep();
		espera(2);
		esperaElemento(Page.resultadoEnderecoCEP, 60);
		Assert.assertTrue(elementoExiste(Page.paginaEnderecoCEP));
		Assert.assertTrue(elementoExiste(Page.resultadoEnderecoCEP));
		espera(2);
		Page.clicarNovaBusca();
		espera(2);
		esperaElemento(Page.botaoBuscar, 60);
		esperaElemento(Page.cepEndereco, 60);
		Assert.assertTrue(elementoExiste(Page.botaoBuscar));
		Assert.assertTrue(elementoExiste(Page.cepEndereco));
		Page.digitarLojaBemol(Loja);
		espera(2);
		Page.buscarCep();
		esperaElemento(Page.resultadoEnderecoCEP, 60);
		elementoExiste(Page.paginaEnderecoCEP);
		elementoExiste(Page.resultadoEnderecoCEP);
		espera(3);
	}
	
	
	@Given("Finalizo a busca")
	public void Finalizo_busca() throws InterruptedException {
		Page.clicarNovaBusca();
		espera(2);
		esperaElemento(Page.botaoBuscar, 60);
		esperaElemento(Page.cepEndereco, 60);
		Assert.assertTrue(elementoExiste(Page.botaoBuscar));
		Assert.assertTrue(elementoExiste(Page.cepEndereco));
	}
	
	@Given("Digitar o valor Manaus no campo de busca {string}")
	public void cliente_novo_practice(String Cidade) throws InterruptedException {
		esperaElemento(Page.botaoBuscarTrivago, 60);
		esperaElemento(Page.campoEnderecoTrivago, 60);
		Assert.assertTrue(elementoExiste(Page.campoEnderecoTrivago));
		Assert.assertTrue(elementoExiste(Page.botaoBuscarTrivago));
		Page.digitarCidade(Cidade);
		esperaElemento(Page.selecionarOpcaoManaus,60);
		espera(5);
		Page.clicarManausOpcao();
		Page.buscarCidadeTrivago();
		espera(2);
	}
	
	@Given("Clicar no botão Pesquisar Selecionar a opção Ordenar por Avaliação e Sugestões")
	public void botao_pesquisar () throws InterruptedException {
		esperaElemento(Page.selecionarOrdenarPor, 60);
		espera(30);
		Assert.assertTrue(elementoExiste(Page.selecionarOrdenarPor));
		Page.clicarOrdenarPor();
		Page.clicarDiv();
		Page.clicarOrdenarPor();
		espera(30);
		esperaElemento(Page.hotelLagoa, 60);
		Assert.assertTrue(elementoExiste(Page.hotelLagoa));
		Assert.assertTrue(elementoExiste(Page.hotelLagoaDiv1));
		Assert.assertTrue(elementoExiste(Page.hotelClassificacao));
		Assert.assertTrue(elementoExiste(Page.clicarOfertaHotel));
		Page.clicarHotelLagoa();
		espera(2);
		esperaElemento(Page.hotelLagoa, 60);
		esperaElemento(Page.avaliacaoHotelLagoa, 60);
		Assert.assertTrue(elementoExiste(Page.hotelLagoa));
		Assert.assertTrue(elementoExiste(Page.avaliacaoHotelLagoa));
		Assert.assertTrue(elementoExiste(Page.clicarOfertaHotel));
	}
	
	@Given("Verifique o nome do primeiro da lista")
	public void primeiro_lista()throws InterruptedException {
		esperaElemento(Page.hotelLagoa, 60);
		Assert.assertTrue(elementoExiste(Page.hotelLagoa));
		Assert.assertTrue(elementoExiste(Page.hotelLagoaDiv1));
		Assert.assertTrue(elementoExiste(Page.hotelClassificacao));
		Page.clicarHotelLagoa();
		espera(2);
	}
	
	@Given("Verifique a avaliação do primeiro da lista")
	public void primeiro_avaliacao()throws InterruptedException {
		espera(2);
		esperaElemento(Page.hotelLagoa, 60);
		esperaElemento(Page.avaliacaoHotelLagoa, 60);
		Assert.assertTrue(elementoExiste(Page.hotelLagoa));
		Assert.assertTrue(elementoExiste(Page.avaliacaoHotelLagoa));
		Assert.assertTrue(elementoExiste(Page.clicarOfertaHotel));
		espera(3);
	}
	
	@Given("Verifique o valor do primeiro da lista")
	public void avaliar_preco ()throws InterruptedException {
		espera(2);
		Assert.assertTrue(elementoExiste(Page.hotelLagoa));
		Assert.assertTrue(elementoExiste(Page.avaliacaoHotelLagoa));
		Assert.assertTrue(elementoExiste(Page.clicarOfertaHotel));
		espera(3);
	}
}