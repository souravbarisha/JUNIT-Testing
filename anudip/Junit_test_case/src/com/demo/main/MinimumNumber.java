package com.demo.main;

public class MinimumNumber {
public static int findMinimum(int [] arr) {
	int min = arr[0];
	for(int i=0; i<arr.length; i++) {
		if(arr[i]<min)
			min=arr[i];
	}
	return min;
}
}
