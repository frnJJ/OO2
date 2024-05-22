package ar.edu.unlp.info.oo2.facturacion_llamadas;
import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;


public class NumeroRandom extends GestorNumeros{

    @Override
    public String obtenerNumeroDisponible(){
        String num = new ArrayList<String>(this.lineas).get(new Random().nextInt(this.lineas.size()));
        this.lineas.remove(num);
        return num;
    }

    
}
