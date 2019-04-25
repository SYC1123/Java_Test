package test6;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator extends JFrame{
	public JFrame jFrame;
	public JPanel jPanel;
	public JPanel jPanel2;
	public JTextField jTextField;
	public JTextField jTextField2;
	public JTextField jTextField3;
	public JLabel jLabel,jLabel2;
	public JButton jButton,jButton2,jButton3,jButton4,jButton5;
	public calculator() {
		// TODO 自动生成的构造函数存根
		jFrame=new JFrame("简易计算器");
		jPanel=new JPanel();
		jPanel2=new JPanel();
		jFrame.setSize(700,130);
		jFrame.setLocation(400,400);
		jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		jPanel.setLayout(null);
		jTextField=new JTextField();
		jTextField.setBounds(150, 20, 100, 20);
		jLabel=new JLabel();
		jLabel.setBounds(250,20,20,20);
		jTextField2=new JTextField();
		jTextField2.setBounds(270, 20, 100, 20);
		jLabel2=new JLabel("=");
		jLabel2.setBounds(370,20,30,20);
		jTextField3=new JTextField();
		jTextField3.setBounds(400, 20, 100, 20);
		jPanel.add(jTextField);
		jPanel.add(jLabel);
		jPanel.add(jTextField2);
		jPanel.add(jLabel2);
		jPanel.add(jTextField3);
		jPanel2.setLayout(new FlowLayout());
		jButton=new JButton("+");
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				jLabel.setText("+");
			}
		});
		jButton2=new JButton("-");
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				jLabel.setText("一");
			}
		});
		jButton3=new JButton("*");
		jButton3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				jLabel.setText("*");
			}
		});
		jButton4=new JButton("/");
		jButton4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				jLabel.setText("/");
			}
		});
		jButton5=new JButton("=");
		jButton5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				double i=Double.parseDouble(jTextField.getText());
				double j=Double.parseDouble(jTextField2.getText());
				if(i%1==0&&j%1==0)
				{
					if(jLabel.getText()=="+")
					{
						jTextField3.setText((i+j)+"");
					}
					else if (jLabel.getText()=="一") {
						jTextField3.setText((i-j)+"");
					}
					else if (jLabel.getText()=="*") {
						jTextField3.setText((i*j)+"");
					}
					else {
						if(j==0)
						{
							javax.swing.JOptionPane.showMessageDialog(null, "除数不能为0！");
						}
					else
						{
							jTextField3.setText((i/j)+"");
						}
						}
						}
				else
				{
					javax.swing.JOptionPane.showMessageDialog(null, "请输入两个整数！");
				}
			}
		});
		jPanel2.add(jButton);
		jPanel2.add(jButton2);
		jPanel2.add(jButton3);
		jPanel2.add(jButton4);
		jPanel2.add(jButton5);
		jFrame.setLayout(new GridLayout(2, 1));
		jFrame.add(jPanel);
		jFrame.add(jPanel2);
		jFrame.setVisible(true);
	}
	
}