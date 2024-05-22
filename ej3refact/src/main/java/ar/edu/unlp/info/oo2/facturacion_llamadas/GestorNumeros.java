package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.SortedSet;
import java.util.TreeSet;

public abstract class GestorNumeros {

    protected SortedSet<String> lineas = new TreeSet<String>();


    public SortedSet<String> getLineas(){
        return this.lineas;
    }
    public void setLineas(SortedSet<String> lineas){
        this.lineas = lineas;
    }



    public void agregarNumero(String numero){
        this.lineas.add(numero);
    }
    public boolean verificar(String numero){
        return this.lineas.contains(numero);
    }
    public abstract String obtenerNumeroDisponible();

    
}
