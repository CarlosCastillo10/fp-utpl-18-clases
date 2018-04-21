/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
                    CONVERTIDOR DE GRADOS CELCIUS - FAHRENHEIT
    Generar la solución que permita obtener por parte de usuario el tipo de 
    conversión que desea realizar y posterior presentación del resultado 
    requerido.
*/
package deberclase3;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class ConvertidorGrados {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double celcius;
        double fahrenheit;
        double resultado;
        int opcion;
        
        System.out.printf("\t1.Grados Celcius a Grados Fahrenheit\n\t2"
                + ".Grados Fahrenheit a Grados Celcius\nESCOJA UNA OPCION: ");
        opcion = entrada.nextInt();
        
        switch(opcion){
            case 1:
                System.out.printf("\nINGRESE EL VALOR DE GRADOS CELCIUS: ");
                celcius = entrada.nextDouble();
                
                fahrenheit = (celcius * 9/5)+ 32;
                
                System.out.printf("GRADOS FAHRENHEIT: %.2f\n",fahrenheit);
            break;
            
            case 2:
                System.out.printf("\nINGRESE EL VALOR DE GRADOS FAHRENHEIT: ");
                fahrenheit = entrada.nextDouble();
                
                celcius = (fahrenheit - 32) * 5/9;
                
                System.out.printf("GRADOS CELCIUS: %.2f\n",celcius);
            break;
            
            default:
                System.out.printf("ERROR: Opcion Incorrecta\n");
                
        }
    }
    
}
