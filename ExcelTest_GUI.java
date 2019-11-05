package excel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ExcelTest_GUI extends JFrame {

	private int result ;
	private String x;
	private String y;
	private String sheet;

	ExcelTest excel = new ExcelTest();

	JTextField t1 = new JTextField("0");
	JTextField t2 = new JTextField("X축 입력");
	JTextField t3 = new JTextField("Y축 입력");
	JTextField t4 = new JTextField("Sheet 입력");

	JButton bu = new JButton("실행");

	public ExcelTest_GUI() {

		setTitle("Excel Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);

		t1.setBounds(120, 30, 100, 30);
		add(t1);

		t2.setBounds(50, 100, 100, 50);
		t2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField b = (JTextField) e.getSource();
				x = b.getText();
				b.setText(x + "값");
			}
		});
		t2.addMouseListener(new MouseListener() {

			
			@Override
			public void mousePressed(MouseEvent e) {
				t2.setText(null);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		add(t2);

		t3.setBounds(220, 100, 100, 50);
		t3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField b = (JTextField) e.getSource();
				y = b.getText();
				b.setText(y + "값");
			}
		});
		t3.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				t3.setText(null);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		add(t3);

		t4.setBounds(130, 180, 100, 50);
		t4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField b = (JTextField) e.getSource();
				sheet = b.getText();
				b.setText(sheet+ "값");
			}
		});
		t4.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				t4.setText(null);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		add(t4);

		bu.setBounds(140, 250, 80, 50);
		bu.addMouseListener(new MouseListener() {

			
			@Override
			public void mouseExited(MouseEvent e) {
				bu.setBackground(Color.WHITE);

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				bu.setBackground(Color.GRAY);

			}
			
			@Override
			public void mousePressed(MouseEvent e) {
						try {
							result = excel.excelTests(Integer.parseInt(x), Integer.parseInt(y),
									Integer.parseInt(sheet));
						} catch (IOException e1) {
							e1.printStackTrace();
						}
						t1.setText(Integer.toString(result) + "개");
	
					}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}


			

		});
		add(bu);

		setResizable(true);
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setVisible(true);

	}

}
