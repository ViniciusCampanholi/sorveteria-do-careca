package Model;

import java.sql.Date;

public class Pedidos {
	private int ID_pedido;
	private Date Data_pedido;
	private int ID_cliente;
	private int ID_sorvete;
	private int Num_pedido;
	
	
	
	public Pedidos() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Pedidos(int iD_pedido, Date data_pedido, int iD_cliente, int iD_sorvete, int num_pedido) {
		super();
		ID_pedido = iD_pedido;
		Data_pedido = data_pedido;
		ID_cliente = iD_cliente;
		ID_sorvete = iD_sorvete;
		Num_pedido = num_pedido;
	}


	public int getID_pedido() {
		return ID_pedido;
	}
	public void setID_pedido(int iD_pedido) {
		ID_pedido = iD_pedido;
	}
	public Date getData_pedido() {
		return Data_pedido;
	}
	public void setData_pedido(Date data_pedido) {
		Data_pedido = data_pedido;
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
	public int getNum_pedido() {
		return Num_pedido;
	}
	public void setNum_pedido(int num_pedido) {
		Num_pedido = num_pedido;
	}
	
}
