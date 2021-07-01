package br.com.creditcard.action;

import javax.swing.JOptionPane;

public class Test4 {
	
	public static void main(String[] args) {
		  int result = JOptionPane.showConfirmDialog(null, "This is a test",
		        "Test", JOptionPane.YES_NO_CANCEL_OPTION);

		  System.out.println("result: " + result);
		}

}
