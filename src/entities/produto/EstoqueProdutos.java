package entities.produto;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

	private Map<Integer, Produto> estoqueMap = new HashMap<>();

	public void adicionarProdutos(int codigo, String nome, double preco, int quantidade) {
		estoqueMap.put(codigo, new Produto(nome, preco, quantidade));
	}

	public void exibirProdutos() {
		System.out.println(estoqueMap);
	}

	public double valorTotal() {
		double valorTotal = 0.0;

		if (!estoqueMap.isEmpty()) {

			for (Produto p : estoqueMap.values()) {
				valorTotal += p.getQuantidade() * p.getPreco();
			}
		}
		return valorTotal;
	}

	public Produto obterProdutoMaisCaro() {

		Produto produtoMaisCaro = null;
		double maiorValor = Double.MIN_VALUE;

		if (!estoqueMap.isEmpty()) {
			for (Produto p : estoqueMap.values()) {
				if (p.getPreco() > maiorValor) {
					produtoMaisCaro = p;
				}
			}
		}
		return produtoMaisCaro;
	}

}
