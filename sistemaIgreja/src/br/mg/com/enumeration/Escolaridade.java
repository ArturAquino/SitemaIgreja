package br.mg.com.enumeration;

public enum Escolaridade {
	
	primeiro_grau_incompleto(0),
	primeiro_grau_completo(1),
	
	segundo_grau_incompleto(2),
	segundo_grau_completo(3),

	terceiro_grau_incompleto(4),
	terceiro_grau_completo(5),

	Mestre(6),
	Doutor(7),
	Phd(8);
	
	public int vlrEsc;
	
	Escolaridade(int vlrEsc){
		this.vlrEsc = vlrEsc;
	}

	public int getVlrEsc() {
		return vlrEsc;
	}
	
	public String toString(){
		
		String esc = null;
		
		if(this.vlrEsc == 0)
			esc = "1º Grau Incompleto";
		
		if(this.vlrEsc == 1)
			esc = "1º Grau Completo";
		
		if(this.vlrEsc == 2)
			esc = "2º Grau Incompleto";
		
		if(this.vlrEsc == 3)
			esc = "2º Grau Completo";
		
		if(this.vlrEsc == 4)
			esc = "3º Grau Incompleto";
		
		if(this.vlrEsc == 5)
			esc = "3º Grau Completo";
		
		if(this.vlrEsc == 6)
			esc = "Mestre";
		
		if(this.vlrEsc == 7)
			esc = "Doutor";
		
		if(this.vlrEsc == 8)
			esc = "Phd";
		
		return esc;
	}
	
}



