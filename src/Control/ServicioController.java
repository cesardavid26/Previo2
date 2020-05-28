package Control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ServicioDao;
import projectWebJPA.Servicio;

/**
 * Servlet implementation class ServicioController
 */
@WebServlet("/ServicioController")
public class ServicioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServicioController() {
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
String accion= request.getParameter("accion");
		
		switch (accion) {
		case "registro":
			String nombre = request.getParameter("nombre");
			String descripcion = request.getParameter("descripcion");

			
			ServicioDao tD = new ServicioDao();
				Servicio t = new Servicio();
				t.setNombre(nombre);
				t.setDescripcion(descripcion);
				tD.registrar(t);
				request.getRequestDispatcher("/regServicio.jsp").forward(request, response);
				
				
			break;
	}

	}
	}


