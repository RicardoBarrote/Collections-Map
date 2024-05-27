package applicationAgenda;

import java.util.Locale;
import java.util.Scanner;

import entities.agenda.AgendaContatos;

public class ProgramAgenda {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		AgendaContatos agendascontatos = new AgendaContatos();

		System.out.println("Contatos atuais: ");
		agendascontatos.exibirContatos();
		System.out.println();

		System.out.println("Adicionando contato");
		agendascontatos.adicionarContato(sc);

		System.out.println();
		System.out.println("Contatos atualizados: ");
		agendascontatos.exibirContatos();
		System.out.println();

		System.out.println("Contato para remover");
		agendascontatos.removerContato(sc);
		System.out.println();

		System.out.println("Contatos atualizados: ");
		agendascontatos.exibirContatos();

		System.out.println();
		System.out.println("Pesquisa por nome");
		agendascontatos.pesquisarPorNome(sc);
		sc.close();
	}

}
