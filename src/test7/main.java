package test7;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class main {
	public final static Color gray = new Color(128, 128, 128);
	public final static Color white = new Color(255, 255, 255);
	public static String string;
	public static int flag,flag_save=0;
	public static String Filename;
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		textFile textFile=new textFile();
		/*�򿪵���¼�*/
		textFile.getjMenuItem().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				openFile openFile=new openFile();
				openFile.getjButton().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO �Զ����ɵķ������
						FileInputStream fileInputStream=null;
						flag=1;
						textFile.jMenuItem2.setBackground(null);
						textFile.jMenuItem2.setEnabled(true);
						try{
							fileInputStream=new FileInputStream(openFile.jTextField.getText());
							Filename=new String(openFile.jTextField.getText());
							byte a[]=new byte[100];
							int b=fileInputStream.read(a);
							string = new String(a, 0, b);
							textFile.getjTextArea().setText(string);
							openFile.jFrame.dispose();
						}catch(FileNotFoundException e1){
							javax.swing.JOptionPane.showMessageDialog(null, "Error! "+e1.getMessage());
						}catch (IOException e2) {
							// TODO: handle exception
							javax.swing.JOptionPane.showMessageDialog(null, "Error! "+e2.getMessage());
						}finally {
							try{
								if(fileInputStream!=null)
								{
									fileInputStream.close();
								}
							}catch(IOException e3){
								javax.swing.JOptionPane.showMessageDialog(null, "Error! "+e3.getMessage());
							}
						}
					}
				});
			}
		});
		/*�������¼�*/
		textFile.getjMenuItem2().addActionListener(new ActionListener() {
			
			@SuppressWarnings("null")
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO �Զ����ɵķ������
				if(flag==1){
					string=textFile.getjTextArea().getText();
					FileOutputStream fileOutputStream=null;
					try {
						flag_save=1;
						fileOutputStream=new FileOutputStream(Filename);
						fileOutputStream.write(textFile.getjTextArea().getText().getBytes());
						javax.swing.JOptionPane.showMessageDialog(null, "����ɹ���");
					} catch (Exception e) {
						// TODO: handle exception
						javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
					}finally {
						if(fileOutputStream==null)
						{
							try {
								fileOutputStream.close();
							} catch (Exception e2) {
								// TODO: handle exception
								javax.swing.JOptionPane.showMessageDialog(null, e2.getMessage());
							}
						}
					}
				}
			}
		});
		/*���Ϊ����¼�*/
		textFile.getjMenuItem3().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO �Զ����ɵķ������
				saveFile saveFile=new saveFile();
				saveFile.jButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO �Զ����ɵķ������
						Filename=saveFile.jTextField.getText();
						FileOutputStream fileOutputStream=null;
						try {
							flag_save=1;
							fileOutputStream=new FileOutputStream(Filename);
							fileOutputStream.write(textFile.jTextArea.getText().getBytes());
							saveFile.jFrame.dispose();
							javax.swing.JOptionPane.showMessageDialog(null, "����ɹ���");
						} catch (Exception e2) {
							// TODO: handle exception
							javax.swing.JOptionPane.showMessageDialog(null, e2.getMessage());
						}finally {
							if (fileOutputStream==null) {
								try {
									fileOutputStream.close();
								} catch (Exception e3) {
									// TODO: handle exception
									javax.swing.JOptionPane.showMessageDialog(null, e3.getMessage());
								}
							}
						}
					}
				});
			}
		});
		/*�˳�����¼�*/
		textFile.getjMenuItem4().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				if(flag_save==1)
				{
					textFile.dispose();
				}
			}
		});
	}
	
}
