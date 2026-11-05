/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_captura;
import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA3_6_CAPTURA {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner capture = new Scanner(System.in);
      String nombres[];
      int edad[];
      int cant;
      
      System.out.println("Cantidad de clientes a capturar: ");
      cant = capture.nextInt();
      capture.nextLine();
      
      nombres = new String[cant];
      edad = new int[cant];
     
      for(int i = 0; i < nombres.length; i++){
         System.out.println("Introduce el nombre del cliente: ");
            nombres[i] = capture.nextLine();
            
         System.out.println("Introduce la edad del cliente: ");
            edad[i] = capture.nextInt();
            capture.nextLine();
     
      }
      System.out.println("Datos capturados: ");
      
      for(int i = 0; i < nombres.length; i++){
         System.out.println("Nombre: "+ nombres[i] + ", edad: " + edad[i]);
     
      }
   }
   
}
