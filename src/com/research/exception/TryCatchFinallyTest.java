package com.research.exception;

public class TryCatchFinallyTest {
	public static void main(String[] args) {

		calculate(1, 0);
	}

	public static void calculate(int a, int b) {
		try {//�������漰����������˿��ܻ��������쳣�������������try
			divided(a, b);
//			System.exit(0);��ִ�����ʱ��Haha�����ӡ
		} catch (Exception e) {
			System.out.println("��������Ϊ0");
		}finally {
			//��ִ��
			System.out.println("Haha");
		}
		System.out.println("Hello");
	}

	public static void divided(int a, int b) {
		System.out.println(a / b);
	}
}
