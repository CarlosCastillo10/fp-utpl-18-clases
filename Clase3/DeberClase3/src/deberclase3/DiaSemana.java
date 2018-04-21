/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
    Una solución que permia leer el número de día (un valor entre 1 y 7) e 
    imprima Lunes si es 1, Martes si es 2, ... , Domingo si es 7.
*/
package deberclase3;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class DiaSemana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        System.out.printf("INGRESE UN NUMERO POR FAVOR:\n");
        numero = entrada.nextInt();
        
        switch(numero){
            
            case 1:
                System.out.printf("El número: %d\nCorresponde al dia: %s\n",numero, "Lunes");
                break;
                
            case 2:
                System.out.printf("El número: %d\nCorresponde al dia: %s\n",numero, "Martes");
                break;
                
            case 3:
                System.out.printf("El número: %d\nCorresponde al dia:%s",numero, "Miércoles");
                break;
                
            case 4:
                System.out.printf("El número: %d\nCorresponde al dia: %s\n",numero, "Jueves");
                break;
                
            case 5:
                System.out.printf("El número: %d\nCorresponde al dia: %s\n",numero, "Viernes");
                break;
                
            case 6:
                System.out.printf("El número: %d\nCorresponde al dia: %s\n",numero, "Sábado");
                break;
                
            case 7:
                System.out.printf("El número: %d\nCorresponde al dia: %s\n",numero,"Domingo");
                break;
                
            default:
                System.out.printf("El número ingresado no corresponde a ningún dia de la semana\n");
        }
    }
    
}
