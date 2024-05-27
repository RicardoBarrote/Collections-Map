package applicationEvento;

import java.time.LocalDate;
import java.time.Month;
import java.util.Locale;
import java.util.Scanner;

import entities.evento.AgendaEvento;

public class programEventos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		AgendaEvento agendaevento = new AgendaEvento ();
		
		agendaevento.adicionarEvento(LocalDate.of(2024, Month.JULY, 15), "Primeiro evento", "Atração Um");
		agendaevento.adicionarEvento(LocalDate.of(2025, Month.FEBRUARY, 21), "Segundo evento", "Atração Dois");
		agendaevento.adicionarEvento(LocalDate.of(2026, Month.AUGUST, 15), "Terceiro evento", "Atração Três");
		
		agendaevento.obterProximoEvento();
		
		sc.close();
	}

}
