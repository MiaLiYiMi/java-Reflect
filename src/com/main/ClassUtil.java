package com.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassUtil {
	public static void printClassMessage(Object obj){
		Class c=obj.getClass();
		System.out.println("---------类的名称----------"+c.getName());		
	}

	public static void getMethodMessage(Class c) {
		//类所有的public方法，包括继承父类的
		Method[] ms=c.getMethods();
		for (Method method : ms) {
			//得到方法的返回值类型的类类型
			Class returnType=method.getReturnType();
			//得到方法的参数类型列表的类类型
			Class[] patamTypes=method.getParameterTypes();
			System.out.println("方法返回值类型-----"+returnType+" 参数----- "+patamTypes);		
			}
		//类自己的public方法
		c.getDeclaredMethods();
	}

	public static void getFieldMessage(Class c) {
		/**
		 * 成员变量也是对象
		 */
		//得到所有的public成员变量，包括继承父类的
		//getFieldMessage(c);
		//得到自己的public成员变量
		Field[] fields2=c.getDeclaredFields();
		for (Field field : fields2) {
			//得到成员变量类型的类类型
			Class fieldType=field.getType();
			//得到成员变量类型的名字
			String typeName=fieldType.getName();
		}
		
		Field[] fields=c.getFields();
		for (Field field : fields) {
			//得到成员变量类型的类类型
			Class fieldType=field.getType();
			//得到成员变量类型的名字
			String typeName=fieldType.getName();
			String fieldName=field.getName();
			System.out.println("成员变量类型----"+typeName+"变量名----"+fieldName);
		}
	}
	/**
	 * 获取类的构造函数的信息
	 * @param obj
	 */
	public static void printConMessage(Object obj) {
		Class c=obj.getClass();
		//构造函数也是对象
		Constructor[] cs=c.getConstructors();
		for (Constructor constructor : cs) {
			System.out.print("构造函数----"+constructor.getName()+"(");
			Class[] patamTypes=constructor.getParameterTypes();
			for (Class class1 : patamTypes) {
				System.out.print(class1.getName()+",");
			}
			System.out.println(")");
		}
		
	}
}
