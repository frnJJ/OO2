package ar.edu.unlp.info.oo2.ejercicio5;

public class AdapterVideoStream extends Media{
	
	private VideoStream vs;
	
	
	public AdapterVideoStream (VideoStream v) {
		this.vs = v;
	}
	
	
	public void play() {
		
		this.vs.reproduce();
		
	}

}
