package ar.edu.unlp.info.oo2.ejercicio_9;

public class Full extends ExcursionState{
	
	public Full(Excursion ex) {
		
		super(ex);
		
	}
	
	public String calculate_people() {
		
		return "Esta excursion ya tiene el maximo de personas inscriptas";
		
	}
	
	public void update() {
		
	
		
	}
	
	public void addClient(User user) {
		
		this.excursion.addInlist(user);
		
	}

}
