package ar.edu.unlp.info.oo2.ejercicio_8;

import java.time.Duration;
import java.util.*;
import java.time.LocalTime;

public class ToDoItem {
	
	private String name;
	private State currentState;
	private List<String> comments = new ArrayList<String>();
	private LocalTime from, to;
	
	
	public ToDoItem(String name) {
		
		this.name= name;
		this.currentState = new Pending(this);
		
	}
	
	
	public void start() {
		
		this.currentState.start();
		
	}
	
	public void togglePause() {
		
		this.currentState.togglePause();
		
	}
	
	public void finish() {
		
		this.currentState.finish();
		
	}
	
	public Duration workedTime() {
		
		return currentState.workedTime();
		
	}
	
	public void addComment(String comment) {
		
		this.currentState.addComment(comment);
		
	}
	
	public void setCurrentState(State s) {
		
		this.currentState= s;
		
	}
	
	public void setComment(String comment) {
		
		this.comments.add(comment);
		
	}
	
	public void startTime() {
		
		from = LocalTime.now();
		
		
		
	}
	
	public void finishTime() {
		
		to = LocalTime.now();
		
	}
	
	public Duration actualWorkedTime(LocalTime t) {
		if (t == null)
			return Duration.between(from, to);
		
		else 
			return Duration.between(from, t);
		
	}
	
	public State getState() {
		
		return this.currentState;
		
	}
	public List<String> getComments(){
		
		return this.comments;
		
	}

}
