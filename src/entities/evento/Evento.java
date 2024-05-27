package entities.evento;

public class Evento {

	private String nome;
	private String atracao;

	public Evento() {

	}

	public Evento(String nome, String atracao) {
		this.nome = nome;
		this.atracao = atracao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAtracao() {
		return atracao;
	}

	public void setAtracao(String atracao) {
		this.atracao = atracao;
	}

	public String toString () {
		return "Evento: " + nome + ", Atracao: " + atracao + " ";
	}
}
