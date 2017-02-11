package br.mg.com.sistemaIgreja.persistencia;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.mg.com.sistemaIgreja.classe.Cliente;

@SuppressWarnings("deprecation")
public class CriaDB {
	
//	private static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
//	private static final String JDBC_URL = "jdbc:derby:sistemaIgrejaDB;create=true";
//	
//	private static final String SQL_STATEMENT = "SELECT * FROM TESTE";
	
	public static void main(String[] args) {
		
		//new CriaDB().insert("Valderi", 26, "M");
		new CriaDB().select();
        
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
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		 
	    
		/*Inicia uma transação no BD*/
        session.beginTransaction();
        
        String sql = "SELECT nome FROM Cliente";
        Query query = session.createQuery(sql);
        
        List<String> lista = query.getResultList();
        
        for(String s:lista){
			System.out.println();
			System.out.println("Nome: "+s);
			//System.out.println("Sexo: "+c.getSexo());
			//System.out.println("Idade: "+c.getIdade());
		}
        
        
        
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
	}

}
