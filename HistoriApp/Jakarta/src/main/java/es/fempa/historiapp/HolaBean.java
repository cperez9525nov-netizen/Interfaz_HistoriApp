package es.fempa.historiapp;

import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import java.io.Serializable;

@Named("AdiosBean")
@RequestScoped
public class HolaBean implements Serializable {
    
    private String saludo = "¡Hola desde Jakarta Faces!";

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }
}