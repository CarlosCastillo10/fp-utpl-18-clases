/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Edad {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String cadena_final;
        int edad;
        int suma = 0;
        int contador = 1;   
        cadena_final = String.format("%s\t%s\n", "Edad","Suma");
        while(contador <= 5 ){
            System.out.printf("Ingrese el valor de edad por favor: ");
            edad = entrada.nextInt();
            suma = suma + edad;
            contador = contador + 1; 
            cadena_final = String.format("%s %d\t %d\n",cadena_final,edad,suma);
        }
        System.out.printf("\n%s",cadena_final);
          
        
    }
}
