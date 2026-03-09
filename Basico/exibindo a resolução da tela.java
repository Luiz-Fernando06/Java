package exercicio2;

import java.awt.Dimension;

// Faça um programa que retorne na tela a resolução da tela do S.O 

public class ResolucaoDaTela {

	public static void main(String[] args) {
		
		Dimension size = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		
		int largura = size.width; //Pega a largura da tela
		int altura = size.height; //Pega a altura da tela
		
		//Exibi largura X altura
		System.out.println("Resolução: " + largura + " X " + altura );
	}

}
