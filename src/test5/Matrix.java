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
			throw new MyException("����Ԫ�ظ�������Ϊ����...");
		}
		this.rows=row;
		this.cols=col;
		this.data=Arrays.copyOf(data1, this.data.length);
	}
	public Matrix(int row,int col)throws MyException
	{
		if(row<0||col<0)
		{
			throw new MyException("����Ԫ�ظ�������Ϊ����...");
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
			throw new MyException("�����±겻��Ϊ����...");
		}
		if(row>this.rows||col>this.cols)
		{
			throw new MyException("Ҫ����������±�С�ڸþ���������±�...");
		}
		return data[row][col];
	}
	public void setData(int row,int col,double value)throws MyException
	{
		if(row<0||col<0)
		{
			throw new MyException("�����±겻��Ϊ����...");
		}
		if(row>this.rows||col>this.cols)
		{
			throw new MyException("Ҫ����������±�С�ڸþ���������±�...");
		}
		data[row][col]=value;
	}
	public void multiply(Matrix m,Matrix newarray) throws MyException
	{
		if(this.cols!=m.rows)
		{
			throw new MyException("����������ֵ�����...");
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
			System.out.println("�����"+(i+1)+"��Ԫ��(��"+this.cols+"��)");
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
			System.out.println("��"+(i+1)+"��Ԫ��Ϊ");
			for(int j=0;j<this.cols;j++)
			{
				System.out.print(this.data[i][j]+" ");
			}
			System.out.println();
		}
	}
}
