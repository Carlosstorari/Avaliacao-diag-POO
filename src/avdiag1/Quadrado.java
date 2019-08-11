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
public class Quadrado extends Forma2D{
    private float valorLado;
    @Override
    public float area() {
        return (float) pow(valorLado,2);   
    }
    
    @Override
    public float perimetro(){
        return valorLado*4;
    }

    public float getValorLado() {
        return valorLado;
    }

    public void setValorLado(float valorLado) {
        this.valorLado = valorLado;
    }
    
    
}
