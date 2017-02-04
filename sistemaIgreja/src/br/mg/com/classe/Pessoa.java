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
	
	private String email;
	private String nomeMae;
	private String nomePai;
<<<<<<< HEAD
	/*????iEscolaridade;
	iCidade;
	iLogradouro
=======
	????iEscolaridade;
	????iCidade;
	????iLogradouro
>>>>>>> branch 'master' of https://github.com/ArturAquino/SitemaIgreja
	private int numero;
<<<<<<< HEAD
	complemento
	iBairro
	cep
	telefone
	celular
	batizado
	eucaristia
	crismando
	crisma
	telResponsavel
	celResponsavel
	observacoes
	responsavel
	usoMedicamento
	restricaoAlimentar*/
=======
	private String complemento;
	????iBairro
	private String cep;
	private String telefone;
	private String celular;
	private String batizado;
	private String eucaristia;
	private String crismando;
	private String crisma;
	private String telResponsavel;
	private String celResponsavel;
	private String observacoes;
	private String responsavel;
	private String usoMedicamento;
	private String restricaoAlimentar;
>>>>>>> branch 'master' of https://github.com/ArturAquino/SitemaIgreja

	
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
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
