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
public class Cubo {
    
    public float Volume(float aresta){
        return (float) pow(aresta, 3); 
    } 
    
    public float Area(float aresta) {
        return (float) pow((aresta*6), 2);   
    }
    
}
