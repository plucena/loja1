package net.mybluemix.seleniumTest;

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

	public WebElement listarAtivos() throws InterruptedException {
		return element = findWithDelay(By.xpath("//*[contains(text(), 'Ativos')]"), driver);
	}
	
	public boolean estaListandoAtivos() throws InterruptedException {
		element = findWithDelay(By.xpath("//md-tab-item[@class='md-active']/span"), driver);
		return element.getText().contains("ATIVOS");
	}

	public WebElement listarInativos() throws InterruptedException {
		return element = findWithDelay(By.xpath("//*[contains(text(), 'Inativos')]"), driver);
	}

	public boolean estaListandoInativos() throws InterruptedException {
		element = findWithDelay(By.xpath("//md-tab-item[@class='md-active']/span"), driver);
		return element.getText().contains("INATIVOS");
	}

	public WebElement botaoNovoFornecedor() throws InterruptedException {
		return element = findWithDelay(By.id("button.novoFornecedor"), driver);
	}

	public WebElement campoCnpj() throws InterruptedException {
		return element = findWithDelay(By.id("input-cnpj"), driver);
	}

	public WebElement campoNome() throws InterruptedException {
		return element = findWithDelay(By.id("input-nome"), driver);
	}

	public WebElement campoEmail() throws InterruptedException {
		return element = findWithDelay(By.id("input-email"), driver);
	}

	public WebElement campoTelefone() throws InterruptedException {
		return element = findWithDelay(By.id("input-telefone"), driver);
	}

	public WebElement campoPrazoEntregaDias() throws InterruptedException {
		return element = findWithDelay(By.id("input-prazoEntregaDias"), driver);
	}

	public WebElement campoEnderecoPais() throws InterruptedException {
		return element = findWithDelay(By.id("input-endereco_Pais"), driver);
	}

	public WebElement campoEnderecoCep() throws InterruptedException {
		return element = findWithDelay(By.id("input-endereco_CEP"), driver);
	}

	public WebElement campoEnderecoEstado() throws InterruptedException {
		return element = findWithDelay(By.id("input-endereco_Estado"), driver);
	}

	public WebElement campoEnderecoCidade() throws InterruptedException {
		return element = findWithDelay(By.id("input-endereco_Cidade"), driver);
	}

	public WebElement campoEnderecoLogradouro() throws InterruptedException {
		return element = findWithDelay(By.id("input-endereco_Logradouro"), driver);
	}

	public WebElement campoAtivo() throws InterruptedException {
		return element = findWithDelay(By.id("switch-ativo"), driver);
	}

	public WebElement botaoSalvarFornecedor() throws InterruptedException {
		return element = findWithDelay(By.id("button-salvarFornecedor"), driver);
	}

	public boolean existeFornecedor(String cnpj) throws InterruptedException {
		String cnpjWithMask = cnpj.substring(0, 2) + "." + cnpj.substring(2, 5) + "." + cnpj.substring(5, 8) + "/"
				+ cnpj.substring(8, 12) + "-" + cnpj.substring(12, 14);

		element = this.listarAtivos();
		element.click();
		element = findWithDelay(By.tagName("md-card"), driver);
		if (element.getText().contains(cnpjWithMask)) {
			return true;
		} else {
			element = this.listarInativos();
			element.click();
			element = findWithDelay(By.tagName("md-card"), driver);
			if (element.getText().contains(cnpjWithMask)) {
				return true;
			} else {
				return false;
			}
		}
	}

	private WebElement findWithDelay(By by, WebDriver driver) throws InterruptedException {
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