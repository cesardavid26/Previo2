package DAO;

import javax.persistence.EntityManager;

import projectWebJPA.Tienda;
import util.Conexion;

public class TiendaDao {
EntityManager em=null;
	
	public TiendaDao() {
		em = Conexion.getEm();
		
		
	}
	public void registrar (Tienda ti) {
		 try {
			 em.getTransaction().begin();
			 em.persist(ti);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			 em.close();
			 }
		
		 
		 
	 }
}
