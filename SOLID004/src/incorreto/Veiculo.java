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
public abstract class Veiculo implements Acoes {
    private boolean motorLigado;
    
    public boolean motorEstaLigado(){
        return this.motorLigado;
    }
    
    public void ligarMotor(){
        this.motorLigado = true;
    }
    public void desligarMotor(){
        this.motorLigado = false;
    }
    
}
