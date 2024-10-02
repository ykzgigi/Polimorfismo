package Polimorfismo;

public class PrincipalProf {

	public static void main(String[] args) {
		
	    ProfissionalSaude profissionalSaude = new ProfissionalSaude("DT. Marcelo d. Odetti", "Profissional de saúde", 600);
	    Medico medico = new Medico ("Dt. Luiz C. Fonseca", "médico", 200,"866");
	    Dentista dentista = new Dentista("Dt. Carlos M. Araújo", "Dentista", 300,"496");
	    Fisioterapeuta fisioterapeuta = new Fisioterapeuta("Dt. Luiza H. Souza", "Fisioterapeuta", 700, "475");
	    
	    
		
		System.out.println("~~~~PROFISSIONAL DE SAÚDE~~~~");
		System.out.println("         ");
		
		System.out.println("Nome: " + profissionalSaude.getNome());
		System.out.println("Especialidade: " + profissionalSaude.getEspecialidade());
		System.out.println("Valor da Consulta: " + profissionalSaude.getValorConsulta());
		profissionalSaude.agendarConsulta();
		
		
		
		
		
		System.out.println("         ");
		System.out.println("~~~~MEDICO~~~~");
		System.out.println("         ");
	
		System.out.println("Nome: " + medico.getNome());
		System.out.println("Especialidade: " + medico.getEspecialidade());
		System.out.println("Valor da Consulta: " + medico.getValorConsulta());
		System.out.println("Crefito: " + medico.getCrm());
		medico.agendarConsulta();
		
		
		
		
		System.out.println("         ");
		System.out.println("~~~~DENTISTA~~~~");
		System.out.println("         ");
	
		System.out.println("Nome: " + dentista.getNome());
		System.out.println("Especialidade: " + dentista.getEspecialidade());
		System.out.println("Valor da Consulta: " + dentista.getValorConsulta());
		System.out.println("Crefito: " + dentista.getCro());
		dentista.agendarConsulta();
		
		
		
		
		System.out.println("         ");
		System.out.println("~~~~FISIOTERAPEUTA~~~~");
		System.out.println("         ");
	
		System.out.println("Nome: " + fisioterapeuta.getNome());
		System.out.println("Especialidade: " + fisioterapeuta.getEspecialidade());
		System.out.println("Valor da Consulta: " + fisioterapeuta.getValorConsulta());
		System.out.println("Crefito: " + fisioterapeuta.getCrefito());
		fisioterapeuta.agendarConsulta();
		
		
		
	}

}
