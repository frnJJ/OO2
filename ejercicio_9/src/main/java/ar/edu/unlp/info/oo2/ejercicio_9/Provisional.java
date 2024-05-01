package ar.edu.unlp.info.oo2.ejercicio_9;

public class Provisional extends ExcursionState{
	
	
	public Provisional(Excursion ex) {
		
		super(ex);
		
	}
	
	public String calculate_people() {
		
		return "Cantidad de personas para llegar al minimo = "+ this.excursion.calculate_prov();
		
	}
	
	public void update() {
		
		if (this.excursion.ShouldUpdate(this.excursion.getMin())) 		
			this.excursion.setState(new Free(this.excursion));
			
		
	}

}
