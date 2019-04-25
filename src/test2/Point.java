package test2;

import java.util.Scanner;

public class Point {
	private int x;
	private int y;
	public Point()
	{
		x=0;
		y=0;
	}
	public Point (int xx,int yy)
	{
		this.x=xx;
		this.y=yy;
	}
	public int Getx()
	{
		return x;
	}
	public int Gety()
	{
		return y;
	}
	public void Setx(int x)
	{
		this.x=x;
	}
	public void Sety(int y)
	{
		this.y=y;
	}
	public double Distance(Point p)
	{
		double r=Math.sqrt((p.x-this.x)*(p.x-this.x)+(p.y-this.y)*(p.y-this.y));
		return r;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	

}
