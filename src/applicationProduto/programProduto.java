package applicationProduto;

import java.util.Locale;
import java.util.Scanner;

import entities.produto.EstoqueProdutos;

public class programProduto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		EstoqueProdutos estoqueprodutos = new EstoqueProdutos();

		System.out.println("Produtos cadastrados: ");
		estoqueprodutos.exibirProdutos();
		System.out.println();

		System.out.print("Informe a quantidade de produtos: ");
		int quantidadeProdutos = sc.nextInt();

		for (int codigo = 1; codigo <= quantidadeProdutos; codigo++) {

			System.out.print("Nome do produto: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.print("Preco: ");
			double precoProduto = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantidadeProduto = sc.nextInt();

			estoqueprodutos.adicionarProdutos(codigo, nomeProduto, precoProduto, quantidadeProduto);
		}
		System.out.println();

		System.out.println("Produtos atualizados: ");
		estoqueprodutos.exibirProdutos();
		System.out.println();

		System.out.println("Valor total do estoque: R$" + estoqueprodutos.valorTotal());
		System.out.println();

		System.out.println("Produto mais caro: " + estoqueprodutos.obterProdutoMaisCaro());
		sc.close();
	}

}
