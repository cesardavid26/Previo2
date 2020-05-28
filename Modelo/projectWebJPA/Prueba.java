package projectWebJPA;

import Control.ClienteController;
import DAO.ClienteDao;
import DAO.ServicioDao;
import DAO.TiendaDao;

public class Prueba {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		7*ClienteDao cD = new ClienteDao();
		Cliente C = new Cliente();
		//c.setId(1090);
		C.setNombre("cesar");
		C.setClave("1234");
		C.setEmail("@gmail.com");
		cD.registrar(C);  */
		
	
		TiendaDao tD = new TiendaDao();
		Tienda t = new Tienda();
		//t.setId(id);
		t.setNombre("tiendas1");
		t.setClave("1234");
		t.setDescripcion("descripcion");
		t.setEmail("@email.com");
		t.setFacebook("facebook");
		t.setImagen("imagen");
		t.setLema("este es el lema");
		t.setPropietario("david");
		t.setWeb("wwww.web.com");
		tD.registrar(t); 
		
		
		
		ServicioDao sD = new ServicioDao();
		Servicio s = new Servicio();
		Tienda t1 = new Tienda();
		//s.setId(id);
		t1.setId(1);
		s.setNombre("Servicio de Atencion");
		s.setDescripcion("Atencio de los clientes");
		
		sD.registrar(s); 
		
		
		TiendaDao tD2 = new TiendaDao();
		Tienda t3 = new Tienda();
		t3.setId(5);
		t3.setNombre("PEPITO PEREZ CC");
		t3.setClave("4321");
		t3.setDescripcion("nueva descp");
		t3.setEmail("@11111.com");
		t3.setFacebook("face");
		t3.setImagen("111111");
		t3.setLema("nuevo lemaaaaaaa");
		t3.setNombre("nuevo nombre");
		t3.setPropietario("Alberto");
		t3.setWeb("www.11111.com.co");
		tD2.actualizar(t3); */
		
	  
		
		
		

	}
}
