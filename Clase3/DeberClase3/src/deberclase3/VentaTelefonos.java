/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
     Una empresa dedicada a vender teléfonos celulares, en base a las siguientes
     consideraciones:

	- Si el cliente es de tipo 1 se le descuenta 10%

	- Si el cliente es de tipo 2 se le descuenta 20%

	- Si el cliente es de tipo 3 se le descuenta 30%
*/
package deberclase3;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class VentaTelefonos {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       String nombre;
       int tipocli;
       int cantidadcel;
       double destipo1 = 0.1;
       double destipo2 = 0.2;
       double destipo3 = 0.3;
       double descuento;
       double subtotal;
       double total;
       double valorcel = 285;
       
       System.out.printf("INGRESE NOMBRE Y APELLIDO POR FAVOR\n");
       nombre = entrada.nextLine();
       
       System.out.printf("INGRESE EL TIPO DE CLIENTE AL QUE CORRESPONDE\n");
       tipocli = entrada.nextInt();
       
       System.out.printf("INGRESE CANTIDIDAD DE TELEFONOS QUE DESEA COMPRAR\n");
       cantidadcel = entrada.nextInt();
       
       switch(tipocli){
           case 1:
               subtotal = valorcel * cantidadcel;
               descuento = subtotal * destipo1;
               total = subtotal - descuento;
               System.out.printf("\nNombre: %s\nTipo de cliente: %d\nCantidad de "
                       + "Celulares: %d\nValor por cada Celular: %.2f\nSubotal a"
                       + " pagar: %.2f\nDescuento: %.2f\nValor a pagar: %.2f\n"
                       ,nombre,tipocli,cantidadcel,valorcel,subtotal,descuento,
                       total);
            break;
            
            case 2:
               subtotal = valorcel * cantidadcel;
               descuento = subtotal * destipo2;
               total = subtotal - descuento;
               System.out.printf("\nNombre: %s\nTipo de cliente: %d\nCantidad de "
                       + "Celulares: %d\nValor por cada Celular: %.2f\nSubotal a"
                       + " pagar: %.2f\nDescuento: %.2f\nValor a pagar: %.2f\n"
                       ,nombre,tipocli,cantidadcel,valorcel,subtotal,descuento,
                       total);
            break; 
            
            case 3:
               subtotal = valorcel * cantidadcel;
               descuento = subtotal * destipo3;
               total = subtotal - descuento;
               System.out.printf("\nNombre: %s\nTipo de cliente: %d\nCantidad de "
                       + "Celulares: %d\nValor por cada Celular: %.2f\nSubotal a"
                       + " pagar: %.2f\nDescuento: %.2f\nValor a pagar: %.2f\n"
                       ,nombre,tipocli,cantidadcel,valorcel,subtotal,descuento,
                       total);
            break; 
            
            default:
                System.out.print("\nERROR:  Tipo de cliente incorrecto\n\tPor favor "
                        + "ingresar entre 1 y 3\n");
       }
       
               
       
       
    }
        
        
    
}
