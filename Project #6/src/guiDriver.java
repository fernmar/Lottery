//Fernando Martinez
//Computer Science II
//Project 6
//12/4/2019
//Lottery


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class guiDriver extends JFrame implements ActionListener {
	public static final int width = 600;
	public static final int height = 400;
	lotterynumbers program = new lotterynumbers();
	JTextField jt1, jt2, jt3, jt4, jt5, jt6, jt7, jt8, jt9, jt10, jt11, jt12;
	int num;
	
	public guiDriver()
	{
		setSize(width, height);
		setTitle("Lottery");
		Container content = getContentPane();
		content.setBackground(Color.gray);
		setLayout(null);
		
		JLabel l1 = new JLabel("User's Lottery Numbers: 0 - 9");
		JLabel l2 = new JLabel("Winning Lottery Numbers:");
		JLabel l3 = new JLabel("Number of Matches:");
		JLabel l4 = new JLabel("Prize:");
		JLabel l5 = new JLabel("Prizes:");
		JLabel l6 = new JLabel("0 Matches = Sorry, no prize!");
		JLabel l7 = new JLabel("1 Match = $2");
		JLabel l8 = new JLabel("2 Matches = $5");
		JLabel l9 = new JLabel("3 Matches = $10");
		JLabel l10 = new JLabel("4 Matches = $5,000");
		JLabel l11 = new JLabel("5 Matches = $50,000");
		JButton playButton = new JButton("Play");
		playButton.addActionListener(this);
		JButton resetButton = new JButton("Reset");
		resetButton.addActionListener(this);
		
		jt1 = new JTextField(3);
		jt2 = new JTextField(3);
		jt3 = new JTextField(3);
		jt4 = new JTextField(3);
		jt5 = new JTextField(3);
		jt6 = new JTextField(3);
		jt7 = new JTextField(3);
		jt8 = new JTextField(3);
		jt9 = new JTextField(3);
		jt10 = new JTextField(3);
		jt11 = new JTextField(3);
		jt12 = new JTextField(10);
		
		Dimension size1 = l1.getPreferredSize();
		Dimension size2 = l2.getPreferredSize();
		Dimension size3 = l3.getPreferredSize();
		Dimension size4 = l4.getPreferredSize();
		Dimension size5 = l5.getPreferredSize();
		Dimension size6 = l6.getPreferredSize();
		Dimension size7 = l7.getPreferredSize();
		Dimension size8 = l8.getPreferredSize();
		Dimension size9 = l9.getPreferredSize();
		Dimension size10 = l10.getPreferredSize();
		Dimension size11 = l11.getPreferredSize();
		Dimension size12 = playButton.getPreferredSize();
		Dimension size13 = resetButton.getPreferredSize();
		Dimension size14 = jt1.getPreferredSize();
		Dimension size15 = jt2.getPreferredSize();
		Dimension size16 = jt3.getPreferredSize();
		Dimension size17 = jt4.getPreferredSize();
		Dimension size18 = jt5.getPreferredSize();
		Dimension size19 = jt6.getPreferredSize();
		Dimension size20 = jt7.getPreferredSize();
		Dimension size21 = jt8.getPreferredSize();
		Dimension size22 = jt9.getPreferredSize();
		Dimension size23 = jt10.getPreferredSize();
		Dimension size24 = jt11.getPreferredSize();
		Dimension size25 = jt12.getPreferredSize();
		
		l1.setBounds(20, 5, size1.width, size1.height);
		l2.setBounds(20, 85, size2.width, size1.height);
		l3.setBounds(20, 175, size3.width, size3.height);
		l4.setBounds(20, 245, size4.width, size4.height);
		l5.setBounds(350, 85, size5.width, size5.height);
		l6.setBounds(350, 105, size6.width, size6.height);
		l7.setBounds(350, 125, size7.width, size7.height);
		l8.setBounds(350, 145, size8.width, size8.height);
		l9.setBounds(350, 165, size9.width, size9.height);
		l10.setBounds(350, 185, size10.width, size10.height);
		l11.setBounds(350, 205, size11.width, size11.height);
		
		playButton.setBounds(200, 325, size12.width, size12.height);
		resetButton.setBounds(275, 325, size13.width, size13.height);
		
		jt1.setBounds(10, 25, size14.width, size14.height);
		jt2.setBounds(55, 25, size15.width, size15.height);
		jt3.setBounds(100, 25, size16.width, size16.height);
		jt4.setBounds(145, 25, size17.width, size17.height);
		jt5.setBounds(190, 25, size18.width, size18.height);
		jt6.setBounds(10, 105, size19.width, size19.height);
		jt7.setBounds(55, 105, size20.width, size20.height);
		jt8.setBounds(100, 105, size21.width, size21.height);
		jt9.setBounds(145, 105, size22.width, size22.height);
		jt10.setBounds(190, 105, size23.width, size23.height);
		jt11.setBounds(20, 195, size24.width, size24.height);
		jt12.setBounds(20, 265, size25.width, size25.height);
		
		content.add(l1);
		content.add(l2);
		content.add(l3);
		content.add(l4);
		content.add(l5);
		content.add(l6);
		content.add(l7);
		content.add(l8);
		content.add(l9);
		content.add(l10);
		content.add(l11);
		content.add(playButton);
		content.add(resetButton);
		content.add(jt1);
		content.add(jt2);
		content.add(jt3);
		content.add(jt4);
		content.add(jt5);
		content.add(jt6);
		content.add(jt7);
		content.add(jt8);
		content.add(jt9);
		content.add(jt10);
		content.add(jt11);
		content.add(jt12);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	public static void main(String[] args) {
		guiDriver pho = new guiDriver();
		pho.setVisible(true);
		
	}
	
	
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("Play")) {
				program.userPick(jt1, jt2, jt3, jt4, jt5); //User picks numbers inputting into array
				program.generate(jt6, jt7, jt8, jt9,jt10); // Generates random numbers into an array
				num = program.check(jt11, num);
				program.prize(jt12,num);
			}
				else if(e.getActionCommand().equals("Reset")) {
				jt1.setText("");
				jt2.setText("");
				jt3.setText("");
				jt4.setText("");
				jt5.setText("");
				jt6.setText("");
				jt7.setText("");
				jt8.setText("");
				jt8.setText("");
				jt9.setText("");
				jt10.setText("");
				jt11.setText("");
				jt12.setText("");
					
				}
			}
			
			
		}