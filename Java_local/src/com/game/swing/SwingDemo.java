package com.game.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class SwingDemo {
	/**
	 * 	Layout managers	
	 * 	1. Boder Layout
		2. Flow Layout
		3. Grid layout
		4. Card layout
		5. Box layout
		6. Grid Bag Layout
		7. Group layout
		8. Spring Layout

	 	Components
	 			1. Button
		2. Label
		3. Text Field
		4. Text Area
		5. Table
		6. Combo box
		7. Slider
		8. Menu
		9. Frame

	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame("Swing Demonstration");
		
		//Add component to the frame
		JButton button = new JButton("click here");
		button.setBounds(200, 250, 20, 10);
		frame.add(button,new BorderLayout().SOUTH);
		frame.setBounds(100, 100, 500, 300);
		frame.setVisible(true);
//		frame.setLayout(null);
//		frame.setLayout(new BorderLayout());
//		frame.setLayout(new FlowLayout());
//		frame.setLayout(new GridLayout(2,3));
//		frame.setLayout(new CardLayout()); //cardLayout was in awt
//		frame.setLayout(new BoxLayout(this, axis)); // didn't got it
		frame.setLayout(new GridBagLayout());
	}

}
