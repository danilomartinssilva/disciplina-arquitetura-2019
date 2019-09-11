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
public class Drone extends Veiculo {
    
    public boolean cameraLigada;
    
    public boolean mostraCameraLigada(){
        return this.cameraLigada;
    }
    public void ligarCamera(){
        this.cameraLigada =true;
    }
    public void desligarCamera(){
        this.cameraLigada = false;
    }
    public void ligarRadio(){
        
        throw new UnsupportedOperationException("O Drone não possui rádio");
    }
    public void desligarRadio(){
        
        throw new UnsupportedOperationException("O Drone não possui rádio");
    }
}
