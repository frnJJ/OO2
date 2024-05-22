package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class UltimoNumero extends GestorNumeros{

    @Override
    public String obtenerNumeroDisponible(){
        String num = this.lineas.last();
        lineas.remove(num);
        return num;
    }
    
}
