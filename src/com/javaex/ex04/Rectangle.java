package com.javaex.ex04;

public class Rectangle extends Shape implements Resizeable{
    private double width;
    private double height;
    
    
    @Override
    public void resize(double s) {
    	width=width*s;
    	height=height*s;
    }
    public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	@Override
    public double getArea() {
    	return width*height;
    }
    
    public double getPerimeter() {
    	return (width+height)*2;
    }
}