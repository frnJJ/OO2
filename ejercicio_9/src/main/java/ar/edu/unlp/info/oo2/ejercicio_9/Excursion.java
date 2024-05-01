package ar.edu.unlp.info.oo2.ejercicio_9;

import java.util.Date;
import java.util.*;

public class Excursion {
	
	private String name;
	private Date date_from;
	private Date date_to;
	private String meeting_point;
	private double cost;
	private int quota_min;
	private int quota_max;
	private List<User> registered_users;
	private List<User> inlist_users;
	private ExcursionState excursion_state;
	
	
	
	public Excursion (String name, String meeting_point, int qmin, int qmax) {
		
		this.name = name;
		this.date_from = new Date();
		this.date_to = new Date(2024, 11, 9);
		this.meeting_point = meeting_point;
		this.cost = 999.0;
		this.quota_min = qmin;
		this.quota_max = qmax;
		this.registered_users = new ArrayList<User>();
		this.inlist_users = new ArrayList<User>();
		this.excursion_state = new Provisional(this);
		
		
		
	}
	
	public void update() {
		
		this.excursion_state.update();
		
	}
	
	public void addClient(User user) {
		
		this.excursion_state.addClient(user);
		this.update();
		
	}
	
	public void addRegistered(User user) {
		
		this.registered_users.add(user);
		
	}
	
	public void addInlist(User user) {
		
		this.inlist_users.add(user);
		
	}
	
	public int calculate_prov() {
		
		return this.quota_min - this.registered_users.size();
		
	}
	
	public int calculate_free() {
		
		return this.quota_max - this.registered_users.size();
		
	}
	
	public void setState(ExcursionState exc) {
		
		this.excursion_state= exc;
		
	}
	
	public boolean ShouldUpdate (int limit) {
		
		return limit > this.registered_users.size();
		
	}
	
	public int getMax() {
		
		return this.quota_max;
		
	}
	
	public int getMin() {
		
		return this.quota_min;
		
	}
	
	public List<String> getEmails(){
		
		return this.registered_users.stream().map(t -> t.getEmail()).toList();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
