package edu.maratonajava.introducao;

public class Aula02TiposPrimitivos {
	
	public static void main(String[] args) {
		
		//int, double, float, char, byte, short, long, boolean
		//tipos primitivos se diferem pelo tamanho, em bytes, que pode ser armazenado.
		
		int idade = 10;
		long numeroGrande = 100000L;
		double salarioDouble = 2000;
		float salarioFlout = 200.0F;//para diferenciar valores decimais para o compilador poder entender,
		                            //é preciso, no float, colocar no final do numero a letra f ou F;
		byte valorByte = -128; // o tamanho é de um byte que é igual a 8 bits, sendo assim o maximo que armazena é 127 ou -128
		
		//boolean armazena somente 1 bit (0 ou 1)
		boolean falso = false;
		boolean verdadeiro = true;
		
		//aceita o caractere, o codigo asc e unicode
		char caractere = 'M';
		char codigoCarctere = 87; //irá imprimir a letra W
		char caracterUnicode = '\u0041'; //caracter inicode, deverá imprimir a leta A
				
		System.out.println(caracterUnicode);
		
		
		//casting
		int idadeCasting = (int)10000000000L; //cast para um numero long caber dentro de uma 
											  //variavel int
		
		System.out.println(idadeCasting); //perceba que na impressão saiu um valor diferente, pois o
		                                  //compilador forçou o valor dentro de um tipo que não suporta o tamnhano
		
		/*
		 * casting é necessário avaliar, pois é recomendado se trocar o tipo da variavel ou invés de fazer o casting
		 */
	}

}
