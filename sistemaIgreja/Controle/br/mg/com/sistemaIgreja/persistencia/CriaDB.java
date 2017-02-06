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
		
		new CriaDB().insert("Valderi", 26, "M");
        
    }
	
	public void insert(String nome, int idade, String sexo){
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setIdade(idade);
		cliente.setSexo(sexo);
	    
		/*Inicia uma transação no BD*/
        session.beginTransaction();
        session.save(cliente);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
		
	}
	
	public void select(){
		
	}

}
