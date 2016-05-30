package net.mybluemix.parteg.lote;

import net.mybluemix.selenium.LotePage;



public class LotePageAdapter  implements AdapterInterface{

	private LotePage lotePage;
	
	public LotePageAdapter(){
		this.lotePage = new LotePage();
	}
	
	@Override
	public boolean cadastrarEvent(Integer fornecedor, Integer materiaPrima, Integer quantidade, Integer unidade,
			Integer preco) {
		try {
			if (!lotePage.encontrarLote(fornecedor, materiaPrima, true)) {
				lotePage.clicarBotao("novoLote");
			} else {
				Thread.sleep(3000);
			}
			String unidadeAuxiliar = mapINT_to_Sigla(unidade % 3);
			
			lotePage.selecionar("fornecedor", fornecedor.toString());
			lotePage.selecionar("materiaPrima", materiaPrima.toString());
			lotePage.preencher("quantidade", quantidade.toString());
			lotePage.selecionar("unidade", unidadeAuxiliar.toString());
			lotePage.preencher("preco", preco.toString());
			lotePage.clicarBotao("salvarLote");
			return lotePage.encontrarLote(sku, false);
			
		} catch (InterruptedException e) {
			return false;
		}
		return false;
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
	public boolean fazerCadastroEvent() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alterarEncomendadosEvent(Boolean next, Boolean cancel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alterarEmEstoqueEvent(Boolean next) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alterarEmProducaoEvent(Boolean next) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alterarFinalizadosEvent() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alterarCanceladosEvent() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean fazerAlteracoesEvent() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mostrarEncomendadosEvent() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mostrarEmEstoqueEvent() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mostrarEmProducaoEvent() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mostrarCanceladosEvent() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mostrarFinalizadosEvent() {
		// TODO Auto-generated method stub
		return false;
	}

}
