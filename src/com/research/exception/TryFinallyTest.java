package com.research.exception;

public class TryFinallyTest {
	public static void main(String[] args) {

		try {
			calculate(1, 0);
		}catch(Exception e) {
			System.out.println("�����ﴦ���쳣");
		}
	}

	public static void calculate(int a, int b) {
		try {//�������漰����������˿��ܻ��������쳣�������������try
			divided(a, b);
		} finally {
			//�ͷ���Դ
			System.out.println("����Ҫŭ�ŵ�����");
		}
		//���쳣ʱ���˾䲻��ִ�е�
		System.out.println("Hello");
	}

	public static void divided(int a, int b) {
		System.out.println(a / b);
	}
}
