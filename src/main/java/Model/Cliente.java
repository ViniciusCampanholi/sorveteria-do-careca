package Model;

public class Cliente {
	private int ID_cliente;
	private String Nome_cliente;
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(int iD_cliente, String nome_cliente) {
		super();
		ID_cliente = iD_cliente;
		Nome_cliente = nome_cliente;
	}

	public int getID_cliente() {
		return ID_cliente;
	}

	public void setID_cliente(int iD_cliente) {
		ID_cliente = iD_cliente;
	}

	public String getNome_cliente() {
		return Nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		Nome_cliente = nome_cliente;
	}
	
	
}
