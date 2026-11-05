/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_menu;

/**
 *
 * @author bisonte
 */
public class EVA3_4_MENU {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      String [] menu = {"Tacos", "Tortas", "Tamales", "Tlacoyos", "Tlayudas", "Pizza"};
      
      System.out.println("Cantidad de elementos del arreglo: " + menu.length);
      
      for(int i = 0; i < menu.length; i++){
         System.out.println(menu[i]);
      
      }
   }
   
}
