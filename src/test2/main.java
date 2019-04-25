package test2;

public class main {

	public static void main(String[] args) {
		Point point=new Point(1,3);
		Point point1=new Point();
		System.out.println("两点距离为"+point.Distance(point1));
		System.out.println("point的X值为"+point.Getx());
		point.Setx(5);
		System.out.println("现在point的值为"+point.Getx());
		Circle circle=new Circle();
		circle.perimeter();
		circle.area();
		Circle circle2=new Circle(point, 4);
		circle2.perimeter();
		circle2.area();
		switch (circle.relation(circle2)) {
			case 0:
				System.out.println("同一个圆");
			break;
			case 1:
				System.out.println("同心圆");
				break;
			case 2:
				System.out.println("相交圆");
				break;
			case 3:
				System.out.println("分离圆");
				break;
			case 4:
				System.out.println("包含圆");
				break;
		default:
			break;
		}
	}
}
