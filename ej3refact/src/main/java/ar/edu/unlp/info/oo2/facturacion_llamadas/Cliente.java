package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*; 

public abstract class Cliente {
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private String nombre;
	private String numeroTelefono;
	protected double descuento;



	public Cliente (String nombre, String numeroTelefono){
		this.nombre = nombre;
		this.numeroTelefono = numeroTelefono;
	}

	public void agregarLlamada(Llamada llamada){
		this.llamadas.add(llamada);
	}

	public double getDescuento(){
		return this.descuento;
	}
	public String getNumeroTelefono(){
		return this.numeroTelefono;
	}

	public double calcularMontoTotalLlamadas(){
		double total = llamadas.stream().mapToDouble(llamada -> llamada.calcularMontoTotaldeLlamada()).sum();
		total -= this.getDescuento() * total;
		return total;
	}

}
