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
public class Aviao extends Veiculo implements AcaoVoar{
    private boolean pilotoAutomaticoAtivo;
    
    public boolean pilotoAutomaticoAtivoStatus(){
        return this.pilotoAutomaticoAtivo;
    }
    public void acionaPilotoAutomatico(){
        this.pilotoAutomaticoAtivo = true;
    }
    public void desativaPilotoAutomatico(){
        this.pilotoAutomaticoAtivo = false;
    }
}
