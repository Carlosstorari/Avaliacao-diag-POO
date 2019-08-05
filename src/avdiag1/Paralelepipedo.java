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
public class Paralelepipedo {
    
    public float Volume(float[] aresta){
        float vol = 1;
        for(int i = 0; i < 3; i++){
            vol *= aresta[i];
        }
        return vol; 
    } 
    
    public float Area(float[] aresta) {
        return 2*(aresta[0]*aresta[1] + aresta[0]*aresta[2] + aresta[1]*aresta[2]);   
    }
}
