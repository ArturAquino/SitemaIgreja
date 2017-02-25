package br.mg.com.sistemaIgreja.classe;

import java.util.Date;

public abstract class Encontro {
	
	private Long id;
	private Paroquia paroquia;
	private String nome;
	private String Logradouro;
	private Long numero;
	private String complemento;
	private String bairro;
	private String cep;
	private String cidade;
	private Date dtInicio;
	private Date dtFim;
	private Date dtMissaEnvio;
	private Date dtMissaEntrega;
	private Date dtMissaReencontro;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getLogradouro() {
		return Logradouro;
	}
	
	public void setLogradouro(String logradouro) {
		Logradouro = logradouro;
	}
	
	public Long getNumero() {
		return numero;
	}
	
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public Date getDtInicio() {
		return dtInicio;
	}
	
	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}
	
	public Date getDtFim() {
		return dtFim;
	}
	
	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}
	
	public Date getDtMissaEnvio() {
		return dtMissaEnvio;
	}
	
	public void setDtMissaEnvio(Date dtMissaEnvio) {
		this.dtMissaEnvio = dtMissaEnvio;
	}
	
	public Date getDtMissaEntrega() {
		return dtMissaEntrega;
	}
	
	public void setDtMissaEntrega(Date dtMissaEntrega) {
		this.dtMissaEntrega = dtMissaEntrega;
	}
	
	public Date getDtMissaReencontro() {
		return dtMissaReencontro;
	}
	
	public void setDtMissaReencontro(Date dtMissaReencontro) {
		this.dtMissaReencontro = dtMissaReencontro;
	}

}
