/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avdiag1;

/**
 *
 * @author ht3000711
 */
public interface FigurasGeometricas {
    //para figuras 2d
    
    private int qtdLados;
    
    //se for 3d
    private float volume;
    
    //para calculo de volume
    private float altura;
    private float comprimento;
    private float largura;
    
    public abstract void figura2D (float[] valorLados);
    public abstract void figura3D (float altura, float comprimento, float largura);
    

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float[] getValorLados() {
        return valorLados;
    }

    public void setValorLados(float[] valorLados) {
        this.valorLados = valorLados;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }
    
    
}
