/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
         
        /*Solución que permita calcular y mostrar el valor a cancelar de una planilla de luz. 
        Se debe ingresar el valor de costo por kilovatio/hora y el número de kilovatios consumidos en el mes. 
        Si el usuario tiene edad mayor a 65 años, se debe descontrar el 10%. */
        
        double valorkilovatio ;
        double valorHoras; 
        int edad;   
        double valorTotal;
        double descuento; 
        double porcentaje;
        double valorTotalD ;
        
        porcentaje = 10 ;
        System.out.println("Ingres su edad");
        edad = entrada.nextInt () ;
        System.out.println("Ingrese los kilovatios consumidos");
        valorkilovatio = entrada.nextDouble() ;
        System.out.println("Ingrese el numero de Horas consumidas");
        valorHoras = entrada.nextDouble() ;
        
        valorTotal = valorHoras * valorkilovatio ;
        
        if (edad > 65 ) {
            descuento = (porcentaje * valorTotal)/100 ;
            valorTotalD = valorTotal - descuento; 
             System.out.println("costo total a pagar es 1 \n" + valorTotalD );
        }
        else 
        System.out.println("costo total a pagar es \n" + valorTotal ) ;
        
                
    }
    
}
