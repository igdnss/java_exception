package com.research.exception;

public class TryFinallyTest {
	public static void main(String[] args) {

		try {
			calculate(1, 0);
		}catch(Exception e) {
			System.out.println("在这里处理异常");
		}
	}

	public static void calculate(int a, int b) {
		try {//函数中涉及到除法，因此可能会有算术异常，所以这里加上try
			divided(a, b);
		} finally {
			//释放资源
			System.out.println("我想要怒放的生命");
		}
		//有异常时，此句不会执行到
		System.out.println("Hello");
	}

	public static void divided(int a, int b) {
		System.out.println(a / b);
	}
}
