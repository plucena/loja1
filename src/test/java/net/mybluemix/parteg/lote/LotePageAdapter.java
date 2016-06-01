package net.mybluemix.parteg.lote;

import net.mybluemix.selenium.LotePage;

public class LotePageAdapter implements AdapterInterface {

	private LotePage lotePage;

	public LotePageAdapter() {
		this.lotePage = new LotePage();
	}

	@Override
	public boolean cadastrarEvent(Integer fornecedor, Integer materiaPrima,
			Integer quantidade, Integer unidade, Integer preco) {
		if (quantidade == null || unidade == null || preco == null) {
			try {
				lotePage.clicarBotao("novoLote");
				Thread.sleep(1500);
				lotePage.selecionar("fornecedor", "00975141632796");
				lotePage.selecionar("materiaPrima", "5");
				lotePage.preencher("quantidade", quantidade.toString());
				lotePage.selecionar("unidade", mapINT_to_Sigla(unidade));
				lotePage.preencher("preco", preco.toString());
				lotePage.clicarBotao("salvarLote");
				if (lotePage.listarEncomendados(false)) {
					return false;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			lotePage.navegarParaLote();
			return true;
		} else {

			try {
				lotePage.clicarBotao("novoLote");
				Thread.sleep(1500);
				lotePage.selecionar("fornecedor", "00975141632796");
				lotePage.selecionar("materiaPrima", "5");
				lotePage.preencher("quantidade", quantidade.toString());
				lotePage.selecionar("unidade", mapINT_to_Sigla(unidade));
				lotePage.preencher("preco", preco.toString());
				lotePage.clicarBotao("salvarLote");
				if (lotePage.listarEncomendados(false)) {
					return true;
				} else {
					return false;
				}

			} catch (InterruptedException e) {
				return false;
			}
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
	public boolean fazerCadastroEvent() { // pronto
		return true;
	}

	@Override
	public boolean alterarEncomendadosEvent(Boolean next, Boolean cancel) { // aba
																			// encomendados
																			// next
																			// =
																			// estoque
		try {
			lotePage.listarEncomendados(true);
			Thread.sleep(1000);
			lotePage.editar();
			if (cancel) {
				lotePage.radioButton("CANCELADO");
				lotePage.clicarBotao("salvarLote");
				if (lotePage.listarCancelados(false)) {
					return true;
				} else {
					return false;
				}
			} else if (next) {
				lotePage.radioButton("EM_ESTOQUE");
				lotePage.clicarBotao("salvarLote");
				if (lotePage.listarEmEstoque(false)) {
					return true;
				} else {
					return false;
				}
			} else {
				if (lotePage.listarEncomendados(false)) {
					return true;
				} else {
					return false;
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean alterarEmEstoqueEvent(Boolean next) { // aba em estoque next
															// = produção
		try {
			lotePage.listarEmEstoque(true);
			Thread.sleep(1000);
			lotePage.editar();
			if (next) {
				lotePage.radioButton("EM_PRODUCAO");
				lotePage.clicarBotao("salvarLote");
			} else {
				lotePage.clicarBotao("salvarLote");
			}
			if (lotePage.listarEmProducao(false)) {
				return true;
			} else {
				return false;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean alterarEmProducaoEvent(Boolean next) { // aba produção next =
															// finalizado
		try {
			lotePage.listarEmProducao(true);
			Thread.sleep(1000);
			lotePage.editar();
			if (next) {
				lotePage.radioButton("FINALIZADO");
				lotePage.clicarBotao("salvarLote");
			} else {
				lotePage.clicarBotao("salvarLote");
			}
			if (lotePage.listarFinalizados(false)) {
				return true;
			} else {
				return false;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean alterarFinalizadosEvent() { // clica em qualquer um e salva
		try {
			lotePage.listarFinalizados(true);
			Thread.sleep(1000);
			lotePage.editar();
			Thread.sleep(500);
			lotePage.clicarBotao("salvarLote");
			if (lotePage.listarFinalizados(false)) {
				return true;
			} else {
				return false;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean alterarCanceladosEvent() { // / clica em qualquer um e salva
		try {
			lotePage.listarCancelados(true);
			Thread.sleep(1000);
			lotePage.editar();
			Thread.sleep(500);
			lotePage.clicarBotao("salvarLote");
			if (lotePage.listarCancelados(false)) {
				return true;
			} else {
				return false;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean fazerAlteracoesEvent() { // ja faz no cadastro
		return true;
	}

	@Override
	public boolean mostrarEncomendadosEvent() {
		try {
			lotePage.listarEncomendados(true);
			Thread.sleep(500);
			if (lotePage.listarEncomendados(false)) {
				return true;
			} else {
				return false;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean mostrarEmEstoqueEvent() {
		try {
			lotePage.listarEmEstoque(true);
			Thread.sleep(500);
			if (lotePage.listarEmEstoque(false)) {
				return true;
			} else {
				return false;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean mostrarEmProducaoEvent() {
		try {
			lotePage.listarEmProducao(true);
			Thread.sleep(500);
			if (lotePage.listarEmProducao(false)) {
				return true;
			} else {
				return false;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean mostrarCanceladosEvent() {
		try {
			lotePage.listarCancelados(true);
			Thread.sleep(500);
			if (lotePage.listarCancelados(false)) {
				return true;
			} else {
				return false;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean mostrarFinalizadosEvent() {
		try {
			lotePage.listarFinalizados(true);
			Thread.sleep(500);
			if (lotePage.listarFinalizados(false)) {
				return true;
			} else {
				return false;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return false;
	}

}
