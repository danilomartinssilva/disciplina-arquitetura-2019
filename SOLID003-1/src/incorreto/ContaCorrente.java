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
public class ContaCorrente implements Conta{
    
    public double saque(){
        return 8;
    }
    

    @Override
    public double saldo() {
       return 10;
    }

    @Override
    public double taxaManutencao() {
        return 5;
    }

    @Override
    public double rendimento() {
        throw new UnsupportedOperationException("Nao tem rendimento"); //To change body of generated methods, choose Tools | Templates.
    }
}
