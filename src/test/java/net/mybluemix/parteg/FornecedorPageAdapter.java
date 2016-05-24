package net.mybluemix.parteg;

import net.mybluemix.selenium.FornecedorPage;

public class FornecedorPageAdapter implements AdapterInterface {

	private FornecedorPage fornecedorPage;

	public FornecedorPageAdapter() {
		fornecedorPage = new FornecedorPage();
	}

	@Override
	public boolean cadastrarEvent(Boolean ativo, String cnpj, String nome,
			String email, String telefone, Integer prazoEntregaDias,
			String endereco_Pais, Integer endereco_Estado,
			String endereco_Cidade, String endereco_Logradouro,
			String endereco_CEP) {

		String ativoString = ativo.toString();
		String endereco_EstadoString = mapINT_to_Sigla(endereco_Estado % 27);

		try {

			if (!fornecedorPage.encontrarFornecedor(cnpj, true)) {
				fornecedorPage.clicarBotao("novoFornecedor");
				fornecedorPage.preencher("cnpj", cnpj);
			} else {
				Thread.sleep(3000);
			}

			fornecedorPage.preencher("nome", nome);
			fornecedorPage.preencher("email", email);
			fornecedorPage.preencher("telefone", telefone);
			fornecedorPage
					.preencher("prazoEntregaDias", prazoEntregaDias.toString());
			fornecedorPage.preencher("endereco_CEP", endereco_CEP);
			fornecedorPage.selecionar("endereco_Estado", endereco_EstadoString);
			fornecedorPage.preencher("endereco_Cidade", endereco_Cidade);
			fornecedorPage
					.preencher("endereco_Logradouro", endereco_Logradouro);
			fornecedorPage.preencher("ativo", ativoString);
			fornecedorPage.clicarBotao("salvarFornecedor");

			return fornecedorPage.encontrarFornecedor(cnpj, false);

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
	public boolean alterarEvent(Boolean ativo, String cnpj, String nome,
			String email, String telefone, Integer prazoEntregaDias,
			String endereco_Pais, Integer endereco_Estado,
			String endereco_Cidade, String endereco_Logradouro,
			String endereco_CEP) {
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
		if (number < 0) {
			number *= -1;
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