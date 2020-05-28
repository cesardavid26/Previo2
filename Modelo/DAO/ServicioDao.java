package DAO;

import javax.persistence.EntityManager;

import projectWebJPA.Servicio;
import util.Conexion;

public class ServicioDao {
EntityManager em=null;
	
	public ServicioDao() {
		em = Conexion.getEm();
		
		
	}
	public void registrar (Servicio serv) {
		 try {
			 em.getTransaction().begin();
			 em.persist(serv);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			 em.close();
			 }
		
		 
		 
	 }
}
