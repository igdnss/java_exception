package com.research.exception;

public class TryCatchTest {

	public static void main(String[] args) {

		calculate(1, 0);
	}

	public static void calculate(int a, int b) {
		try {//函数中涉及到除法，因此可能会有算术异常，所以这里加上try
			divided(a, b);
		} catch (Exception e) {// 这里可以写成Exception(父类),也可以写指定的异常ArithmeticException
			System.out.println("除数不能为0");
		}
		System.out.println("Hello");
	}

	public static void divided(int a, int b) {
		System.out.println(a / b);
	}

}
