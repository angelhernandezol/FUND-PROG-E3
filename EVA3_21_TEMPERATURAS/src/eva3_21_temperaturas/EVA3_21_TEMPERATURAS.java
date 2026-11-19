/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_21_temperaturas;
import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA3_21_TEMPERATURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double centi = capturarTemp("Calcular grados Centrigrados: ");
        
        
        System.out.println(centi + " C - " + convertirCaF(centi) + " F");
        System.out.println(centi + " C - " + convertirCaK(centi) + " K");
        
        System.out.println();
        
        double fahrenheit = capturarTemp("Calcular grados Fahrenheit: ");
        System.out.println(fahrenheit + " F - " + convertirFaC(fahrenheit) + " C");
        
        
    }
    
    public static double convertirCaF(double centi){
        double resu = centi * 1.8 + 32; 
        
    return resu;
    }
    
    public static double convertirFaC(double fahrenheit){
        double resu = (fahrenheit - 32) * (5/9.0);
        
    return resu;
    }
    
    public static double convertirCaK(double kel){
        double resu = kel + 273.15; 
        
    return resu;
    }
    
    public static double capturarTemp(String mensaje){
        Scanner capture =  new Scanner(System.in);
        
        System.out.println(mensaje);
        double valor = capture.nextDouble();
        
        return valor; 
    }
}
