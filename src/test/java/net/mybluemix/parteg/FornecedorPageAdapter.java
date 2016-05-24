package net.mybluemix.parteg;

import net.mybluemix.selenium.FornecedorPage;

public class FornecedorPageAdapter implements AdapterInterface {
	
	private FornecedorPage fornecedorPage;
	
	public FornecedorPageAdapter() {
		fornecedorPage = new FornecedorPage();
	}
	
	@Override
	public boolean cadastrarEvent(Boolean ativo, Integer cnpj, Integer nome, Integer email, Integer telefone,
			Integer prazoEntregaDias, Integer endereco_Pais, Integer endereco_Estado, Integer endereco_Cidade,
			Integer endereco_Logradouro, Integer endereco_CEP) {

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
			//fornecedorPage.preencher("endereco_Pais", endereco_PaisString);
			fornecedorPage.preencher("endereco_CEP", endereco_CEPString);
			fornecedorPage.selecionar("endereco_Estado", "AL");
			fornecedorPage.preencher("endereco_Cidade", endereco_CidadeString);
			fornecedorPage.preencher("endereco_Logradouro", endereco_LogradouroString);
			fornecedorPage.preencher("ativo", ativoString);
			fornecedorPage.clicarBotao("salvarFornecedor");

			return fornecedorPage.encontrarFornecedor(cnpjString, false);

		} catch (InterruptedException e) {

			return false;

		}
	}

	@Override
	public boolean fazerCadastroAtivosEvent() {
		try {
			return fornecedorPage.listarAtivos(true);
		} catch (InterruptedException e) {
			return false;
		} finally {
			fornecedorPage.fecharPagina();
		}
	}

	@Override
	public boolean fazerCadastroInativosEvent() {
		try {
			return fornecedorPage.listarInativos(true);
		} catch (InterruptedException e) {
			return false;
		} finally {
			fornecedorPage.fecharPagina();
		}
	}

	@Override
	public boolean alterarEvent(Boolean ativo, Integer cnpj, Integer nome, Integer email, Integer telefone,
			Integer prazoEntregaDias, Integer endereco_Pais, Integer endereco_Estado, Integer endereco_Cidade,
			Integer endereco_Logradouro, Integer endereco_CEP) {
		return this.cadastrarEvent(ativo, cnpj, nome, email, telefone, prazoEntregaDias, endereco_Pais, endereco_Estado, endereco_Cidade, endereco_Logradouro, endereco_CEP);
	}

	@Override
	public boolean fazerAlteracoesAtivosEvent() {
		return fazerCadastroAtivosEvent();
	}

	@Override
	public boolean fazerAlteracoesInativosEvent() {
		return fazerCadastroInativosEvent();
	}

	@Override
	public boolean mostrarInativosEvent() {
		try {
			return fornecedorPage.listarInativos(true);
		} catch (InterruptedException e) {
			return false;
		}
	}

	@Override
	public boolean mostrarAtivosEvent() {
		try {
			return fornecedorPage.listarAtivos(true);
		} catch (InterruptedException e) {
			return false;
		}
	}

}