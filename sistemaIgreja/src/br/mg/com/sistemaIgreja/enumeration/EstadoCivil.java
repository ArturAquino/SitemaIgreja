package br.mg.com.sistemaIgreja.enumeration;

public enum EstadoCivil {
	
	Solteiro(1),
	Casado(2);
	
	public int vlrEstCivil;
	
	EstadoCivil(int vlrEstCivil){
		this.vlrEstCivil = vlrEstCivil;
	}

	public int getVlrEstCivil() {
		return vlrEstCivil;
	}

}
