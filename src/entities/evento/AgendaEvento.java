package entities.evento;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEvento {

	private Map<LocalDate, Evento> eventosMap = new HashMap<>();

	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		eventosMap.put(data, new Evento(nome, atracao));
	}

	public void exibirAgenda() {
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);

		System.out.println(eventosTreeMap);
	}

	public void obterProximoEvento() {

		LocalDate data = LocalDate.now();
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);

		for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {

			if (entry.getKey().isEqual(data) || entry.getKey().isAfter(data)) {
				System.out.println("" + entry.getValue() + "" + entry.getKey());
				break;
			}
		}

	}
}
