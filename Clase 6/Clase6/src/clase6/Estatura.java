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
public class Estatura {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String cadena_final;
        double promedio_estatura;
        double suma_estatura = 0;
        double estatura;
        double estatura_minima = 1.20;
        boolean verificar = true;
        int contador = 0;
        cadena_final = String.format("%s\n", "Reporte de estaturas");
        System.out.printf("INGRESO DE ESTATURAS DE LOS ESTUDIANTES\n");
       
        while(verificar){
            System.out.printf("\n\tIngrese la estatura numero %d: ", contador);      
            estatura = entrada.nextDouble();
            if (estatura < estatura_minima){
                estatura = estatura_minima;    
           }
            suma_estatura = suma_estatura + estatura;
             cadena_final = String.format("%s %.2f\n",cadena_final,estatura);
            entrada.nextLine();
            contador = contador + 1;
            System.out.printf("\nDesea ingresar mas estaturas?\n");
            System.out.printf("Ingrese no(SALIR): ");
            String respuesta = entrada.nextLine();
            
            if (respuesta.equals("no")){
                verificar = false;
            }
            
        }
        promedio_estatura = suma_estatura / contador;
        System.out.printf("\n%s",cadena_final);
        System.out.printf("Promedio estaturas: %.2f\n", promedio_estatura);
        System.out.printf("Reporte generado por Dep. Deportes\n");
    }
}
