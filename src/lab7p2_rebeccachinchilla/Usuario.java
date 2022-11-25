/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_rebeccachinchilla;

/**
 *
 * @author Dell
 */
public class Usuario {
    /*
    Contara con un id único, username, contraseña y su tipo de usuario. 
    */
    
    
    int id;
    String Username;
    String Contra;
    int tipoUsuario;

    public Usuario(int id, String Username, String Contra, int tipoUsuario) {
        this.id = id;
        this.Username = Username;
        this.Contra = Contra;
        this.tipoUsuario = tipoUsuario;
    }

    //GETTER
    
    public int getId() {
        return id;
    }

    public String getUsername() {
        return Username;
    }

    public String getContra() {
        return Contra;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    
    //SETTER
    
    
    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setContra(String Contra) {
        this.Contra = Contra;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    
    
    
    
    
    
}
