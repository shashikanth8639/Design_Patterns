package com.epam.designPattern2;

public class Producer {
	public static AbstractFactoryPattern getFactory(boolean rounded){   
	      if(rounded){
	         return new RoundedShape();        
	      }else{
	         return new ShapeFactory();
	      }
	   }
}
