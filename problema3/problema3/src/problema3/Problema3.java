/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        /* Elaborar una solución que permita leer los datos de un automóvil 
       (marca, origen y costo) imprima el impuesto por pagar y el precio de 
        venta (incluido el impuesto). Si el origen es Alemania el impuesto es 
        20%, si es de Japón el impuesto es 30%, si es de Italia, 15%, y si es 
        de USA, 8%*/
        
        String origen ;
        double valorUnidad; 
        double valorCosto ;   
        double valorTotal;
        double descuento; 
        double porcentaje;
        double porcentaje2;
        double porcentaje3;
        double porcentaje4;
         
        porcentaje = 20 ;
        porcentaje2 = 30 ;
        porcentaje3 = 15 ;
        porcentaje4 = 8 ;
        
        System.out.println("Ingrese el pais de origen del automovil");
        origen = entrada.nextLine() ;
        System.out.println("Ingrese el valor del automvil");
        valorUnidad = entrada.nextDouble() ;
        System.out.println("Ingrese el costo del automvil");
        valorCosto = entrada.nextDouble() ;
        valorTotal = valorUnidad * valorCosto  ;
        
        if (origen.equals("Alemania")) {
            descuento = (porcentaje * valorTotal)/100 ;
            valorTotal = valorTotal - descuento; }
        
        if (origen.equals("Japon")) {
             descuento = (porcentaje2 * valorTotal)/100 ;
            valorTotal = valorTotal - descuento; }
        
        if (origen.equals("USA"))  {
             descuento = (porcentaje4 * valorTotal)/100 ;
            valorTotal = valorTotal - descuento; }
        
        if (origen.equals("Italia") ) {
             descuento = (porcentaje3 * valorTotal)/100 ;
            valorTotal = valorTotal - descuento; } 
        
        System.out.println("Precio total del vehiculo de " + origen + " es: \n" 
                + valorTotal) ;
        
    }
    
}
