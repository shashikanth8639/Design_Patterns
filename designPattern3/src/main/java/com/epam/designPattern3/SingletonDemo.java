package com.epam.designPattern3;

public class SingletonDemo {
	
	public static void main (String[] args) {
      Singleton obj = Singleton.getInstance();
      obj.show();
   }

	private static SingletonDemo getInstance() {
		return null;
	}
}
