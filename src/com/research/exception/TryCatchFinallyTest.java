package com.research.exception;

public class TryCatchFinallyTest {
	public static void main(String[] args) {

		calculate(1, 0);
	}

	public static void calculate(int a, int b) {
		try {//函数中涉及到除法，因此可能会有算术异常，所以这里加上try
			divided(a, b);
//			System.exit(0);当执行这句时，Haha不会打印
		} catch (Exception e) {
			System.out.println("除数不能为0");
		}finally {
			//必执行
			System.out.println("Haha");
		}
		System.out.println("Hello");
	}

	public static void divided(int a, int b) {
		System.out.println(a / b);
	}
}
