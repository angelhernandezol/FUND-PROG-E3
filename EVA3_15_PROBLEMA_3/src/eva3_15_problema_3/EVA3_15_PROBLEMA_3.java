/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_15_problema_3;

/**
 *
 * @author bisonte
 */
public class EVA3_15_PROBLEMA_3 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
     int matriz[][] = new int [5][5];
     
     for (int i = 0; i < matriz.length; i++) { 
             for (int j = 0; j < matriz[i].length; j++) { 
                 matriz[i][j] = (int)(Math.random()* 100);
             } 
      }
     
     
      for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j < matriz[i].length; j++) {
                 System.out.print("[" + matriz[i][j] + "]");
             }
             System.out.println();
      }
   
      System.out.println();
      
      
      for (int i = (matriz.length - 1); i >= 0; i--) {
             for (int j = (matriz[i].length - 1); j >= 0; j--) {
                 System.out.print("[" + matriz[i][j] + "]");
             }
             System.out.println();
      }
      
      
   }
   
  
}
