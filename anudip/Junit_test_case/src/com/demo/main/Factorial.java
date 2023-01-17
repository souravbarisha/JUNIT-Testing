package com.demo.main;

public class Factorial {
public static int findFactorial(int num) {
	int fact=1;
	for(int i=1; i<=num; i++) {
		fact=fact*i;
	}
	return fact;
}
}
