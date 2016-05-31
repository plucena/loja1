package net.mybluemix.parteg.materiaprima;

import net.mybluemix.selenium.MateriaPrimaPage;

public class MateriaPrimaPageAdapter implements AdapterInterface {

	private MateriaPrimaPage materiaPrimaPage;

	public MateriaPrimaPageAdapter() {
		this.materiaPrimaPage = new MateriaPrimaPage();
	}

	@Override
	public boolean cadastrarEvent(String nome, String tipo, String descricao) {
		try {
			materiaPrimaPage.clicarBotao("novaMateriaPrima");
			materiaPrimaPage.preencher("nome", nome);
			materiaPrimaPage.preencher("descricao", descricao);
			materiaPrimaPage.preencher("tipo", tipo);
			materiaPrimaPage.clicarBotao("salvarMateriaPrima");
			if(materiaPrimaPage.encontrarMateriaPrima(nome)){
				materiaPrimaPage.fecharPagina();
				return true;
			}else{
				return false;	
			}

		} catch (InterruptedException e) {
			return false;
		}
	}

	@Override
	public boolean alterarEvent(String nome, String tipo, String descricao) {
		try {
			materiaPrimaPage.editar();
			Thread.sleep(1000);
			materiaPrimaPage.preencher("nome", nome);
			materiaPrimaPage.preencher("descricao", descricao);
			materiaPrimaPage.preencher("tipo", tipo);
			materiaPrimaPage.clicarBotao("salvarMateriaPrima");
			if(materiaPrimaPage.encontrarMateriaPrima(nome)){
				materiaPrimaPage.fecharPagina();
				return true;
			}else{
				return false;	
			}		
		} catch (InterruptedException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean fazerCadastroEvent() {
		return true;
	}

	@Override
	public boolean fazerAlteracoesEvent() {
		return true;
	}

}
