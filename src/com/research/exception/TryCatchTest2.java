package com.research.exception;

import java.util.FormatterClosedException;

public class TryCatchTest2 {

	public static void main(String[] args) {

		calculate(1, 0);
	}

	public static void calculate(int a, int b) {
		try {//�������漰����������˿��ܻ��������쳣�������������try
			divided(a, b);
		} catch (FormatterClosedException e) {// �������ָ����һ���쳣�������������쳣�����Գ�����ж�,�����ӡhello
			System.out.println("��������Ϊ0");
		}
		System.out.println("Hello");
	}

	public static void divided(int a, int b) {
		System.out.println(a / b);
	}

}
