package Model;

public class Avaliacao {
	private int ID_avalição;
	private String Descrição_avaliação;
	private int ID_cliente;
	private int ID_sorvete;
	
	public Avaliacao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Avaliacao(int iD_avalição, String descrição_avaliação, int iD_cliente, int iD_sorvete) {
		super();
		ID_avalição = iD_avalição;
		Descrição_avaliação = descrição_avaliação;
		ID_cliente = iD_cliente;
		ID_sorvete = iD_sorvete;
	}

	public int getID_avalição() {
		return ID_avalição;
	}

	public void setID_avalição(int iD_avalição) {
		ID_avalição = iD_avalição;
	}

	public String getDescrição_avaliação() {
		return Descrição_avaliação;
	}

	public void setDescrição_avaliação(String descrição_avaliação) {
		Descrição_avaliação = descrição_avaliação;
	}

	public int getID_cliente() {
		return ID_cliente;
	}

	public void setID_cliente(int iD_cliente) {
		ID_cliente = iD_cliente;
	}

	public int getID_sorvete() {
		return ID_sorvete;
	}

	public void setID_sorvete(int iD_sorvete) {
		ID_sorvete = iD_sorvete;
	}
	
	
}
