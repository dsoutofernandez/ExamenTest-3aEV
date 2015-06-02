/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcd;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author dsoutofernandez
 */

public class MCD {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws IOException {
        int numero1, numero2;
        
        try
        {
            BufferedReader entradaTeclado = new BufferedReader(
                new InputStreamReader(System.in));
            System.out.print("Introduzca el número 1: ");
            numero1 = Integer.parseInt(entradaTeclado.readLine());
            System.out.print("Introduzca el número 2: ");
            numero2 = Integer.parseInt(entradaTeclado.readLine());
        
            Calculo calculo = new Calculo();
            calculo.setNumero1(numero1);
            calculo.setNumero2(numero2);
        
            System.out.println("El MCD de " + calculo.getNumero1() + " y " + 
                    calculo.getNumero2() + " es: " + calculo.obtenerMCD(calculo.getNumero1(),calculo.getNumero2()));

            System.out.println("Resultado del cálculo: " + 
                    calculo.getMensajeResultado());            
        }
        catch (NumberFormatException e) 
        {
            System.out.println("Debe introducir un número válido: " +
                    e.getMessage());
        }
        catch (IOException e)
        {
            System.out.println("Error al introducir datos: " + 
                    e.getMessage());            
        }        
}
    
}
