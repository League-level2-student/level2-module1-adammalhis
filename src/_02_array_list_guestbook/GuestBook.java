package _02_array_list_guestbook;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import _01_array_list_visualizer.data.ArrayList;

public class GuestBook implements ActionListener {
	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	JButton button1= new JButton();
	JButton button2= new JButton();
	ArrayList<String> theArrayList= new ArrayList<String>();
	public void run() {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	button1.setText("Add Name");
	button2.setText("View Names");
	button1.addActionListener(this);
	button2.addActionListener(this);
	frame.setVisible(true);
	frame.pack();
	
	
	
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (button1==e.getSource()) {
			theArrayList.add(JOptionPane.showInputDialog("What is your name"));
		}
		if (button2==e.getSource()) {
			for (int i=0; i<theArrayList.size(); i++) {
			String s= theArrayList.get(i);
				JOptionPane.showMessageDialog(null, "Guest # "+ i + " " + s);
			}
		}
	}
}
