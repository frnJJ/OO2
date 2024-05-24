package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.SortedSet;

public class PrimerNumero implements GestorNumeros{

    @Override
    public String obtenerNumeroDisponible(SortedSet<String> lineas){
        String num = lineas.first();
        lineas.remove(num);
        return num;
    }
    
}
