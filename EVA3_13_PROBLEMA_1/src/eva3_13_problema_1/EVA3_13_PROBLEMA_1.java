/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_problema_1;
import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA3_13_PROBLEMA_1 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      int[] numeros = new int[10];
      Scanner capture = new Scanner(System.in);
      int valor, n = 0;

      for (int i = 0; i < numeros.length; i++) {
         numeros[i] = (int)(Math.random() * 10);
         System.out.print("[" + numeros[i] + "]");
      }
      System.out.println();
      
      System.out.println("Ingrese el valor a contar: ");
         valor = capture.nextInt();
      
      for (int i = 0; i < numeros.length; i++) {
         if(valor == numeros[i]){
            n++;
         }
         
      }
      System.out.println("El numero ingresado se repite: " + n + " veces");
   }
   
}
