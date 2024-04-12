package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.List;
import java.util.ArrayList;

public class Sistema {
	
	private List<Usuario> users = new ArrayList<Usuario>();
	
	public Usuario addUser (String screenName) {
		
		if (! (this.users.stream().anyMatch(u -> (u.getScreenName() == screenName)))) {
			
			Usuario user = new Usuario(screenName);
			this.users.add(user);
			return user;
		}
		return null;
		
	}
	
	

}
