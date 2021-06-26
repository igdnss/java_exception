package com.research.exception;

public class ExceptionTransfer1 {

	public static void main(String[] args) {
		
		calculate(1, 0);
	}

	public static void calculate(int a, int b) {
		try {
			divided(a, b);
		} catch (Exception e) {
			System.out.println("除数不能为0");
		}
	}

	public static void divided(int a, int b) {
		System.out.println(a/b);
	}

}
