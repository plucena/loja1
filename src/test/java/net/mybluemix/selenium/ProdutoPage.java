package net.mybluemix.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ProdutoPage {

	private String url = "http://loja.mybluemix.net/app/#/produtos";
	private WebDriver driver;
	private WebElement element = null;

	public ProdutoPage() {
		driver = new FirefoxDriver();
		driver.get(this.url);
	}

	public void fecharPagina() {
		driver.close();
	}

	public boolean encontrarProduto(String nome) {
		try {
			element = findWithDelay(By.tagName("table"), driver);
			return element.getText().contains(nome);
		} catch (Exception e) {
			return false;
		}
	}

	public void clicarBotao(String botao) throws InterruptedException {
		String idBotao = null;
		switch (botao) {
		case "novoProduto":
			idBotao = "button-novoProduto";
			break;
		case "salvarProduto":
			idBotao = "button-salvarProduto";
			break;
		}
		element = findWithDelay(By.id(idBotao), driver);
		element.click();
	}

	public void editar() throws InterruptedException {
		element = findWithDelay(By.xpath("//tr[@class='md-row ng-scope']"),
				driver);
		element.click();

	}

	// public void editar() throws InterruptedException {
	// try{
	// element = findWithDelay(By.xpath("//tr[@class='md-row ng-scope']"),
	// driver);
	// element.click();
	// }catch(Exception e){ //Adicionei daqui para baixo! Pega o último elemento
	// do *Em Produção*
	// element = findWithDelay(By.xpath("//md-content"),
	// driver);
	// element.click();
	// }
	//
	//
	// }

	public void radioButton(String nome) {
		try {
			switch (nome) {
			case "EM_ESTOQUE":
				element = findWithDelay(
						By.xpath("//md-radio-button[@value='EM_ESTOQUE']"),
						driver);
				break;

			case "EM_PRODUCAO":
				element = findWithDelay(
						By.xpath("//md-radio-button[@value='EM_PRODUCAO']"),
						driver);
				break;
			default:
				break;
			}
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void preencher(String campo, String valor)
			throws InterruptedException {
		String idCampo = "input-" + campo;
		element = findWithDelay(By.id(idCampo), driver);
		element.clear();
		element.sendKeys(valor);

	}

	public void selecionar(String campo, String valor)
			throws InterruptedException {
		String idCampo = "select-" + campo;
		element = findWithDelay(By.id(idCampo), driver);
		element.click();
		String idOpcao = campo + "-" + valor;
		element = findWithDelay(By.id(idOpcao), driver);
		element.click();
	}

	private WebElement findWithDelay(By by, WebDriver driver)
			throws InterruptedException {
		int interval = 50;
		try {
			element = driver.findElement(by); // Aqui tá recebendo NULL quando
												// não acha.
			return element;
		} catch (Exception e1) {
			for (int milis = 0; milis < 3000; milis = milis + interval) {
				try {
					element = driver.findElement(by);
					return element;
				} catch (Exception e2) {
					Thread.sleep(interval); // Lançando uma Exception aqui!!!
											// Parece que não achou nada!
				}
			}
		}
		return element; // NULL quando não acha.
	}

	public boolean listarEmProducao(boolean click) throws InterruptedException {
		if (click) {
			element = findWithDelay(
					By.xpath("//*[contains(text(), 'Em Produção')]"), driver);
			element.click();
		}
		element = findWithDelay(By.xpath("//md-tab-item[1]"), driver);
		return element.getText().contains("EM PRODUÇÃO");
	}

	public boolean listarEmEstoque(boolean click) throws InterruptedException {
		if (click) {
			element = findWithDelay(
					By.xpath("//*[contains(text(), 'Estoque')]"), driver);
			element.click();
		}
		element = findWithDelay(By.xpath("//md-tab-item[2]"), driver);
		return element.getText().contains("EM ESTOQUE");

	}

}
