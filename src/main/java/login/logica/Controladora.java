package login.logica;

import login.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    //llamamos a la persistencia
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public Usuario validarUsuario(String usuario, String contrasenia) {

        //declaramos usuario en null
        Usuario usr = null;

        //creamos una lista de usuarios para traer todos los usuarios.
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();

        //for each
        for (Usuario usu : listaUsuarios) {
            if (usu.getNombreUsuario().equals(usuario)) {//se utiliza equals ya que ocupamos cadenas de caract. y no nº
                if (usu.getContrasenia().equals(contrasenia)) {
                    usr = usu;//devolvemos el numbre de usuario
                    return usr;
                } else {
                    //"Contraseña incorrecta!";
                    usr = null;
                    return usr;
                }
            } else {
                //"Usuario no encontrado!"
                usr = null;
            }
        }
        //devolvemos null
        return usr;
    }

    public List<Usuario> traerUsuarios() {
        return controlPersis.traerUsuarios();

    }

    public List<Rol> traerRoles() {
        return controlPersis.traerRoles();
    }

    public void crearUsuario(String usuario, String contra, String rolRecibido) {

        Usuario usu = new Usuario();//creamos un constructor vacio para asignar solo los datos que tenemos

        usu.setNombreUsuario(usuario);
        usu.setContrasenia(contra);

//como el rol es un string y tenemos que tener un objeto completo de rol
        Rol rolEncontrado = new Rol();
        rolEncontrado = this.traerRol(rolRecibido);//hacemos la busqueda del rol para asignarlo despues como corresponde
        if (rolEncontrado != null) {//si encuentra un rol
            usu.setUnRol(rolEncontrado);//se va a asignar
        }

        controlPersis.crearUsuario(usu);

    }

    private Rol traerRol(String rolRecibido) {
        List<Rol> listaRoles = controlPersis.traerRoles();

        for (Rol rol : listaRoles) {// para cada rol en la lista de roles
            if (rol.getNombreRol().equals(rolRecibido)) {//si el nombre del rol en el que estoy ahora es igual al rol que paso la persona
                return rol;//retorno ese rol
            }
        }

        return null;//si no lo encuentra retorna null
    }

    public void eliminarUsuario(int idUsuario) {
        controlPersis.eliminarUsuario(idUsuario);
    }

    public Usuario traerUsuario(int idUsuario) {
        return controlPersis.traerUsuario(idUsuario);
    }

    public void EditarUsuario(Usuario usu,String usuario, String contra, String rolRecibido) {
        usu.setNombreUsuario(usuario);
        usu.setContrasenia(contra);

        Rol rolEncontrado = new Rol();
        rolEncontrado = this.traerRol(rolRecibido);//hacemos la busqueda del rol para asignarlo despues como corresponde
        if (rolEncontrado != null) {//si encuentra un rol
            usu.setUnRol(rolEncontrado);//se va a asignar
        }
        controlPersis.editarUsuario(usu);
    }
}
