package view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListaNotasOitoAlunos {
/*
  12) Faça um algoritmo que leia a nota de 10 alunos de uma turma e guarde-as em uma lista. 
      No final, mostre:
		a) Qual é a média da turma
		b) Quantos alunos estão acima da média da turma
		c) Qual foi a maior nota digitada
		d) Em que posições a maior nota aparece
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Double> notas = new ArrayList<Double>();
		double media = 0.0;
		double soma = 0.0;
		
		//leia a nota de 10 alunos
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite a nota dos alunos: ");
			notas.add(scan.nextDouble());
			
		}
		// mostra lista de notas
		System.out.println("Lista: " + notas);
		
		//a) Qual é a média da turma 
		for (Double nota : notas) {
			soma += nota;
		}
		media = (double) soma / notas.size();
		System.out.println("Qual é a média da turma: " + media);
		
		//b) Quantos alunos estão acima da média da turma
		int acimaMedia = 0;
		for (Double nota : notas) {
			if (nota > media) {
				acimaMedia++;
			}
		}
		// mostra nota acima da média
		System.out.println("Quantos alunos estão acima da média da turma: " + acimaMedia);
		
		//c) Qual foi a maior nota digitada
		double maiorNota = notas.get(0);
		for (Double nota : notas) {
			if (nota > maiorNota) {
				maiorNota++;
			}
		}	
		//motra maior nota
		System.out.println("Qual foi a maior nota digitada: "+ maiorNota);
		
		//d) Em que posições a maior nota aparece
		ArrayList<Integer> posicaoMaioNotas = new ArrayList<Integer>();
		for(int i=0; i < notas.size(); i++) {
			if (notas.get(i) == maiorNota) {
				posicaoMaioNotas.add(i);
			}
		}
		
		//mostra as posições da maior nota
		System.out.println("Em que posições a maior nota aparece: " + posicaoMaioNotas.indexOf(posicaoMaioNotas));
	}
}
