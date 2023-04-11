package com.example.test.three;

public class PalildromeStringApp {

	public static void main(String[] args) {
      String str="My name is sibashish and i can speak malayalam";
      String[] words= str.split(" ");
      System.out.println("Palindrome Strings are : ");
      for(String w:words) {
    	  if(isPalindrome(w)) {
    		  System.out.println(w);
    	  }
      }
      
	}
	public static boolean isPalindrome(String str) {
		int start=0, end=str.length()-1;
		while(start<end) {
			if(str.charAt(start)!= str.charAt(end)) {
				return false;
			} else {
				start++;
				end--;
			}
		}
		return true;
	}

}
