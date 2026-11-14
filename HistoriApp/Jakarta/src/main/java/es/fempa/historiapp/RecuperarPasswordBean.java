package es.fempa.historiapp;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class RecuperarPasswordBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String email;
    private String confirmEmail;
    private boolean enviado = false;

    public void recuperar() {
        
        // 1. Validar que no estén vacíos
        if (email == null || email.trim().isEmpty() || confirmEmail == null || confirmEmail.trim().isEmpty()) {
            FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Todos los campos son obligatorios."));
            return;
        }

        // 2. Validar el formato del correo electrónico con el patrón
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

        if (!email.matches(emailRegex)) {
            FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "El formato del correo electrónico no es válido."));
            return;
        }

        // 3. Validar que ambos correos coincidan
        if (!email.equals(confirmEmail)) {
            FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Los correos electrónicos no coinciden."));
            return;
        }

        // Si todo es correcto, simulamos el envío de la contraseña
        enviado = true;
        
        FacesContext.getCurrentInstance().addMessage(null,
            new FacesMessage(FacesMessage.SEVERITY_INFO, "Éxito", "Contraseña enviada correctamente."));
    }

    // Getters y Setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConfirmEmail() {
        return confirmEmail;
    }

    public void setConfirmEmail(String confirmEmail) {
        this.confirmEmail = confirmEmail;
    }

    public boolean isEnviado() {
        return enviado;
    }

    public void setEnviado(boolean enviado) {
        this.enviado = enviado;
    }
}