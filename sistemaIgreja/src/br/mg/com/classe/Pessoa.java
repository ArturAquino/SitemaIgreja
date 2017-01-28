package br.mg.com.classe;

import java.util.Date;

import br.mg.com.enumeration.Sexo;

public abstract class Pessoa {
	
	private String nome;
	private String nomeQuadrante;
	private String nomeCracha;
	private Long estadoCivil;
	private Date dataNascimento;
	private Date dataCasamento;
	private Sexo sexo;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNomeQuadrante() {
		return nomeQuadrante;
	}
	
	public void setNomeQuadrante(String nomeQuadrante) {
		this.nomeQuadrante = nomeQuadrante;
	}
	
	public String getNomeCracha() {
		return nomeCracha;
	}
	
	public void setNomeCracha(String nomeCracha) {
		this.nomeCracha = nomeCracha;
	}
	
	public Long getEstadoCivil() {
		return estadoCivil;
	}
	
	public void setEstadoCivil(Long estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public Date getDataCasamento() {
		return dataCasamento;
	}
	
	public void setDataCasamento(Date dataCasamento) {
		this.dataCasamento = dataCasamento;
	}
	
	public Sexo getSexo() {
		return sexo;
	}
	
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	

}
