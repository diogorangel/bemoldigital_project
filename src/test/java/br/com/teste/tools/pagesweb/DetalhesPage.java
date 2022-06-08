package br.com.teste.tools.pagesweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import br.com.teste.practice.utilitarios.UtilsWeb;

public class DetalhesPage extends UtilsWeb {

	@SuppressWarnings("unused")
	
	private WebDriver driverWeb;

	public DetalhesPage(WebDriver driverWeb) {
		this.driverWeb = driverWeb;
		PageFactory.initElements(driverWeb, this);
	}
	
	// Certificado Chrome: Botão Avançado
	@FindBy(xpath = "//*[@id='details-button']")
	public WebElement btnAvancadoChrome;

	// Certificado Chrome: Link Ok
	@FindBy(xpath = "//*[@id='proceed-link']")
	public WebElement linkCertificadoOkChrome;

	// Certificado IE: Link Mais Informações
	@FindBy(id = "moreInfoContainer")
	public WebElement btnMaisInformacoesIe;

	// Certificado IE: Continuar
	@FindBy(id = "overridelink")
	public WebElement btnContinuarIe;
	
	//Imagem Site
	@FindBy (xpath = "//a[contains(@href, 'https://buscacepinter.correios.com.br/app/index.php')]|//div[@class='w-full flex']")
	public WebElement logoSite;
	
	// Campo para CEP
	@FindBy(xpath = "//input[contains(@id, 'endereco')]")
	public WebElement cepEndereco;
	
	//Clicar no Botao Buscar
	@FindBy (xpath = "//button[@class='primario']")
	public WebElement botaoBuscar;
	
	// Campo para Loja
	@FindBy(xpath = "//input[contains(@id, 'endereco')]")
	public WebElement campoLoja;
	
	//Clicar no Botao Nova Busca
	@FindBy (xpath = "//button[@id='btn_voltar']")
	public WebElement botaoNovaBusca;
	
	//Resultado da Busca por Endereço ou CEP
	@FindBy (xpath = "//h4[contains(., 'Resultado da Busca por Endereço ou CEP')]")
	public WebElement paginaEnderecoCEP;
	
	//Resultado da Busca por Endereço ou CEP
	@FindBy (xpath = "//td['Rua Miranda Leão' and 'Centro' and 'Manaus/AM' and '69005-040'] | //td['Rua Miranda Leão' and 'Lojas Bemol' and 'Centro' and 'Manaus/AM' and '69005-040']")
	public WebElement resultadoEnderecoCEP;
	
	// Campo para Endereco Trivago
	@FindBy(xpath = "//input[contains(@id, 'input-auto-complete')]")
	public WebElement campoEnderecoTrivago;
	
	// Opcoes exibidas Manaus
	@FindBy(xpath = "//span[contains(@data-testid, 'Manaus')] | //div[contains(@class, 'flex flex-col truncate')]")
	public WebElement selecionarOpcaoManaus;
	
	//Clicar no Botao Buscar
	@FindBy (xpath = "//button[@aria-label='Pesquisar']")
	public WebElement botaoBuscarTrivago;
	
	//Selecionar Ordenar por
	@FindBy (xpath = "//select[contains(@id, 'sorting-selector')]")
	public WebElement selecionarOrdenarPor;
	
	//Selecionar Ordenar por
	@FindBy (xpath = "//option[contains(., 'Avaliação e sugestões')]")
	public WebElement selecionarAvaliacaoSugestao;
	
	//Ordenar Por Clicar
	@FindBy (xpath = "//p[contains(., 'Como o pagamento afeta a classificação')]")
	public WebElement clicarOrdenarPor;
	
	//Hotel Lagoa
	@FindBy (xpath = "//span[contains(., 'Hotel Lagoa') and ('8.3')]")
	public WebElement hotelLagoa;
	
	//Hotel Lagoa Primeiro Elemento
	@FindBy (xpath = "//div[contains(@class, 'bg-white rounded 2xl:rounded-sm SlideoutContainer_shadow__CA7DE')]")
	public WebElement hotelLagoaDiv1;
	
	//Hotel Classificacao
	@FindBy (xpath = "//span[contains(., '8.3') and ('Hotel Lagoa')]")
	public WebElement hotelClassificacao;
	
	// Clicar Hotel Lagoa
	@FindBy (xpath = "//p[contains(., 'R$176') and ('Hotel Lagoa')] | //p[contains(., 'R$180') and ('Hotel Lagoa')]")
	public WebElement clicarOfertaHotel;
	
	//Hotel Lagoa
	@FindBy (xpath = "//span[contains(., '8.3')]")
	public WebElement avaliacaoHotelLagoa;
	
	
	public void digitarCEP(String CEP) {
		cepEndereco.sendKeys(CEP);
	}
	
	public void digitarLojaBemol(String Loja) {
		cepEndereco.sendKeys(Loja);
	}
	
	public void clicarNovaBusca() {
		botaoNovaBusca.click();
	}
	
	public void buscarCep() {
		botaoBuscar.click();
	}
	
	public void digitarCidade(String Cidade) {
		campoEnderecoTrivago.sendKeys(Cidade);
	}
	
	public void buscarCidadeTrivago() {
		botaoBuscarTrivago.click();
	}
	
	public void selecionarAvaliarSugestao() {
		selecionarOrdenarPor.click();
	}
	
	public void clicarOrdenarPor() {
		selecionarAvaliacaoSugestao.click();
	}
	
	public void clicarHotelLagoa() {
		clicarOfertaHotel.click();
	}
	
	public void clicarManausOpcao() {
		selecionarOpcaoManaus.click();
	}
	
	public void clicarDiv() {
		clicarOrdenarPor.click();
	}
}