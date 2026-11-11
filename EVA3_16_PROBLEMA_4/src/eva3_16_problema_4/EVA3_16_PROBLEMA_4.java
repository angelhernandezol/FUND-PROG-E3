/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_16_problema_4;
import java.util.Scanner;

/**
 *
 * @author Mauricio
 */
public class EVA3_16_PROBLEMA_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [][] asistencia = new String[4][6];
        Scanner capture = new Scanner(System.in);
        int asis;
        
        asistencia[0][0] = "    /   ";
        asistencia[1][0] = "Alumno 1";
        asistencia[2][0] = "Alumno 2";
        asistencia[3][0] = "Alumno 3";
        
        asistencia[0][1] = " Lunes     ";
        asistencia[0][2] = " Martes    ";
        asistencia[0][3] = " Miercoles ";
        asistencia[0][4] = " Jueves    ";
        asistencia[0][5] = " Viernes   ";
        
        
        
            
        for (int i = 1; i < asistencia.length; i++) { 
            System.out.println(">> Asistencia para estudiante " + i + "...");
                
            for (int j = 1; j < (asistencia[i].length); j++) {
              
            System.out.println("    Ingrese asistencia del dia " + asistencia[0][j] + " (Asisistio = 1/No Asistio = 0):");
                asis = capture.nextInt();   
                
                asistencia[i][j] = "     " + asis + "     ";
            }
            System.out.println();
        }
        
        for (int i = 0; i < asistencia.length; i++) {
            for (int j = 0; j < asistencia[i].length; j++) {              
                
                System.out.print("[" + asistencia[i][j] + "]");
            }
            System.out.println();
        }
    
    }
}   