package Abstraction;

import java.util.Scanner;

abstract class Shape{
	protected double area;
	public Shape() {
	}
	public abstract void calculateArea();
	public final double getArea() {
		return this.area;	
	} 
	
}
class Rectangle extends Shape{
	
	private double length;
	private double bredth;
	public Rectangle() {
		super();
	}
	public void setLength(double length) {
		this.length = length;
	}

	public void setBredth(double bredth) {
		this.bredth = bredth;
	}
	public void calculateArea() {
		this.area= this.length * this.bredth;
	}	
}
class Circle extends Shape{
	private double radius;
	public Circle() {
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void calculateArea() {
		this.area = Math.PI * Math.pow(this.radius,2);
	}
}
public class ProgramShape {
	static Scanner sc = new Scanner(System.in);
	private static void acceptRecord(Shape shape) {
		if (shape instanceof Rectangle) {
			Rectangle rect = (Rectangle) shape;  //downcasting
			System.out.print("Length : ");
			rect.setLength(sc.nextDouble());
			System.out.print("Breadth : ");
			rect.setBredth(sc.nextDouble());
		}else {
			Circle c =(Circle) shape;
			System.out.println("Radius : ");
			c.setRadius(sc.nextDouble());
		}
		
	}
	private static void printRecord(Shape shape) {
		System.out.println("Area : "+shape.getArea());	
	}
	
	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Rectangle");
		System.out.println("2.Circle");
		System.out.println("Enter choice : ");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int ch;
		while ((ch = ProgramShape.menuList()) != 0) {
			Shape shape = null;
			switch (ch) {
			case 1:
				shape = new Rectangle(); //upcasting
 				break;
			case 2:
				shape = new Circle(); //upcasting
				break;
			}
			if (shape != null) {
				ProgramShape.acceptRecord(shape);
				shape.calculateArea();
				ProgramShape.printRecord(shape);
			}
		}
	}

}
