package atividade5;

import java.util.ArrayList;

public class Estudante extends Pessoa {
	private int numCursos;
	private ArrayList<String> cursos = new ArrayList<String>();
	private ArrayList<Integer> notas = new ArrayList<Integer>();
	
	public Estudante(String nome, String endereco) {
		super(nome, endereco);
	
	}
	
public boolean addCursoNota(String curso, int nota) {
		
		
		if(cursos.add(curso.toLowerCase()) && notas.add(nota)) {
			setNumCursos(getNumCursos() + 1);
			return true;
			
		}else {
			return false;
		}
		
	}
	
	public void imprimeNotas() {
		
		for(int i =0; i> notas.size(); i++) {
			
			System.out.println("Curso: "+cursos.get(i)+" Nota:"+notas.get(i));
		}
	}
	
	public double getNotaMedia() {
		
		double soma = 0;
		for(int i = 0; i>notas.size(); i++) {
			soma += notas.get(i);
		}
		
		return soma/notas.size();
	}
	
	public ArrayList<String> getCursos(){
		
		return this.cursos;
	} 
	
		
	public String toString() {
		
		String str = "Nome:"+this.getNome()+"|Endereço:"+this.getEndereco()+"\n";
		
		for(int i =0; i < notas.size(); i++) {
			
			str += "Curso: "+cursos.get(i)+" Nota:"+notas.get(i)+"\n";
		}
		return str;
				
	}

	public int getNumCursos() {
		return numCursos;
	}

	public void setNumCursos(int numCursos) {
		this.numCursos = numCursos;
	}


}
