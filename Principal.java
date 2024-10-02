package Polimorfismo;

public class Principal {

	public static void main(String[] args) {

		Lobo lobo = new Lobo ("Thor", "M", "Qualquer");
		System.out.println("Nome: " + lobo.getNome());
		System.out.println("Sexo: " + lobo.getSexo());
		System.out.println("Raça: " + lobo.getRaca());
		lobo.emitirSom();
		lobo.caminhar();
		lobo.correr();
		lobo.dormir();
		
		System.out.println("            ");

		Leao leao = new Leao ("Spike", "M", "Qualquer");
		System.out.println("Nome: " + leao.getNome());
		System.out.println("Sexo: " + leao.getSexo());
		System.out.println("Raça: " + leao.getRaca());
		leao.emitirSom();
		leao.caminhar();
		leao.correr();
		leao.dormir();
		
		System.out.println("            ");
		
		
		Tigre tigre = new Tigre ("Carlos", "M", "Qualquer");
		System.out.println("Nome: " + tigre.getNome());
		System.out.println("Sexo: " + tigre.getSexo());
		System.out.println("Raça: " + tigre.getRaca());
		tigre.emitirSom();
		tigre.caminhar();
		tigre.correr();
		tigre.dormir();
		
		System.out.println("            ");
		
		Cachorro cachorro = new Cachorro ("Bidu", "M", "Qualquer");
		System.out.println("Nome: " + cachorro.getNome());
		System.out.println("Sexo: " + cachorro.getSexo());
		System.out.println("Raça: " + cachorro.getRaca());
		cachorro.emitirSom();
		cachorro.caminhar();
		cachorro.correr();
		cachorro.dormir();
		
		System.out.println("            ");
		
		Gato gato = new Gato ("Simon", "M", "Qualquer");
		System.out.println("Nome: " + gato.getNome());
		System.out.println("Sexo: " + gato.getSexo());
		System.out.println("Raça: " + gato.getRaca());
		gato.emitirSom();
		gato.caminhar();
		gato.correr();
		gato.dormir();
		
		
		
	
	}
}
