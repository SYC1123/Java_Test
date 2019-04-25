package test3;

import test2.Point;

public class Circle1 {
	private Point center;
	private int r;
	public Circle1 (Point p,int r)
	{
		this.r=r;
		this.center=p;
	}
	public Circle1()
	{
		r=1;
		center=new Point();
	}
	public Circle1(int xx,int yy,int rr)
	{
		center=new Point(xx,yy);
		r=rr;
	}
	public void perimeter()
	{
		System.out.println("圆的周长为"+2*Math.PI*r);
	}
	public void area()
	{
		double s=Math.PI*r*r;
		System.out.println("圆的面积为"+s);
	}
	public int relation(Circle1 c)
	{
		int Sum=c.r+r;
		if(this.center==c.center&&this.r==c.r){
			return 0;//同一个圆
		}
		else if (this.center==c.center&&this.r!=c.r) {
			return 1;//同心圆
		}
		else if(Math.abs(this.r-c.r)<this.center.Distance(c.center)&&this.center.Distance(c.center)<Sum) {
			return 2;//相交圆
		}
		else if(this.center.Distance(c.center)>Sum){
			return 3;//分离圆
		}
		else {
			return 4;//包含圆
		}		
	}
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	

}
