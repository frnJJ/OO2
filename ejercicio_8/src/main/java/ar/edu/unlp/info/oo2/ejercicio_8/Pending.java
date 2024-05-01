package ar.edu.unlp.info.oo2.ejercicio_8;
import java.time.Duration;
import java.time.LocalTime;

public class Pending extends State {
	
	public Pending(ToDoItem i) {
		super(i);
	}
	
	public void start() {
		
		this.task.startTime();
		this.task.setCurrentState(new in_progress(task));
		
	}
	
	public void togglePause() {
		
		throw new RuntimeException("No se puede poner el pausa ua tarea pendiente");

		
	}
	
	public void finish() {
		
		
		
	}
	
	public void addComment(String comment) {
		
		this.task.setComment(comment);
		
	}
	
	public Duration workedTime() {
		
		throw new RuntimeException("Esta tarea no fue iniciada todavia");
		
	}

}
