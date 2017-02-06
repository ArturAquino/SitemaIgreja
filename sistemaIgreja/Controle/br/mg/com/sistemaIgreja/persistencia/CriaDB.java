package br.mg.com.sistemaIgreja.persistencia;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.mg.com.classe.Cliente;

@SuppressWarnings("deprecation")
public class CriaDB {
	
//	private static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
//	private static final String JDBC_URL = "jdbc:derby:sistemaIgrejaDB;create=true";
//	
//	private static final String SQL_STATEMENT = "SELECT * FROM TESTE";
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Pedro Bino");
		cliente.setIdade(35);
		cliente.setSexo("M");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	    Session session = sessionFactory.openSession();
	        
        session.beginTransaction();
        session.save(cliente);
        session.getTransaction().commit();
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        Query query = session.createQuery("from Cliente");
        
        List<Cliente> list = query.list();
        
        for(Cliente user1:list){
        	System.out.println();
            System.out.println(user1.getNome());
        }
        
        session.getTransaction().commit();
        
    }


}
