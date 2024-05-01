package ar.edu.unlp.info.oo2.ejercicio_8;
import java.time.Duration;
import java.time.LocalTime;

public class Finished extends State{
	
	
	public Finished (ToDoItem i) {
		
		super(i);
		
	}
	
	public void start() {
		
		
	}
	
	public void togglePause() {
		
		throw new RuntimeException("No se puede pausar una tarea finalizada");
	
	}
	
	public void finish() {
		
			
	}
	
	public void addComment(String comment) {
		
		
	
	} 
	
	public Duration workedTime() {
		
		return this.task.actualWorkedTime(null);
		
	}
	
	
	
	

}
