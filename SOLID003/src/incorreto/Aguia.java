/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incorreto;

/**
 *
 * @author Danilo
 */
public class Aguia implements Ave {
    
    public void comer(){
        System.out.println("Come");
    }
    public void voar(){
        System.out.println("Voando");    
    }
    public void cantar(){
        throw new UnsupportedOperationException("Aguia nao canta");
    }
    
}
