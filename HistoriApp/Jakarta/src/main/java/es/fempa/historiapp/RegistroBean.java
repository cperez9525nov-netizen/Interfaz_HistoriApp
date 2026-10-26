package es.fempa.historiapp;

import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import java.io.Serializable;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.annotation.PostConstruct;

@Named
@ViewScoped
public class RegistroBean implements Serializable {
    
    private String email;
    private String nombre;
    private String password;
    private String confirmPassword;

    @Inject
    private UsuarioBean usuarioBean;

    // Getters and setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public void registrar() {

        boolean ok = true;

        if (email.trim().isEmpty() || nombre.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {

            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Todos los campos son obligatorios."));
            ok = false;

        }

        if (!password.equals(confirmPassword)) {

            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Las contraseñas no coinciden."));
            ok = false;

        }

        if (password.length() < 6) {

            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "La contraseña debe tener al menos 6 caracteres."));
            ok = false;

        }

        if (usuarioBean.existeEmail(email)) {

            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "El correo electrónico ya está registrado."));
            ok = false;

        }

        if (ok) {

            Usuarios nuevoUsuario = new Usuarios();
            nuevoUsuario.setNombre(nombre);
            nuevoUsuario.setEmail(email);
            nuevoUsuario.setPassword(password);

            usuarioBean.agregarUsuario(nuevoUsuario);

            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Éxito", "Registro completado. Ahora puedes iniciar sesión."));

            // Limpiar campos después del registro
            email = "";
            nombre = "";
            password = "";
            confirmPassword = "";

        }

    }
    
}
