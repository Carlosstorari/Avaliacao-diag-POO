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
public class Triangulo extends Forma2D {
    private float base;
    private float altura;
    private float[] lados = new float[3];
    
    @Override
    public float area() {
        return base * altura / 2;   
    }
    
    @Override
    public float perimetro(){
        float soma = 0;
        for(int i = 0; i< lados.length; i++){
            soma += lados[i];
        }
        return soma;
    }  

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

    public float[] getLados() {
        return lados;
    }

    public void setLados(float[] lados) {
        this.lados = lados;
    }
    
}
