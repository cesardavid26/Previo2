package Control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ClienteController
 */
@WebServlet("/ClienteController")
public class ClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClienteController() {
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
		String accion = request.getParameter("accion");	
		switch (accion) {
		case "ingresar":
			int id = Integer.parseInt(request.getParameter("codigo"));
			String nombre = request.getParameter("nombre");
			String email = request.getParameter("email");
			String clave =   request.getParameter("clave");
			int semestre = Integer.parseInt(request.getParameter("semestre"));
			
			ca.setCodigo(codigo);
			ca.setCredito(credito);
			ca.setNombre(nombre);
			ca.setSemestre(semestre);
			
			cDao.registrar(ca);
			response.sendRedirect("index.jsp");
			break;
			
			
	}

}
