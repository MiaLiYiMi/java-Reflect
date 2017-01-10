package com.main;

public class ClassUtilsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="ss";
		Class c=string.getClass();
		ClassUtil.printClassMessage(string);
		ClassUtil.printConMessage(string);
		ClassUtil.getFieldMessage(c);
		ClassUtil.getMethodMessage(c);
	}

}
