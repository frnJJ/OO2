package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.SortedSet;
import java.util.TreeSet;

public class GestorNumerosDisponibles {
	private GestorNumeros gestor = new UltimoNumero();
 	private SortedSet<String> lineas = new TreeSet<String>();

	public boolean agregarNumero(String numero){
		return this.lineas.add(numero);
	}

	public String obtenerNumeroDisponible(){
		return gestor.obtenerNumeroDisponible(lineas);
	}

	public void cambiarTipoGenerador(GestorNumeros gest){
		this.gestor = gest;
	}
}