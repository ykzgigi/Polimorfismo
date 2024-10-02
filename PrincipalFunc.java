package Polimorfismo;

public class PrincipalFunc {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario(04, "João", "15 9974-3765", 826, "Avenida Esbertalina Barbosa Damiani");
		Horista horista =  new Horista (01, "Victor", "15 9974-6384", 675, "Avenida Tocantins");
		Jornada jornada = new Jornada (02, "Larissa", "15 9946-4332", 356, "Rua Tenente-Coronel Cardoso");
		ConsultorPj consultorPj = new ConsultorPj (03, "Marcelo", "15 9932-7234", 634, "Rua da Imprensa");
		
		

		System.out.println("~~~~FUNCIONÁRIO~~~~");
		System.out.println("         ");
		System.out.println("Id: " + funcionario.getId());
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Telefone: " + funcionario.getTelefone());
		System.out.println("Matricula: " + funcionario.getMatricula());
		System.out.println("Endereço: " + funcionario.getEndereco());
		System.out.println("O salário total de João é: ");
		System.out.println(funcionario.calcularSalario(10000.00, 1000));
		
		
		
		
		
		System.out.println("         ");
		System.out.println("~~~~HORISTA~~~~");
		System.out.println("         ");

		System.out.println("Id: " + horista.getId());
		System.out.println("Nome: " + horista.getNome());
		System.out.println("Telefone: " + horista.getTelefone());
		System.out.println("Matricula: " + horista.getMatricula());
		System.out.println("Endereço: " + horista.getEndereco());
		System.out.println("O salário total de Victor é: ");
		System.out.println(horista.calcularSalario(20000.00, 1376));
		
		
		
		
		System.out.println("         ");
		System.out.println("~~~~JORNADA~~~~");
		System.out.println("         ");
		
		System.out.println("Id: " + jornada.getId());
		System.out.println("Nome: " + jornada.getNome());
		System.out.println("Telefone: " + jornada.getTelefone());
		System.out.println("Matricula: " + jornada.getMatricula());
		System.out.println("Endereço: " + jornada.getEndereco());
		System.out.println("O salário total de Larissa é: ");
		System.out.println(jornada.calcularSalario(14000.00, 1384));
		
		
		
		
		
		System.out.println("         ");
		System.out.println("~~~~CONSULTOR PJ~~~~");
		System.out.println("         ");

		System.out.println("Id: " + consultorPj.getId());
		System.out.println("Nome: " + consultorPj.getNome());
		System.out.println("Telefone: " + consultorPj.getTelefone());
		System.out.println("Matricula: " + consultorPj.getMatricula());
		System.out.println("Endereço: " + consultorPj.getEndereco());
		System.out.println("O salário total de Marcelo é: ");
		System.out.println(consultorPj.calcularSalario(15000.00, 1649));
	

		




	}

}
