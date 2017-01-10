package com.main;

import java.lang.reflect.Method;
import java.util.ArrayList;


public class MethodNewDemo {
	public static void main(String[] args){
		ArrayList list=new ArrayList();
		//list.add("dsad");
		list.add(1);
		Class class1=list.getClass();
		System.out.println(list.get(0));
		
		ArrayList<String> list1=new ArrayList<String>();
		Class class2=list1.getClass();
		list1.add("dfdf");
		//list1.add(20);错误的
		System.out.println(list.get(0));
		
		try {
			Method method=class1.getMethod("add",Object.class);
			//绕过编译操作绕过了泛型
			method.invoke(list1, 20);
			System.out.println(list1.size());
			System.out.println(list1);
			/*
			 * 
			for (String string : list1) {
				System.out.println(string);
			}
			*/
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
