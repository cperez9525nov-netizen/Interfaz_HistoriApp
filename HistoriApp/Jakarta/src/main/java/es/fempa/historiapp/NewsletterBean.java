package es.fempa.historiapp;

import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import java.io.Serializable;

@Named
@RequestScoped
public class NewsletterBean implements Serializable {

    private String correo;
    private boolean suscrito = false; // Estado inicial

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isSuscrito() {
        return suscrito;
    }

    public void setSuscrito(boolean suscrito) {
        this.suscrito = suscrito;
    }

    public void suscribir() {
        if (correo == null || correo.trim().isEmpty()) {
            FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Por favor, introduce un correo electrónico."));
            return;
        }

        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        if (!correo.matches(emailRegex)) {
            FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "El formato del correo electrónico no es válido."));
            return;
        }

        // Si la validación es correcta, cambiamos el estado a true
        this.suscrito = true;
        
        // Opcional: También dejamos una notificación flotante de confirmación
        FacesContext.getCurrentInstance().addMessage(null, 
            new FacesMessage(FacesMessage.SEVERITY_INFO, "¡Bienvenido!", "Suscripción realizada con éxito."));
    }
}