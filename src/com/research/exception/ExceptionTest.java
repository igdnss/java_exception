package com.research.exception;

import java.io.File;
import java.io.FileInputStream;

public class ExceptionTest {
	public static void main(String[] args) {
		//��ָ���쳣
		String address= null;
		System.out.println(address);
		//����Խ���쳣
		String[] arr = {"a"};
		System.out.println(arr[2]);
		//�����쳣
		System.out.println(1/0);
		//����ת���쳣
		Object str = "aaa";
		Long i = (Long)str;
		//���ָ�ʽ���쳣
		int number = Integer.parseInt("1a");
		//�ļ��������쳣
		File file = new File("c:\\abc.txt");
		FileInputStream inputStream = new FileInputStream(file);
	}
}
