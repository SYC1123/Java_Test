package test3;

import test2.Point;

public class ColorredCircle extends Circle1  {
	private color borderColor;
	private color centerColor;
	public ColorredCircle() {
		// TODO 自动生成的构造函数存根
		super();
		borderColor=new color();
		centerColor=new color();
	}
	public ColorredCircle(color centerColor,color borderColor){
		super();
		this.borderColor=borderColor;
		this.centerColor=centerColor;
	}
	public ColorredCircle(int radius,Point center,color centerColor,color bordercolor){
		super(center, radius);
		this.borderColor=bordercolor;
		this.centerColor=centerColor;
	}
	public color getBorderColor() {
		return borderColor;
	}
	public void setBorderColor(color borderColor) {
		this.borderColor = borderColor;
	}
	public color getCenterColor() {
		return centerColor;
	}
	public void setCenterColor(color centerColor) {
		this.centerColor = centerColor;
	}
}
