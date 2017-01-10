package com.main;

import java.lang.reflect.Method;

public class MethodDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		A a1=new A();
		a1.print("sss", "aaa");
		a1.print(20, 80);
		
		Class class1=a1.getClass();
		Method method=class1.getMethod("print",String.class,String.class);
		//方法对象反射操作
		method.invoke(a1,"a100","s1");
		
		Class class2=a1.getClass();
		Method method1=class2.getMethod("print",int.class,int.class);
		//方法对象反射操作
		method1.invoke(a1,10,20);
		
	}

}
class A{
	public void print(int a,int b) {
		System.out.println(a+b);
	}
	public void print(String a,String b) {
		System.out.println(a.toUpperCase()+","+b.toUpperCase());
	}
}