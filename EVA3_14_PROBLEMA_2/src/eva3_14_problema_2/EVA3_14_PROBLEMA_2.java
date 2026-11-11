/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_14_problema_2;

/**
 *
 * @author bisonte
 */
public class EVA3_14_PROBLEMA_2 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      int[] numeros = new int[10];
      int valor_mayor = 0, valor_menor = 99;
      
      for (int i = 0; i < numeros.length; i++) {
         numeros[i] = (int)(Math.random() * 100);
         System.out.print("[" + numeros[i] + "]");
      }
      System.out.println();
      
      for (int i = 0; i < numeros.length; i++) {
         if(numeros[i] > valor_mayor){
            valor_mayor = numeros[i];
         }
         if(numeros[i] <= valor_menor){
            valor_menor = numeros[i];         
         }
      }
      
      System.out.println("El valor mas grande es = " + valor_mayor);
      System.out.println("El valor mas grande es = " + valor_menor);
   }
   
}
