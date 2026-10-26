package es.fempa.historiapp;

import jakarta.inject.Named;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.annotation.PostConstruct;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ApplicationScoped
public class UsuarioBean implements Serializable {

    private Long id;
    private String nombre;
    private String email;
    private String password;

    // La lista global de usuarios registrados
    private List<Usuarios> listaUsuarios;

    @PostConstruct
    public void init() {
        listaUsuarios = new ArrayList<>();
        // Usuario de prueba inicial
        listaUsuarios.add(new Usuarios(1L, "Cristian Pérez Beltrá", "admin@historiapp.es", "1234"));
    }

    public Usuarios validarCredenciales(String email, String password) {
        for (Usuarios u : listaUsuarios) {
            if (u.getEmail().equalsIgnoreCase(email) && u.getPassword().equals(password)) {
                return u;
            }
        }
        return null;
    }

    public void agregarUsuario(Usuarios nuevo) {
        nuevo.setId((long) (listaUsuarios.size() + 1));
        listaUsuarios.add(nuevo);
    }

    public boolean existeEmail(String email) {
        for (Usuarios u : listaUsuarios) {
            if (u.getEmail().equalsIgnoreCase(email)) {
                return true;
            }
        }
        return false;
    }

    // Getters y Setters
    public List<Usuarios> getListaUsuarios() {

        return listaUsuarios;

    }

    public void setListaUsuarios(List<Usuarios> listaUsuarios) {

        this.listaUsuarios = listaUsuarios;

    }

}
