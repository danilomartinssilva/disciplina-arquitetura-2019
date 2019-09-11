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
public interface ControleDirecao {
    
    default double getRigidezSuspensao(){
        return 0;
    }
    default double getRigidezDirecao(){
        return 0;
    }
    default double getInjecaoCombustivel(){
        return 0;
    }
}
