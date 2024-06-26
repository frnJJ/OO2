package ar.edu.unlp.info.oo2.ejercicio_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.util.List;
import java.util.*;

public class UsuarioTest {
	
	private Sistema s = new Sistema();
	private Usuario u3;
	private Usuario u1;
	private Usuario u2;
	private List<Post> l1 = new ArrayList<Post>();
	private List<Post> l2 = new ArrayList<Post>();
	
	@BeforeEach
	void setUp() {
		
		u1 = s.addUser("Francisco");
		u2 = s.addUser("Sergio");
		u3 = new Usuario("franco");
		Tweet t1 = u1.twitear("Hola como estas");
		reTweet t2 = u1.reTwitear(t1);
		u2.reTwitear(t1);	
		l1.add(t1);
		l1.add(t2);
		
	}
	
	@Test
	public void testAddUser() {
		
		assertEquals(s.addUser("Francisco"),null);
		assertEquals(s.addUser("franco").getScreenName(),u3.getScreenName());
		
	}
	
	@Test
	public void testTwitear() {
		
		assertEquals(u1.getTweet(),this.l1);
		assertNotEquals(u1.getTweet(),this.l2);
		
	}
	
	
	
	
	
	

}
