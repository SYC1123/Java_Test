package test5;

public class main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		try{
			Matrix matrix=new Matrix(3,3);
			matrix.Input();
			Matrix matrix2=new Matrix(3,3,matrix.Getarray());
			Matrix matrix3=new Matrix();
			matrix.multiply(matrix2, matrix3);
			matrix3.Output();
			matrix.setData(-1, 0, 0);
			matrix.getData(4, 4);
		}catch(MyException e){
			System.out.println(e.getMessage());
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("�����������쳣...");
		}
	}
}
