public class Main {
	public static void main(String[] args) {
		/*4. Conversão de tipos
	Crie um programa que:
	declare um int
	converta esse valor para double
	imprima os dois valores
	Objetivo: praticar casting em Java.*/
	int inteiro = 10;
	double real = 5.5;
	
	double n = (double) inteiro;
	System.out.println(n);
	
	int n1 = (int) real;
	System.out.println(n1);
	}
}