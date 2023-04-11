package com.training.demo;
import java.util.*;

public class HashSetExmApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> setValue= new HashSet<String>();
		setValue.add("c++");
		setValue.add("c#");
		setValue.add("c");
		setValue.add("objective c");
		
		System.out.println(setValue);
		
		Set<String> setValue2= new HashSet<String>(setValue);
		setValue2.add("java");
		System.out.println(setValue2);
		
		for (String val : setValue2) {
			if(val=="java") {
				System.out.println("This is java");
			} else {
				System.out.println("This is "+val);
			}
		    
		}
		Set<String> setValue3= new HashSet<String>();
		setValue3.add("JS");
		setValue3.addAll(setValue2);
		System.out.println(setValue3);
		
		
		if(setValue3.remove("js1")!=true) {
			System.out.println("Value doesn't exist");
		} 
		Iterator<String> i=setValue3.iterator();  
        while(i.hasNext()){  
            System.out.println(i.next());  
        }  

	}

}
