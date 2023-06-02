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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.Rectangle;

public class Test extends JFrame {
	
	private static final long serialVersionUID = 1L;

	static BattleArena ba = BattleArena.getInstance();

	static private JPanel contentPane;
	
	static private JPanel battlePanel;
	
	static private JPanel heroPanel;
	
	static private JButton hero1Btn;
	static private JButton hero2Btn;
	static private JButton hero3Btn;
	
	static private JPanel redBarHero1Jp;
	static private JPanel redBarHero2Jp;
	static private JPanel redBarHero3Jp;
	
	static private JPanel greenBarHero1Jp;
	static private JPanel greenBarHero2Jp;
	static private JPanel greenBarHero3Jp;
	
	static private JLabel hero1HpLbl;
	static private JLabel hero2HpLbl;
	static private JLabel hero3HpLbl;
	
	
	static private JPanel mobPanel;
		
	static private JButton mob1Btn;
	static private JButton mob2Btn;
	static private JButton mob3Btn;
	
	static private JPanel redBarMob1Jp;
	static private JPanel redBarMob2Jp;
	static private JPanel redBarMob3Jp;
	
	static private JPanel greenBarMob1Jp;
	static private JPanel greenBarMob2Jp;
	static private JPanel greenBarMob3Jp;
	
	static private JLabel mob1HpLbl;
	static private JLabel mob2HpLbl;
	static private JLabel mob3HpLbl;
	
	
	static private JPanel contextualPanel;
	
	static private JButton finishTurnBtn;
	
	
	static private JPanel iniciativePanel;
	
	static private JLabel iniciativeOrderlbl1;
	static private JLabel iniciativeOrderlbl2;
	static private JLabel iniciativeOrderlbl3;
	static private JLabel iniciativeOrderlbl4;
	static private JLabel iniciativeOrderlbl5;
	static private JLabel iniciativeOrderlbl6;
	
	
	static private JPanel actionsCharacterPanel;
	
	static private JButton changePositionBtn;
	static private JButton ability1btn;
	static private JButton ability2btn;
	static private JButton abilit31btn;
	static private JButton ability4btn;

	public Test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		iniciativePanel = new JPanel();
		iniciativePanel.setBounds(5, 0, 614, 35);
		contentPane.add(iniciativePanel);
		iniciativePanel.setLayout(new GridLayout(0, 6, 0, 0));
		
		iniciativeOrderlbl1 = new JLabel("");
		iniciativeOrderlbl1.setHorizontalAlignment(SwingConstants.CENTER);
		iniciativePanel.add(iniciativeOrderlbl1);
		
		iniciativeOrderlbl2 = new JLabel("");
		iniciativeOrderlbl2.setHorizontalAlignment(SwingConstants.CENTER);
		iniciativePanel.add(iniciativeOrderlbl2);
		
		iniciativeOrderlbl3 = new JLabel("");
		iniciativeOrderlbl3.setHorizontalAlignment(SwingConstants.CENTER);
		iniciativePanel.add(iniciativeOrderlbl3);
		
		iniciativeOrderlbl4 = new JLabel("");
		iniciativeOrderlbl4.setHorizontalAlignment(SwingConstants.CENTER);
		iniciativePanel.add(iniciativeOrderlbl4);
		
		iniciativeOrderlbl5 = new JLabel("");
		iniciativeOrderlbl5.setHorizontalAlignment(SwingConstants.CENTER);
		iniciativePanel.add(iniciativeOrderlbl5);
		
		iniciativeOrderlbl6 = new JLabel("");
		iniciativeOrderlbl6.setHorizontalAlignment(SwingConstants.CENTER);
		iniciativePanel.add(iniciativeOrderlbl6);
		
		battlePanel = new JPanel();
		battlePanel.setBounds(5, 35, 614, 252);
		contentPane.add(battlePanel);
		battlePanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		heroPanel = new JPanel();
		battlePanel.add(heroPanel);
		heroPanel.setLayout(null);
		
		hero1Btn = new JButton("");
		hero1Btn.setBounds(207, 41, 90, 200);
		heroPanel.add(hero1Btn);
		
		hero2Btn = new JButton("");
		hero2Btn.setBounds(107, 41, 90, 200);
		heroPanel.add(hero2Btn);
		
		hero3Btn = new JButton("");
		hero3Btn.setBounds(7, 41, 90, 200);
		heroPanel.add(hero3Btn);
		
		hero1HpLbl = new JLabel("");
		hero1HpLbl.setVisible(false);
		hero1HpLbl.setHorizontalAlignment(SwingConstants.CENTER);
		hero1HpLbl.setBounds(207, 11, 90, 19);
		heroPanel.add(hero1HpLbl);
		
		hero2HpLbl = new JLabel("");
		hero2HpLbl.setVisible(false);
		hero2HpLbl.setHorizontalAlignment(SwingConstants.CENTER);
		hero2HpLbl.setBounds(107, 11, 90, 19);
		heroPanel.add(hero2HpLbl);
		
		hero3HpLbl = new JLabel("");
		hero3HpLbl.setVisible(false);
		hero3HpLbl.setHorizontalAlignment(SwingConstants.CENTER);
		hero3HpLbl.setBounds(7, 11, 90, 19);
		heroPanel.add(hero3HpLbl);
		
		greenBarHero1Jp = new JPanel();
		greenBarHero1Jp.setBackground(Color.GREEN);
		greenBarHero1Jp.setBounds(207, 11, 90, 19);
		heroPanel.add(greenBarHero1Jp);
		
		greenBarHero2Jp = new JPanel();
		greenBarHero2Jp.setBackground(Color.GREEN);
		greenBarHero2Jp.setBounds(107, 11, 90, 19);
		heroPanel.add(greenBarHero2Jp);
		
		greenBarHero3Jp = new JPanel();
		greenBarHero3Jp.setBackground(Color.GREEN);
		greenBarHero3Jp.setBounds(7, 11, 90, 19);
		heroPanel.add(greenBarHero3Jp);
		
		redBarHero1Jp = new JPanel();
		redBarHero1Jp.setBackground(Color.RED);
		redBarHero1Jp.setBounds(207, 11, 90, 19);
		heroPanel.add(redBarHero1Jp);
		
		redBarHero2Jp = new JPanel();
		redBarHero2Jp.setBackground(Color.RED);
		redBarHero2Jp.setBounds(107, 11, 90, 19);
		heroPanel.add(redBarHero2Jp);
		
		redBarHero3Jp = new JPanel();
		redBarHero3Jp.setBackground(Color.RED);
		redBarHero3Jp.setBounds(7, 11, 90, 19);
		heroPanel.add(redBarHero3Jp);
		
		mobPanel = new JPanel();
		battlePanel.add(mobPanel);
		mobPanel.setLayout(null);
		
		mob1Btn = new JButton("");
		mob1Btn.setBounds(10, 41, 90, 200);
		mobPanel.add(mob1Btn);
		
		mob2Btn = new JButton("");
		mob2Btn.setBounds(110, 41, 90, 200);
		mobPanel.add(mob2Btn);
		
		mob3Btn = new JButton("");
		mob3Btn.setBounds(210, 41, 90, 200);
		mobPanel.add(mob3Btn);
		
		mob1HpLbl = new JLabel("");
		mob1HpLbl.setVisible(false);
		mob1HpLbl.setHorizontalAlignment(SwingConstants.CENTER);
		mob1HpLbl.setBounds(10, 11, 90, 19);
		mobPanel.add(mob1HpLbl);
		
		mob2HpLbl = new JLabel("");
		mob2HpLbl.setVisible(false);
		mob2HpLbl.setHorizontalAlignment(SwingConstants.CENTER);
		mob2HpLbl.setBounds(110, 11, 90, 19);
		mobPanel.add(mob2HpLbl);
		
		mob3HpLbl = new JLabel("");
		mob3HpLbl.setVisible(false);
		mob3HpLbl.setHorizontalAlignment(SwingConstants.CENTER);
		mob3HpLbl.setBounds(210, 11, 90, 19);
		mobPanel.add(mob3HpLbl);
		
		greenBarMob1Jp = new JPanel();
		greenBarMob1Jp.setBackground(Color.GREEN);
		greenBarMob1Jp.setBounds(10, 11, 90, 19);
		mobPanel.add(greenBarMob1Jp);
		
		greenBarMob2Jp = new JPanel();
		greenBarMob2Jp.setBackground(Color.GREEN);
		greenBarMob2Jp.setBounds(110, 11, 90, 19);
		mobPanel.add(greenBarMob2Jp);
		
		greenBarMob3Jp = new JPanel();
		greenBarMob3Jp.setBackground(Color.GREEN);
		greenBarMob3Jp.setBounds(210, 11, 90, 19);
		mobPanel.add(greenBarMob3Jp);
		
		redBarMob1Jp = new JPanel();
		redBarMob1Jp.setBackground(Color.RED);
		redBarMob1Jp.setBounds(10, 11, 90, 19);
		mobPanel.add(redBarMob1Jp);
		
		redBarMob2Jp = new JPanel();
		redBarMob2Jp.setBackground(Color.RED);
		redBarMob2Jp.setBounds(110, 11, 90, 19);
		mobPanel.add(redBarMob2Jp);
		
		redBarMob3Jp = new JPanel();
		redBarMob3Jp.setBackground(Color.RED);
		redBarMob3Jp.setBounds(210, 11, 90, 19);
		mobPanel.add(redBarMob3Jp);
		
		contextualPanel = new JPanel();
		contextualPanel.setBounds(5, 298, 614, 96);
		contentPane.add(contextualPanel);
		contextualPanel.setLayout(new GridLayout(0, 2, 0, 0));
		
		actionsCharacterPanel = new JPanel();
		contextualPanel.add(actionsCharacterPanel);
		actionsCharacterPanel.setLayout(null);
		
		changePositionBtn = new JButton("");
		changePositionBtn.setBounds(257,9,40,40);
		changePositionBtn.setIcon(new javax.swing.ImageIcon("src\\main\\resources\\icons\\changeIcon.png"));
		actionsCharacterPanel.add(changePositionBtn);
		
		ability1btn = new JButton("");
		ability1btn.setBounds(57, 9, 40, 40);
		actionsCharacterPanel.add(ability1btn);
		
		ability2btn = new JButton("");
		ability2btn.setBounds(107, 9, 40, 40);
		actionsCharacterPanel.add(ability2btn);
		
		abilit31btn = new JButton("");
		abilit31btn.setBounds(157, 9, 40, 40);
		actionsCharacterPanel.add(abilit31btn);
		
		ability4btn = new JButton("");
		ability4btn.setBounds(207, 9, 40, 40);
		actionsCharacterPanel.add(ability4btn);
		
		finishTurnBtn = new JButton("Finish Turn");
		contextualPanel.add(finishTurnBtn);
		
		setSprites();
		buttonsActions();
		hpBarEvents();
		setIniciativeOrder();
		
		markCreatureOnTurn();
		setHp();
	}
	
	private void hpBarEvents() {
		redBarHero1Jp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				hero1HpLbl.setVisible(true);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				hero1HpLbl.setVisible(false);
			}
		});
		
		redBarHero2Jp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				hero2HpLbl.setVisible(true);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				hero2HpLbl.setVisible(false);
			}
		});
		
		redBarHero3Jp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				hero3HpLbl.setVisible(true);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				hero3HpLbl.setVisible(false);
			}
		});
		
		redBarMob1Jp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				mob1HpLbl.setVisible(true);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				mob1HpLbl.setVisible(false);
			}
		});
		
		redBarMob2Jp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				mob2HpLbl.setVisible(true);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				mob2HpLbl.setVisible(false);
			}
		});
		
		redBarMob3Jp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				mob3HpLbl.setVisible(true);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				mob3HpLbl.setVisible(false);
			}
		});
	}

	private void buttonsActions() {
		hero1Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ba.setObjetiveHeros(0);
				ba.changePositions(0);
				hero1Btn.setBackground(Color.green);
				hero2Btn.setBackground(null);
				hero3Btn.setBackground(null);
			}
		});
		
		hero2Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ba.setObjetiveHeros(1);
				ba.changePositions(1);
				hero1Btn.setBackground(null);
				hero2Btn.setBackground(Color.green);
				hero3Btn.setBackground(null);
			}
		});
		
		hero3Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ba.setObjetiveHeros(2);
				ba.changePositions(2);
				hero1Btn.setBackground(null);
				hero2Btn.setBackground(null);
				hero3Btn.setBackground(Color.green);
			}
		});
		
		mob1Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ba.setObjetiveMobs(0);
				
				mob1Btn.setBackground(Color.green);
				mob2Btn.setBackground(null);
				mob3Btn.setBackground(null);
			}
		});
		
		mob2Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ba.setObjetiveMobs(1);
				
				mob1Btn.setBackground(null);
				mob2Btn.setBackground(Color.green);
				mob3Btn.setBackground(null);
			}
		});
		
		mob3Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ba.setObjetiveMobs(2);
				
				mob1Btn.setBackground(null);
				mob2Btn.setBackground(null);
				mob3Btn.setBackground(Color.green);
			}
		});
		
		changePositionBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ba.changeRequest();
			}
		});
		
		finishTurnBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hero1Btn.setBackground(null);
				hero2Btn.setBackground(null);
				hero3Btn.setBackground(null);
				
				mob1Btn.setBackground(null);
				mob2Btn.setBackground(null);
				mob3Btn.setBackground(null);
				
				ba.endTurn();	
			}
		});
	}
	
	public static void setSprites() {
		hero1Btn.setIcon(new javax.swing.ImageIcon(ba.metodoSpriteBotonHero(0)));
			ba.setSwingHero(hero1Btn, greenBarHero1Jp, 0);
		hero2Btn.setIcon(new javax.swing.ImageIcon(ba.metodoSpriteBotonHero(1)));
			ba.setSwingHero(hero2Btn, greenBarHero2Jp, 1);
		hero3Btn.setIcon(new javax.swing.ImageIcon(ba.metodoSpriteBotonHero(2)));
			ba.setSwingHero(hero3Btn, greenBarHero3Jp, 2);
		
		mob1Btn.setIcon(new javax.swing.ImageIcon(ba.metodoSpriteBotonMob(0)));
			ba.setSwingMob(mob1Btn, greenBarMob1Jp, 0);
		mob2Btn.setIcon(new javax.swing.ImageIcon(ba.metodoSpriteBotonMob(1)));
			ba.setSwingMob(mob2Btn, greenBarMob2Jp, 1);
		mob3Btn.setIcon(new javax.swing.ImageIcon(ba.metodoSpriteBotonMob(2)));
			ba.setSwingMob(mob3Btn, greenBarMob3Jp, 2);
	}
	
	public static void setHp() {
		hero1HpLbl.setText(ba.getHpStringHero(1));
		hero2HpLbl.setText(ba.getHpStringHero(2));
		hero3HpLbl.setText(ba.getHpStringHero(3));
		
		mob1HpLbl.setText(ba.getHpStringMob(1));
		mob2HpLbl.setText(ba.getHpStringMob(2));
		mob3HpLbl.setText(ba.getHpStringMob(3));
	}
	
	public static void setIniciativeOrder() {
		iniciativeOrderlbl1.setText(ba.getIniciativeOrder1());
		iniciativeOrderlbl2.setText(ba.getIniciativeOrder2());
		iniciativeOrderlbl3.setText(ba.getIniciativeOrder3());
		iniciativeOrderlbl4.setText(ba.getIniciativeOrder4());
		iniciativeOrderlbl5.setText(ba.getIniciativeOrder5());
		iniciativeOrderlbl6.setText(ba.getIniciativeOrder6());
	}
	
	public static void markCreatureOnTurn() {
		ba.markCreatureOnTurn();
	}
}
