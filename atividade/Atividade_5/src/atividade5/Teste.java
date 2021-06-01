package atividade5;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		Estudante estudante01 = new Estudante("Fernanda", "Casa Amarela.");
		estudante01.addCursoNota("Lógica", 7);
		estudante01.addCursoNota("Empreendorismo", 10);
		estudante01.addCursoNota("Inteligencia Artificial", 5);
		
		Estudante estudante02 = new Estudante("José Batista", "Passarinho");
		estudante02.addCursoNota("Informatica ", 7);
		estudante02.addCursoNota("Etica", 10);
		estudante02.addCursoNota("Projeto", 8);
		
		Estudante estudante03 = new Estudante("Miriam Maria", "Casa Forte");
		estudante03.addCursoNota("Informatica ", 10);
		estudante03.addCursoNota("Empreendorismo", 10);
		estudante03.addCursoNota("Etica", 9);
		estudante03.addCursoNota("Projeto", 10);
		
		pessoas.add(estudante01);
		pessoas.add(estudante02);
		pessoas.add(estudante03);

		Professor  professor01 = new Professor("Gustavo Guanabara", "São Francisco");
		professor01.addCurso("Informatica ");
		professor01.addCurso("Logica");
		
		Professor professor02 = new Professor("Jhonson Kell", "Recife");
		professor02.addCurso("Empreendorismo");
		professor02.addCurso("Etica");
		
		Professor  professor03 = new Professor("Pedro Xixarro", "Ilha do Joaneiro");
		professor03.addCurso("Inteligencia Artificial ");
		
		pessoas.add(professor01);
		pessoas.add(professor02);
		pessoas.add(professor03);
		

		for(int i = 0; i<pessoas.size(); i++) {
			String str = pessoas.get(i).toString();
			System.out.println(str);
		}
		
		String test = pessoasData(pessoas);
		System.out.println(test);
}

private static String pessoasData(ArrayList<Pessoa> pessoas) {
	
	Professor professor = new Professor(null, null);
	Estudante estudante = new Estudante(null, null);
	String str = "";
	
		
		for(int i = 0; i< pessoas.size(); i++) {
				
			 if(professor.getClass() == pessoas.get(i).getClass()) {
				 Professor teacher = (Professor) pessoas.get(i);
				 
				 for(int y = 0; y < teacher.getCursos().size(); y++) {
					str += "Curso: "+ teacher.getCursos().get(y)+"\n";
					str += "Professor: " + teacher.getNome()+"\n";
					str += "Alunos: \n";
							
						for(int z = 0; z < pessoas.size(); z++) {
							
							if(estudante.getClass() == pessoas.get(z).getClass()) {
								Estudante student = (Estudante) pessoas.get(z);
								
								for(int x = 0; x < student.getCursos().size(); x++) {
									
									if(student.getCursos().get(x).equals(teacher.getCursos().get(y))) {
										str += student.getNome()+"\n";
									}
								}
							}
						}
						str +="------------------------- \n";
				 }
			 }
		}
		
		return str;
}


	}


