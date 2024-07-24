package login.persistencia;

import login.logica.Usuario;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import login.Persistencia.exceptions.NonexistentEntityException;
import login.logica.Rol;

public class ControladoraPersistencia {

    //llamamos a la bd
    UsuarioJpaController UsuarioJPA = new UsuarioJpaController();
    RolJpaController RolJPA = new RolJpaController();

    public List<Usuario> traerUsuarios() {
        return UsuarioJPA.findUsuarioEntities(); //en bd seria equivalente a SELECT * FROM USUARIOS
    }

    public List<Rol> traerRoles() {
        return RolJPA.findRolEntities();
    }

    public void crearUsuario(Usuario usu) {
        UsuarioJPA.create(usu);
    }

    public void eliminarUsuario(int idUsuario) {
        try {
            UsuarioJPA.destroy(idUsuario);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario traerUsuario(int idUsuario) {
        return UsuarioJPA.findUsuario(idUsuario);
    }

    public void editarUsuario(Usuario usu) {
        try {
            UsuarioJPA.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        }

}
