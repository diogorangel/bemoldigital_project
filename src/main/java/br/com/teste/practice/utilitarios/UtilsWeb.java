package br.com.teste.practice.utilitarios;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.bradesco.automacaocartoes.core.DriverFactory;
import br.com.bradesco.automacaocartoes.core.UtilsCoreWeb;

public class UtilsWeb extends UtilsCoreWeb {

	private static WebDriver driverWeb;

	public UtilsWeb() {
		driverWeb = DriverFactory.getDriverWeb();
	}	
	
	public void scrollAteOElemento(WebElement elemento) {
		
		((JavascriptExecutor) driverWeb).executeScript("arguments[0].scrollIntoView(true);", elemento);
	
	}
	
	public void scrollToTop() {
		
		((JavascriptExecutor) driverWeb).executeScript("window.scrollTo(0,0)");
		
	}
	public void scrollTomiddle() {
		
		((JavascriptExecutor) driverWeb).executeScript("window.scrollTo(300, 500)");
		
	}
	public void scrollToBottom() {
		
		((JavascriptExecutor) driverWeb).executeScript("window.scrollTo(0,2000)");
		
	}
}