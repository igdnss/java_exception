package com.research.exception;

public class TryCatchTest {

	public static void main(String[] args) {

		calculate(1, 0);
	}

	public static void calculate(int a, int b) {
		try {//�������漰����������˿��ܻ��������쳣�������������try
			divided(a, b);
		} catch (Exception e) {// �������д��Exception(����),Ҳ����дָ�����쳣ArithmeticException
			System.out.println("��������Ϊ0");
		}
		System.out.println("Hello");
	}

	public static void divided(int a, int b) {
		System.out.println(a / b);
	}

}
