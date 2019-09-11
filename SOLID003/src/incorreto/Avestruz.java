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
public class Avestruz implements Ave{
    
    public void comer(){
        System.out.println("Comendo");
    }
    public void cantar(){
        throw new UnsupportedOperationException("Avestruz não canta");
    }
    public void voar(){
        throw new UnsupportedOperationException("Avestruz não voa");
    }
    
}
