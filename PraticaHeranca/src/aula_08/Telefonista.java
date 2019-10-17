package aula_08;

public class Telefonista extends Funcionarios {
	private double codigo; 

	public Telefonista(String nome , double salarios, double codigo) {
		super(nome, salarios);
		
		this.codigo = codigo;
		
	}

	public double getCodigo() {
		return codigo;
	}

	public void setCodigo(double codigo) {
		this.codigo = codigo;
	}
	

}
