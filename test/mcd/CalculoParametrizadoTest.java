/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcd;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author dsoutofernandez
 */

   @RunWith(Parameterized.class)
public class CalculoParametrizadoTest {
    
    private double result;
    private Calculo mod = new Calculo();
    
    
   @Before
   public void initialize() {
   
   
   }

    public CalculoParametrizadoTest(Calculo mod,double result) {
      this.mod = mod;
      this.result = result;
   }

    /*
    *Bateria de 4 tests
    */ 

   @Parameterized.Parameters
   public static Collection primeNumbers() {
      return Arrays.asList(new Object[][] {
         { new Calculo (2,2),2},
         { new Calculo(3,1),2}, //este es erroneo a proposito como prueba
         { new Calculo (4,8),4},
         { new Calculo (6,12),6}
         
      });
   }

   // This test will run 4 times since we have 5 parameters defined
   @Test
   public void testPrimeNumberChecker() {
      System.out.println("Parameterized Number is : " +result);
      assertEquals(result,mod.obtenerMCD(mod.getNumero1(),mod.getNumero2()),0.1);
   }
} 
