package com.microservice.communication;

import java.util.Arrays;
import java.util.List;

public class MaxAndMin {
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,15,45,22,36,42,85);
		 list.stream().mapToInt(x-> x).min().getAsInt();
		 list.stream().mapToInt(x-> x).max().getAsInt();
		

	}

}
