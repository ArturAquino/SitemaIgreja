package br.mg.com.sistemaIgreja.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CriaDB {
	
	private static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
	private static final String JDBC_URL = "jdbc:derby:sistemaIgrejaDB;create=true";
	
	private static final String SQL_STATEMENT = "SELECT * FROM TESTE";
	
	public static void main(String[] args){
		 
		try {
			
			Class.forName(DRIVER);
			Connection con = DriverManager.getConnection(JDBC_URL);
			
			/*Comando para criação de uma tabela*/
			/*con.createStatement().execute(""
					+ "CREATE TABLE TESTE("
					+ "		NOME VARCHAR(255),"
					+ "		SEXO VARCHAR(1),"
					+ "		IDADE INTEGER)"
					);*/
			/*Comando para inserção de dados em uma tabela*/
			/*con.createStatement().execute(""
					+ "INSERT INTO TESTE(NOME, SEXO, IDADE)"
					+ "		VALUES('ADEMIR', 'M', 29)");
			
			//System.out.println("Tabela criada com sucesso!!!");*/
			
			Statement statemant = con.createStatement();
			
			ResultSet res = statemant.executeQuery(SQL_STATEMENT);
			
			//ResultSetMetaData resMD = res.getMetaData();
			
			//int totalColuna = resMD.getColumnCount(); 
			
			for(int i = 1; i <= res.getMetaData().getColumnCount(); i++){
				System.out.format("%20s", res.getMetaData().getColumnName(i)+" | ");
			}
			
			while(res.next()){
				
				System.out.println();
				
				for(int i = 1; i <= res.getMetaData().getColumnCount(); i++){
					System.out.format("%20s", res.getString(i)+" | ");
				}
			}
			
			if(statemant != null)
				statemant.close();
			
			if(con != null)
				con.close();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
