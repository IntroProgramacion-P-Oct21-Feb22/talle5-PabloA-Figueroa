/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
         
        /*Solución que imprima el costo de un pedido de un artículo del cual se 
        tiene la descripción,cantidad que se requiere y el precio unitario. 
        Si la cantidad pedida excede de 50 unidades, se hace un descuento de 15%. */
        
        String nombreProducto ;
        double valorUnidad; 
        double valorCosto ;   
        double valorTotal;
        double descuento; 
        double porcentaje;
       
        
        porcentaje = 15 ;
        System.out.println("Ingrese el nombre del producto");
        nombreProducto = entrada.nextLine() ;
        System.out.println("Ingrese el valor de Unidad");
        valorUnidad = entrada.nextDouble() ;
        System.out.println("Ingrese el costo por unidad");
        valorCosto = entrada.nextDouble() ;
        valorTotal = valorUnidad * valorCosto  ;
        
        if ( valorUnidad > 50 ) {
            descuento = (porcentaje * valorTotal)/100 ;
            valorTotal = valorTotal - descuento; 
        }
        System.out.println("costo total de " + nombreProducto  +" a pagar \n" 
                + valorTotal ) ;
        
        // TODO code application logic here
    }
    
}
