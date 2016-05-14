package net.mybluemix.seleniumTest;

import java.util.Random;

import net.mybluemix.seleniumTest.FornecedorPage;

public class FornecedorPageTest {

	public static void main(String[] args) {

		String result;

		Random random = new Random();
		char[] digits = new char[14];
		for (int i = 0; i < 14; i++) {
			digits[i] = (char) ('0' + random.nextInt(10));
		}
		String cnpj = new String(digits);
		
		result = FornecedorPageTest.salvarFornecedorTest(
				cnpj,
				"Fornecedor Selenium",
				"fornecedor@selenium.com.br",
				"12 3456 7890",
				"123",
				"Brasil",
				"12345678",
				"Amazonas",
				"Manaus",
				"Avenida Selenium, 123",
				"true"
				) ? "Success!" : "Failure!";
		
		System.out.println("salvarFornecedorTest(): " + result);
		
	}

	public static boolean salvarFornecedorTest(
			String cnpj,
			String nome,
			String email,
			String telefone,
			String prazoEntregaDias,
			String endereco_Pais,
			String endereco_CEP,
			String endereco_Estado,
			String endereco_Cidade,
			String endereco_Logradouro,
			String ativo
			) {

		FornecedorPage fornecedorPage = new FornecedorPage();

		try {

			if (!fornecedorPage.encontrarFornecedor(cnpj, true)){
				fornecedorPage.clicarBotao("novoFornecedor");
				fornecedorPage.preencher("cnpj", cnpj);
			}
			
			fornecedorPage.preencher("nome", nome);
			fornecedorPage.preencher("email", email);
			fornecedorPage.preencher("telefone", telefone);
			fornecedorPage.preencher("prazoEntregaDias", prazoEntregaDias);
			fornecedorPage.preencher("endereco_Pais", endereco_Pais);
			fornecedorPage.preencher("endereco_CEP", endereco_CEP);
			fornecedorPage.preencher("endereco_Estado", endereco_Estado);
			fornecedorPage.preencher("endereco_Cidade", endereco_Cidade);
			fornecedorPage.preencher("endereco_Logradouro", endereco_Logradouro);
			fornecedorPage.preencher("ativo", ativo);
			fornecedorPage.clicarBotao("salvarFornecedor");
			
			return fornecedorPage.encontrarFornecedor(cnpj, false);

		} catch (InterruptedException e) {

			return false;

		} finally {

			fornecedorPage.fecharPagina();

		}
	}
	
}