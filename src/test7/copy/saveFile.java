package test7.copy;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class saveFile extends JFrame{
	public JFrame jFrame;
	public JTextField jTextField;
	public JButton jButton;
	public JPanel jPanel;
	private String string;
	public String Filename;
	public saveFile(){
	jFrame=new JFrame("保存文件");
	jPanel=new JPanel();
	jButton=new JButton("保存");
	jFrame.setBounds(300,300,300,100);
	jPanel.setLayout(new BorderLayout());
	jTextField=new JTextField();
	jPanel.add(jTextField,BorderLayout.CENTER);
	jPanel.add(jButton,BorderLayout.EAST);
	jFrame.add(jPanel);
	jFrame.setVisible(true);
	}
	public JFrame getjFrame() {
		return jFrame;
	}
	public void setjFrame(JFrame jFrame) {
		this.jFrame = jFrame;
	}
	public JTextField getjTextField() {
		return jTextField;
	}
	public void setjTextField(JTextField jTextField) {
		this.jTextField = jTextField;
	}
	public JButton getjButton() {
		return jButton;
	}
	public void setjButton(JButton jButton) {
		this.jButton = jButton;
	}
	public JPanel getjPanel() {
		return jPanel;
	}
	public void setjPanel(JPanel jPanel) {
		this.jPanel = jPanel;
	}
	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}
	public String getFilename() {
		return Filename;
	}
	public void setFilename(String filename) {
		Filename = filename;
	}

}
