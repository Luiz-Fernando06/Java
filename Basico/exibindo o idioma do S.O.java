package exercicio2;

import java.util.*;

// Crie um Sistema que retorne o idioma do Sistema operacional

public class IdiomaDoSistema {

	public static void main(String[] args) {
    
		Locale idioma = Locale.getDefault(); // Objeto que pega o local pafrão do S.O
    
		//Exibindo o idioma completo e a sigla
		System.out.print("Idioma do sistema: " +  idioma.getDisplayLanguage() + " " + idioma.getLanguage());
	}

}
