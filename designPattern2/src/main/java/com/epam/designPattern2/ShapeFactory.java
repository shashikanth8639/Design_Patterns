package com.epam.designPattern2;

public class ShapeFactory extends AbstractFactoryPattern{
	@Override
	Shape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();         
	      }else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }	 
	      
		return null;
	}
}
