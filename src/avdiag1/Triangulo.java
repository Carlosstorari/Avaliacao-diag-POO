/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avdiag1;

import static java.lang.Math.pow;

/**
 *
 * @author note
 */
public class Triangulo {
    
    
    public float Area(float base, float altura) {
        return base * altura / 2;   
    }
    
    public float VPerimetro(float[] lados){
        float soma = 0;
        for(int i = 0; i< lados.length; i++){
            soma += lados[i];
        }
        return soma;
    }  
    
}
