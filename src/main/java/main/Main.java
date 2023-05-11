package main;

import java.awt.EventQueue;
import java.util.ArrayList;

import creatures.Cleric;
import creatures.Fighter;
import creatures.Ranger;
import creatures.Zombie;
import gui.Test;
import source.Creature;
import source.TeamCreatures;
import util.BattleArena;
import util.IniciativeComparator;
import util.UtilBattle;

public class Main {

	public static void main(String[] args) {
		
		BattleArena ba = BattleArena.getInstance();
		
		Fighter f1 = new Fighter();
		Ranger r1 = new Ranger();
		Cleric c1 = new Cleric();
		
		Zombie z1 = new Zombie();
		Zombie z2 = new Zombie();
		Zombie z3 = new Zombie();
		
		ba.BattleArena(new TeamCreatures(f1, r1, c1), new TeamCreatures(z1, z2, z3));
		
		ba.showList();
		
		try {
			Test frame = new Test();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
//		for (Creature c : iniciativeList) { System.out.println( c.getClass().toString().charAt(16)+": "+c.getIniciative());	}
		
//		System.out.println("Fighter HP - " + f1.getActualHp() +"/"+ f1.getMaxHp()+"\n"+"Ranger HP - " + r1.getActualHp() +"/"+ r1.getMaxHp()+"\n"+"Cleric HP - " + c1.getActualHp() +"/"+ c1.getMaxHp()+"\n"+"Zombie 1 HP - " + z1.getActualHp() +"/"+ z1.getMaxHp()+"\n"+"Zombie 2 HP - " + z2.getActualHp() +"/"+ z2.getMaxHp()+"\n"+	"Zombie 3 HP - " + z3.getActualHp() +"/"+ z3.getMaxHp()+"\n");		

//		UtilBattle.attackCreature(f1, z3);
		
//		System.out.println("Fighter HP - " + f1.getActualHp() +"/"+ f1.getMaxHp()+"\n"+"Ranger HP - " + r1.getActualHp() +"/"+ r1.getMaxHp()+"\n"+"Cleric HP - " + c1.getActualHp() +"/"+ c1.getMaxHp()+"\n"+"Zombie 1 HP - " + z1.getActualHp() +"/"+ z1.getMaxHp()+"\n"+"Zombie 2 HP - " + z2.getActualHp() +"/"+ z2.getMaxHp()+"\n"+	"Zombie 3 HP - " + z3.getActualHp() +"/"+ z3.getMaxHp()+"\n");		

//		UtilBattle.attackCreature(f1, z3);
		
//		System.out.println("Fighter HP - " + f1.getActualHp() +"/"+ f1.getMaxHp()+"\n"+"Ranger HP - " + r1.getActualHp() +"/"+ r1.getMaxHp()+"\n"+"Cleric HP - " + c1.getActualHp() +"/"+ c1.getMaxHp()+"\n"+"Zombie 1 HP - " + z1.getActualHp() +"/"+ z1.getMaxHp()+"\n"+"Zombie 2 HP - " + z2.getActualHp() +"/"+ z2.getMaxHp()+"\n"+	"Zombie 3 HP - " + z3.getActualHp() +"/"+ z3.getMaxHp()+"\n");		

	}
}
