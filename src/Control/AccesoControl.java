package Control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.TiendaDao;
import projectWebJPA.Tienda;

/**
 * Servlet implementation class AccesoControl
 */
@WebServlet("/AccesoControl")
public class AccesoControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccesoControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession sesion = request.getSession();
		String accion = request.getParameter("accion");
		switch (accion) {
		case "ingreso":
			
			String email = request.getParameter("email");
			String pass = request.getParameter("pass");
			TiendaDao tD = new TiendaDao();
			Tienda t = new Tienda();
			t=tD.validar(email, pass);
			if (t!=null ) {
				sesion.setAttribute("tienda", t);
				request.getRequestDispatcher("/index.html").forward(request, response);
				
			}else {
				
				request.getRequestDispatcher("/login.jsp").forward(request, response);
				
				
			}
			
			
			break;

		default:
			break;
		}
	}

}
