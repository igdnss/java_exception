package com.research.exception;

import java.util.FormatterClosedException;

public class TryCatchTest2 {

	public static void main(String[] args) {

		calculate(1, 0);
	}

	public static void calculate(int a, int b) {
		try {//函数中涉及到除法，因此可能会有算术异常，所以这里加上try
			divided(a, b);
		} catch (FormatterClosedException e) {// 这里随便指定了一个异常，但不是算术异常，所以程序会中断,不会打印hello
			System.out.println("除数不能为0");
		}
		System.out.println("Hello");
	}

	public static void divided(int a, int b) {
		System.out.println(a / b);
	}

}
