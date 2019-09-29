package _15_voting_booth;

import javax.swing.JOptionPane;

public class vote {
public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("How old are you in years?");
	int how = Integer.parseInt(input);
	if(how < 18) {
		JOptionPane.showMessageDialog(null, "You are not old enough to vote ate this age. Com eback when you are older.");
	}
	else {
		
		JOptionPane.showMessageDialog(null, "You may get in line to vote.");
	}
}
}