package ar.edu.unlp.info.oo2.ejercicio_9;

import java.util.*;

public class User {
	
	private String name;
	private String surname;
	private String email;
	private List<Excursion> my_list;
	
	
	public User (String name, String surname, String email) {
		
		this.email = email;
		this.my_list = new ArrayList<Excursion> ();
		this.name = name;
		this.surname = surname;
		
	}
	
	public String getEmail() {
		
		return this.email;
		
	}

}
