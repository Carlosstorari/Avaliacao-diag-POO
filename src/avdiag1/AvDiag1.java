package avdiag1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
public class AvDiag1 {
    public static void main(String[] args) {
        // Carlos HT3000711
        // Daniel HT3000745
        // Wiliam HT1720228
        int x = 0;
        float area, perimetro, volume;
        float base, altura, aresta, lado;
        List<Forma> forma = new ArrayList<Forma>();
        float[] ladosTriangulo = new float[3];
        float[] arestas = new float[3];
        while(x != 7){
        String[] options = {"Quadrado", "Retangulo", "Triangulo","Cubo","Paralelepipedo","Piramide","Imprimir formas","Sair"};
        x = JOptionPane.showOptionDialog(null, "Escolha uma forma geométrica",
                "Formas geométricas",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            switch (x){
                case 0:
                    Quadrado quadrado = new Quadrado();
                    lado = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor dos lados do Quadrado"));
                    quadrado.setValorLado(lado);
                    area = quadrado.area();
                    perimetro = quadrado.perimetro();
                    JOptionPane.showMessageDialog(null, "Área: "+area+"\nPerimetro: "+perimetro);
                    quadrado.setNome("Quadrado");
                    forma.add(quadrado);
                    break;
                case 1:
                    Retangulo retangulo = new Retangulo();
                    base = Float.parseFloat(JOptionPane.showInputDialog("Digite a base do retangulo"));
                    altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do retangulo"));
                    retangulo.setBase(base);
                    retangulo.setAltura(altura);
                    perimetro = retangulo.perimetro();
                    area = retangulo.area();
                    JOptionPane.showMessageDialog(null, "Área: "+area+"\nPerimetro: "+perimetro);
                    retangulo.setNome("Retangulo");
                    forma.add(retangulo);
                    break;
                case 2:
                    Triangulo triangulo = new Triangulo();
                    for(int i = 0; i< ladosTriangulo.length; i++){
                        ladosTriangulo[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do "+(i+1)+"° lado"));
                    }
                    base = Float.parseFloat(JOptionPane.showInputDialog("Digite a base do triangulo"));
                    altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do triangulo"));
                    triangulo.setBase(base);
                    triangulo.setAltura(altura);
                    triangulo.setLados(ladosTriangulo);
                    perimetro = triangulo.perimetro();
                    area = triangulo.area();
                    JOptionPane.showMessageDialog(null, "Área: "+area+"\nPerimetro: "+perimetro);
                    triangulo.setNome("Triangulo");
                    forma.add(triangulo);
                    break;
                case 3:
                    Cubo cubo = new Cubo();
                    aresta = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor das arestas do cubo"));
                    cubo.setAresta(aresta);
                    volume = cubo.volume();
                    JOptionPane.showMessageDialog(null, "Volume: "+volume);
                    cubo.setNome("Cubo");
                    forma.add(cubo);
                    break;
                case 4:
                    Paralelepipedo paralelepipedo = new Paralelepipedo();
                    for(int i = 0; i < arestas.length; i++){
                        arestas[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da "+(i+1)+"° aresta "));
                    }
                    paralelepipedo.setAresta(arestas);
                    volume = paralelepipedo.volume();
                    JOptionPane.showMessageDialog(null, "Volume: "+volume);
                    paralelepipedo.setNome("Paralelepipedo");
                    forma.add(paralelepipedo);
                    break;
                case 5:
                    Piramide piramide = new Piramide();
                    base = Float.parseFloat(JOptionPane.showInputDialog("Digite a area da base: "));
                    altura = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da altura: "));
                    piramide.setBase(base);
                    piramide.setAltura(altura);
                    volume = piramide.volume();
                    JOptionPane.showMessageDialog(null, "Volume: "+volume);
                    piramide.setNome("Piramide");
                    forma.add(piramide);
                    break;
                case 6:
                    Collections.sort(forma);
                    //JOptionPane.showMessageDialog(null, forma);
                    String output = "";
                    for(int i = 0; i<forma.size(); i++){
                        String everything = forma.get(i).toString();
                        output += everything + "\n";       
                    }
                    JOptionPane.showMessageDialog(null, output);
                    break;
                default:
                    System.exit(0);
                    break;
            }
        }
    }
    
}
