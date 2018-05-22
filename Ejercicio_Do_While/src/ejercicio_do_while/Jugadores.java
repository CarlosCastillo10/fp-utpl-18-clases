/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* 
    PROGRAMA QUE PERMITE GENERAR REPORTE DE CUALQUIER CANTIDAD DE JUGADORES
*/
package ejercicio_do_while;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Jugadores {
    public static void main(String[] args){
            // Importamos el metodo Scanner.
            Scanner entrada = new Scanner(System.in);
            
            //Variables globales
            String nombre_jugador;
            String cadena;
            String nombre_temporal = ""; // Variable que permite llenar los espacion en blanco.
            String respuesta;
            int pases;
            int goles;
            int total_pases;
            int total_goles;
            int total_partidos = 4;
            int cont_jugadores = 0;
            int cont_partidos; 
            double promedio_pases = 0;
            double promedio_goles = 0;
            double promedio_pases_finales;
            double promedio_goles_finales;
            
            //Valor inicial que toma la variable 'cadena'
            cadena = String.format("\n----------------------------------------------------------------------------------\n%50s\n\n%-25s%-20s%-20s%-20s\n"
                    + "","Reporte de Jugadores del Equipo 'UTPL'","Nombre del Jugador","Total de","Pases","Total Goles","Nivel del Jugador");
            
            //Ciclo Repetitivo principal(do-while). 
            do{
                       cont_jugadores = cont_jugadores + 1;//Contador del numero de jugadores ingresados.
                       total_pases = 0;
                       total_goles = 0;
                       System.out.printf("\n%25s\n","REGISTRO DE JUGADORES");
                       System.out.printf("\n%s %d\n","Jugador",cont_jugadores);
                       System.out.printf("\t%s", "Nombre: ");
                       nombre_jugador = entrada.nextLine().toUpperCase();//to.UpperCase() convierte en mayusculas toda la cadena ingresada.
                        
                       //Primera Concatenacion de la variable 'cadena'.
                       cadena = String.format("%s\n%-25s",cadena, nombre_jugador);
                       
                       //Ciclo Repetitivo interno(do-while) que permite ingresar todos los detalles del partido de cada jugador.
                       cont_partidos = 0;
                       do{
                                  cont_partidos = cont_partidos + 1;//Contador que controla la cantidad de partidos y permitira la salida del ciclo.
                                  System.out.printf("\n%s %d\n","Partido",cont_partidos );
                                  System.out.printf("\t%s","Cantidad Pases: ");
                                  pases = entrada.nextInt();
                                  
                                  System.out.printf("\t%s","Cantidad Goles: ");
                                  goles = entrada.nextInt();
                                  
                                  //Segunda Concatenacion de la variable 'cadena'
                                  cadena = String.format("%s%s%d: %-16d%s%d: %d\n%-25s",cadena,"P",cont_partidos,pases,"P",cont_partidos,goles,
                                          nombre_temporal);
                                  
                                  //Calculo del total de pases y goles de cada jugador
                                  total_pases = total_pases + pases;
                                  total_goles = total_goles + goles;
                                 
                                  entrada.nextLine(); //Limpiador de Scanner.
                       }while (cont_partidos < total_partidos);   //Cierre del ciclo(Cuando la condicion sea falsa.). 
                       
                       System.out.printf("\n------------------------------------\n");
                       
                       //Tercera Concatenacion de la variable 'cadena'
                       cadena = String.format("%s\n%30s: %-13d%s: %-13d",cadena,"Total",total_pases,"Total",total_goles);
                       
                       //Condicion que determine el nivel de cada jugador
                       if (total_pases >= 100){
                           
                                    //Quinta Concatenacion de la variable 'cadena'.
                                   cadena = String.format("%s%s\n----------------------------------------------------------------------------------\n",cadena,"Excelente");
                       }else{
                                  if (total_pases >= 80 && total_pases <= 90){
                                             //Quinta Concatenacion de la variable 'cadena'.
                                             cadena = String.format("%s%s\n----------------------------------------------------------------------------------\n",cadena,
                                                     "Muy Bueno");
                                  }else{
                                             if (total_pases >= 60 && total_pases <= 79){
                                                        //Quinta Concatenacion de la variable 'cadena'.
                                                        cadena = String.format("%s%s\n----------------------------------------------------------------------------------\n",cadena
                                                                ,"Bueno");
                                             }else{
                                                        //Quinta Concatenacion de la variable 'cadena'.
                                                        cadena = String.format("%s%s\n----------------------------------------------------------------------------------\n",cadena
                                                                ,"Regular");
                                             }
                                  }
                       }
                       
                       //Sentencia que determina si se continua repitiendo el ciclo o sale del mismo.
                       System.out.printf("\nIngrese 'si' para --->%s\nIngrese 'no' para --->%s\n"," Nuevo Jugador","Salir");
                       System.out.printf("\nEscriba su respuesta: ");
                       respuesta = entrada.nextLine().toUpperCase();//Convierte en mayusculas la respuesta.
                       System.out.printf("\n------------------------------------\n");
                       
                       //Suma del total de pases y goles de todos los jugadores registrados.
                       promedio_pases = promedio_pases + total_pases;
                       promedio_goles = promedio_goles + total_goles;
            }while(respuesta.equals("SI"));//En caso que la respuesta ingresada por el usuario sea (SI) continuara en el ciclo caso contrario saldra del mismo.
             
            //Calculo del promedio de pases y goles de todo el equipo.
            promedio_pases_finales = promedio_pases / total_partidos;
            promedio_goles_finales = promedio_goles / total_partidos;
            
            //Concatenacion Final de la variable 'cadena'
            cadena = String.format("%s%s\n%d %s\n%s %.2f\n%s %.2f\n",cadena,"Datos Finales:",cont_jugadores,"Jugadares analizados",
                    "Promedio de pases del equipo es", promedio_pases_finales, "Promedio de goles del equipo es",promedio_goles_finales);
            
            //Presenta en pantalla todo lo que contiene la variable 'cadena'.
            System.out.printf("%s\n",cadena);
    }
    
}
