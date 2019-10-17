package aula_08;

public class Secretaria extends Funcionarios {
	private double numeroramal;

	public Secretaria(String nome , double salarios,double numeroramal) {
		super(nome,salarios);		
		this.numeroramal = numeroramal;
		
	}

	public double getNumeroramal() {
		return numeroramal;
	}

	public void setNumeroramal(double numeroramal) {
		this.numeroramal = numeroramal;
	}
	
	
}
