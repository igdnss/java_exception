package com.research.exception;

public class ThrowsTest1 {

	public static void main(String[] args) {
		
		try {
			calculate(1, 0);
		}catch(ArithmeticException e) {
			System.out.println("�����쳣");
		}
	}

	public static void calculate(int a, int b) throws ArithmeticException {
		
		divided(a, b);
		//divided�����쳣ʱ��������ִ��
		System.out.println("Hello");
	}

	public static void divided(int a, int b) {
		System.out.println(a / b);
	}

}
