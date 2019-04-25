package test7;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class textFile extends JFrame{
	public final static Color gray = new Color(128, 128, 128);
	public final static Color white = new Color(255, 255, 255);
	public JFrame jFrame,jFrame2,jFrame3;
	public JMenuBar jMenuBar;
	public JMenu jMenu;
	public JMenuItem jMenuItem,jMenuItem2,jMenuItem3,jMenuItem4;
	public JScrollPane jScrollPane;
	public JTextArea jTextArea;
	public JSeparator jSeparator;
	public JTextField jTextField;
	public JButton jButton;
	private String Filename;
	String string;
	public textFile()
	{
		jFrame=new JFrame("简易文本编辑器");
		jFrame.setBounds(200,200,500,500);
		jMenuBar = new JMenuBar();
		jMenu = new JMenu("文件");
		jMenuItem = new JMenuItem("打开");
		jMenuItem2 = new JMenuItem("保存");
		jMenuItem2.setBackground(gray);
		jMenuItem2.setEnabled(false);
		jMenuItem3 = new JMenuItem("另存为");
		jMenuItem4 = new JMenuItem("退出");
		jSeparator = new JSeparator();
		jMenu.add(jMenuItem);
		jMenu.add(jMenuItem2);
		jMenu.add(jMenuItem3);
		jMenu.add(jSeparator);
		jMenu.add(jMenuItem4);
		jScrollPane = new JScrollPane();
		jTextArea = new JTextArea();
		jScrollPane.setViewportView(jTextArea);
		jFrame.add(jScrollPane);
		jMenuBar.add(jMenu);
		jFrame.setJMenuBar(jMenuBar);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public JFrame getjFrame() {
		return jFrame;
	}
	public void setjFrame(JFrame jFrame) {
		this.jFrame = jFrame;
	}
	public JFrame getjFrame2() {
		return jFrame2;
	}
	public void setjFrame2(JFrame jFrame2) {
		this.jFrame2 = jFrame2;
	}
	public JFrame getjFrame3() {
		return jFrame3;
	}
	public void setjFrame3(JFrame jFrame3) {
		this.jFrame3 = jFrame3;
	}
	public JMenuBar getjMenuBar() {
		return jMenuBar;
	}
	public void setjMenuBar(JMenuBar jMenuBar) {
		this.jMenuBar = jMenuBar;
	}
	public JMenu getjMenu() {
		return jMenu;
	}
	public void setjMenu(JMenu jMenu) {
		this.jMenu = jMenu;
	}
	public JMenuItem getjMenuItem() {
		return jMenuItem;
	}
	public void setjMenuItem(JMenuItem jMenuItem) {
		this.jMenuItem = jMenuItem;
	}
	public JMenuItem getjMenuItem2() {
		return jMenuItem2;
	}
	public void setjMenuItem2(JMenuItem jMenuItem2) {
		this.jMenuItem2 = jMenuItem2;
	}
	public JMenuItem getjMenuItem3() {
		return jMenuItem3;
	}
	public void setjMenuItem3(JMenuItem jMenuItem3) {
		this.jMenuItem3 = jMenuItem3;
	}
	public JMenuItem getjMenuItem4() {
		return jMenuItem4;
	}
	public void setjMenuItem4(JMenuItem jMenuItem4) {
		this.jMenuItem4 = jMenuItem4;
	}
	public JScrollPane getjScrollPane() {
		return jScrollPane;
	}
	public void setjScrollPane(JScrollPane jScrollPane) {
		this.jScrollPane = jScrollPane;
	}
	public JTextArea getjTextArea() {
		return jTextArea;
	}
	public void setjTextArea(JTextArea jTextArea) {
		this.jTextArea = jTextArea;
	}
	public JSeparator getjSeparator() {
		return jSeparator;
	}
	public void setjSeparator(JSeparator jSeparator) {
		this.jSeparator = jSeparator;
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
	public String getFilename() {
		return Filename;
	}
	public void setFilename(String filename) {
		Filename = filename;
	}
	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}


}
