package net.mybluemix.seleniumTest;

import java.util.Random;

import net.mybluemix.seleniumTest.FornecedorPage;

public class FornecedorPageTest {

	public static void main(String[] args) {

		String result;

		result = FornecedorPageTest.listarFornecedoresAtivosTest() ? "Success!" : "Failure!";
		System.out.println("listarFornecedoresAtivosTest(): " + result);

		result = FornecedorPageTest.listarFornecedoresInativosTest() ? "Success!" : "Failure!";
		System.out.println("listarFornecedoresInativosTest(): " + result);

		result = FornecedorPageTest.cadastroFornecedorTest() ? "Success!" : "Failure!";
		System.out.println("cadastroFornecedorTest(): " + result);

		// TODO: chamar demais testes para exercitar outros estados

	}

	public static boolean listarFornecedoresAtivosTest() {

		FornecedorPage fornecedorPage = new FornecedorPage();

		try {

			fornecedorPage.listarAtivos().click();
			if (fornecedorPage.estaListandoAtivos()) {
				return true;
			} else {
				return false;
			}

		} catch (InterruptedException e) {

			return false;

		} finally {

			fornecedorPage.fecharPagina();

		}
	}

	public static boolean listarFornecedoresInativosTest() {

		FornecedorPage fornecedorPage = new FornecedorPage();

		try {

			fornecedorPage.listarInativos().click();
			if (fornecedorPage.estaListandoInativos()) {
				return true;
			} else {
				return false;
			}

		} catch (InterruptedException e) {

			return false;

		} finally {

			fornecedorPage.fecharPagina();

		}
	}

	public static boolean cadastroFornecedorTest() {

		Random random = new Random();
		char[] digits = new char[14];
		for (int i = 0; i < 14; i++) {
			digits[i] = (char) ('0' + random.nextInt(10));
		}
		String cnpj = new String(digits);

		FornecedorPage fornecedorPage = new FornecedorPage();

		try {

			fornecedorPage.botaoNovoFornecedor().click();
			fornecedorPage.campoCnpj().sendKeys(cnpj);
			fornecedorPage.campoNome().sendKeys("Fornecedor Selenium");
			fornecedorPage.campoEmail().sendKeys("fornecedor@selenium.com.br");
			fornecedorPage.campoTelefone().sendKeys("12 3456 7890");
			fornecedorPage.campoPrazoEntregaDias().sendKeys("123");
			fornecedorPage.campoEnderecoPais().sendKeys("Brasil");
			fornecedorPage.campoEnderecoCep().sendKeys("12345678");
			fornecedorPage.campoEnderecoEstado().sendKeys("Amazonas");
			fornecedorPage.campoEnderecoCidade().sendKeys("Manaus");
			fornecedorPage.campoEnderecoLogradouro().sendKeys("Avenida Selenium, 123");
			fornecedorPage.campoAtivo().click(); // Para criar fornecedor ativo
			fornecedorPage.botaoSalvarFornecedor().click();
			return fornecedorPage.existeFornecedor(cnpj);

		} catch (InterruptedException e) {

			return false;

		} finally {

			fornecedorPage.fecharPagina();

		}
	}

}