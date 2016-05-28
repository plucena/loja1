package net.mybluemix.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MateriaPrimaPage {

	private String url = "http://loja.mybluemix.net/app/#/materias-primas";
	private WebDriver driver;
	private WebElement element = null;

	public MateriaPrimaPage() {
		driver = new FirefoxDriver();
		driver.get(this.url);
	}

	public void fecharPagina() {
		driver.close();
	}

	public boolean encontrarMateriaPrima(Integer sku, boolean click)
			throws InterruptedException {
		element = findWithDelay(By.id(sku.toString()), driver);
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
		case "novoMateriaPrima":
			idBotao = "button-novaMateriaPrima";
			break;
		case "salvarMateriaPrima":
			idBotao = "button-salvarMateriaPrima";
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
					Thread.sleep(interval); //Lançando uma Exception aqui!!!
											//Parece que não achou nada!
				}
			}
		}
		return element;
	}

}
