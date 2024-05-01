package ar.edu.unlp.info.oo2.ejercicio_8;

import java.time.Duration;
import java.time.LocalTime;

public abstract class State {
	
	protected ToDoItem task;
	
	
	public State (ToDoItem i) {
		
		this.task = i;
		
	}
	
	
	public abstract void start();
	
	public abstract void togglePause();
	
	public abstract void finish();
	
	public abstract void addComment(String name);
	
	public abstract Duration workedTime();
	

}
