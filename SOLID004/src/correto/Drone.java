/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correto;

/**
 *
 * @author Danilo
 */
public class Drone extends Veiculo implements AcaoCamera {
    

    private boolean cameraLigada ;
    
    
    public boolean mostraCameraLigada(){
        return this.cameraLigada;
    }
    public void ligarCamera(){
        this.cameraLigada = true;
    }
    public void desligarCamera(){
        this.cameraLigada = false;
    }
    
}

