/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_18_metodos;

/**
 *
 * @author bisonte
 */
public class EVA3_18_METODOS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      
      //LLAMAR O INVOCAR EL METODO
      mostrarMensaje("Hola mundo");
      mostrarMensaje("Mauricio Hernandez");
      mostrarMensaje("Dundamentos de las programcion");
      mostrarMensaje("SISTEMAS COMPUTACIONALES  ");
      
      System.out.println();
      
      //METODOS QUE REGRESAN VALORES
      //1. RECUPERAR EL VALOR PARA USARLO DESPUESS
      int resultado = sumar(10, 20);
      System.out.println("Suma de 10 + 20 = " + resultado);
      //2. USARLO DIRECTAMENTE
      System.out.println("Suma de 10 + 20 = " +  sumar(10, 20));
      //3. NO IMPORTA EL VALOR DE RETORNO
      sumar(10, 30);

   }
   //Modificadores, valor de retorno 
                 //DEBE SER UN VERBO INFINITIVO 
                 //VARIAS PALABRAS: iniciar en minusculas, demas en mayusculas
   public static void mostrarMensaje(String mensaje){ //CABECERA
      //CUERPO O IMPLEMENTACIÓN DEL METODO
      System.out.println(mensaje);
      
   }
   
   public static int sumar(int num1, int num2){
      int resultado = num1 + num2;
      
      return resultado;
   }
}
