package main;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Iterator;

import creatures.Cleric;
import creatures.Fighter;
import creatures.Ranger;
import creatures.Zombie;
import gui.Test;
import source.Creature;
import source.TeamCreatures;
import util.BattleArena;
import util.Catalogue;
import util.IniciativeComparator;
import util.UtilBattle;

public class Main {

	public static void main(String[] args) {
			
		BattleArena ba = BattleArena.getInstance();
		Catalogue cat = Catalogue.getInstance();
				
		cat.instanceCatalogue();
		
		Creature f1 = cat.getCreature("Fighter");
		Creature r1 = cat.getCreature("Ranger");
		Creature c1 = cat.getCreature("Cleric");
		
		Creature z1 = new Zombie();
		Creature z2 = new Zombie();
		Creature z3 = new Zombie();
		
		ba.CreateArena(new TeamCreatures(f1,r1,c1),	new TeamCreatures(z1,z2,z3));
		
		Test windowBattle = new Test();
		windowBattle.setVisible(true);

		//ba.showHeroesList();
		//ba.showMobsList();
		//System.out.println("Fighter HP - " + f1.getActualHp() +"/"+ f1.getMaxHp()+"\n"+"Ranger HP - " + r1.getActualHp() +"/"+ r1.getMaxHp()+"\n"+"Cleric HP - " + c1.getActualHp() +"/"+ c1.getMaxHp()+"\n"+"Zombie 1 HP - " + z1.getActualHp() +"/"+ z1.getMaxHp()+"\n"+"Zombie 2 HP - " + z2.getActualHp() +"/"+ z2.getMaxHp()+"\n"+	"Zombie 3 HP - " + z3.getActualHp() +"/"+ z3.getMaxHp()+"\n");		
		
	}
}
