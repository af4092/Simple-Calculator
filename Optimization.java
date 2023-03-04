package com.Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;

public class Optimization extends JFrame {

	private JPanel contentPane;
	private JTextField tfNumber;
	private String firstNumber, secondNumber;
	private JLabel lbCalculation;
	private JButton btnMinus;
	private String operation;
	private JButton btnMultiply;
	private JButton btnDivide;
	private JButton btnClear;
	private JButton btnSqrt;
	private JButton btnSquare;
	private JButton btnSquare_1;
	private JButton btnOne;
	private JButton btnTwo;
	private JButton btnThree;
	private JButton btnFour;
	private JButton btnFive;
	private JButton btnSix;
	private JButton btnSeven;
	private JButton btnNine;
	private JButton btnEight;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Optimization frame = new Optimization();
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
	public Optimization() {
		setTitle("Mini Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 444, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfNumber = new JTextField();
		tfNumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNumber.setBounds(40, 37, 306, 35);
		contentPane.add(tfNumber);
		tfNumber.setColumns(10);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = tfNumber.getText();
				tfNumber.setText("");
				operation = "+";
			
				
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(10, 96, 52, 40);
		contentPane.add(btnPlus);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setBackground(Color.DARK_GRAY);
		btnEqual.setForeground(Color.RED);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				secondNumber = tfNumber.getText();
				
				double number1 = Double.parseDouble(firstNumber);
				double number2 = Double.parseDouble(secondNumber);
				
				if(operation.equals("+")){
					tfNumber.setText(String.valueOf(number1 + number2));
					lbCalculation.setText(number1 + " + " + number2 + " = " + (number1 + number2));
				}else if(operation.equals("-")) {
					tfNumber.setText(String.valueOf(number1 - number2));
					lbCalculation.setText(number1 + " - " + number2 + " = " + (number1 - number2));
				}else if(operation.equals("*")) {
					tfNumber.setText(String.valueOf(number1 * number2));
					lbCalculation.setText(number1 + " * " + number2 + " = " + (number1 * number2));
				}else if(operation.equals("/")) {
					tfNumber.setText(String.valueOf(number1 / number2));
					lbCalculation.setText(number1 + " / " + number2 + " = " + (number1 / number2));
				}else if(operation.equals("<html>x<sup>y</sup></html>")) {
					tfNumber.setText(String.valueOf(Math.pow(number1, number2)));
					lbCalculation.setText(number1 + " ^ " + number2 + " = " + (Math.pow(number1, number2)));
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBounds(40, 383, 52, 40);
		contentPane.add(btnEqual);
		
		lbCalculation = new JLabel("");
		lbCalculation.setFont(new Font("Tahoma", Font.ITALIC, 10));
		lbCalculation.setBounds(40, 14, 139, 21);
		contentPane.add(lbCalculation);
		
		btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = tfNumber.getText();
				tfNumber.setText("");
				operation = "-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMinus.setBounds(10, 146, 52, 40);
		contentPane.add(btnMinus);
		
		btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = tfNumber.getText();
				tfNumber.setText("");
				operation = "*";
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMultiply.setBounds(72, 196, 52, 40);
		contentPane.add(btnMultiply);
		
		btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = tfNumber.getText();
				tfNumber.setText("");
				operation = "/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDivide.setBounds(72, 96, 52, 40);
		contentPane.add(btnDivide);
		
		btnClear = new JButton("Clr");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfNumber.setText("");
				lbCalculation.setText("");
			}
		});
		btnClear.setForeground(Color.RED);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBackground(Color.DARK_GRAY);
		btnClear.setBounds(122, 383, 76, 40);
		contentPane.add(btnClear);
		
		btnSqrt = new JButton("<html>&radic;</html>");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numberString = tfNumber.getText();
				Double number = Double.parseDouble(numberString);
				Double sqrtResult = Math.sqrt(number);
				tfNumber.setText("");
				lbCalculation.setText("");
				tfNumber.setText(String.valueOf(sqrtResult));
				}
		});
		btnSqrt.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSqrt.setBounds(10, 196, 52, 40);
		contentPane.add(btnSqrt);
		
		btnSquare = new JButton("<html>x&sup2;</html>");
		btnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numberString = tfNumber.getText();
				Double numberParse = Double.parseDouble(numberString);
				Double squareResult = numberParse * numberParse;
				tfNumber.setText("");
				lbCalculation.setText("");
				tfNumber.setText(String.valueOf(squareResult));
			}
		});
		btnSquare.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSquare.setBounds(72, 146, 52, 40);
		contentPane.add(btnSquare);
		
		btnSquare_1 = new JButton("<html>x<sup>y</sup></html>");
		btnSquare_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = tfNumber.getText();
				tfNumber.setText("");
				lbCalculation.setText("");
				operation = "<html>x<sup>y</sup></html>";
				
			}
		});
		btnSquare_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSquare_1.setBounds(10, 246, 52, 40);
		contentPane.add(btnSquare_1);
		
		btnOne = new JButton("1");
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				tfNumber.setText(tfNumber.getText() + "1");
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "enter valid number");
				}
			}
		});
		btnOne.setBackground(new Color(0, 128, 0));
		btnOne.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnOne.setBounds(154, 96, 52, 40);
		contentPane.add(btnOne);
		
		btnTwo = new JButton("2");
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfNumber.setText(tfNumber.getText() + "2");
			}
		});
		btnTwo.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnTwo.setBackground(new Color(0, 128, 0));
		btnTwo.setBounds(220, 96, 52, 40);
		contentPane.add(btnTwo);
		
		btnThree = new JButton("3");
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfNumber.setText(tfNumber.getText() + "3");
			}
		});
		btnThree.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnThree.setBackground(new Color(0, 128, 0));
		btnThree.setBounds(282, 96, 52, 40);
		contentPane.add(btnThree);
		
		btnFour = new JButton("4");
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfNumber.setText(tfNumber.getText() + "4");
			}
		});
		btnFour.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnFour.setBackground(new Color(0, 128, 0));
		btnFour.setBounds(154, 156, 52, 40);
		contentPane.add(btnFour);
		
		btnFive = new JButton("5");
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfNumber.setText(tfNumber.getText() + "5");
			}
		});
		btnFive.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnFive.setBackground(new Color(0, 128, 0));
		btnFive.setBounds(220, 156, 52, 40);
		contentPane.add(btnFive);
		
		btnSix = new JButton("6");
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfNumber.setText(tfNumber.getText() + "6");
			}
		});
		btnSix.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSix.setBackground(new Color(0, 128, 0));
		btnSix.setBounds(282, 156, 52, 40);
		contentPane.add(btnSix);
		
		btnSeven = new JButton("7");
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfNumber.setText(tfNumber.getText() + "7");
			}
		});
		btnSeven.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSeven.setBackground(new Color(0, 128, 0));
		btnSeven.setBounds(154, 215, 52, 40);
		contentPane.add(btnSeven);
		
		btnEight = new JButton("8");
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfNumber.setText(tfNumber.getText() + "8");
			}
		});
		btnEight.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEight.setBackground(new Color(0, 128, 0));
		btnEight.setBounds(220, 215, 52, 40);
		contentPane.add(btnEight);
		
		btnNine = new JButton("9");
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfNumber.setText(tfNumber.getText() + "9");
			}
		});
		btnNine.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNine.setBackground(new Color(0, 128, 0));
		btnNine.setBounds(282, 215, 52, 40);
		contentPane.add(btnNine);	
		
		JButton btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfNumber.setText(tfNumber.getText() + "0");
			}
		});
		btnZero.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnZero.setBackground(new Color(0, 128, 0));
		btnZero.setBounds(154, 275, 52, 40);
		contentPane.add(btnZero);
	}
}
