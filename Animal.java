package Polimorfismo;

public class Animal {

	private String nome;
	private String sexo;
	private String raca;

	public Animal(String nome,String sexo, String raca) {
		this.nome = nome;
		this.sexo = sexo;
		this.raca = raca;
	}

	public void dormir() {
		System.out.println("Dormindo");
	}
	public void caminhar() {
		System.out.println("caminhando");
	}
	public void correr() {
		System.out.println("correndo");
	}
	public void emitirSom() {
		System.out.println("Emitindo Som");
	}	
	
	
	
	


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
}

