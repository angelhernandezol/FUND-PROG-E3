/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_busqueda;
import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA3_9_BUSQUEDA {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      int[] valores = new int[10];
      Scanner capture = new Scanner(System.in);
      int valor;
      boolean salir = true;
      
      for (int i = 0; i < valores.length; i++) {
         valores[i] = (int)(Math.random() * 100);
      }
      
      for (int i = 0; i < valores.length; i++) {
         System.out.print("[" + valores[i] + "]");
      }
      
      System.out.println();
      
      do{
         //Pedir valore
         System.out.println("Introduce el valor a buscar en el arreglo:");
         valor = capture.nextInt();
         capture.nextLine();
         //Buscar 
         for(int i = 0; i < valores.length; i++){
            if(valor == valores[i]){
               System.out.println("Valor encontrado en la posicion: " + i);
               salir = false;
               break;
            }
            
         }
         //Si esta en el arreglo, salir del ciclo 
        
      }while(salir);
      
      System.out.println("------Valor encontrado------");
   }
   
}
