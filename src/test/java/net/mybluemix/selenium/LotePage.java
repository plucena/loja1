package net.mybluemix.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LotePage {
	
	private String url = "http://loja.mybluemix.net/app/#/lotes";
	private WebDriver driver;
	private WebElement element = null;
	
	public LotePage() {
		driver = new FirefoxDriver();
		driver.get(this.url);
	}
	
	public void fecharPagina() {
		driver.close();
	}
	
	public boolean listarEncomendados(boolean click) throws InterruptedException {
		if (click) {
			element = findWithDelay(By.xpath("//*[contains(text(), 'Encomendados')]"), driver);
			element.click();
		}
		element = findWithDelay(By.xpath("//md-tab-item[@class='md-active']/span"), driver);
		return element.getText().contains("ENCOMENDADOS");
	}

	public boolean listarEmEstoque(boolean click) throws InterruptedException {
		if (click) {
			element = findWithDelay(By.xpath("//*[contains(text(), 'Em Estoque')]"), driver);
			element.click();
		}
		element = findWithDelay(By.xpath("//md-tab-item[@class='md-active']/span"), driver);
		return element.getText().contains("EM ESTOQUE");
	}
	
	public boolean listarEmProducao(boolean click) throws InterruptedException {
		if (click) {
			element = findWithDelay(By.xpath("//*[contains(text(), 'Em Producao')]"), driver);
			element.click();
		}
		element = findWithDelay(By.xpath("//md-tab-item[@class='md-active']/span"), driver);
		return element.getText().contains("EM PRODUCAO");
	}

	public boolean listarFinalizados(boolean click) throws InterruptedException {
		if (click) {
			element = findWithDelay(By.xpath("//*[contains(text(), 'Finalizados')]"), driver);
			element.click();
		}
		element = findWithDelay(By.xpath("//md-tab-item[@class='md-active']/span"), driver);
		return element.getText().contains("FINALIZADOS");
	}
	
	public boolean listarCancelados(boolean click) throws InterruptedException {
		if (click) {
			element = findWithDelay(By.xpath("//*[contains(text(), 'Cancelados')]"), driver);
			element.click();
		}
		element = findWithDelay(By.xpath("//md-tab-item[@class='md-active']/span"), driver);
		return element.getText().contains("CANCELADOS");
	}
	
	public void selecionar(String campo, String valor) throws InterruptedException {
		String idCampo = "select-" + campo;
		element = findWithDelay(By.id(idCampo), driver);
		element.click();
		String idOpcao = campo + "-" + valor;
		element = findWithDelay(By.id(idOpcao), driver);
		element.click();
	}

	public boolean encontrarLote(Integer sku, boolean click)//Mudar o SKU para um outro Identificador.
			throws InterruptedException {
		this.listarEncomendados(true);
		element = findWithDelay(By.id(sku.toString()), driver);
		if (!element.isDisplayed()) {
			this.listarEmEstoque(true);
			element = findWithDelay(By.id(sku.toString()), driver);
			if (!element.isDisplayed()) {
				this.listarEmProducao(true);
				element = findWithDelay(By.id(sku.toString()), driver);
				//Se puder alterar o finalizar e os cancelados, então adicionar o this.listar aqui.
			}
		}
		if (element.getText().contains(sku.toString())) {
			if (click)
				element.click();
			return true;
		} else {
			return false;
		}
	}

	public void clicarBotao(String botao) throws InterruptedException {
		String idBotao = null;
		switch (botao) {
		case "novoLote":
			idBotao = "button-novoLote";
			break;
		case "salvarLote":
			idBotao = "button-salvarLote";
			break;
		}
		element = findWithDelay(By.id(idBotao), driver);
		element.click();
	}

	public void preencher(String campo, String valor)
			throws InterruptedException {
		String idCampo = "input-" + campo;
		element = findWithDelay(By.id(idCampo), driver);
		element.clear();
		element.sendKeys(valor);

	}

	private WebElement findWithDelay(By by, WebDriver driver)
			throws InterruptedException {
		int interval = 50;
		try {
			element = driver.findElement(by);
			return element;
		} catch (Exception e1) {
			for (int milis = 0; milis < 3000; milis = milis + interval) {
				try {
					element = driver.findElement(by);
					return element;
				} catch (Exception e2) {
					Thread.sleep(interval);
				}
			}
		}
		return element;
	}


}
