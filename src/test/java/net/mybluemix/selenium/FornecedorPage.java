package net.mybluemix.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FornecedorPage {

	private String url = "http://loja.mybluemix.net/app/#/fornecedores";
	private WebDriver driver;
	private WebElement element = null;

	public FornecedorPage() {
		driver = new FirefoxDriver();
		driver.get(this.url);
	}

	public void fecharPagina() {
		driver.close();
	}
	
	public boolean listarAtivos(boolean click) throws InterruptedException {
		if (click) {
			element = findWithDelay(By.xpath("//*[contains(text(), 'Ativos')]"), driver);
			element.click();
		}
		element = findWithDelay(By.xpath("//md-tab-item[@class='md-active']/span"), driver);
		return element.getText().contains("ATIVOS");
	}

	public boolean listarInativos(boolean click) throws InterruptedException {
		if (click) {
			element = findWithDelay(By.xpath("//*[contains(text(), 'Inativos')]"), driver);
			element.click();
		}
		element = findWithDelay(By.xpath("//md-tab-item[@class='md-active']/span"), driver);
		return element.getText().contains("INATIVOS");
	}
	
	public boolean encontrarFornecedor(String cnpj, boolean click) throws InterruptedException {
		String cnpjWithMask = cnpj.substring(0, 2) + "." + cnpj.substring(2, 5) + "." + cnpj.substring(5, 8) + "/"
				+ cnpj.substring(8, 12) + "-" + cnpj.substring(12, 14);
		this.listarAtivos(true);
		element = findWithDelay(By.id(cnpj), driver);
		if (!element.isDisplayed()) {
			this.listarInativos(true);
			element = findWithDelay(By.id(cnpj), driver);
		}
		if (element.getText().contains(cnpjWithMask)){
			if(click)
				element.click();
			return true;
		} else {
			return false;
		}		
	}

	public void clicarBotao(String botao) throws InterruptedException {
		String idBotao = null;
		switch (botao) {
		case "novoFornecedor":
			idBotao = "button-novoFornecedor";
			break;
		case "salvarFornecedor":
			idBotao = "button-salvarFornecedor";
			break;
		}
		element = findWithDelay(By.id(idBotao), driver);
		element.click();
	}

	public void preencher(String campo, String valor) throws InterruptedException {
		String idCampo = "input-" + campo;
		element = findWithDelay(By.id(idCampo), driver);
		if (campo == "ativo") {
			if (valor == "true") {
				if(element.getText().contains("Fornecedor Desativado"))
					element.click();
			} else if (valor == "false") {
				if(element.getText().contains("Fornecedor Ativo"))
					element.click();
			}
		} else {
			element.clear();
			element.sendKeys(valor);
		}
	}
	
	public void selecionar(String campo, String valor) throws InterruptedException {
		String idCampo = "select-" + campo;
		element = findWithDelay(By.id(idCampo), driver);
		element.click();
		String idOpcao = "estado-" + valor;
		element = findWithDelay(By.id(idOpcao), driver);
		element.click();
	}

	private WebElement findWithDelay(By by, WebDriver driver) throws InterruptedException {
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