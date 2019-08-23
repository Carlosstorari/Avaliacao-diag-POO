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
public class Forma implements Comparable {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Forma[] push(Forma formas[], Forma forma){
        for(int i = 0; i < formas.length; i++){
            if(formas[i] == null){
                formas[i] = forma;
                break;
            }
        }
        return formas;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
