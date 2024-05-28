package applicationArquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProgramArquivoAndMap {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Map<String, Integer> mapVotacao = new HashMap<>();

		System.out.println("Insira o caminho do arquivo: ");
		String path = sc.next();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String nome = fields[0];
				Integer voto = Integer.parseInt(fields[1]);

				if (mapVotacao.containsKey(nome)) {
					int valorVoto = mapVotacao.get(nome);
					mapVotacao.put(nome, voto + valorVoto);
				}
				line = br.readLine();
			}

			Map<String, Integer> mapVotacaoOrdenado = new TreeMap<>(mapVotacao);
			for (String key : mapVotacaoOrdenado.keySet()) {
				System.out.println("Nome: " + key + ", votos: " + mapVotacaoOrdenado.get(key));
			}
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}

}
