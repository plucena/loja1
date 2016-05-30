package net.mybluemix.parteg.materiaprima;

import net.mybluemix.selenium.MateriaPrimaPage;

public class MateriaPrimaPageAdapter implements AdapterInterface {

	private MateriaPrimaPage materiaPrimaPage;
	
	public MateriaPrimaPageAdapter() {
		this.materiaPrimaPage = new MateriaPrimaPage();
	}
	
	

	@Override
	public boolean cadastrarEvent(Integer sku, String nome, String tipo, String descricao) {
		try {
			if (!materiaPrimaPage.encontrarMateriaPrima(sku, true)) { //Quando não encontrasse o ideal num era cadastrar?
				materiaPrimaPage.clicarBotao("novaMateriaPrima");
			} else {
				Thread.sleep(3000);
			}
			
			materiaPrimaPage.preencher("nome", nome);
			materiaPrimaPage.preencher("descricao", descricao);
			materiaPrimaPage.preencher("tipo", tipo);
			materiaPrimaPage.clicarBotao("salvarMateriaPrima");
			return materiaPrimaPage.encontrarMateriaPrima(sku, false);
			
		} catch (InterruptedException e) {
			return false;
		}
	}

	@Override
	public boolean alterarEvent(Integer sku,String nome, String tipo, String descricao) {
		return this.cadastrarEvent(sku, nome, tipo, descricao);
	}

	@Override
	public boolean fazerCadastroEvent() {
		return false;
	}

	@Override
	public boolean fazerAlteracoesEvent() {
		return false;
	}

}
