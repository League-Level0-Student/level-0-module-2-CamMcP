package _14_rollercoaster;

import javax.swing.JOptionPane;

public class rollarolada {


public static void main(String[] args) {
	

String input = JOptionPane.showInputDialog("How tall are you in inches?");
	int how = Integer.parseInt(input);
	if(how < 48) {
		JOptionPane.showMessageDialog(null, "You are not tall enough for this ride");
	}
	else {
		
		JOptionPane.showMessageDialog(null, "You will ride on the next car.");
	}

}
	
	
	
	
}

