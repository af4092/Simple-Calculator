package com.Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MiniCalculator extends JFrame {

	private JPanel contentPane;
	private JTextField tfFirstNumber;
	private JTextField tfSecondNumber;
	private JLabel lbAnswer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiniCalculator frame = new MiniCalculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MiniCalculator() {
		setTitle("Simple Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbFirstNumber = new JLabel("First Number");
		lbFirstNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbFirstNumber.setBounds(10, 23, 169, 46);
		contentPane.add(lbFirstNumber);
		
		tfFirstNumber = new JTextField();
		tfFirstNumber.setFont(new Font("Tahoma", Font.PLAIN, 22));
		tfFirstNumber.setBounds(168, 36, 133, 33);
		contentPane.add(tfFirstNumber);
		tfFirstNumber.setColumns(10);
		
		JLabel lbSecondNumber = new JLabel("Second Number");
		lbSecondNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbSecondNumber.setBounds(10, 92, 169, 33);
		contentPane.add(lbSecondNumber);
		
		tfSecondNumber = new JTextField();
		tfSecondNumber.setFont(new Font("Tahoma", Font.PLAIN, 22));
		tfSecondNumber.setBounds(168, 91, 133, 33);
		contentPane.add(tfSecondNumber);
		tfSecondNumber.setColumns(10);
		
		JLabel lbResult = new JLabel("Answer");
		lbResult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbResult.setBounds(10, 167, 133, 25);
		contentPane.add(lbResult);
		
		lbAnswer = new JLabel("");
		lbAnswer.setBackground(Color.CYAN);
		lbAnswer.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbAnswer.setBounds(168, 171, 133, 25);
		contentPane.add(lbAnswer);
		
		JButton btnAddition = new JButton("+");
		btnAddition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstNumber = tfFirstNumber.getText();
				String secondNumber = tfSecondNumber.getText();
				double number1 = Double.parseDouble(firstNumber);
				double number2 = Double.parseDouble(secondNumber);
				double additionAnswer = number1 + number2;
				String additionResult = Double.toString(additionAnswer);
				
				lbAnswer.setText(additionResult);
			}
		});
		btnAddition.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAddition.setBounds(10, 222, 49, 31);
		contentPane.add(btnAddition);
		
		JButton btnClear = new JButton("Clr");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfFirstNumber.setText("");
				tfSecondNumber.setText("");
				lbAnswer.setText("");
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnClear.setBounds(343, 222, 70, 31);
		contentPane.add(btnClear);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstNumber = tfFirstNumber.getText();
				String secondNumber = tfSecondNumber.getText();
				double number1 = Double.parseDouble(firstNumber);
				double number2 = Double.parseDouble(secondNumber);
				double result2 = number1 - number2;
				String MinusResult = Double.toString(result2);
				lbAnswer.setText(MinusResult);
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMinus.setBounds(74, 222, 49, 31);
		contentPane.add(btnMinus);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstNumber = tfFirstNumber.getText();
				String secondNumber = tfSecondNumber.getText();
				double number1 = Double.parseDouble(firstNumber);
				double number2 = Double.parseDouble(secondNumber);
				double result3 = number1 * number2;
				String MultiplyResult = Double.toString(result3);
				lbAnswer.setText(MultiplyResult);
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMultiply.setBounds(149, 222, 49, 31);
		contentPane.add(btnMultiply);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstNumber = tfFirstNumber.getText();
				String secondNumber = tfSecondNumber.getText();
				double number1 = Double.parseDouble(firstNumber);
				double number2 = Double.parseDouble(secondNumber);
				double result4 = number1 / number2;
				String DivisionResult = Double.toString(result4);
				lbAnswer.setText(DivisionResult);
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDivide.setBounds(218, 222, 49, 31);
		contentPane.add(btnDivide);
		
		
	}

}
