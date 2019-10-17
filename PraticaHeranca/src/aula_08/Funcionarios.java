package aula_08;

public class Funcionarios {
	
		
		private String nome;
		private double salarios;

	public Funcionarios(String nome , double salarios) {
		
		this.nome = nome;
	    this.salarios = salarios;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalarios() {
		return salarios;
	}

	public void setSalarios(Double salarios) {
		this.salarios = salarios;
	}
}


