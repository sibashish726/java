package com.example.test.two;

import java.util.Arrays;
import java.util.List;

public class MapToIntAppOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<String> str= Arrays.asList("3","23","21","13","19");
      str.stream().mapToInt(n -> Integer.parseInt(n)).filter(n ->n%3==0).forEach(System.out::println);
	}

}
