package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.SortedSet;

public class UltimoNumero implements  GestorNumeros{
    
    @Override
    public String obtenerNumeroDisponible(SortedSet<String> lineas){
        String num = lineas.last();
        lineas.remove(num);
        return num;
    }
    
}
