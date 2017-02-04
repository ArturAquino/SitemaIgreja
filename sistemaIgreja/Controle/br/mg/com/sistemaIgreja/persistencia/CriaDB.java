package br.mg.com.sistemaIgreja.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.mg.com.classe.Cliente;

public class CriaDB {
	
//	private static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
//	private static final String JDBC_URL = "jdbc:derby:sistemaIgrejaDB;create=true";
//	
//	private static final String SQL_STATEMENT = "SELECT * FROM TESTE";
	
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Derby");
		EntityManager em = emf.createEntityManager();

		Cliente cliente = new Cliente();
		cliente.setNome("Pedro Bino");
		cliente.setIdade(35);
		cliente.setSexo("M");

		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();

		System.out.println("Cliente salvo com sucesso !!");

		//em.close();

		}


}
