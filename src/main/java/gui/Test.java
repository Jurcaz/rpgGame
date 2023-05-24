package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import util.BattleArena;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class Test extends JFrame {
	
	private static final long serialVersionUID = 1L;

	static BattleArena ba = BattleArena.getInstance();

	static private JPanel contentPane;
	
	static private JPanel battlePanel;
	
	static private JPanel heroPanel;
	
	static private JButton hero1Btn;
	static private JButton hero2Btn;
	static private JButton hero3Btn;
	
	static private JPanel redBarHero1;
	static private JPanel redBarHero2;
	static private JPanel redBarHero3;
	
	static private JPanel greenBarHero1;
	static private JPanel greenBarHero2;
	static private JPanel greenBarHero3;
	
	static private JPanel mobPanel;
		
	static private JButton mob1Btn;
	static private JButton mob2Btn;
	static private JButton mob3Btn;
	
	static private JPanel redBarMob1;
	static private JPanel redBarMob2;
	static private JPanel redBarMob3;
	
	static private JPanel greenBarMob1;
	static private JPanel greenBarMob2;
	static private JPanel greenBarMob3;
	
	static private JPanel contextualPanel;
	
	static private JTextArea contextualTextArea;
	
	static private JButton finishTurnBtn;
	
	

	public Test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		battlePanel = new JPanel();
		battlePanel.setBounds(5, 5, 614, 252);
		contentPane.add(battlePanel);
		battlePanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		heroPanel = new JPanel();
		battlePanel.add(heroPanel);
		heroPanel.setLayout(null);
		
		hero2Btn = new JButton("");
		hero2Btn.setBounds(107, 41, 90, 200);
		heroPanel.add(hero2Btn);
		
		hero1Btn = new JButton("");
		hero1Btn.setBounds(207, 41, 90, 200);
		heroPanel.add(hero1Btn);
		
		hero3Btn = new JButton("");
		hero3Btn.setBounds(7, 41, 90, 200);
		heroPanel.add(hero3Btn);
		
		greenBarHero1 = new JPanel();
		greenBarHero1.setBackground(Color.GREEN);
		greenBarHero1.setBounds(207, 11, 90, 19);
		heroPanel.add(greenBarHero1);
		
		greenBarHero2 = new JPanel();
		greenBarHero2.setBackground(Color.GREEN);
		greenBarHero2.setBounds(107, 11, 90, 19);
		heroPanel.add(greenBarHero2);
		
		greenBarHero3 = new JPanel();
		greenBarHero3.setBackground(Color.GREEN);
		greenBarHero3.setBounds(7, 11, 90, 19);
		heroPanel.add(greenBarHero3);
		
		redBarHero1 = new JPanel();
		redBarHero1.setBackground(Color.RED);
		redBarHero1.setBounds(207, 11, 90, 19);
		heroPanel.add(redBarHero1);
		
		redBarHero2 = new JPanel();
		redBarHero2.setBackground(Color.RED);
		redBarHero2.setBounds(107, 11, 90, 19);
		heroPanel.add(redBarHero2);
		
		redBarHero3 = new JPanel();
		redBarHero3.setBackground(Color.RED);
		redBarHero3.setBounds(7, 11, 90, 19);
		heroPanel.add(redBarHero3);
		
		
		
		mobPanel = new JPanel();
		battlePanel.add(mobPanel);
		mobPanel.setLayout(null);
		
		mob2Btn = new JButton("");
		mob2Btn.setBounds(110, 41, 90, 200);
		mobPanel.add(mob2Btn);
		
		mob1Btn = new JButton("");
		mob1Btn.setBounds(10, 41, 90, 200);
		mobPanel.add(mob1Btn);
		
		mob3Btn = new JButton("");
		mob3Btn.setBounds(210, 41, 90, 200);
		mobPanel.add(mob3Btn);
		
		greenBarMob1 = new JPanel();
		greenBarMob1.setBackground(Color.GREEN);
		greenBarMob1.setBounds(10, 11, 90, 19);
		mobPanel.add(greenBarMob1);
		
		greenBarMob2 = new JPanel();
		greenBarMob2.setBackground(Color.GREEN);
		greenBarMob2.setBounds(110, 11, 90, 19);
		mobPanel.add(greenBarMob2);
		
		greenBarMob3 = new JPanel();
		greenBarMob3.setBackground(Color.GREEN);
		greenBarMob3.setBounds(210, 11, 90, 19);
		mobPanel.add(greenBarMob3);
		
		redBarMob1 = new JPanel();
		redBarMob1.setBackground(Color.RED);
		redBarMob1.setBounds(10, 11, 90, 19);
		mobPanel.add(redBarMob1);
		
		redBarMob2 = new JPanel();
		redBarMob2.setBackground(Color.RED);
		redBarMob2.setBounds(110, 11, 90, 19);
		mobPanel.add(redBarMob2);
		
		redBarMob3 = new JPanel();
		redBarMob3.setBackground(Color.RED);
		redBarMob3.setBounds(210, 11, 90, 19);
		mobPanel.add(redBarMob3);
		
		contextualPanel = new JPanel();
		contextualPanel.setBounds(5, 268, 614, 96);
		contentPane.add(contextualPanel);
		contextualPanel.setLayout(new GridLayout(0, 2, 0, 0));
		
		contextualTextArea = new JTextArea();
		contextualPanel.add(contextualTextArea);
		
		finishTurnBtn = new JButton("Finish Turn");
		contextualPanel.add(finishTurnBtn);
		
		setSprites();
		buttonsActions();
		
		markCreatureOnTurn();
		setHpContextual(ba.showHp());
	}

	private void buttonsActions() {
		hero1Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ba.setObjetive(0);
			}
		});
		
		hero2Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ba.setObjetive(1);
			}
		});
		
		hero3Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ba.setObjetive(2);
			}
		});
		
		mob1Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ba.setObjetive(0);
			}
		});
		
		mob2Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ba.setObjetive(1);
			}
		});
		
		mob3Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ba.setObjetive(2);
			}
		});
		
		finishTurnBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ba.endTurn();
			}
		});
	}
	
	public static void setSprites() {
		hero1Btn.setIcon(new javax.swing.ImageIcon(ba.metodoSpriteBotonHero()));
			ba.setJbuttonHero(hero1Btn, greenBarHero1);
		hero2Btn.setIcon(new javax.swing.ImageIcon(ba.metodoSpriteBotonHero()));
			ba.setJbuttonHero(hero2Btn, greenBarHero2);
		hero3Btn.setIcon(new javax.swing.ImageIcon(ba.metodoSpriteBotonHero()));
			ba.setJbuttonHero(hero3Btn, greenBarHero3);
		
		mob1Btn.setIcon(new javax.swing.ImageIcon(ba.metodoSpriteBotonMob()));
			ba.setJbuttonMob(mob1Btn, greenBarMob1);
		mob2Btn.setIcon(new javax.swing.ImageIcon(ba.metodoSpriteBotonMob()));
			ba.setJbuttonMob(mob2Btn, greenBarMob2);
		mob3Btn.setIcon(new javax.swing.ImageIcon(ba.metodoSpriteBotonMob()));
			ba.setJbuttonMob(mob3Btn, greenBarMob3);
	}
	
	public static void setHpContextual(String str) {
		contextualTextArea.setText(str);
	}
	
	public static void markCreatureOnTurn() {
		ba.markCreatureOnTurn();
	}
}
