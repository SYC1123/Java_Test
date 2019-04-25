package test8;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class time extends JFrame {
	private Thread Beijing;
	private Thread New_York;
	private Thread London;
	public JFrame jFrame;
	public JPanel jPanel, jPanel2, jPanel3;
	public JLabel jLabel, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6;
	Font font = new Font("宋体", Font.BOLD, 30);

	public time() {
		// TODO 自动生成的构造函数存根
		jFrame = new JFrame("世界时钟");
		jFrame.setBounds(200, 200, 800, 150);
		jFrame.setLayout(new GridLayout(1, 3));

		jPanel = new JPanel();
		jPanel.setLayout(new GridLayout(2, 1));
		jLabel = new JLabel("北京时间");
		jLabel.setFont(font);
		jLabel2 = new JLabel();
		Beijing = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO 自动生成的方法存根
				while (true) {
					Calendar now = Calendar.getInstance();
					String sdf = new SimpleDateFormat("HH:mm:ss").format(now.getTime());
					jLabel2.setText(sdf);
					jLabel2.setFont(font);
				}
			}
		});
		Beijing.start();
		jPanel.add(jLabel);
		jPanel.add(jLabel2);

		jPanel2 = new JPanel();
		jPanel2.setLayout(new GridLayout(2, 1));
		jLabel3 = new JLabel("纽约时间");
		jLabel3.setFont(font);
		jLabel4 = new JLabel();
		New_York = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO 自动生成的方法存根
				while (true) {
					Calendar now = Calendar.getInstance();
					now.add(Calendar.HOUR, -12);
					String sdf = new SimpleDateFormat("HH:mm:ss").format(now.getTime());
					jLabel4.setText(sdf);
					jLabel4.setFont(font);
				}
			}
		});
		New_York.start();
		jPanel2.add(jLabel3);
		jPanel2.add(jLabel4);

		jPanel3 = new JPanel();
		jPanel3.setLayout(new GridLayout(2, 1));
		jLabel5 = new JLabel("伦敦时间");
		jLabel5.setFont(font);
		jLabel6 = new JLabel();
		London = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO 自动生成的方法存根
				while (true) {
					Calendar now = Calendar.getInstance();
					now.add(Calendar.HOUR, -7);
					String sdf = new SimpleDateFormat("HH:mm:ss").format(now.getTime());
					jLabel6.setText(sdf);
					jLabel6.setFont(font);
				}
			}
		});
		London.start();
		jPanel3.add(jLabel5);
		jPanel3.add(jLabel6);

		jFrame.add(jPanel);
		jFrame.add(jPanel2);
		jFrame.add(jPanel3);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
