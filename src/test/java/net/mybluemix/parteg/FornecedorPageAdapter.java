package net.mybluemix.parteg;

import net.mybluemix.selenium.FornecedorPage;

public class FornecedorPageAdapter implements AdapterInterface {

	private FornecedorPage fornecedorPage;

	public FornecedorPageAdapter() {
		fornecedorPage = new FornecedorPage();
	}

	@Override
	public boolean cadastrarEvent(Boolean ativo, Integer cnpj, Integer nome,
			Integer email, Integer telefone, Integer prazoEntregaDias,
			Integer endereco_Pais, Integer endereco_Estado,
			Integer endereco_Cidade, Integer endereco_Logradouro,
			Integer endereco_CEP) {

		String ativoString = ativo.toString();

		StringBuffer cnpjStringBuffer = new StringBuffer(Integer
				.toUnsignedString(cnpj).toString());
		while (cnpjStringBuffer.length() < 14) {
			cnpjStringBuffer.insert(0, '0');
		}
		String cnpjString = cnpjStringBuffer.toString();

		String nomeString = Integer.toUnsignedString(nome).toString();
		String emailString = Integer.toUnsignedString(email).toString()
				+ "@test.com";
		String telefoneString = Integer.toUnsignedString(telefone).toString();
		String prazoEntregaDiasString = Integer.toUnsignedString(
				prazoEntregaDias).toString();
		prazoEntregaDiasString = prazoEntregaDiasString.substring(0, 3);
		// String endereco_PaisString =
		// Integer.toUnsignedString(endereco_Pais).toString();
		// String endereco_EstadoString =
		// Integer.toUnsignedString(endereco_Estado).toString();
		String endereco_EstadoString = mapINT_to_Sigla(endereco_Estado % 27);
		String endereco_CidadeString = Integer
				.toUnsignedString(endereco_Cidade).toString();
		String endereco_LogradouroString = Integer.toUnsignedString(
				endereco_Logradouro).toString();

		StringBuffer endereco_CEPStringBuffer = new StringBuffer(Integer
				.toUnsignedString(endereco_CEP).toString());
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
			fornecedorPage
					.preencher("prazoEntregaDias", prazoEntregaDiasString);
			// fornecedorPage.preencher("endereco_Pais", endereco_PaisString);
			fornecedorPage.preencher("endereco_CEP", endereco_CEPString);
			fornecedorPage.selecionar("endereco_Estado", endereco_EstadoString);
			fornecedorPage.preencher("endereco_Cidade", endereco_CidadeString);
			fornecedorPage.preencher("endereco_Logradouro",
					endereco_LogradouroString);
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
	public boolean alterarEvent(Boolean ativo, Integer cnpj, Integer nome,
			Integer email, Integer telefone, Integer prazoEntregaDias,
			Integer endereco_Pais, Integer endereco_Estado,
			Integer endereco_Cidade, Integer endereco_Logradouro,
			Integer endereco_CEP) {
		return this.cadastrarEvent(ativo, cnpj, nome, email, telefone,
				prazoEntregaDias, endereco_Pais, endereco_Estado,
				endereco_Cidade, endereco_Logradouro, endereco_CEP);
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

	private String mapINT_to_Sigla(int number) {
		String sigla = "";
		if (number < 0){
			number *= -1 ;
		}
		switch (number) {
		case 1:
			sigla = "AC";
			break;
		case 2:
			sigla = "AL";
			break;
		case 3:
			sigla = "AP";
			break;
		case 4:
			sigla = "AM";
			break;
		case 5:
			sigla = "BA";
			break;
		case 6:
			sigla = "CE";
			break;
		case 7:
			sigla = "DF";
			break;
		case 8:
			sigla = "ES";
			break;
		case 9:
			sigla = "GO";
			break;
		case 10:
			sigla = "MA";
			break;
		case 11:
			sigla = "MT";
			break;
		case 12:
			sigla = "MS";
			break;
		case 13:
			sigla = "MG";
			break;
		case 14:
			sigla = "PA";
			break;
		case 15:
			sigla = "PB";
			break;
		case 16:
			sigla = "PR";
			break;
		case 17:
			sigla = "PE";
			break;
		case 18:
			sigla = "PI";
			break;
		case 19:
			sigla = "RJ";
			break;
		case 20:
			sigla = "RN";
			break;
		case 21:
			sigla = "RS";
			break;
		case 22:
			sigla = "RO";
			break;
		case 23:
			sigla = "RR";
			break;
		case 24:
			sigla = "SC";
			break;
		case 25:
			sigla = "SP";
			break;
		case 26:
			sigla = "SE";
			break;
		case 27:
			sigla = "TO";
			break;
		default:
			sigla = "MG";
			break;
		}
		return sigla;
	}
}