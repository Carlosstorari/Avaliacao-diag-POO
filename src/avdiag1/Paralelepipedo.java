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
public class Paralelepipedo extends Forma3D{
    private float[] aresta = new float[3];

    public float[] getAresta() {
        return aresta;
    }

    public void setAresta(float[] aresta) {
        this.aresta = aresta;
    }
    

    @Override
    public float volume() {
        float vol = 1;
        for(int i = 0; i < 3; i++){
            vol *= aresta[i];
        }
        return vol; 
    }
    
}
