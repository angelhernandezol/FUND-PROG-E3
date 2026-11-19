/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_22_areas;
import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA3_22_AREAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner capture =  new Scanner(System.in);
        
        System.out.println("Seleccione figura:");
        System.out.println("    1. Circulo");
        System.out.println("    2. Triangulo");
        System.out.println("    3. Rectangulo");
        
        int val = capture.nextInt();
        capture.nextLine();
        
        switch (val) {
            case 1:
                System.out.println("Ingrese radio: ");
                double radio = capture.nextDouble();
                System.out.println("La areal del circulo es = " + areaCirculo(radio));
                
                break;
            case 2:
                System.out.println("Ingrese base: ");
                double base = capture.nextDouble();
                System.out.println("Ingrese altura: ");
                double altura = capture.nextDouble();
                
                System.out.println("La areal del triangulo es = " + areaTrinagulo(base, altura)); 
                break;
            case 3:
                System.out.println("Ingrese lado: ");
                double lado = capture.nextDouble();
                System.out.println("Ingrese segundo lado: ");
                double lado2 = capture.nextDouble();
                
                System.out.println("La areal del triangulo es = " + areaRectangulo(lado, lado2)); 
                break;
            default:
                System.out.println("Opcion invalida");
        }
    }
    
    public static double areaCirculo(double radio){
    double resultado = Math.PI * (Math.pow(radio, 2));
            
    return resultado;
    }
    
    public static double areaTrinagulo(double base, double altura){
    double resultado = base * altura * 0.5;
            
    return resultado;
    }
    
    public static double areaRectangulo(double lado, double lado2){
    double resultado = lado * lado2;
    
    return resultado;
    }
}
