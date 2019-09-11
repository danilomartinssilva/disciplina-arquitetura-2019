/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Incorreto;

/**
 *
 * @author Danilo
 */
public class VeiculoService {
    private Veiculo veiculo;
    
    public VeiculoService(Veiculo veiculo){
        this.veiculo = veiculo;
    }
    public void alterarControleDirecao( ControleDirecao controleDirecao){
        
       switch(controleDirecao){
           case SPORT:
               veiculo.setInjecaoCombustivel(45);
               veiculo.setRigidezDirecao(35);
               veiculo.setRigidezSuspensao(50);
               break;
           case CONFORTO:
               veiculo.setInjecaoCombustivel(10);
               veiculo.setRigidezDirecao(20);
               veiculo.setRigidezSuspensao(20);
               break;
           case ECONOMICO:
               veiculo.setInjecaoCombustivel(10);
               veiculo.setRigidezDirecao(15);
               veiculo.setRigidezSuspensao(15);
               break;
           default:
               veiculo.setInjecaoCombustivel(15);
               veiculo.setRigidezDirecao(15);
               veiculo.setRigidezSuspensao(15);
               
       }      
        
    }
    
}
