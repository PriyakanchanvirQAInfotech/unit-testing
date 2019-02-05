package org.qait.Consecutive.Junit;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;
public class AppTest {

	@Test
	public void arrayListConsecutiveLetters() {
		App letters= new App();
		List<String> al = new ArrayList<String>();
	      al.add("Apple");
	      al.add("Ant");
	      al.add("Egg");
	      al.add("Banana");
	      al.add("Dog");
	      al.add("Fish");
	    ArrayList expected = new ArrayList(); 
	    expected.add("Apple");
	    expected.add("Egg");
	    
	   assertEquals("Result is not matching", expected, letters.check(al));
	}
	
	@Test
	public void arrayListInteger() {
		App letters= new App();
		List<String> al = new ArrayList<String>();
	      al.add("112");
	      al.add("21");
	      al.add("1887");
	      al.add("1546");
	      al.add("6456");
	      al.add("3633");
	    ArrayList expected = new ArrayList(); 
	    
	    
	   assertEquals("String should contains letters", letters.check(al));
	}
	
}