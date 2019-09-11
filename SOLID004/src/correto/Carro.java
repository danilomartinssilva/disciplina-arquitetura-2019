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
public class Carro extends Veiculo implements AcaoRadio{
    
    private boolean radioLigado;
    
    public boolean radioEstaLigado(){
        return this.radioLigado;
    }
    public void ligarRadio(){
        this.radioLigado = true;
    }
    public void desligarRadio(){
        this.radioLigado =false;
    }
    
}
