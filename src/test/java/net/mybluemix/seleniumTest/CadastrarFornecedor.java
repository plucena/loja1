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
				System.out.println("Success!");
			} else {
				System.out.println("Fail!");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			result = false;
		} finally {
			driver.quit();
		}

	}

	private static boolean sistemaCadastraFornecedor(boolean fornecedorAtivo) throws InterruptedException {

		findWithDelay(By.id("button.novoFornecedor")).click();

		Random random = new Random();
		char[] digits = new char[14];
		for (int i = 0; i < 14; i++) {
			digits[i] = (char) ('0' + random.nextInt(10));
		}
		String cnpj = new String(digits);
		String cnpjWithMask = cnpj.substring(0, 2) + "." + cnpj.substring(2, 5) + "." + cnpj.substring(5, 8) + "/"
				+ cnpj.substring(8, 12) + "-" + cnpj.substring(12, 14);

		findWithDelay(By.id("input-cnpj")).sendKeys(cnpj);
		findWithDelay(By.id("input-nome")).sendKeys("Fornecedor Selenium");
		findWithDelay(By.id("input-email")).sendKeys("fornecedor@selenium.com.br");
		findWithDelay(By.id("input-telefone")).sendKeys("12 3456 7890");
		findWithDelay(By.id("input-prazoEntregaDias")).sendKeys("123");
		findWithDelay(By.id("input-endereco_Pais")).sendKeys("Brasil");
		findWithDelay(By.id("input-endereco_CEP")).sendKeys("12345678");
		findWithDelay(By.id("input-endereco_Estado")).sendKeys("São Paulo");
		findWithDelay(By.id("input-endereco_Cidade")).sendKeys("Campinas");
		findWithDelay(By.id("input-endereco_Logradouro")).sendKeys("Avenida Selenium, 123");

		if (fornecedorAtivo) {
			findWithDelay(By.id("switch-ativo")).click();
		}

		findWithDelay(By.id("button-salvarFornecedor")).click();

		element = findWithDelay(By.tagName("md-card"));

		if (element.getText().contains(cnpjWithMask)) {
			return true;
		} else {
			element = findWithDelay(By.xpath("//*[contains(text(), 'Inativos')]"));
			element.click();

			element = findWithDelay(By.tagName("md-card"));
			if (element.getText().contains(cnpjWithMask)) {
				return true;
			} else {
				return false;
			}
		}

	}

	public static WebElement findWithDelay(By by) throws InterruptedException {
		try {
			element = driver.findElement(by);
		} catch (Exception e1) {
			for (int milis = 0; milis < 3000; milis = milis + 200) {
				try {
					element = driver.findElement(by);
				} catch (Exception e2) {
					Thread.sleep(200);
				}
			}
		}
		return element;
	}

}