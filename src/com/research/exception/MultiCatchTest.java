package com.research.exception;

public class MultiCatchTest {
	public static void main(String[] args) {

		calculate(1, 0);
	}

	public static void calculate(int a, int b) {
		try {//�������漰����������˿��ܻ��������쳣�������������try
			divided(a, b);
			Integer i = Integer.parseInt("124");
		}catch(NumberFormatException e) {
			System.out.println("����ҪΪȫ����");
			
		}catch (Exception e) {
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
