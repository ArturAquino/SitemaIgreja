package br.mg.com.sistemaIgreja.persistencia;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.mg.com.sistemaIgreja.classe.Paroquia;

@SuppressWarnings("deprecation")
public class CriaDB {
	
//	private static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
//	private static final String JDBC_URL = "jdbc:derby:sistemaIgrejaDB;create=true";
//	
//	private static final String SQL_STATEMENT = "SELECT * FROM TESTE";
	
	public static void main(String[] args) {
		
		//new CriaDB().insert("São Benedito", "Uberlândia", "Nsa Sra Graças", "República Piratini", 908, "Casa", "38402-028", "3222-9371");
		new CriaDB().select();
        
    }
	
	public void insert(String nome, String cidade, String bairro, String logradouro, 
			           Integer numero, String complemento, String cep, String telefone){
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Paroquia paroquia = new Paroquia();
		paroquia.setNome(nome);
		paroquia.setCidade(cidade);
		paroquia.setBairro(bairro);
		paroquia.setLogradouro(logradouro);
		paroquia.setNumero(numero);
		paroquia.setComplemento(complemento);
		paroquia.setCep(cep);
		paroquia.setTelefone(telefone);
		
	    
		/*Inicia uma transação no BD*/
        session.beginTransaction();
        session.save(paroquia);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
		
	}
	
	public void select(){
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		 
	    
		/*Inicia uma transação no BD*/
        session.beginTransaction();
        
        String sql = "SELECT nome FROM Paroquia";
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
