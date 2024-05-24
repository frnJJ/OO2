package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private GestorNumerosDisponibles guia = new GestorNumerosDisponibles();


	public boolean agregarNumeroTelefono(String numero) {
		return guia.agregarNumero(numero);
	}

	public String obtenerNumeroLibre(){
			return guia.obtenerNumeroDisponible();
	}

	public Cliente registrarClienteJuridico(String cuit, String nombre){
		Juridico cliente = new Juridico(nombre,this.obtenerNumeroLibre(),cuit);
		this.clientes.add(cliente);
		return cliente;
	}

	public Cliente registrarClienteFisico(String dni, String nombre){
		Fisico cliente = new Fisico(nombre,this.obtenerNumeroLibre(),dni);
		this.clientes.add(cliente);
		return cliente;
	}


	public Llamada registrarLlamadaInternacional(Cliente origen, Cliente destino, int duracion){
		Internacional llamada = new Internacional(origen.getNumeroTelefono(),destino.getNumeroTelefono(),duracion);
		this.llamadas.add(llamada);
		origen.agregarLlamada(llamada);
		return llamada;
	}
	public Llamada registrarLlamadaNacional(Cliente origen, Cliente destino, int duracion){
		Nacional llamada = new Nacional(origen.getNumeroTelefono(),destino.getNumeroTelefono(),duracion);
		this.llamadas.add(llamada);
		origen.agregarLlamada(llamada);
		return llamada;
	}


	public double calcularMontoTotalLlamadas(Cliente cliente) {
		return cliente.calcularMontoTotalLlamadas();
	}

	public int cantidadDeUsuarios() {
		return clientes.size();
	}

	public boolean existeUsuario(Cliente persona) {
		return clientes.contains(persona);
	}
	 public void cambiarTipoGenerador(GestorNumeros gest){
		this.guia.cambiarTipoGenerador(gest);
	 }

}
