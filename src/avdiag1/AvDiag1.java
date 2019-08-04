/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avdiag1;

import java.util.Arrays;
import javax.swing.JList;
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
        float area, perimetro, lado;
        String[] options = {"Quadrado", "Retangulo", "Triangulo","Cubo","Paralelepipedo","Piramide"};
        int x = JOptionPane.showOptionDialog(null, "Escolha uma forma geométrica",
                "Formas geométricas",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        System.out.println(x);
        switch (x){
            case 0:
                Quadrado quadrado = new Quadrado();
                lado = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor dos lados do "));
                area = quadrado.VPerimetro(lado);
                perimetro = quadrado.Area(lado);
                JOptionPane.showMessageDialog(null, "Área: "+area+"\nPerimetro: "+perimetro);
                break;
            /*case 1:
                Retangulo retangulo = new Retangulo();
                lado = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor dos lados do "));
                area = quadrado.VPerimetro(lado);
                perimetro = quadrado.Area(lado);
                JOptionPane.showMessageDialog(null, "Área: "+area+"\nPerimetro: "+perimetro);
                break;
            case 2:
                Quadrado quadrado = new Quadrado();
                lado = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor dos lados do "));
                area = quadrado.VPerimetro(lado);
                perimetro = quadrado.Area(lado);
                JOptionPane.showMessageDialog(null, "Área: "+area+"\nPerimetro: "+perimetro);
                break;
            case 3:
                Quadrado quadrado = new Quadrado();
                lado = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor dos lados do "));
                area = quadrado.VPerimetro(lado);
                perimetro = quadrado.Area(lado);
                JOptionPane.showMessageDialog(null, "Área: "+area+"\nPerimetro: "+perimetro);
                break;
            case 4:
                Quadrado quadrado = new Quadrado();
                lado = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor dos lados do "));
                area = quadrado.VPerimetro(lado);
                perimetro = quadrado.Area(lado);
                JOptionPane.showMessageDialog(null, "Área: "+area+"\nPerimetro: "+perimetro);
                break;
            case 5:
                Quadrado quadrado = new Quadrado();
                lado = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor dos lados do "));
                area = quadrado.VPerimetro(lado);
                perimetro = quadrado.Area(lado);
                JOptionPane.showMessageDialog(null, "Área: "+area+"\nPerimetro: "+perimetro);
                break;*/
        }
        
    }
    
}
