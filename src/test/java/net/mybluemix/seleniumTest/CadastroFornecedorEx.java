package net.mybluemix.seleniumTest;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Search Google example.
 * 
 */
public class CadastroFornecedorEx {
	static WebDriver driver;
	static Wait<WebDriver> wait;
	private static WebElement foundElement;

	public static void main(String[] args) {
		// path do chromedriver
		System.setProperty("webdriver.chrome.driver",
				"/home/lucas/Downloads/chromedriver");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 30);
		driver.get("http://loja.mybluemix.net/app/#/fornecedores");

		boolean result;
		try {
			result = firstPageContainsQAANet();
		} catch (Exception e) {
			e.printStackTrace();
			result = false;
		} finally {
			// Fecha a aba (ou navegador)
			// driver.close();
		}

		System.out.println("Test " + (result ? "passed." : "failed."));
		if (!result) {
			System.exit(1);
		}
	}

	private static boolean firstPageContainsQAANet()
			throws InterruptedException {

		find(By.id("button.novoFornecedor")).click();

		String cnpj = randomDigits(new Random(), 14).toString();

		String cnpjMask = cnpj.substring(0, 2) + "." + cnpj.substring(2, 5)
				+ "." + cnpj.substring(5, 8) + "/" + cnpj.substring(8, 12)
				+ "-" + cnpj.substring(12, 14);

		find(By.id("input-cnpj")).sendKeys(cnpj);
		find(By.id("input-nome")).sendKeys("NOme Fulano");
		find(By.id("input-email")).sendKeys("email@email.com");
		find(By.id("input-telefone")).sendKeys("35999999999");
		find(By.id("input-prazoEntregaDias")).sendKeys("12");
		find(By.id("input-endereco_Pais")).sendKeys("Brasil");
		find(By.id("input-endereco_CEP")).sendKeys("37145000");
		find(By.id("input-endereco_Estado")).sendKeys("Minas Gerais");
		find(By.id("input-endereco_Cidade")).sendKeys("Alterosa");
		find(By.id("input-endereco_Logradouro")).sendKeys("Casa");

		find(By.id("switch-ativo")).click();

		find(By.id("button-salvarFornecedor")).click();

		Thread.sleep(1000);

		if (driver.findElement(By.tagName("md-card")).getText()
				.contains(cnpjMask)) {
			return true;
		} else {
			driver.findElement(By.xpath("//*[contains(text(), 'Inativos')]"))
					.click();
			return driver.findElement(By.tagName("md-card")).getText()
					.contains(cnpjMask);
		}

	}

	public static String randomDigits(Random random, int length) {
		char[] digits = new char[length];
		// Make sure the leading digit isn't 0.
		digits[0] = (char) ('1' + random.nextInt(9));
		for (int i = 1; i < length; i++) {
			digits[i] = (char) ('0' + random.nextInt(10));
		}
		return new String(digits);
	}

	public static WebElement find(By by) throws InterruptedException {
		for (int milis = 0; milis < 3000; milis = milis + 200) {
			try {
				foundElement = driver.findElement(by);
			} catch (Exception e) {
				Thread.sleep(200);
			}
		}
		return foundElement;
	}
}