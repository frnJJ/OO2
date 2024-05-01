package ar.edu.unlp.info.oo2.ejercicio_9;

public class Free extends ExcursionState{
	
	public Free(Excursion ex) {
		
		super(ex);
		
	}
	
	public String calculate_people() {
		
		return "cantidad de personas para llegar al maximo = "+this.excursion.calculate_free()+"Emails= "+this.excursion.getEmails();
		
	}
	
	
	
	
	public void update() {
		
		if (this.excursion.ShouldUpdate(this.excursion.getMax())) 
			this.excursion.setState(new Full(this.excursion));
		
	}

}
