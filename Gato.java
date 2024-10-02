package Polimorfismo;

public class Gato extends Animal {
	
	public Gato(String nome, String sexo, String raca) {
		super(nome,sexo,raca);
	}
    
	@Override
	public void emitirSom() {
		System.out.println("O gato está miando");
	}

}
