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
public class ContaPoupanca implements Conta{
    
    public double saldo(){
        return 10;
    }
    public double saque(){
        return 2;
        
    }
    public double rendimento(){
        return 10;
    }

    @Override
    public double taxaManutencao() {
        throw new UnsupportedOperationException("Nao tem manuntecao"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
