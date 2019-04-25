package test3;

import test2.Point;

public class main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根\
		color color=new color(1,1,1);
		ColorredCircle colorredCircle=new ColorredCircle();
		colorredCircle.area();
		colorredCircle.perimeter();
		System.out.println("无参构造的有色圆bordercolor为"+	colorredCircle.getBorderColor().getRed()+colorredCircle.getBorderColor().getGreen()+colorredCircle.getBorderColor().getBlue());
		//colorredCircle.getCenterColor();
		colorredCircle.setBorderColor(color);
		System.out.println("改变有色圆bordercolor为"+colorredCircle.getBorderColor().getRed()+colorredCircle.getBorderColor().getGreen()+colorredCircle.getBorderColor().getBlue());
		colorredCircle.getBorderColor().setBlue(2);
		System.out.println("改变蓝色有色圆bordercolor为"+colorredCircle.getBorderColor().getRed()+colorredCircle.getBorderColor().getGreen()+colorredCircle.getBorderColor().getBlue());
		System.out.println("无参构造的有色圆的圆心X，Y，半径为"+colorredCircle.getCenter().Getx()+colorredCircle.getCenter().Gety()+colorredCircle.getR());
		color centerColor=new color();
		color borderColor=new color(2,2,2);
		ColorredCircle colorredCircle2=new ColorredCircle(centerColor,borderColor);
		System.out.println("有参构造的有色圆bordercolor为"+	colorredCircle2.getBorderColor().getRed()+colorredCircle2.getBorderColor().getGreen()+colorredCircle2.getBorderColor().getBlue());
		int radius=3;
		Point point=new Point(1,1);
		ColorredCircle colorredCircle3=new ColorredCircle(radius,point,centerColor,borderColor);
		System.out.println("有参构造的有色圆的圆心X，Y，半径为"+colorredCircle3.getCenter().Getx()+colorredCircle3.getCenter().Gety()+colorredCircle3.getR());

	}

}
