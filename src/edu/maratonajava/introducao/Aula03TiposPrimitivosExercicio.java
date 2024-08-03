package edu.maratonajava.introducao;

/*
 Prática
 
 Criar variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
 
 Eu <nome>, morando no endereço <endereço>,
 confirmo que recebio o salario de <salario>, na data <data>
 */

public class Aula03TiposPrimitivosExercicio {

	public static void main(String[] args) {
		
		String nome = "Alexandre";
		String endereco = "Rua tal de tal numero 55 - Potigura - Itu/SP";
		double salario = 16.000;
		String data = "26/12/1978";
		
		System.out.println("Eu "+nome+", morando no endereço "+endereco+", confirmo "
				+ "que recebi o salário de "+salario+", na data "+data);
		
		//ou
		String relatorio = "Eu "+nome+", morando no endereço "+endereco+", confirmo "
				+ "que recebi o salário de "+salario+", na data "+data;
		
		System.out.println(relatorio);

	}

}
