package DAO;

import javax.persistence.EntityManager;

import projectWebJPA.Tienda;
import util.Conexion;

public class TiendaDao {
EntityManager em=null;
	
	public TiendaDao() {
		em = Conexion.getEm();
		
		
	}
	public void registrar (Tienda tienda) {
		 try {
			 em.getTransaction().begin();
			 em.persist(tienda);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			 
			 }
		
		 
		 
	 }
	
	 public void actualizar (Tienda tienda) {
		 try {
			 em.getTransaction().begin();
			 em.merge(tienda);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			
			 }
		
		 
		 
	 }
}
