package entities.agenda;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AgendaContatos {

	private Map<String, String> agendaContatoMap = new HashMap<>();

	public void adicionarContato(Scanner sc) {
		int repeticao = 0;

		System.out.println("Informe quantos contatos será adicionado: ");
		int quantidadeContatos = sc.nextInt();

		while (repeticao != quantidadeContatos) {

			System.out.print("Nome do contato: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Número do contato: ");
			String contato = sc.next();

			agendaContatoMap.put(nome, contato);
			repeticao++;
		}
	}

	public void exibirContatos() {
		System.out.println(agendaContatoMap);
	}

	public void removerContato(Scanner sc) {
		if (!agendaContatoMap.isEmpty()) {
			System.out.print("Nome para remover: ");
			sc.nextLine();
			String nomeRemover = sc.nextLine();
			agendaContatoMap.remove(nomeRemover);
		} else {
			throw new IllegalStateException("Sua lista está vazia.");
		}
	}

	public void pesquisarPorNome(Scanner sc) {
		String numeroPorNome = null;
		if (!agendaContatoMap.isEmpty()) {
			System.out.print("Nome para pesquisar: ");
			String nome = sc.nextLine();
			numeroPorNome = agendaContatoMap.get(nome);
			System.out.println("Contato: " + numeroPorNome);
		}
	}
}
