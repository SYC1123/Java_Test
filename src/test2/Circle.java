package test2;

public class Circle {
	private Point center;
	private int r;
	public Circle (Point p,int r)
	{
		this.r=r;
		this.center=p;
	}
	public Circle()
	{
		r=2;
		center=new Point();
	}
	public Circle(int xx,int yy,int rr)
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
	public int relation(Circle c)
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
	@Override
	public String toString() {
		return "Circle [center=" + center + ", r=" + r + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (center == null) {
			if (other.center != null)
				return false;
		} else if (!center.equals(other.center))
			return false;
		if (r != other.r)
			return false;
		return true;
	}
	
}
