import javax.swing.*;

import java.awt.*;
import java.util.*;
import java.util.concurrent.*;
public class MathCards {

	
	public static void main(String[] args){
		int labelHeight = 150;
		int labelWidth = 150;
		Random rand = new Random();
		int seconds = 4;
		int nProblems = 20;

		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(800,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel contentPane = new JPanel();
		contentPane.setOpaque(true);
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(null);
		
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		JLabel sign = new JLabel();
		JLabel label3 = new JLabel();
		JLabel label4 = new JLabel();
		for (int i = 0; i < nProblems; ++i){
			int rand_int1 = rand.nextInt(8) + 2;
			int rand_int2 = rand.nextInt(8) + 2;
			String number1 = " " + rand_int1;
			String number2 = " " + rand_int2;
			sign.setText("+");
			sign.setSize(labelWidth*3, labelHeight);;
			sign.setLocation(frame.getWidth()/2-labelWidth-50, frame.getHeight()/5+labelHeight);
			sign.setFont(new Font("Calibri", Font.PLAIN, 150));
			sign.setVisible(true);
			label1.setText(number1);
			label1.setSize(labelWidth*3, labelHeight);
			label1.setLocation(frame.getWidth()/2-labelWidth, frame.getHeight()/5);
			label1.setFont(new Font("Calibri", Font.PLAIN, 150));
			label1.setVisible(true);
			label2.setText(number2);
			label2.setSize(labelWidth*3, labelHeight);;
			label2.setLocation(frame.getWidth()/2-labelWidth, frame.getHeight()/5+labelHeight);
			label2.setFont(new Font("Calibri", Font.PLAIN, 150));
			label2.setVisible(true);
			contentPane.add(label1);
			contentPane.add(label2);
			contentPane.add(sign);
			contentPane.add(label3);
			contentPane.add(label4);
			int sum = rand_int1 + rand_int2;
			String sumString = "" + sum;
			label3.setText(sumString);
			label3.setSize(labelWidth+5, labelHeight+5);
			label3.setLocation(frame.getWidth()/2-labelWidth, frame.getHeight()/2-labelHeight);
			label3.setFont(new Font("Calibri", Font.PLAIN, 150));
			label3.setVisible(false);
			label4.setText("__");
			label4.setSize(labelWidth+5, labelHeight+5);
			label4.setLocation(frame.getWidth()/2-labelWidth, frame.getHeight()/2);
			label4.setFont(new Font("Calibri", Font.PLAIN, 150));
			label4.setVisible(true);
			frame.setContentPane(contentPane);
			try {
				Thread.sleep(seconds*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			label1.setVisible(false);
			label2.setVisible(false);
			label4.setVisible(false);
			label3.setVisible(true);
			sign.setVisible(false);
			frame.setContentPane(contentPane);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("DONE");
		
	}
}
