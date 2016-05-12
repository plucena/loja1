package net.mybluemix.seleniumTest;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CadastrarFornecedor {

	static WebDriver driver;
	static Wait<WebDriver> wait;
	private static WebElement element;

	public static String url = "http://loja.mybluemix.net/app/#/fornecedores";

	public static void main(String[] args) {

		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 30);
		driver.get(url);

		boolean result;
		try {
			result = sistemaCadastraFornecedor(false);
			if (result) {
			} else {
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			result = false;
		} finally {
			driver.quit();
		}

	}

	private static boolean sistemaCadastraFornecedor(boolean fornecedorAtivo) throws InterruptedException {

		.click();

		Random random = new Random();
		char[] digits = new char[14];
		for (int i = 0; i < 14; i++) {
			digits[i] = (char) ('0' + random.nextInt(10));
		}
		String cnpj = new String(digits);
		String cnpjWithMask = cnpj.substring(0, 2) + "." + cnpj.substring(2, 5) + "." + cnpj.substring(5, 8) + "/"
				+ cnpj.substring(8, 12) + "-" + cnpj.substring(12, 14);

		.sendKeys(cnpj);

		.sendKeys("Fornecedor Selenium");

		.sendKeys("fornecedor@selenium.com.br");

		.sendKeys("12 3456 7890");

		.sendKeys("123");

		.sendKeys("Brasil");

		.sendKeys("12345678");

		.sendKeys("S�o Paulo");

		.sendKeys("Campinas");

		.sendKeys("Avenida Selenium, 123");

		if (fornecedorAtivo) {
			.click();
		}

		.click();
		

		if (element.getText().contains(cnpjWithMask)) {
			return true;
		} else {
			element.click();

			if (element.getText().contains(cnpjWithMask)) {
				return true;
			} else {
			}
		}

	}

		for (int milis = 0; milis < 3000; milis = milis + 200) {
			try {
				element = driver.findElement(by);
			} catch (Exception e) {
				Thread.sleep(200);
			}
		}
		return element;
	}

}
