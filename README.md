# Simple-Calculator
Simple Calculator built with eclipse window builder

<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/222349940-2a0b1a8b-7dd1-4017-80e7-a46daf4d863b.png" alt="Image">
</p>

After optimizing the app, updated image

<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/222895887-f81f0102-954b-4493-830f-6e78c1727b43.png" alt="Image">
</p>

Made some UI changes, result as follows: 

<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/224937347-f1d8a57d-e076-4989-bd54-7390d936f5c7.png" alt="Image">
</p>

## [Implementation](https://github.com/af4092/Mini-Calculator/blob/main/Mini_Calculator/src/com/Login/OptimizationUI.java)

- `Java Swing` application for a mini calculator. It creates a `GUI window` with various buttons and a text field to perform basic arithmetic calculations.
- Here's a breakdown of the code:

1. The class `Optimization` extends `JFrame` to create the main frame for the calculator.
2. The constructor sets up the frame by setting its size, title, and default close operation.
3. The `contentPane` panel is created and set as the content pane for the frame.
4. Various Swing components such as buttons, labels, and text fields are created and added to the content pane.
5. Action listeners are added to the buttons to perform specific operations when clicked.
6. The `btnPlus`, `btnMinus`, `btnMultiply`, `btnDivide`, and `btnSquare_1` buttons set the `operation` variable to the respective operation symbol (`+`, `-`, `*`, `/`, `<html>x<sup>y</sup></html>`).
7. The `btnEqual` button calculates the result based on the selected operation and displays it in the text field (`tfNumber`) and a label (`lbCalculation`).
8. Other buttons (`btnSqrt`, `btnSquare`, `btnClear`, `btnOne`, `btnTwo`, ..., `btnNine`, `btnZero`) handle specific actions such as square root, square, clearing the text field, and entering numeric values.
9. The `Optimization` class represents the main window of the calculator application.

- To run this code, we need to have the necessary dependencies for Java Swing and compile and execute the code using a Java development environment.
