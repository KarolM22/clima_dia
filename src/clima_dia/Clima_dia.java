/*
 * 3.El sistema meteorológico local requiere un sistema para capturar la 
temperatura promedio de cada día de la semana e imprimir el nombre del día y un mensaje
de la percepción de la temperatura de acuerdo con el valor capturado según la siguiente tabla:

Temperatura	Mensaje
Menor o igual que cero	Congelante
1 a 10°C	Muy frío
11 a 20°C	Frío
21 a 24°C	Templado
25 a 29°C	Agradable
30 a 35°C	Caliente
36°C o más	Muy caliente

 */
package clima_dia;

import java.util.Scanner;

/**
 *
 * Karol Martinez Cuellar
 */
public class Clima_dia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        int temp;
        String [][] dia  = new String [7][2];
        dia [0][0] = "LUNES";dia [1][0] = "MARTES";dia [2][0] = "MIERCOLES";
        dia [3][0] = "JUEVES";dia [4][0] = "VIERNES";dia [5][0] = "SABADO";dia [6][0] = "DOMINGO";
        
        for (int c=0;c<=6; c++){
           
            //C = CONTADOR DEL FOR 
            System.out.println("DIGITE LA TEMPERATURA DEL DIA "+dia[c][0]);
            temp=leer.nextInt();
            
            if (temp <= 0) {
               
                dia [c][1] = " CONGELANTE ";
            } else {
                if ((temp >= 1) && (temp <= 10)) {
               
                dia [c][1] = " MUY FRIO ";
            } else {
                    if ((temp >= 11) &&( temp <= 20)) {
               
                dia [c][1] = " FRIO ";
            } else {
                        if ((temp >= 21) && (temp <= 24)) {
               
                dia [c][1] = " TEMPLADO ";
            } else {
                            if ((temp >= 25) &&( temp <= 29)) {
               
                dia [c][1] = " AGRADABLE ";
            } else {
                                if ((temp >= 30) &&( temp <= 35)) {
                
                dia [c][1] = " CALIENTE ";
            } else { 
                                    if (temp> 36) {
               
                dia [c][1] = " MUY CALIENTE ";
            }
              }
                            }
                        }
                    }
                }
            }
                            
            
        }
        for (int F=0;F<=6; F++){
            System.out.println("-------------------------------------------");
             System.out.println("EL DIA: "+dia[F][0]); 
             System.out.println("SU TEMPERATURA ES: "+dia[F][1]);
        }
    }
    
}
    

