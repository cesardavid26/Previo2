package DAO;

import javax.persistence.EntityManager;
import javax.persistence.Query;

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
	 public Tienda validar(String email, String pass) {
			Tienda t = new Tienda();
			 Query nativeQuery = em.createNativeQuery("SELECT id,nombre FROM Tienda p "
			 		                                 + "WHERE p.email =? "
			 		                                 + "and p.clave= ? "
			 		                                 );
		        nativeQuery.setParameter(1, email);
		        nativeQuery.setParameter(2, pass);
		        Object[] result = (Object[]) nativeQuery.getSingleResult();
		        t.setId((Integer)(result[0]));
		        t.setNombre((String) result[1]);
		        return t;
	 }
}
