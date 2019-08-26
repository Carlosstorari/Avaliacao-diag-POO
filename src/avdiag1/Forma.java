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
public abstract class Forma implements Comparable<Forma>{
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public abstract String toString();
    @Override
    public int compareTo(Forma f) {
        if (this.nome.compareToIgnoreCase(f.getNome()) < 0) { 
            return -1;
        } if (this.nome.compareToIgnoreCase(f.getNome()) > 0) { 
            return 1; 
        }
        return 0; 
    }

}
