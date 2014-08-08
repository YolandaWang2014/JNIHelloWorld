package com.yolanda.jni;


public class HelloWorld {
	/*
	 * 声明native方法：
	 * 如果你想将一个方法做为一个本地方法的话，
	 * 那么你就必须声明改方法为native的，并且不能实现。
	 */
	public native void displayHelloWorld();

	static {
		/*
		 * 加载动态库，这里一般是以static块进行加载的；
		 * 参数“hello”是动态库的名字。
		 */
		System.loadLibrary("hello");
	}

	public static void main(String[] args) {
		new HelloWorld().displayHelloWorld();
	}

}
