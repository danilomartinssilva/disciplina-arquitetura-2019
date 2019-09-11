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
public class Economico implements ControleDirecao {
    
  public double getRigidezSuspensao(){
      return 15;
  }
  public double getRigidezDirecao(){
      return 15;
  }
  public double getInjecaoCombustivel(){
      return 15;
  }
}
