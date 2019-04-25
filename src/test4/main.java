package test4;

import test2.Circle;
import test2.Point;
import test3.color;

public class main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Point point=new Point();
		System.out.println(point.toString());
		Point point2=new Point(1,1);
		Point point3=new Point(1,1);
		System.out.println(point2.equals(point));
		System.out.println(point3.equals(point2));
		Circle circle=new Circle(1,1,1);
		System.out.println(circle.toString());
		Circle circle2=new Circle();
		System.out.println(circle.equals(circle2));
	}
	

}
