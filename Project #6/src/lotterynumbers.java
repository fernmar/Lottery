//Fernando Martinez
//Computer Science II
//Project 6
//12/4/2019
//Lottery



import java.util.Random;
import java.util.Scanner;
import javax.swing.*;

public class lotterynumbers {
	int num;
	int match;
	int[] lotto = new int[5];
	int[] picks = new int[5];

	public void generate(JTextField jt6,JTextField jt7, JTextField jt8, JTextField jt9, JTextField jt10) {
		int number;
		Random rand = new Random();
		for (int t = 0; t < lotto.length; t++) {
			number = rand.nextInt(10);
			lotto[t] = number;
		}
		jt6.setText(Integer.toString(lotto[0]));
		jt7.setText(Integer.toString(lotto[1]));
		jt8.setText(Integer.toString(lotto[2]));
		jt9.setText(Integer.toString(lotto[3]));
		jt10.setText(Integer.toString(lotto[4]));
	}

	public void userPick(JTextField jt1, JTextField jt2, JTextField jt3, JTextField jt4, JTextField jt5) {
		Scanner keyboard = new Scanner(System.in);
			picks[0] = Integer.parseInt(jt1.getText());
			picks[1] = Integer.parseInt(jt2.getText());
			picks[2] = Integer.parseInt(jt3.getText());
			picks[3] = Integer.parseInt(jt4.getText());
			picks[4] = Integer.parseInt(jt5.getText());
		keyboard.close();

	}

	public int check(JTextField jt11,int num) {
		if (lotto[0] == picks[0])
			num++;
		if (lotto[1] == picks[1])
			num++;
		if (lotto[2] == picks[2])
			num++;
		if (lotto[3] == picks[3])
			num++;
		if (lotto[4] == picks[4])
			num++;
		jt11.setText(Integer.toString(num));
		return num;
	}
	public void prize(JTextField jt12, int num) {
		if(num == 0)
			jt12.setText("Sorry no prize");
		else if(num == 1)
			jt12.setText("$2");
		else if(num == 2)
			jt12.setText("$5");
		else if(num == 3)
			jt12.setText("$10");
		else if(num == 4)
			jt12.setText("$5,000");
		else if(num == 5)
			jt12.setText("$10,000");
	}

	

}