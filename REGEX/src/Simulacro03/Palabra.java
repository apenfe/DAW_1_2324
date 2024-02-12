package Simulacro03;

public class Palabra{
	
	private String word;
	private int nivel;
	
	public Palabra(String word, String nivel) {
		
		this.word=word;
		
		if(nivel.equals("facil")) {
			this.nivel=1;
		}else if(nivel.equals("normal")) {
			this.nivel=2;
		}else if(nivel.equals("dificil")) {
			this.nivel=3;
		}else {
			this.nivel=0;
		}	
		
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
		
}