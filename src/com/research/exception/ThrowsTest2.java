package com.research.exception;

import java.io.FileNotFoundException;

public class ThrowsTest2 {
	public static void main(String[] args) {
		//���봦����������벻ͨ��
		try {
			calculate(1, 0);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void calculate(int a, int b) throws FileNotFoundException {

		divided(a, b);
		// divided�����쳣ʱ��������ִ��
		System.out.println("Hello");
	}

	public static void divided(int a, int b) {
		System.out.println(a / b);
	}
}
