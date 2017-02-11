package br.mg.com.sistemaIgreja.classe;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.mg.com.sistemaIgreja.enumeration.Escolaridade;
import br.mg.com.sistemaIgreja.enumeration.EstadoCivil;
import br.mg.com.sistemaIgreja.enumeration.PlcSimNao;
import br.mg.com.sistemaIgreja.enumeration.Sexo;

@Entity
public abstract class Pessoa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codigo;
	
	private String nome;
	private String nomeQuadrante;
	private String nomeCracha;
	private EstadoCivil estadoCivil;
	private Date dataNascimento;
	private Date dataCasamento;
	private Sexo sexo;
	
	private String nomeMae;
	private String nomePai;
	
	/*Grau de escolaridade*/
	private Escolaridade escolaridade;
	
	/*Endereço*/
	private String cidade;
	private String logradouro;
	private String bairro;
	private int numero;
	private String complemento;
	private String cep;
	
	/*Forma de contato*/
	private String email;
	private String telefone;
	private String celular;
	
	/*Dados de batismo e crisma*/
	private PlcSimNao batizado;
	private PlcSimNao eucaristia;
	
	/*Tirar dúvida aqui*/
	private String crismando;
	private String crisma;
	
	/*Responsável*/
	private String telResponsavel;
	private String celResponsavel;
	private String responsavel;
	
	/*Informações relevantes*/
	private String observacoes;
	private String usoMedicamento;
	private String restricaoAlimentar;

	
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
	
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	
	public void setEstadoCivil(EstadoCivil estadoCivil) {
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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public PlcSimNao getBatizado() {
		return batizado;
	}

	public void setBatizado(PlcSimNao batizado) {
		this.batizado = batizado;
	}

	public PlcSimNao getEucaristia() {
		return eucaristia;
	}

	public void setEucaristia(PlcSimNao eucaristia) {
		this.eucaristia = eucaristia;
	}

	public String getCrismando() {
		return crismando;
	}

	public void setCrismando(String crismando) {
		this.crismando = crismando;
	}

	public String getCrisma() {
		return crisma;
	}

	public void setCrisma(String crisma) {
		this.crisma = crisma;
	}

	public String getTelResponsavel() {
		return telResponsavel;
	}

	public void setTelResponsavel(String telResponsavel) {
		this.telResponsavel = telResponsavel;
	}

	public String getCelResponsavel() {
		return celResponsavel;
	}

	public void setCelResponsavel(String celResponsavel) {
		this.celResponsavel = celResponsavel;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public String getUsoMedicamento() {
		return usoMedicamento;
	}

	public void setUsoMedicamento(String usoMedicamento) {
		this.usoMedicamento = usoMedicamento;
	}

	public String getRestricaoAlimentar() {
		return restricaoAlimentar;
	}

	public void setRestricaoAlimentar(String restricaoAlimentar) {
		this.restricaoAlimentar = restricaoAlimentar;
	}

	public Escolaridade getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(Escolaridade escolaridade) {
		this.escolaridade = escolaridade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	

}
