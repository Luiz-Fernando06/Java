// Leia três números e mostre o menor deles

import java.util.Scanner;

public class MyClass {
    
  public static void main(String args[]) {
      
    Scanner s = new Scanner(System.in);
    
    System.out.println("Digite um número: ");
    int x = s.nextInt();
    
    System.out.println("Digite um número: ");
    int y = s.nextInt();
    
    System.out.println("Digite um número: ");
    int z = s.nextInt();

    if (x < y && x < z) {
        System.out.println("Menor: " + x);
        
    } else if (y < x && y < z) {
        System.out.println("Menor: " + y);

    } else if (z < x && z < y){
        System.out.println("Menor: " + z);

    }
    
  }
}
