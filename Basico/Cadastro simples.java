public class Main {
	public static void main(String[] args) {
		/*
		2. Cadastro simples
	Crie um programa que armazene as seguintes 		informações de uma pessoa:
	idade
	altura
	peso
	primeira letra do nome
	se possui carteira de motorista
	Depois imprima todos os valores.
*/

	byte idade = 20;
	double altura = 1.75;
	float peso = 56.7f;
	String nome= "Luiz";
	boolean possuiCarteira = true;
	
	System.out.println("Digite sua idade: ");
	System.out.println(idade);
	
	System.out.println("Digite sua altura: ");
	System.out.println(altura);
	
	System.out.println("Digite seu peso: ");
	System.out.println(peso);
	
	System.out.println("Digite seu nome: ");
	System.out.println(nome);
	
	System.out.println("Possui carteira?: ");
	System.out.println(possuiCarteira);
	
	
	}
}