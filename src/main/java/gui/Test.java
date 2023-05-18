package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import util.BattleArena;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Test extends JFrame {
	
	private static final long serialVersionUID = 1L;

	static BattleArena ba = BattleArena.getInstance();

	static private JPanel contentPane;
	
	static private JPanel battlePanel;
	
	static private JPanel heroesPanel;
	
	static private JButton hero1Btn;
	static private JButton hero2Btn;
	static private JButton hero3Btn;
	
	
	static private JPanel mobPanel;
		
	static private JButton mob1Btn;
	static private JButton mob2Btn;
	static private JButton mob3Btn;
	
	
	static private JPanel contextualPanel;
	
	static private JLabel contextualLbl;
	static private JButton finishTurnBtn;

	/**
	 * Create the frame.
	 */
	public Test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		battlePanel = new JPanel();
		battlePanel.setBounds(5, 5, 614, 342);
		contentPane.add(battlePanel);
		battlePanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		heroesPanel = new JPanel();
		battlePanel.add(heroesPanel);
		heroesPanel.setLayout(null);
		
		hero2Btn = new JButton("");
		hero2Btn.setBounds(38, 51, 32, 32);
		heroesPanel.add(hero2Btn);
		
		hero1Btn = new JButton("");
		hero1Btn.setBounds(155, 170, 32, 32);
		heroesPanel.add(hero1Btn);
		
		hero3Btn = new JButton("");
		hero3Btn.setBounds(38, 278, 32, 32);
		heroesPanel.add(hero3Btn);
		
		mobPanel = new JPanel();
		battlePanel.add(mobPanel);
		mobPanel.setLayout(null);
		
		mob2Btn = new JButton("");
		mob2Btn.setBounds(184, 36, 32, 32);
		mobPanel.add(mob2Btn);
		
		mob1Btn = new JButton("");
		mob1Btn.setBounds(102, 171, 32, 32);
		mobPanel.add(mob1Btn);
		
		mob3Btn = new JButton("");
		mob3Btn.setBounds(184, 269, 32, 32);
		mobPanel.add(mob3Btn);
		
		contextualPanel = new JPanel();
		contextualPanel.setBounds(5, 358, 614, 78);
		contentPane.add(contextualPanel);
		contextualPanel.setLayout(new GridLayout(0, 2, 0, 0));
		
		contextualLbl = new JLabel("");
		contextualPanel.add(contextualLbl);
		
		finishTurnBtn = new JButton("Finish Turn");
		contextualPanel.add(finishTurnBtn);
		
		setSprites();
	}
	
	public static void setSprites() {
		hero1Btn.setIcon(new javax.swing.ImageIcon(ba.getSpriteHeros(0)));
		hero2Btn.setIcon(new javax.swing.ImageIcon(ba.getSpriteHeros(1)));
		hero3Btn.setIcon(new javax.swing.ImageIcon(ba.getSpriteHeros(2)));
		
		mob1Btn.setIcon(new javax.swing.ImageIcon(ba.getSpriteMobs(0)));
		mob2Btn.setIcon(new javax.swing.ImageIcon(ba.getSpriteMobs(1)));
		mob3Btn.setIcon(new javax.swing.ImageIcon(ba.getSpriteMobs(2)));
	}
	
	public static void setHpContextual(String str) {
		contextualLbl.setText(str);
	}
	
}
