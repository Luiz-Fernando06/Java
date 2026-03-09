package exercicio2;

import java.util.Date;

// Crie um programa que exiba a data e a hora atual 

public class HoraDoSistema {

	public static void main(String[] args) {
		Date relogio = new Date(); // Criando um objeto
		System.out.println("A hora do sistema é:");
		System.out.println(relogio.toString()); // Converte o objeto para uma string
	}

}
