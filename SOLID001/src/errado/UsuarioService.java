/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package errado;

/**
 *
 * @author Danilo
 */
public class UsuarioService {
    
    
    public void alterarEmail(Usuario u){
        
        if(existePermissao(u)){
            System.out.println("Será alterado o e-mail");
        }
        
    }
    public boolean existePermissao(Usuario u){
        return true;
    }
    
}
