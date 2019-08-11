package avdiag1;
import javax.swing.JOptionPane;
public class AvDiag1 {
    public static void main(String[] args) {
        // Carlos HT3000711
        // Daniel HT3000745
        int x = 0;
        float area, perimetro, volume, faceLateral;
        float base, altura, aresta, lado;
        float[] ladosTriangulo = new float[3];
        float[] arestas = new float[3];
        while(x != 6){
        String[] options = {"Quadrado", "Retangulo", "Triangulo","Cubo","Paralelepipedo","Piramide","Sair"};
        x = JOptionPane.showOptionDialog(null, "Escolha uma forma geométrica",
                "Formas geométricas",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            switch (x){
                case 0:
                    Quadrado quadrado = new Quadrado();
                    lado = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor dos lados do "));
                    quadrado.setValorLado(lado);
                    area = quadrado.area();
                    perimetro = quadrado.perimetro();
                    JOptionPane.showMessageDialog(null, "Área: "+area+"\nPerimetro: "+perimetro);
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
                    Piramide piramide = new Piramide();
                    base = Float.parseFloat(JOptionPane.showInputDialog("Digite a area da base: "));
                    faceLateral = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da face lateral: "));
                    altura = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da altura: "));
                    area = piramide.Area(base, faceLateral);
                    volume = piramide.Volume(base, altura);
                    JOptionPane.showMessageDialog(null, "Área: "+area+"\nVolume: "+volume);
                    break;
                default:
                    System.exit(0);
                    break;
            }
        }
    }
    
}
