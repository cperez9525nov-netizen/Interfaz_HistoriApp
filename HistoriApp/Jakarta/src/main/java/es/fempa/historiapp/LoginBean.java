package es.fempa.historiapp;

import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.annotation.PostConstruct;

@Named
@SessionScoped
public class LoginBean implements Serializable {
    
    private String email;
    private String password;

    private boolean loggedIn = false;


    // Constructores

    public LoginBean() {
    }

    public LoginBean(String email, String password) {

        this.email = email;
        this.password = password;
    
    }

    // Inyectamos el UsuarioBean para mockear sus datos aquí con los setters

    @Inject
    private UsuarioBean usuarioBean;
   
    // Getters and setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Método de login

    public String iniciarSesion() {

    Usuarios usuarioEncontrado = usuarioBean.validarCredenciales(email, password);

    if (usuarioEncontrado != null) {

        // Credenciales correctas
        return "index.xhtml?faces-redirect=true";

    } else {

        FacesContext.getCurrentInstance().addMessage(null, 
            new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error de inicio de sesión", "Correo o contraseña incorrectos"));
        return null;

    }
}
}
