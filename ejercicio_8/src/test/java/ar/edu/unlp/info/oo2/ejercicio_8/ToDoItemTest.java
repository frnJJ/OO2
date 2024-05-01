package ar.edu.unlp.info.oo2.ejercicio_8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;
import java.time.LocalTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToDoItemTest {
	
	private ToDoItem uno;
	private ToDoItem dos;
	private ToDoItem tres;
	private ToDoItem cuatro;
	
	
	@BeforeEach
	void setUp () {
		uno = new ToDoItem("Examen");
		uno.start();
		dos = new ToDoItem("Pasear el perro");
		dos.start();
		dos.togglePause();
		tres = new ToDoItem("Estudiar");
		cuatro = new ToDoItem("Correr");
		cuatro.start();
		cuatro.finish();
		
	}
	
	@Test
	public void startTest() {
		
		assertTrue(uno.getState() instanceof in_progress);
		dos.start();
		assertTrue(dos.getState() instanceof Paused);
		assertTrue(tres.getState() instanceof Pending);
		tres.start();
		assertTrue(tres.getState() instanceof in_progress);
		
	}
	@Test
	public void togglePauseTest() {
		
		assertTrue(uno.getState() instanceof in_progress);
		uno.togglePause();
		assertTrue(uno.getState() instanceof Paused);
		cuatro.togglePause();
		assertTrue(cuatro.getState() instanceof Finished);
		tres.togglePause();
		assertTrue(tres.getState() instanceof Pending);
		
	}
	
	@Test
	public void finish() {
		
		assertTrue(cuatro.getState() instanceof Finished);
		uno.finish();
		assertTrue(uno.getState() instanceof Finished);
		tres.finish();
		assertTrue(tres.getState() instanceof Pending);
		
		
	}
	
	@Test
	public void workedTimeTest() {
		
		LocalTime from = LocalTime.now();
		tres.start();
		assertEquals(tres.workedTime().getSeconds(),Duration.between(from, LocalTime.now()).getSeconds());
		System.out.println(Duration.between(from, LocalTime.now()).getNano());
		System.out.println(tres.workedTime().getNano());
		
	}
	
	@Test
	public void addCommenTest() {
		
		uno.addComment("ING2");
		assertTrue(uno.getComments().contains("ING2"));
		cuatro.addComment("Cerrar puerta");
		assertFalse(cuatro.getComments().contains("Cerrar Puerta"));
		
	}

}
