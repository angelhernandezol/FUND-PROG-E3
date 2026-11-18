/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_20_metodos;

/**
 *
 * @author bisonte
 */
public class EVA3_20_METODOS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      int datos[] = {100, 200, 300, 400, 500, 600 , 700, 800, 900, 1000};
      imprirArreglo(datos);
   }
   public static void imprirArreglo(int[] arreglo){
      for (int i = 0; i < arreglo.length; i++) {
         System.out.print("[" + arreglo[i] + "]");
      }
      System.out.println();
   }
}
