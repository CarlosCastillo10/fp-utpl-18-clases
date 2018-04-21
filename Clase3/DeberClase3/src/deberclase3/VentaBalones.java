/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
    En una empresa dedicada a la venta de balones, si se compra uno se hace un 
    descuento de 50%, si se compra 2 descuento de 70%, se compra 3 o más se 
    descuenta 80%. Generar la solución que permita presentar el número de 
    balones a comprar, el precio de cada balón y el valor final a cancelar.
*/
package deberclase3;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class VentaBalones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int cantidadbal;
        double destotal;
        double destipo1 = 0.5;
        double destipo2 = 0.7;
        double destipo3 = 0.8;
        double valorbal = 7.20;
        double subtotal;
        double total;
        
        System.out.printf("INGRESE SU NOMBRE Y APELLIDO POR FAVOR\n");
        nombre = entrada.nextLine();
        
        System.out.printf("INGRESE LA CANTIDAD DE BALONES QUE DESES COMPRAR\n");
        cantidadbal = entrada.nextInt();
        
        if(cantidadbal == 1){
            subtotal = valorbal * cantidadbal;
            destotal = subtotal * destipo1;
            total = subtotal - destotal;
            System.out.printf("\nNombre: %s\nCantidad de balones: %d\nValor por "
                    + "cada balon: %.2f\nTotal a pagar: %.2f\n",nombre,cantidadbal,
                    valorbal,total);
        }else{
            if(cantidadbal == 2){
                subtotal = valorbal * cantidadbal;
                destotal = subtotal * destipo2;
                total = subtotal - destotal;
                System.out.printf("\nNombre: %s\nCantidad de balones: %d\nValor por "
                    + "cada balon: %.2f\nTotal a pagar: %.2f\n",nombre,cantidadbal,
                    valorbal,total);
            }else{
                subtotal = valorbal * cantidadbal;
                destotal = subtotal * destipo3;
                total = subtotal - destotal;
                System.out.printf("\nNombre: %s\nCantidad de balones: %d\nValor por "
                    + "cada balon: %.2f\nTotal a pagar: %.2f\n",nombre,cantidadbal,
                    valorbal,total);
            }
            
        }
        
        
        
    }
}
