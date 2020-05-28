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
			 
			 }
		
		 
		 
	 }
	public void actualizar (Cliente cliente) {
		 try {
			 em.getTransaction().begin();
			 em.merge(cliente);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			
			 }
		
		 
		 
	 }
	 
	 public void eliminar (int id){
		 try {

			 Cliente u = em.find(Cliente.class, id);
			 em.getTransaction().begin();
			 em.remove(u);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			 }
		
		 
		 
	 }
	 
	 public Cliente buscar (Integer m) {
		 Cliente x = null;
		 try {
			 em.getTransaction().begin();
			 Cliente u = em.find(Cliente.class, m);
			 em.getTransaction().commit();
			 //System.out.println(u.getUsuario());
			 x=u;
			  
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {

			 }
		return x;
		
		 
		 
	 }
		 
	 }

}
