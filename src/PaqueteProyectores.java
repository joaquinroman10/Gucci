/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class PaqueteProyectores {
     String destinatarios;
     String destino;
     float costoEnvio;
     Boolean enTransito;

    public PaqueteProyectores(String destinatarios, String destino, float costoEnvio, Boolean enTransito) {
        this.destinatarios = destinatarios;
        this.destino = destino;
        this.costoEnvio = costoEnvio;
        this.enTransito = enTransito;
    }

    public String getDestinatarios() {
        return destinatarios;
    }

    public void setDestinatarios(String destinatarios) {
        this.destinatarios = destinatarios;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public float getCostoEnvio() {
        return costoEnvio;
    }

    public void setCostoEnvio(float costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    public Boolean getEnTransito() {
        return enTransito;
    }

    public void setEnTransito(Boolean enTransito) {
        this.enTransito = enTransito;
    }
     
     
}
