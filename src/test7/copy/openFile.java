package test7.copy;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class openFile extends JFrame{
	public JFrame jFrame;
	public JTextField jTextField;
	public JButton jButton;
	public JPanel jPanel;
	private String string;
	public String Filename;
	public openFile(){
		jFrame=new JFrame("打开文件");
		jPanel=new JPanel();
		jButton=new JButton("打开");
		jFrame.setBounds(300,300,300,100);
		jPanel.setLayout(new BorderLayout());
		jTextField=new JTextField();
		jPanel.add(jTextField,BorderLayout.CENTER);
		jPanel.add(jButton,BorderLayout.EAST);
		jFrame.add(jPanel);
		jFrame.setVisible(true);
	}
	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}
	public JButton getjButton() {
		return jButton;
	}
	public void setjButton(JButton jButton) {
		this.jButton = jButton;
	}
	
}
