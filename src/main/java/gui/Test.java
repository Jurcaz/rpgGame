package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Test extends JFrame{

	private static final long serialVersionUID = 1L;
	
	public JFrame frame;

	public Test() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel contextualPanel = new JPanel();
		getContentPane().add(contextualPanel, BorderLayout.SOUTH);
		
		JPanel battlePanel = new JPanel();
		getContentPane().add(battlePanel, BorderLayout.CENTER);
		battlePanel.setLayout(null);
		
		JLabel hero1lbl = new JLabel("");
		hero1lbl.setBounds(10, 11, 32, 32);
		battlePanel.add(hero1lbl);
		
		JLabel hero2lbl = new JLabel("");
		hero2lbl.setBounds(10, 54, 32, 32);
		battlePanel.add(hero2lbl);
		
		JLabel hero3lbl = new JLabel("");
		hero3lbl.setBounds(10, 97, 32, 32);
		battlePanel.add(hero3lbl);
		
		JLabel mob1lbl = new JLabel("");
		mob1lbl.setBounds(392, 11, 32, 32);
		battlePanel.add(mob1lbl);
		
		JLabel mob2lbl = new JLabel("");
		mob2lbl.setBounds(392, 54, 32, 32);
		battlePanel.add(mob2lbl);
		
		JLabel mob3lbl = new JLabel("");
		mob3lbl.setIcon(new ImageIcon("C:\\Users\\jmdin\\eclipse-workspace\\rpgGame\\src\\main\\resources\\icons\\gladius.png"));
		mob3lbl.setBounds(392, 97, 32, 32);
		battlePanel.add(mob3lbl);
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
