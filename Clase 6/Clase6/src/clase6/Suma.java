/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;

/**
 *
 * @author Carlos
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suma = 0;
        int contador = 1;
        System.out.printf("%s\t%s\n","Contador","Suma");
        while(contador <= 4){
            suma = suma + contador;
           System.out.printf("   %d\t\t %d\n",contador,suma);
            contador = contador + 1;        
        }
    }
    
}
