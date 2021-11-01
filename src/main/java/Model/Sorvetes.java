package Model;

public class Sorvetes {
	private int ID_sorvete;
	private String Nome_sorvete;
	private String Avaliacao;
	public Sorvetes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sorvetes(int iD_sorvete, String nome_sorvete, String avaliacao) {
		super();
		ID_sorvete = iD_sorvete;
		Nome_sorvete = nome_sorvete;
		Avaliacao = avaliacao;
	}
	public int getID_sorvete() {
		return ID_sorvete;
	}
	public void setID_sorvete(int iD_sorvete) {
		ID_sorvete = iD_sorvete;
	}
	public String getNome_sorvete() {
		return Nome_sorvete;
	}
	public void setNome_sorvete(String nome_sorvete) {
		Nome_sorvete = nome_sorvete;
	}
	public String getAvaliacao() {
		return Avaliacao;
	}
	public void setAvaliacao(String avaliacao) {
		Avaliacao = avaliacao;
	}
}
