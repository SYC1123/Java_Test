package test5;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
	private int rows;
	private int cols;
	private double data[][]=new double[100][100];
	public Matrix()
	{
		rows=5;
		cols=5;
	}
	public Matrix (int row,int col,double data1[][])throws MyException
	{
		if(row<0||col<0)
		{
			throw new MyException("数组元素个数不能为负数...");
		}
		this.rows=row;
		this.cols=col;
		this.data=Arrays.copyOf(data1, this.data.length);
	}
	public Matrix(int row,int col)throws MyException
	{
		if(row<0||col<0)
		{
			throw new MyException("数组元素个数不能为负数...");
		}
		this.rows=row;
		this.cols=col;
	}
	public Matrix(double data1[][])
	{
		this.data=Arrays.copyOf(data1, this.data.length);
	}
	public double getData(int row,int col)throws MyException
	{
		if(row<0||col<0)
		{
			throw new MyException("数组下标不能为负数...");
		}
		if(row>this.rows||col>this.cols)
		{
			throw new MyException("要输入的行列下标小于该矩阵的行列下标...");
		}
		return data[row][col];
	}
	public void setData(int row,int col,double value)throws MyException
	{
		if(row<0||col<0)
		{
			throw new MyException("数组下标不能为负数...");
		}
		if(row>this.rows||col>this.cols)
		{
			throw new MyException("要输入的行列下标小于该矩阵的行列下标...");
		}
		data[row][col]=value;
	}
	public void multiply(Matrix m,Matrix newarray) throws MyException
	{
		if(this.cols!=m.rows)
		{
			throw new MyException("两矩阵行列值不相等...");
		}
		newarray.rows=this.rows;
		newarray.cols=m.cols;
		for(int i=0;i<this.rows;i++)
		{
			for(int j=0;j<m.cols;j++)
			{
				newarray.data[i][j]=0;
				for(int k=0;k<this.rows;k++)
				{
					newarray.data[i][j]=newarray.data[i][j]+this.data[i][k]*m.data[k][j];
				}
			}
		}
	}
	public void Input()
	{
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<this.rows;i++)
		{
			System.out.println("输入第"+(i+1)+"行元素(共"+this.cols+"列)");
			for(int j=0;j<this.cols;j++)
			{
				this.data[i][j]=scanner.nextDouble();
			}
		}
	}
	public double[][] Getarray()
	{
		return this.data;
	}
	public void Output()
	{
		for(int i=0;i<this.rows;i++)
		{
			System.out.println("第"+(i+1)+"行元素为");
			for(int j=0;j<this.cols;j++)
			{
				System.out.print(this.data[i][j]+" ");
			}
			System.out.println();
		}
	}
}
