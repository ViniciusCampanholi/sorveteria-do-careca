package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.DAO;
import Model.Sorvetes;

/**
 * Servlet implementation class controller
 */
@WebServlet(urlPatterns={"/controller","/avaliação"})
public class controller extends HttpServlet {
	DAO dao = new DAO();
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		gestaoSorvete(request, response);	
	}
	
	protected void gestaoSorvete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			ArrayList<Sorvetes> lista = dao.listarSorvetes();	
			request.setAttribute("sorvetes", lista);
			RequestDispatcher rd = request.getRequestDispatcher("Avaliação.jsp");
			rd.forward(request, response);
	}
}
