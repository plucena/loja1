package net.mybluemix.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReceitaPage {

	private String url = "http://loja.mybluemix.net/app/#/receitas";
	private WebDriver driver;
	private WebElement element = null;

	public ReceitaPage() {
		driver = new FirefoxDriver();
		driver.get(this.url);
	}

	public void fecharPagina() {
		driver.close();
	}

	public void navegarParaReceita() {
		driver.navigate().to("http://loja.mybluemix.net/app/#/receitas");
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

	public boolean encontrarReceita(String nome, boolean click)
			throws InterruptedException {
		element = findWithDelay(By.tagName("table"), driver);
		if (element.getText().contains(nome)) {
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
		case "novaReceita":
			idBotao = "button-novaReceita";
			break;
		case "salvarReceita":
			idBotao = "button-salvarReceita";
			break;
		case "removerItemReceita":
			idBotao = "button-removerItemReceita";
			break;
		case "novoItemReceita":
			idBotao = "button-novoItemReceita";
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

	public void editar() throws InterruptedException {
		try {
			element = findWithDelay(By.xpath("//tr[@class='md-row ng-scope']"),
					driver);
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public boolean duasMateriasPrimas() {
		try {
			element = findWithDelay(
					By.id("select-receita.receita[1].materiaPrima"), driver);
			if (element == null) {
				return false;
			} else {
				return true;
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
			return false;
		}

	}

	private WebElement findWithDelay(By by, WebDriver driver)
			throws InterruptedException {
		int interval = 50;
		element = null;
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
