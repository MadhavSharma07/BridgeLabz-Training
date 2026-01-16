package annotations;

import java.util.*;

public class SuppressWarningsAnnotation {
	@SuppressWarnings( "unchecked")
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(10);
		list.add("Madhav");
		list.add('c');
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		

	}

}