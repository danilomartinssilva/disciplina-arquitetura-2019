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
public class Conforto implements ControleDirecao{
 
  public double getRigidezSuspensao(){
      return 20;
  }
  public double getRigidezDirecao(){
      return 20;
  }
  public double getInjecaoCombustivel(){
      return 25;
  }
}
