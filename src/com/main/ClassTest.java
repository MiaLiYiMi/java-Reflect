package com.main;

public class ClassTest {
	public static void main(String[] args) throws Exception{
		//创建一个实例对象
		Foo foo=new Foo();
		
		//Foo这个类本身也是实例对象，是Class类的实例对象
		Class class1=Foo.class;
		
		Class class2=foo.getClass();
		
		Class class3=Class.forName("com.main.Foo");
		
		//通过类的类类型创建该类的实例对象
		Foo f1=(Foo)class1.newInstance();//需要有无参数的构造方法
		f1.foo();
		
		Foo f2=(Foo)class2.newInstance();//需要有无参数的构造方法
		f2.foo();
		
		Foo f3=(Foo)class3.newInstance();//需要有无参数的构造方法
		f3.foo();
	}
	
	
}
class Foo{
	void foo(){
		System.out.println("FOO");
	}
}