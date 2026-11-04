/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_arreglos;

/**
 *
 * @author bisonte
 */
public class EVA3_1_ARREGLOS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      //un arreglo es una estructura de datos
      //ES UNA SECUENCIA DE VALORES
      //TODOS LOS DATOS SON DEL MISMO TIPO
      //NO CAMBIA DE TAMAÑO (INMUTABLE)
      //EL ACCESO ES POR INDICES (ACCESO ALEATORIO)
      
      int [] arreglo; //Solo se declara el arreglo, aun no existe 
      //especificar el tamaño 
      arreglo = new int[10]; //a partir de aqui, importa conocer el tamaño de los datos 
      //int[] arreglo = new int[10]; --> una sola linea 
      
      //ACESO POR INDICES 
      //EN JAVA EL PRIMER ELEMENTO ESTÁ EN LA PÓSICIÓN CERO 0
      //EL ULTIMO ES LA POSICIÓN N - 1, DONDE N ES LA CANTIDAD DE ELEMENTOS 
      //0 1 2 3 4 5 6 7 8 9
      arreglo[0] = 100; 
      arreglo[1] = 200; 
      arreglo[2] = 300; 
      arreglo[3] = 400; 
      arreglo[4] = 500; 
      arreglo[5] = 600; 
      arreglo[6] = 700; 
      arreglo[7] = 800; 
      arreglo[8] = 900; 
      arreglo[9] = 1000; 
      
      System.out.println("arreglo[0] = " + arreglo[0]);
      System.out.println("arreglo[0] = " + arreglo[1]);
      System.out.println("arreglo[0] = " + arreglo[2]);
      System.out.println("arreglo[0] = " + arreglo[3]);
      System.out.println("arreglo[0] = " + arreglo[4]);
      System.out.println("arreglo[0] = " + arreglo[5]);
      System.out.println("arreglo[0] = " + arreglo[6]);
      System.out.println("arreglo[0] = " + arreglo[7]);
      System.out.println("arreglo[0] = " + arreglo[8]);
      System.out.println("arreglo[0] = " + arreglo[9]);
      
      
     
   }
   
}
