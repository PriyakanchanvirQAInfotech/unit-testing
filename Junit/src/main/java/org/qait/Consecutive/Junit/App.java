package org.qait.Consecutive.Junit;

import java.util.*;
public class App {
	
	public List <String> check (List<String> al1){
		List actual = new ArrayList(); 
		for (int i = 0; i < al1.size(); i++) {
			for(int j=1; j < al1.get(i).length(); j++) {
				
				if(al1.get(i).charAt(j)== al1.get(i).charAt(j-1))
				{
					actual.add(al1.get(i));
				}
			}
		}
		return actual;
		
	}
}