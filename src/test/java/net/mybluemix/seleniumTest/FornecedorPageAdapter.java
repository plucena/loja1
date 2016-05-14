package net.mybluemix.seleniumTest;

import estoquistaPk.AdapterInterface;
import net.mybluemix.seleniumTest.FornecedorPage;

public class FornecedorPageAdapter implements AdapterInterface {

	@Override
	public boolean cadastrarEvent(Boolean ativo, Integer cnpj, Integer nome, Integer email, Integer telefone,
			Integer prazoEntregaDias, Integer endereco_Pais, Integer endereco_Estado, Integer endereco_Cidade,
			Integer endereco_Logradouro, Integer endereco_CEP) {

		FornecedorPage fornecedorPage = new FornecedorPage();
		
		String ativoString = ativo.toString();
		
		StringBuffer cnpjStringBuffer = new StringBuffer(Integer.toUnsignedString(cnpj).toString());
	    while (cnpjStringBuffer.length() < 14) {
	           cnpjStringBuffer.insert(0, '0');
	    }
		String cnpjString = cnpjStringBuffer.toString();
		
		String nomeString = Integer.toUnsignedString(nome).toString();
		String emailString = Integer.toUnsignedString(email).toString() + "@test.com";
		String telefoneString = Integer.toUnsignedString(telefone).toString();
		String prazoEntregaDiasString = Integer.toUnsignedString(prazoEntregaDias).toString();
		prazoEntregaDiasString = prazoEntregaDiasString.substring(0, 3);
		String endereco_PaisString = Integer.toUnsignedString(endereco_Pais).toString();
		String endereco_EstadoString = Integer.toUnsignedString(endereco_Estado).toString();
		String endereco_CidadeString = Integer.toUnsignedString(endereco_Cidade).toString();
		String endereco_LogradouroString = Integer.toUnsignedString(endereco_Logradouro).toString();
		
		StringBuffer endereco_CEPStringBuffer = new StringBuffer(Integer.toUnsignedString(endereco_CEP).toString());
	    while (endereco_CEPStringBuffer.length() < 8) {
	    	endereco_CEPStringBuffer.insert(0, '0');
	    }
		String endereco_CEPString = endereco_CEPStringBuffer.toString();
		endereco_CEPString = endereco_CEPString.substring(0, 8);

		try {

			if (!fornecedorPage.encontrarFornecedor(cnpjString, true)) {
				fornecedorPage.clicarBotao("novoFornecedor");
				fornecedorPage.preencher("cnpj", cnpjString);
			} else {
				Thread.sleep(3000);
			}

			fornecedorPage.preencher("nome", nomeString);
			fornecedorPage.preencher("email", emailString);
			fornecedorPage.preencher("telefone", telefoneString);
			fornecedorPage.preencher("prazoEntregaDias", prazoEntregaDiasString);
			fornecedorPage.preencher("endereco_Pais", endereco_PaisString);
			fornecedorPage.preencher("endereco_CEP", endereco_CEPString);
			fornecedorPage.preencher("endereco_Estado", endereco_EstadoString);
			fornecedorPage.preencher("endereco_Cidade", endereco_CidadeString);
			fornecedorPage.preencher("endereco_Logradouro", endereco_LogradouroString);
			fornecedorPage.preencher("ativo", ativoString);
			fornecedorPage.clicarBotao("salvarFornecedor");

			return fornecedorPage.encontrarFornecedor(cnpjString, false);

		} catch (InterruptedException e) {

			return false;

		} finally {

			fornecedorPage.fecharPagina();

		}
	}

	@Override
	public boolean fazerCadastroAtivosEvent() {
		return this.mostrarAtivosEvent();
	}

	@Override
	public boolean fazerCadastroInativosEvent() {
		return this.mostrarInativosEvent();
	}

	@Override
	public boolean alterarEvent(Boolean ativo, Integer cnpj, Integer nome, Integer email, Integer telefone,
			Integer prazoEntregaDias, Integer endereco_Pais, Integer endereco_Estado, Integer endereco_Cidade,
			Integer endereco_Logradouro, Integer endereco_CEP) {
		return this.cadastrarEvent(ativo, cnpj, nome, email, telefone, prazoEntregaDias, endereco_Pais, endereco_Estado, endereco_Cidade, endereco_Logradouro, endereco_CEP);
	}

	@Override
	public boolean fazerAlteracoesAtivosEvent() {
		return this.mostrarAtivosEvent();
	}

	@Override
	public boolean fazerAlteracoesInativosEvent() {
		return this.mostrarInativosEvent();
	}

	@Override
	public boolean mostrarInativosEvent() {

		FornecedorPage fornecedorPage = new FornecedorPage();

		try {

			return fornecedorPage.listarInativos();

		} catch (InterruptedException e) {

			return false;

		} finally {

			fornecedorPage.fecharPagina();

		}
	}

	@Override
	public boolean mostrarAtivosEvent() {
		
		FornecedorPage fornecedorPage = new FornecedorPage();

		try {

			return fornecedorPage.listarAtivos();

		} catch (InterruptedException e) {

			return false;

		} finally {

			fornecedorPage.fecharPagina();

		}
	}

}