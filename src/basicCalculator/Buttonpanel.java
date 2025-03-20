package basicCalculator;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Buttonpanel extends JPanel  {
	JButton[] numberButtons;//0-9
	JButton add,suntract,multiply,divide,clear,equals;
	ActionHandler actionHandler;
	
	
			public Buttonpanel(ActionHandler actionHandler) {
				this.actionHandler=actionHandler;
				setLayout(new GridLayout(4,4,5,6));
				numberButtons=new JButton[10];
				for(int i=0;i<10;i++) {
					numberButtons[i]=new JButton(String.valueOf(i));
					numberButtons[i].setFont(new Font("Arial",Font.BOLD,12));
					numberButtons[i].setPreferredSize(new Dimension(40,40));
					numberButtons[i].addActionListener(actionHandler);
					add(numberButtons[i]);
					}
				add=new  JButton("+");
				JButton subtract = new JButton("-");
				multiply=new JButton("*");
				
				divide=new JButton("/");
				clear=new JButton("C");
				equals=new JButton("=");
				JButton[] operations= {add,subtract,multiply,divide,clear,equals};
				for (JButton btn:operations) {
				
					
					btn.setFont(new Font("Arial",Font.BOLD,12));
					btn.setPreferredSize(new Dimension(40,40));
					btn.addActionListener(actionHandler);
					add(btn);
				}
			
		
		
	}

}
