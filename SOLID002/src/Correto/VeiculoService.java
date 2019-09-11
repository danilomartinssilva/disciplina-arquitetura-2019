/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Correto;

/**
 *
 * @author Danilo
 */
public class VeiculoService {
    private Veiculo veiculo;
    
    public VeiculoService(Veiculo veiculo){
        this.veiculo = veiculo;
    }
    public void alterarControleDirecao(ControleDirecao controleDirecao){
        veiculo.setInjecaoCombustivel(controleDirecao.getInjecaoCombustivel());
        veiculo.setRigidezDirecao(controleDirecao.getRigidezDirecao());
        veiculo.setRigidezSuspensao(controleDirecao.getRigidezSuspensao());
    }
    
}
