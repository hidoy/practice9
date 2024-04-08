package com.javaex.ex04;

public class RectTriangle extends Shape{
    private double width;
    private double height;
	public RectTriangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	 public double getArea() {
	    	return width*height/2;
	    } 
	    
	 public double getPerimeter() {
		double hyp=Math.sqrt(width*width + height*height);
	   	return width+height+hyp;
	 }
    
}