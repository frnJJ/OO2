package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class Internacional extends Llamada{


    public Internacional (String origen, String destino, int duracion){
        super(origen,destino,duracion);
    }
    @Override
    public double calcularMontoTotaldeLlamada(){
        return this.getDuracion() * 150 + (this.getDuracion() * 150 * 0.21) + 50;
    }

}