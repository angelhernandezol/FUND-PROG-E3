/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_restaurante;

/**
 *
 * @author bisonte
 */
public class EVA3_7_RESTAURANTE {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      double[] precio = {70.54, 100.50, 50.50, 70.76, 85.09, 80.90, 100.32, 43.32, 90.01, 76.76};
      String[] nombre = {"Tacos", "Pizza", "Papas francesas", "Club Sandwich", "Spaguetti", "Hamburgesa", "Suchi", "Gorditas", "Ensalada Cesar", "Lasagna"};
      
      System.out.println("COMIDAS DISPONIBLES:");
       for(int i = 0; i < nombre.length; i++){
         System.out.println(nombre[i] + " --> $" + precio[i]);
     
      }
   }
   
}
