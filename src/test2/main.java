package test2;

public class main {

	public static void main(String[] args) {
		Point point=new Point(1,3);
		Point point1=new Point();
		System.out.println("�������Ϊ"+point.Distance(point1));
		System.out.println("point��XֵΪ"+point.Getx());
		point.Setx(5);
		System.out.println("����point��ֵΪ"+point.Getx());
		Circle circle=new Circle();
		circle.perimeter();
		circle.area();
		Circle circle2=new Circle(point, 4);
		circle2.perimeter();
		circle2.area();
		switch (circle.relation(circle2)) {
			case 0:
				System.out.println("ͬһ��Բ");
			break;
			case 1:
				System.out.println("ͬ��Բ");
				break;
			case 2:
				System.out.println("�ཻԲ");
				break;
			case 3:
				System.out.println("����Բ");
				break;
			case 4:
				System.out.println("����Բ");
				break;
		default:
			break;
		}
	}
}
