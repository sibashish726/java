package com.example.test;

import java.util.Arrays;
import java.util.List;

public class AllNumbersAreDivisibleByTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         List<Integer> alist=  Arrays.asList(2,4,81,12,44,64);
         boolean res= alist.stream().allMatch(n -> n%2==0);
         //boolean res= alist.stream().anyMatch(n -> n%2==0);
         
         if(res) { 
        	 System.out.println("Yes! all are divisible");
        	 } else { 
        		 System.out.println("Not all of thema are divisible");
           }
         
         
	}

}
