/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_11_arreglo_multi_2;

/**
 *
 * @author bisonte
 */
public class EVA3_11_ARREGLO_MULTI_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int cubo[][][] = new int [2][3][4]; //24 ENTEROS
         
         for (int i = 0; i < cubo.length; i++) { //1er dimesion
             for (int j = 0; j < cubo[i].length; j++) { //2da dimesion
                 for (int k = 0; k < cubo[i][j].length; k++) { //3era dimesion
                     cubo[i][j][k] = (int)(Math.random() * 100);
                     
                 }
             }
        }
        //COMO MOSTRAMOS LOS VALORES 
         for (int i = 0; i < cubo.length; i++) {
             for (int j = 0; j < cubo[i].length; j++) {
                 for (int k = 0; k < cubo[i][j].length; k++) {
                     System.out.print("[" + cubo[i][j][k] + "]");
                     
                 }
                 System.out.println();
             }
             System.out.println();

        }
         
    }
    
}
