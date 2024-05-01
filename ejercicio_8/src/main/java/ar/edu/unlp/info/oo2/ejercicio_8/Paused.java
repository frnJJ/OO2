package ar.edu.unlp.info.oo2.ejercicio_8;
import java.time.Duration;
import java.time.LocalTime;

public class Paused extends State{
	
	public Paused (ToDoItem i) {
		
		super(i);
		
	}
	
	public void start() {
		
		
		
	}
	
	public void togglePause() {
		
		this.task.setCurrentState(new in_progress(task));
		
	}
	
	public void finish() {
		
		this.task.setCurrentState(new Finished(task));
		this.task.finishTime();
		
	}
	
	public void addComment(String comment) {
		
		this.task.setComment(comment);
		
	}
	
	public Duration workedTime() {
		
		return this.task.actualWorkedTime(LocalTime.now());
		
	}

}
