
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class GestorDePaquetes {
    String nombreEmpresa;
    ArrayList <PaqueteProyectores> paquete;

    public GestorDePaquetes(String nombreEmpresa, ArrayList<PaqueteProyectores> paquete) {
        this.nombreEmpresa = nombreEmpresa;
        this.paquete = paquete;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public ArrayList<PaqueteProyectores> getPaquete() {
        return paquete;
    }

    public void setPaquete(ArrayList<PaqueteProyectores> paquete) {
        this.paquete = paquete;
    }
    
    
}
