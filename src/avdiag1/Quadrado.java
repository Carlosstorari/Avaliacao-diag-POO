/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avdiag1;

import static java.lang.Math.pow;

/**
 *
 * @author ht3000711
 */
public class Quadrado{
    
    private float perimetro;
    private float area;

    
    public float Area(float valorLado) {
        return (float) pow(valorLado,2);   
    }
    
    public float VPerimetro(float valorLado){
        return valorLado*4;
    }  
}
