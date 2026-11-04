/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_arreglos;

/**
 *
 * @author bisonte
 */
public class EVA3_2_ARREGLOS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      //int[] arreglo, x, y;  TODOS SON ARREGLOS
      //int arreglo[], x, y; SOLO HAY UN ARREGLO
      
      int arreglo[], x, y; 
      arreglo = new int[10]; 
      
      
      //arreglo[10] = 100; el indice es incorrecto, 10 no es una posición valida (lleaga hasta 9)
      
      //EL USO DE ARREGLOS VA LIGADO AL USO DE CICLOS 
      //EN PARTICULAR EL CICLO FOR 
      
      for(int i = 0; i < 10; i++){
         arreglo[i] =(int)(Math.random() * 100); //CASTING --> COMPATIBLES
         
      }
      System.out.println();
      
      for(int i = 0; i < 10; i++){
         System.out.print(arreglo[i]+ " - ");      
      }
      
      
   }
   
}
