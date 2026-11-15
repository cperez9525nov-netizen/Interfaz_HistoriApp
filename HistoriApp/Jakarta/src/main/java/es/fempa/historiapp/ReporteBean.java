package es.fempa.historiapp;

import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import java.util.concurrent.CompletableFuture;

@Named
@SessionScoped
public class ReporteBean implements Serializable {

    private boolean enviando = false; // Controla si se muestra el formulario o el texto normal
    private boolean enviadoExito = false; // Controla si se muestra el mensaje de "Gracias"
    private String mensajeError;

    public boolean isEnviando() {
        return enviando;
    }

    public void setEnviando(boolean enviando) {
        this.enviando = enviando;
    }

    public boolean isEnviadoExito() {
        return enviadoExito;
    }

    public void setEnviadoExito(boolean enviadoExito) {
        this.enviadoExito = enviadoExito;
    }

    public String getMensajeError() {
        return mensajeError;
    }

    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }

    // Método para abrir el formulario de reporte
    public void abrirFormulario() {
        this.enviando = true;
        this.enviadoExito = false;
        this.mensajeError = "";
    }

    // Método para cancelar
    public void cancelar() {
        this.enviando = false;
        this.enviadoExito = false;
        this.mensajeError = "";
    }

    // Método al enviar el reporte
    public void enviarReporte() {
        if (mensajeError == null || mensajeError.trim().isEmpty()) {
            FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Por favor, describe el error antes de enviar."));
            return;
        }

        // Se oculta el formulario y se muestra el mensaje de agradecimiento 
        this.enviando = false;
        this.enviadoExito = true;
        this.mensajeError = "";
        
    }
}