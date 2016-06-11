package net.mybluemix.parteg.receita;

import net.mybluemix.selenium.ReceitaPage;

public class ReceitaPageAdapter implements AdapterInterface {

	private ReceitaPage receitaPage;

	public ReceitaPageAdapter() {
		this.receitaPage = new ReceitaPage();
	}

	@Override
	public Boolean cadastrarEvent(String nome, String descricao, String tipo,
			Integer sku, String unidade, Integer quantidade, Boolean incluir,
			Integer sku2, String unidade2, Integer quantidade2) {
		try {
			if (nome.equals(" ") || tipo.equals(" ") || sku == null
					|| unidade.equals(" ") || quantidade == null
					|| sku2 == null || unidade2.equals(" ")
					|| quantidade2 == null) {
				Thread.sleep(5000);
				receitaPage.fecharPagina();
				return true;
			} else {
				receitaPage.clicarBotao("novaReceita");
				receitaPage.preencher("nome", nome);
				receitaPage.preencher("descricao", descricao);
				receitaPage.preencher("tipo", tipo);
				receitaPage.selecionar("receita.receita[0].materiaPrima", "229376");
				receitaPage.selecionar("receita.receita[0].unidade",
						mapINT_to_Sigla(Integer.parseInt(unidade)));
				receitaPage.preencher("receita.receita[0].quantidade",
						quantidade.toString());
				if (incluir) {
					if(!receitaPage.duasMateriasPrimas()){
						receitaPage.clicarBotao("novoItemReceita");	
					}
					receitaPage.selecionar("receita.receita[1].materiaPrima", "262144");
					receitaPage.selecionar("receita.receita[1].unidade", mapINT_to_Sigla(Integer.parseInt(unidade2)));
					receitaPage.preencher("receita.receita[1].quantidade", quantidade2.toString());
				}
				receitaPage.clicarBotao("salvarReceita");
				if (receitaPage.encontrarReceita(nome, false)) {
					receitaPage.fecharPagina();
					return true;
				} else {
					return false;
				}
			}
		} catch (InterruptedException e) {
			return false;
		}

	}

	private String mapINT_to_Sigla(int number) {
		String sigla = "";
		switch (number) {
		case 0:
			sigla = "Kg";
			break;
		case 1:
			sigla = "m";
			break;
		case 2:
			sigla = "Un";
			break;
		default:
			sigla = "Kg";
			break;
		}
		return sigla;
	}

	@Override
	public Boolean alterarEvent(String nome, String descricao, String tipo,
			Integer sku, String unidade, Integer quantidade, Boolean incluir,
			Integer sku2, String unidade2, Integer quantidade2) {
		try {
			if (nome.equals(" ") || tipo.equals(" ") || sku == null
					|| unidade.equals(" ") || quantidade == null
					|| sku2 == null || unidade2.equals(" ")
					|| quantidade2 == null) {
				Thread.sleep(5000);
				receitaPage.fecharPagina();
				return true;
			} else {
				receitaPage.editar();
				Thread.sleep(1800);
				receitaPage.preencher("nome", nome);
				receitaPage.preencher("descricao", descricao);
				receitaPage.preencher("tipo", tipo);
				receitaPage.selecionar("receita.receita[0].materiaPrima", "229376");
				receitaPage.selecionar("receita.receita[0].unidade",
						mapINT_to_Sigla(Integer.parseInt(unidade)));
				receitaPage.preencher("receita.receita[0].quantidade",
						quantidade.toString());
				if (incluir) {
					if(!receitaPage.duasMateriasPrimas()){
						receitaPage.clicarBotao("novoItemReceita");	
					}
					receitaPage.selecionar("receita.receita[1].materiaPrima", "262144");
					receitaPage.selecionar("receita.receita[1].unidade", mapINT_to_Sigla(Integer.parseInt(unidade2)));
					receitaPage.preencher("receita.receita[1].quantidade", quantidade2.toString());
				}
				receitaPage.clicarBotao("salvarReceita");
				if (receitaPage.encontrarReceita(nome, false)) {
					receitaPage.fecharPagina();
					return true;
				} else {
					return false;
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Boolean fazerCadastroEvent() {
		return true;
	}

	@Override
	public Boolean fazerAlteracoesEvent() {
		return true;
	}

}
