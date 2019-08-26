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
public class Cubo extends Forma3D{
    private float aresta;
    @Override
    public float volume() {
        return (float) pow(aresta, 3); 
    }

    public float getAresta() {
        return aresta;
    }

    public void setAresta(float aresta) {
        this.aresta = aresta;
    }
    
    @Override
    public String toString() {
        return " \n"+this.getNome()+"\nVolume: "+this.volume()+"\n";
    }
}
