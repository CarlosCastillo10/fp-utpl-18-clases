/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7;

/**
 *
 * @author Carlos
 */
public class Ejemplo2 {
    public static void main(String[] args){
        
        int suma = 0;
        
        for (int contador = 2; contador <=20; contador += 2){
            suma = suma + contador;
        }
        System.out.printf("%s %d\n","La suma es: ",suma);
    }
    
}
