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
public class Carro extends Veiculo {
    
    public boolean radioLigado;
    
    public boolean radioEstaLigado(){
        return this.radioLigado;
    }
    public void ligarRadio(){
        this.radioLigado = true;
    }
    public void desligarRadio(){
        this.radioLigado = false;
    }
    public void ligarCamera(){
        throw new UnsupportedOperationException("O Carro nao possui camera");
    }
    public void desligarCamera(){
        throw new UnsupportedOperationException("Carro não possui camera");
    }
    
    
}
