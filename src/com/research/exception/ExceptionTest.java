package com.research.exception;

import java.io.File;
import java.io.FileInputStream;

public class ExceptionTest {
	public static void main(String[] args) {
		//空指针异常
		String address= null;
		System.out.println(address);
		//数组越界异常
		String[] arr = {"a"};
		System.out.println(arr[2]);
		//算术异常
		System.out.println(1/0);
		//类型转换异常
		Object str = "aaa";
		Long i = (Long)str;
		//数字格式化异常
		int number = Integer.parseInt("1a");
		//文件不存在异常
		File file = new File("c:\\abc.txt");
		FileInputStream inputStream = new FileInputStream(file);
	}
}
