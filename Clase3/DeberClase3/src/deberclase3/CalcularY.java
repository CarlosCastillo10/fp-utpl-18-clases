/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
    Solución que permita calcular y presentar los valores de X y Y, teniendo 
    como dato de entrada el valor de X y obtener el de Y en base a las 
    siguientes restricciones:
        Si X<0 entonces Y=3*X+10

        Si X>0 entonces Y=X*2+6

        Si X==0 entonces Y=1
*/
package deberclase3;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class CalcularY {
    public static void main(String[] args){
       Scanner entrada = new Scanner(System.in); 
       double x;
       double y;
       
       System.out.printf("INGRESE EL VALOR DE 'X' POR FAVOR\n");
       x = entrada.nextDouble();
       
       if(x < 0){
          y = 3 * x + 10;
          System.out.printf("\nValor de X: %.2f\nValor de Y: %.2f\n",x,y);
       }else{
           if(x == 0){
               y = 1;
               System.out.printf("\nValor de X: %.2f\nValor de Y: %.2f\n",x,y);
           }else{
             y = x * 2 + 10;
               System.out.printf("\nValor de X: %.2f\nValor de Y: %.2f\n",x,y);
           }
       }
       
    }
}
