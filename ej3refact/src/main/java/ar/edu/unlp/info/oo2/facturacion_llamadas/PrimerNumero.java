package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class PrimerNumero extends GestorNumeros{

    @Override
    public String obtenerNumeroDisponible(){
        String num = this.lineas.first();
        lineas.remove(num);
        return num;
    }
    
}
