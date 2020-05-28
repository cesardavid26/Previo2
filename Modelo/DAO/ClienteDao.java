package DAO;

import javax.persistence.EntityManager;

import projectWebJPA.Cliente;
import util.Conexion;

public class ClienteDao {
EntityManager em=null;
	
	public ClienteDao() {
		em = Conexion.getEm();
		
		
	}
	public void registrar (Cliente cliente) {
		 try {
			 em.getTransaction().begin();
			 em.persist(cliente);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			 em.close();
			 }
		
		 
		 
	 }

}
