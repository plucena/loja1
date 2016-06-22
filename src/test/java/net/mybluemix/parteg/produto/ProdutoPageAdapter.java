package net.mybluemix.parteg.produto;

import java.util.Random;

import net.mybluemix.selenium.ProdutoPage;

public class ProdutoPageAdapter implements AdapterInterface {

	private ProdutoPage produtoPage;

	public ProdutoPageAdapter() {
		this.produtoPage = new ProdutoPage();
	}

	@Override
	public Boolean cadastrarEvent(String receita, String preco) {
		try {
			if (receita.equals(" ") || preco.equals(" ")) {
				Thread.sleep(5000);
				produtoPage.fecharPagina();
				return true;
			} else {
				produtoPage.clicarBotao("novoProduto");
				produtoPage.preencher("preco", preco);
				Thread.sleep(1500);
				produtoPage.selecionar("receita", "1");

				produtoPage.clicarBotao("salvarProduto");
				if (produtoPage.listarEmProducao(true)) {
					return true;
				} else {
					return false;
				}
			}
		} catch (InterruptedException e) {
			return false;
		}

	}

	@Override
	public Boolean fazerCadastroEvent() {
		return true;
	}

	@Override
	public Boolean alterarEmProducaoEvent(Boolean next) {
		try {
			produtoPage.listarEmProducao(true);
			Thread.sleep(1000);
			produtoPage.editar();
			if (next) {
				produtoPage.radioButton("EM_ESTOQUE");
				Random r = new Random();
				int randomNum = r.nextInt((50 - 3) + 1) + 3;
				produtoPage.preencher("quantidadeProduzida",
						Integer.toString(randomNum));
				produtoPage.clicarBotao("salvarProduto");

			} else {
				Thread.sleep(1500);
				produtoPage.clicarBotao("salvarProduto");
			}
			if (produtoPage.listarEmEstoque(false)) {
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
	public Boolean alterarEmEstoqueEvent(Boolean next) {
		try {
			produtoPage.listarEmEstoque(false);
			Thread.sleep(1000);
			produtoPage.editar();
			if (next) {
				produtoPage.radioButton("EM_PRODUCAO");
				produtoPage.clicarBotao("salvarProduto");
			} else {
				Thread.sleep(2000);
				produtoPage.clicarBotao("salvarProduto");
			}
			if (produtoPage.listarEmProducao(true)) {
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
	public Boolean fazerAlteracoesEvent() {
		return true;
	}

	@Override
	public Boolean mostrarEmProducaoEvent() {
		try {
			produtoPage.listarEmProducao(true);
			Thread.sleep(500);
			if (produtoPage.listarEmProducao(false)) {
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
	public Boolean mostrarEmEstoqueEvent() {
		try {
			produtoPage.listarEmEstoque(true);
			Thread.sleep(500);
			if (produtoPage.listarEmEstoque(false)) {
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
