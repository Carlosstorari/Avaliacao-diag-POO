/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avdiag1;

import javax.swing.JOptionPane;

/**
 *
 * @author ht3000711
 */
public class AvDiag1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float area, perimetro, volume, faceLateral;
        float base, altura, aresta, lado;
        float[] ladosTriangulo = new float[3];
        float[] arestas = new float[3];
        
        String[] options = {"Quadrado", "Retangulo", "Triangulo","Cubo","Paralelepipedo","Piramide"};
        int x = JOptionPane.showOptionDialog(null, "Escolha uma forma geométrica",
                "Formas geométricas",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        System.out.println(x);
        switch (x){
            case 0:
                Quadrado quadrado = new Quadrado();
                lado = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor dos lados do "));
                area = quadrado.Area(lado);
                perimetro = quadrado.VPerimetro(lado);
                JOptionPane.showMessageDialog(null, "Área: "+area+"\nPerimetro: "+perimetro);
                break;
            case 1:
                Retangulo retangulo = new Retangulo();
                base = Float.parseFloat(JOptionPane.showInputDialog("Digite a base do retangulo"));
                altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do retangulo"));
                perimetro = retangulo.VPerimetro(base, altura);
                area = retangulo.Area(base, altura);
                JOptionPane.showMessageDialog(null, "Área: "+area+"\nPerimetro: "+perimetro);
                break;
            case 2:
                Triangulo triangulo = new Triangulo();
                for(int i = 0; i< ladosTriangulo.length; i++){
                    ladosTriangulo[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do "+(i+1)+"° lado"));
                }
                base = Float.parseFloat(JOptionPane.showInputDialog("Digite a base do triangulo"));
                altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do triangulo"));
                perimetro = triangulo.VPerimetro(ladosTriangulo);
                area = triangulo.Area(base, altura);
                JOptionPane.showMessageDialog(null, "Área: "+area+"\nPerimetro: "+perimetro);
                break;
            case 3:
                Cubo cubo = new Cubo();
                aresta = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor das arestas do cubo"));
                volume = cubo.Volume(aresta);
                area = cubo.Area(aresta);
                JOptionPane.showMessageDialog(null, "Área: "+area+"\nVolume: "+volume);
                break;
            case 4:
                Paralelepipedo paralelepipedo = new Paralelepipedo();
                for(int i = 0; i < arestas.length; i++){
                    arestas[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da "+(i+1)+"° aresta "));
                }
                
                area = paralelepipedo.Area(arestas);
                volume = paralelepipedo.Volume(arestas);
                JOptionPane.showMessageDialog(null, "Área: "+area+"\nVolume: "+volume);
                break;
            case 5:
                Piramede piramede = new Piramede();
                base = Float.parseFloat(JOptionPane.showInputDialog("Digite a area da base: "));
                faceLateral = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da face lateral: "));
                altura = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da altura: "));
                area = piramede.Area(base, faceLateral);
                volume = piramede.Volume(base, altura);
                JOptionPane.showMessageDialog(null, "Área: "+area+"\nVolume: "+volume);
                break;
        }
        
    }
    
}
