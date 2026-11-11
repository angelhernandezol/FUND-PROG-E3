/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_17_problema_5;
import java.util.Scanner;

/**
 *
 * @author Mauricio
 */
public class EVA3_17_PROBLEMA_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] ciudades = new String[9][8];
        Scanner capture = new Scanner(System.in);
        String tem1;
        double prom = 0, temp_final;
        
        ciudades[0][0] = "CIUDAD           ";
        ciudades[1][0] = "Chihuahua        ";
        ciudades[2][0] = "Ciudad de Mexico ";
        ciudades[3][0] = "Cancun           ";
        ciudades[4][0] = "Paris            ";
        ciudades[5][0] = "Monterrey        ";
        ciudades[6][0] = "Tokio            ";
        ciudades[7][0] = "Londres          ";
        ciudades[8][0] = "Barcelona        ";
       
        ciudades[0][1] = "Tem. Dia 1";
        ciudades[0][2] = "Tem. Dia 2";
        ciudades[0][3] = "Tem. Dia 3";
        ciudades[0][4] = "Tem. Dia 4";
        ciudades[0][5] = "Tem. Dia 5";
        ciudades[0][6] = "Tem. Dia 6";
        ciudades[0][7] = "Tem. Dia 7";
       
        
        for (int i = 1; i < ciudades.length; i++) {
            System.out.println(">> Temperatura para " + ciudades[i][0]);
            for (int j = 1; j < ciudades[i].length; j++) {
                 System.out.println("    Ingrese " + ciudades[0][j]);
                 tem1 = capture.nextLine();
                 
                 ciudades[i][j] = tem1;
            }
        }
        System.out.println();
        
        for (int i = 0; i < ciudades.length; i++) {
            for (int j = 0; j < ciudades[i].length; j++) {
                System.out.print("[" + ciudades[i][j] + "]");
            }
            System.out.println();
        }
        
        System.out.println();
           System.out.println("<<<<PROMEDIO DE TEMPERATURA DE CIUDADES>>>>>");
        
         for (int i = 1; i < ciudades.length; i++) {
            prom = 0;   
            
            for (int j = 1; j < ciudades[i].length; j++) {
                
                prom += Double.valueOf(ciudades[i][j]);
            }
            
            temp_final = prom / (ciudades[i].length - 1);
            System.out.println("El promedio de temperatura de " + ciudades[i][0]);
                System.out.println(temp_final + " Grados");
                
            System.out.println();
        }
        
    }
    
}
