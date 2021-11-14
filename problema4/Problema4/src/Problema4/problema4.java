/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*En una hosteria de la ciudad de Loja se hace un descuento del 10% 
        si el cliente se hospeda más de 5 días, del 15% si se hospeda más de 10
        días y del 20% si se hospeda más de 15 días. Elaborar un solución que 
        pida como datos de entrada el número de días y el precio diario 
        de la habitación y luego calcule e imprima el subtotal 
        por pagar, el descuento y el total por pagar.*/
        Scanner entrada = new Scanner (System.in);
        
        int numeroDias;
        double precioDias;
        double porcentaje1;
        double porcentaje2;
        double porcentaje3;
        double descuento;
        double descuento2;
        double descuento3;
        double totalpagar;
        double subTotal;

       
        porcentaje1 = 10;
        porcentaje2 = 15;
        porcentaje3 = 20;    
        
        System.out.println("Ingres los dias de hospedaje");
        numeroDias = entrada.nextInt () ;
        System.out.println("Ingrese el valor por dai de hospedaje");
        precioDias = entrada.nextDouble() ;
        totalpagar = numeroDias * precioDias; 
        subTotal = numeroDias * precioDias; 
        
        if (numeroDias <0){
        subTotal = 0;
        totalpagar = 0;
        }
        if (numeroDias>=5 && numeroDias<10){
        descuento = (porcentaje1 * totalpagar)/100 ;
        totalpagar = totalpagar - descuento ;
        } else {
         
        if (numeroDias>=10 && numeroDias<15){
        descuento2 = (porcentaje2 * totalpagar)/100 ;
        totalpagar = totalpagar - descuento2 ;
        } }
        
       
        if (numeroDias>= 15){
        descuento3 = (porcentaje3 * totalpagar)/100 ;
        totalpagar = totalpagar - descuento3 ;
                
        }
        System.out.println("Total a pagar es:" + subTotal);
        System.out.println("Total a pagar con descuento es:" + totalpagar);
    }
    
}
