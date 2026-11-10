/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10_arreglos_multi;

/**
 *
 * @author bisonte
 */
public class EVA3_10_ARREGLOS_MULTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Un arreglo puede tener multiples dimesiones:
         //ARREGLO DE UNA DIMESION
         int datos[] = new int[10];
         
         //ARREGLOS DE DOS DIMESIONES (MATRIZ)
            //FILAS, COLUMNAS                   
         int matriz[][] = new int [3][3];
         /*
         [][][]
         [][][]
         [][][]
         */
         
         for (int i = 0; i < matriz.length; i++) { //FILAS --> (primera dimesion matriz.length)
            
             for (int j = 0; j < matriz[i].length; j++) { //COLUNMAS --> (segunda dimesion numero de fila y largo con matriz.length)
                 
                 matriz[i][j] = (int)(Math.random()* 100);
             } 
        }
         
         
         for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j < matriz[i].length; j++) {
                 System.out.print("[" + matriz[i][j] + "]");
             }
             System.out.println();
        }
         
         
    }
    
}
