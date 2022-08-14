import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	
	JLabel calculatorScreen;
	JButton sevenButton, eightButton, nineButton, fourButton, fiveButton, sixButton, oneButton, twoButton, threeButton, zeroButton, dotButton, equalButton, divButton, multButton, minusButton, plusButton, clearButton;
	boolean isDotUsed = false;
	boolean isOperatorClicked = false;
	String operator;
	String oldValue = "";
	float result;
	ImageIcon icon;
	public Calculator() {
		JFrame jf = new JFrame("Calculator");
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setSize(600, 600);
		jf.setLocation(300, 150);
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		icon = new ImageIcon("C:\\Users\\Gokul Sujan\\eclipse-workspace\\jee\\Calculator\\src\\icon.png");
		jf.setIconImage(icon.getImage());
		
		calculatorScreen = new JLabel();
		calculatorScreen.setBounds(30, 50, 540, 50);
		calculatorScreen.setBackground(Color.DARK_GRAY);
		calculatorScreen.setForeground(Color.white);
		calculatorScreen.setOpaque(true);
		calculatorScreen.setHorizontalAlignment(SwingConstants.RIGHT);
		jf.add(calculatorScreen);
		
		sevenButton = new JButton("7");
		sevenButton.addActionListener(this);
		sevenButton.setBackground(Color.WHITE);
		sevenButton.setBounds(30, 130, 80, 80);
		jf.add(sevenButton);
		
		eightButton = new JButton("8");
		eightButton.addActionListener(this);
		eightButton.setBackground(Color.WHITE);
		eightButton.setBounds(130, 130, 80, 80);
		jf.add(eightButton);
		
		nineButton = new JButton("9");
		nineButton.addActionListener(this);
		nineButton.setBackground(Color.WHITE);
		nineButton.setBounds(230, 130, 80, 80);
		jf.add(nineButton);
		
		fourButton = new JButton("4");
		fourButton.addActionListener(this);
		fourButton.setBackground(Color.WHITE);
		fourButton.setBounds(30, 230, 80, 80);
		jf.add(fourButton);
		
		fiveButton = new JButton("5");
		fiveButton.addActionListener(this);
		fiveButton.setBackground(Color.WHITE);
		fiveButton.setBounds(130, 230, 80, 80);
		jf.add(fiveButton);
		
		sixButton = new JButton("6");
		sixButton.addActionListener(this);
		sixButton.setBackground(Color.WHITE);
		sixButton.setBounds(230, 230, 80, 80);
		jf.add(sixButton);
		
		oneButton = new JButton("1");
		oneButton.addActionListener(this);
		oneButton.setBackground(Color.WHITE);
		oneButton.setBounds(30, 330, 80, 80);
		jf.add(oneButton);
		
		twoButton = new JButton("2");
		twoButton.addActionListener(this);
		twoButton.setBackground(Color.WHITE);
		twoButton.setBounds(130, 330, 80, 80);
		jf.add(twoButton);
		
		threeButton = new JButton("3");
		threeButton.addActionListener(this);
		threeButton.setBackground(Color.WHITE);
		threeButton.setBounds(230, 330, 80, 80);
		jf.add(threeButton);
		
		zeroButton = new JButton("0");
		zeroButton.addActionListener(this);
		zeroButton.setBackground(Color.WHITE);
		zeroButton.setBounds(30, 430, 80, 80);
		jf.add(zeroButton);
		
		dotButton = new JButton(".");
		dotButton.addActionListener(this);
		dotButton.setBackground(Color.WHITE);
		dotButton.setBounds(130, 430, 80, 80);
		jf.add(dotButton);
		
		equalButton = new JButton("=");
		equalButton.addActionListener(this);
		equalButton.setBackground(Color.WHITE);
		equalButton.setBounds(230, 430, 80, 80);
		jf.add(equalButton);
		
		divButton = new JButton("÷");
		divButton.addActionListener(this);
		divButton.setBackground(Color.WHITE);
		divButton.setBounds(330, 130, 80, 80);
		jf.add(divButton);
		
		multButton = new JButton("x");
		multButton.addActionListener(this);
		multButton.setBackground(Color.WHITE);
		multButton.setBounds(330, 230, 80, 80);
		jf.add(multButton);
		
		minusButton = new JButton("-");
		minusButton.addActionListener(this);
		minusButton.setBackground(Color.WHITE);
		minusButton.setBounds(330, 330, 80, 80);
		jf.add(minusButton);
		
		plusButton = new JButton("+");
		plusButton.addActionListener(this);
		plusButton.setBackground(Color.WHITE);
		plusButton.setBounds(330, 430, 80, 80);
		jf.add(plusButton);
		
		clearButton = new JButton("C");
		clearButton.addActionListener(this);
		clearButton.setBackground(Color.WHITE);
		clearButton.setBounds(430, 430, 80, 80);
		jf.add(clearButton);
	}
	
	public static void main(String[] args) {
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String value = calculatorScreen.getText();
		if(e.getSource() == sevenButton) {
			if(isOperatorClicked) {
				calculatorScreen.setText("7");
				isOperatorClicked = false;
			} else {
				calculatorScreen.setText(value + "7");
				isOperatorClicked = false;
			}
			
		} else if(e.getSource() == eightButton) {
			if(isOperatorClicked) {
				calculatorScreen.setText("8");
				isOperatorClicked = false;
			} else {
				calculatorScreen.setText(value + "8");
			}
		} else if(e.getSource() == nineButton) {
			if(isOperatorClicked) {
				calculatorScreen.setText("9");
				isOperatorClicked = false;
			} else {
				calculatorScreen.setText(value + "9");
				isOperatorClicked = false;
			}
		} else if(e.getSource() == fourButton) {
			if(isOperatorClicked) {
				calculatorScreen.setText("4");
				isOperatorClicked = false;
			} else {
				calculatorScreen.setText(value + "4");
			}
		} else if(e.getSource() == fiveButton) {
			if(isOperatorClicked) {
				calculatorScreen.setText("5");
				isOperatorClicked = false;
			} else {
				calculatorScreen.setText(value + "5");
			}
		} else if(e.getSource() == sixButton) {
			if(isOperatorClicked) {
				calculatorScreen.setText("6");
				isOperatorClicked = false;
			} else {
				calculatorScreen.setText(value + "6");
			}
		} else if(e.getSource() == oneButton) {
			if(isOperatorClicked) {
				calculatorScreen.setText("1");
				isOperatorClicked = false;
			} else {
				calculatorScreen.setText(value + "1");
			}
		} else if(e.getSource() == twoButton) {
			if(isOperatorClicked) {
				calculatorScreen.setText("2");
				isOperatorClicked = false;
			} else {
				calculatorScreen.setText(value + "2");
			}
		} else if(e.getSource() == threeButton) {
			if(isOperatorClicked) {
				calculatorScreen.setText("3");
				isOperatorClicked = false;
			} else {
				calculatorScreen.setText(value + "3");
			}
		} else if(e.getSource() == zeroButton) {
			if(isOperatorClicked) {
				calculatorScreen.setText("0");
				isOperatorClicked = false;
			} else {
				calculatorScreen.setText(value + "0");
			}
		} else if(e.getSource() == dotButton) {
			if(!isDotUsed) {
				calculatorScreen.setText(value + ".");
			}
			isDotUsed = true;
		} else if(e.getSource() == divButton) {
			isOperatorClicked = true;
			if(oldValue == "") {
				oldValue = value;
				operator = "/";
			} else {
				if(operator == "/") {
					float oldValuef = Float.parseFloat(oldValue);
					float valuef = Float.parseFloat(value);
					result = oldValuef / valuef;
					oldValue = result + "";
					operator = "/";
					
				} else if(operator == "*") {
					float oldValuef = Float.parseFloat(oldValue);
					float valuef = Float.parseFloat(value);
					result = oldValuef * valuef;
					oldValue = result + "";
					operator = "/";
					
				} else if(operator == "-") {
					float oldValuef = Float.parseFloat(oldValue);
					float valuef = Float.parseFloat(value);
					result = oldValuef - valuef;
					oldValue = result + "";
					operator = "/";
					
				} else if(operator == "+") {
					float oldValuef = Float.parseFloat(oldValue);
					float valuef = Float.parseFloat(value);
					result = oldValuef + valuef;
					oldValue = result + "";
					operator = "/";
					
				}
			}
			
		} else if(e.getSource() == multButton) {
			isOperatorClicked = true;
			if(oldValue == "") {
				oldValue = value;
				operator = "*";
			} else {
				if(operator == "/") {
					float oldValuef = Float.parseFloat(oldValue);
					float valuef = Float.parseFloat(value);
					result = oldValuef / valuef;
					oldValue = result + "";
					operator = "*";
					
				} else if(operator == "*") {
					float oldValuef = Float.parseFloat(oldValue);
					float valuef = Float.parseFloat(value);
					result = oldValuef * valuef;
					oldValue = result + "";
					operator = "*";
					
				} else if(operator == "-") {
					float oldValuef = Float.parseFloat(oldValue);
					float valuef = Float.parseFloat(value);
					result = oldValuef - valuef;
					oldValue = result + "";
					operator = "*";
					
				} else if(operator == "+") {
					float oldValuef = Float.parseFloat(oldValue);
					float valuef = Float.parseFloat(value);
					result = oldValuef + valuef;
					oldValue = result + "";
					operator = "*";
					
				}
			}
			
		} else if(e.getSource() == minusButton) {
			isOperatorClicked = true;
			if(oldValue == "") {
				oldValue = value;
				operator = "-";
			} else {
				if(operator == "/") {
					float oldValuef = Float.parseFloat(oldValue);
					float valuef = Float.parseFloat(value);
					result = oldValuef / valuef;
					oldValue = result + "";
					operator = "-";
					
				} else if(operator == "*") {
					float oldValuef = Float.parseFloat(oldValue);
					float valuef = Float.parseFloat(value);
					result = oldValuef * valuef;
					oldValue = result + "";
					operator = "-";
					
				} else if(operator == "-") {
					float oldValuef = Float.parseFloat(oldValue);
					float valuef = Float.parseFloat(value);
					result = oldValuef - valuef;
					oldValue = result + "";
					operator = "-";
					
				} else if(operator == "+") {
					float oldValuef = Float.parseFloat(oldValue);
					float valuef = Float.parseFloat(value);
					result = oldValuef + valuef;
					oldValue = result + "";
					operator = "-";
					
				}
			}
			
		} else if(e.getSource() == plusButton) {
			isOperatorClicked = true;
			if(oldValue == "") {
				oldValue = value;
				operator = "+";
			} else {
				if(operator == "/") {
					float oldValuef = Float.parseFloat(oldValue);
					float valuef = Float.parseFloat(value);
					result = oldValuef / valuef;
					oldValue = result + "";
					operator = "+";
					
				} else if(operator == "*") {
					float oldValuef = Float.parseFloat(oldValue);
					float valuef = Float.parseFloat(value);
					result = oldValuef * valuef;
					oldValue = result + "";
					operator = "+";
					
				} else if(operator == "-") {
					float oldValuef = Float.parseFloat(oldValue);
					float valuef = Float.parseFloat(value);
					result = oldValuef - valuef;
					oldValue = result + "";
					operator = "+";
					
				} else if(operator == "+") {
					float oldValuef = Float.parseFloat(oldValue);
					float valuef = Float.parseFloat(value);
					result = oldValuef + valuef;
					oldValue = result + "";
					operator = "+";
					
				}
			}
			
		} else if(e.getSource() == equalButton) {
			if(operator == "/") {
				float oldValuef = Float.parseFloat(oldValue);
				float valuef = Float.parseFloat(value);
				result = oldValuef / valuef;
				oldValue = result + "";
				calculatorScreen.setText(result +"");
				
			} else if(operator == "*") {
				float oldValuef = Float.parseFloat(oldValue);
				float valuef = Float.parseFloat(value);
				result = oldValuef * valuef;
				oldValue = result + "";
				calculatorScreen.setText(result +"");
				
			} else if(operator == "-") {
				float oldValuef = Float.parseFloat(oldValue);
				float valuef = Float.parseFloat(value);
				result = oldValuef - valuef;
				oldValue = result + "";
				calculatorScreen.setText(result +"");
				
			} else if(operator == "+") {
				float oldValuef = Float.parseFloat(oldValue);
				float valuef = Float.parseFloat(value);
				result = oldValuef + valuef;
				oldValue = result + "";
				calculatorScreen.setText(result +"");
				
			}
		} else if (e.getSource() == clearButton) {
			calculatorScreen.setText("");
			oldValue = "";
		}
		
	} 

}
