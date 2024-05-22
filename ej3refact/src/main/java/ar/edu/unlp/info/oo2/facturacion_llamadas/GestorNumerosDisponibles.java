package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class GestorNumerosDisponibles {
	private GestorNumeros gestor = new UltimoNumero();


	public void agregarNumero(String numero){
		this.gestor.agregarNumero(numero);
	}

	public boolean verificar(String numero){
		return this.gestor.verificar(numero);
	}
	public String obtenerNumeroDisponible(){
		return gestor.obtenerNumeroDisponible();
	}

	public void cambiarTipoGenerador(GestorNumeros gest){
		gest.setLineas(this.gestor.getLineas());
		this.gestor = gest;
	}
}