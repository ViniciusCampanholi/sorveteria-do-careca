package Model;

public class Avaliacao {
	private int ID_avali��o;
	private String Descri��o_avalia��o;
	private int ID_cliente;
	private int ID_sorvete;
	
	public Avaliacao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Avaliacao(int iD_avali��o, String descri��o_avalia��o, int iD_cliente, int iD_sorvete) {
		super();
		ID_avali��o = iD_avali��o;
		Descri��o_avalia��o = descri��o_avalia��o;
		ID_cliente = iD_cliente;
		ID_sorvete = iD_sorvete;
	}

	public int getID_avali��o() {
		return ID_avali��o;
	}

	public void setID_avali��o(int iD_avali��o) {
		ID_avali��o = iD_avali��o;
	}

	public String getDescri��o_avalia��o() {
		return Descri��o_avalia��o;
	}

	public void setDescri��o_avalia��o(String descri��o_avalia��o) {
		Descri��o_avalia��o = descri��o_avalia��o;
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
