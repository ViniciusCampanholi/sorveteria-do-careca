package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAO {
	/** Módulo de Conexão **/
	// Parametros de conexao

	private String user = "root";
	private String pwd = "dutr7chet3cn0l0g14";
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/SORVETERIA_DO_CARECA?useTimezone=true&serverTimezone=UTC";
	
	//Método de conexao
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pwd);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
		//teste conexao
		public void testaConexao() {
			try {
				Connection con = conectar();
			System.out.println("valor da conexao: "+con);
			} catch (Exception e) {
				System.out.println("deu erro: " +e);
			}
		}	
		
		public ArrayList<Sorvetes> listarSorvetes() {
			//criando objeto para acessar a classe JavaBeans
			ArrayList<Sorvetes> sorvetes = new ArrayList<>();
			String read="select * from Sorvetes order by 2";
			try {
				Connection con = conectar();
				PreparedStatement pst = con.prepareStatement(read);
				ResultSet rs = pst.executeQuery();
				//laço de repetição para obter todos os contatos
				while (rs.next()) {
					//variaveis de apoio que recebem os dados do banco
					int idsorvete = rs.getInt(1);
					String nomesorvete = rs.getString(2);
					String avaliacao = rs.getString(3);
					//populando o arraylist
					sorvetes.add(new Sorvetes(idsorvete,nomesorvete,avaliacao));
				}
				con.close();
				System.out.println(sorvetes);
				return sorvetes;
				
			} catch (Exception e) {
				System.out.println(e);
				return null;
			}
		}

}


