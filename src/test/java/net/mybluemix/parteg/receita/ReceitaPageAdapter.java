package net.mybluemix.parteg.receita;

import net.mybluemix.selenium.ReceitaPage;

public class ReceitaPageAdapter  implements AdapterInterface{
	
	private ReceitaPage receitaPage;

	public ReceitaPageAdapter() {
		this.receitaPage = new ReceitaPage();
	}

	@Override
	public Boolean cadastrarEvent(String nome, String descricao, String tipo, Integer sku, String unidade,
			Integer quantidade, Boolean incluir, Integer sku2, String unidade2, Integer quantidade2) {
		try {
			receitaPage.clicarBotao("novanovaReceita");
			receitaPage.preencher("nome", nome);
			receitaPage.preencher("descricao", descricao);
			receitaPage.preencher("tipo", tipo);
			receitaPage.selecionar("select-receita.receita[0].materiaPrima", sku.toString());
			receitaPage.selecionar("select-receita.receita[0].unidade", unidade);
			receitaPage.preencher("input-receita.receita[0].quantidade", quantidade.toString());
			if(incluir){
				receitaPage.selecionar("select-receita.receita[1].materiaPrima", sku2.toString());
				receitaPage.selecionar("select-receita.receita[1].unidade", unidade2);
				receitaPage.preencher("input-receita.receita[1].quantidade", quantidade2.toString());
			}
			receitaPage.clicarBotao("salvarReceita");
			if(receitaPage.encontrarReceita(nome,false)){
				receitaPage.fecharPagina();
				return true;
			}else{
				return false;	
			}

		} catch (InterruptedException e) {
			return false;
		}
		
	}

	@Override
	public Boolean alterarEvent(String nome, String descricao, String tipo, Integer sku, String unidade,
			Integer quantidade, Boolean incluir, Integer sku2, String unidade2, Integer quantidade2) {
		
		
		return null;
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
