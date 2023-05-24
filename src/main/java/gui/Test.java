package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import util.BattleArena;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

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
		
		heroesPanel = new JPanel();
		battlePanel.add(heroesPanel);
		heroesPanel.setLayout(null);
		
		hero2Btn = new JButton("");
		hero2Btn.setBounds(107, 11, 90, 230);
		heroesPanel.add(hero2Btn);
		
		hero1Btn = new JButton("");
		hero1Btn.setBounds(207, 11, 90, 230);
		heroesPanel.add(hero1Btn);
		
		hero3Btn = new JButton("");
		hero3Btn.setBounds(7, 11, 90, 230);
		heroesPanel.add(hero3Btn);
		
		mobPanel = new JPanel();
		battlePanel.add(mobPanel);
		mobPanel.setLayout(null);
		
		mob2Btn = new JButton("");
		mob2Btn.setBounds(110, 11, 90, 230);
		mobPanel.add(mob2Btn);
		
		mob1Btn = new JButton("");
		mob1Btn.setBounds(10, 11, 90, 230);
		mobPanel.add(mob1Btn);
		
		mob3Btn = new JButton("");
		mob3Btn.setBounds(210, 11, 90, 230);
		mobPanel.add(mob3Btn);
		
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
		
		showHp();
		showIniciativeTurn();
		markCreatureOnTurn();
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
			ba.setJbuttonHero(hero1Btn);
		hero2Btn.setIcon(new javax.swing.ImageIcon(ba.metodoSpriteBotonHero()));
			ba.setJbuttonHero(hero2Btn);
		hero3Btn.setIcon(new javax.swing.ImageIcon(ba.metodoSpriteBotonHero()));
			ba.setJbuttonHero(hero3Btn);
		
		mob1Btn.setIcon(new javax.swing.ImageIcon(ba.metodoSpriteBotonMob()));
			ba.setJbuttonMob(mob1Btn);
		mob2Btn.setIcon(new javax.swing.ImageIcon(ba.metodoSpriteBotonMob()));
			ba.setJbuttonMob(mob2Btn);
		mob3Btn.setIcon(new javax.swing.ImageIcon(ba.metodoSpriteBotonMob()));
			ba.setJbuttonMob(mob3Btn);
	}
	
	public static void setHpContextual(String str) {
		contextualTextArea.setText(str);
		System.out.println(str);
	}
	
	private void showHp() {
		System.out.println(ba.showHp());
	}
	
	public static void showIniciativeTurn() {
		System.out.println(ba.getCreatureOnTurn()+"\n");
	}
	
	public static void markCreatureOnTurn() {
		ba.markCreatureOnTurn();
	}
}
