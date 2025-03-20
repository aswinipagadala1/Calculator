package basicCalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class ActionHandler implements ActionListener{
	JTextField display;
	double num1,num2,result;
	char operator;
	boolean operatorPressed;
	

	public ActionHandler(JTextField display) {
		this.display=display;
		this.operatorPressed=false;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		String command=e.getActionCommand();
		if(command.charAt(0)>='0'&& command.charAt(0)<='9'){
			
			if(operatorPressed) {
				display.setText(command);
				operatorPressed=false;
				
			}
			else {
				display.setText(display.getText()+command);
			}
		}
			
			else if(command.charAt(0)=='c') {
				display.setText("");
				num1=num2=result=0;
				boolean operationpressed = false;
				
			}
			else if(command.charAt(0)=='=') {
				num2=Double.parseDouble(display.getText());
				int operation;
				switch(operation) {
				case '+':
					result=num1/num2;
					break;
				case '-':
					result=num1-num2;
					break;
				case '*':
					result=num1*num2;
				case '/':
					if(num2!=0) {
						result=num1/num2;
					}
					return;
				}
				break;
			}
		display.setText(String.valueOf(result));
		operatorPressed=false;
	
		
	}
	else {
		if(!display.getText().isEmpty()) {
			num1=Double.parseDouble(display.getText());
			operator=command.charAt(0);
			operatorPressed=true;
			}
		}
	}






