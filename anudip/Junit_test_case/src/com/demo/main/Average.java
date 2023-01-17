package com.demo.main;

public class Average {
public static int findAverage(int [] arr) {
	
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum = sum+arr[i];
	}
	int ave= sum/arr.length;
	return ave;
}
}
