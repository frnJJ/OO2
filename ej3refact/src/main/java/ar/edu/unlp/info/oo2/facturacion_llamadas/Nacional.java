package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class Nacional extends Llamada{

    public Nacional (String origen, String destino, int duracion){
        super(origen,destino,duracion);
    }
    @Override
    public double calcularMontoTotaldeLlamada(){
        return this.getDuracion() * 3 + (this.getDuracion() * 3 * 0.21);
    }



}