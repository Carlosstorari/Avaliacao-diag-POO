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
public class Retangulo extends Forma2D {
   private float base;
   private float altura;
    
    @Override
    public float area() {
        return base * altura;   
    }
    
    @Override
    public float perimetro(){
        
        return base*2 + altura*2;
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
    @Override
    public String toString() {
        return " \n"+this.getNome()+"\nÁrea: "+this.area()+"\nPerimetro: "+this.perimetro()+"\n";
    }
}
