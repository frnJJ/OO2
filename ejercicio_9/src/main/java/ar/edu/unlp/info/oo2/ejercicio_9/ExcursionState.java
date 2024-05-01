package ar.edu.unlp.info.oo2.ejercicio_9;

public abstract class ExcursionState {
	
	protected Excursion excursion;
	
	public ExcursionState(Excursion excursion) {
		
		this.excursion = excursion;
		
	}
	
	public abstract String calculate_people();
	
	public void addClient (User user) {
		
		this.excursion.addRegistered(user);
		
	}
	
	public abstract void update();

}
