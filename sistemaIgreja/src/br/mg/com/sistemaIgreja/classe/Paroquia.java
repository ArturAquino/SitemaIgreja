package br.mg.com.sistemaIgreja.classe;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Paroquia {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codigo;
	
	private String nome;
	private String cidade;
	private String bairro;
	private String logradouro;
	private Integer numero;
	private String complemento;
	private String cep;
	private String telefone;
	
	public final String getNome() {
		return nome;
	}
	public final void setNome(String nome) {
		this.nome = nome;
	}
	public final String getCidade() {
		return cidade;
	}
	public final void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public final String getBairro() {
		return bairro;
	}
	public final void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public final String getLogradouro() {
		return logradouro;
	}
	public final void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public final Integer getNumero() {
		return numero;
	}
	public final void setNumero(Integer numero) {
		this.numero = numero;
	}
	public final String getComplemento() {
		return complemento;
	}
	public final void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public final String getCep() {
		return cep;
	}
	public final void setCep(String cep) {
		this.cep = cep;
	}
	public final String getTelefone() {
		return telefone;
	}
	public final void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
