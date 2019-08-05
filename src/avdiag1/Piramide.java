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
public class Piramide {
    
    public float Volume(float areaBase, float altura){
        
        return (float)(0.33 * areaBase * altura); 
    }
    
    public float Area (float areaBase, float facesLaterais){
        
        return areaBase + facesLaterais*4;
    }
    
}
