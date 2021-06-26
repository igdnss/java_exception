package com.research.exception;

public class ThrowTest {
	public static void main(String[] args) {
		try {
			calculate(1, 0);
		}catch(DenominatorCanNotBe0Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void calculate(int a, int b) {
		if (b != 0) {
			divided(a, b);
		} else {
			throw new DenominatorCanNotBe0Exception("除数不能为0");
		}
	}

	public static void divided(int a, int b) {
		System.out.println(a / b);
	}
}
