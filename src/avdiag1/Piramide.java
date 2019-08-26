/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avdiag1;

/**
 *
 * @author note
 */
public class Piramide extends Forma3D{
    private float base,altura;

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    @Override
    public float volume() {
        return (float)(0.33 * base * altura); 
    }
    public String toString() {
        return " \n"+this.getNome()+"\nVolume: "+this.volume()+"\n";
    }
}
