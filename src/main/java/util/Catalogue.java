package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import creatures.Cleric;
import creatures.Fighter;
import creatures.Ranger;
import creatures.Zombie;
import source.Creature;
import source.Item;

public class Catalogue {

	private static Catalogue instance;
	
	private Catalogue() {
		
	}
	
	public static Catalogue getInstance() {
		if(instance==null) instance = new Catalogue();
		return instance;
	}
	
	//------------------------------Atributos------------------------------//
	
	ArrayList<Creature> creatureList = new ArrayList<Creature>();
	
	public void instanceCatalogue() {
		creatureList.add(new Fighter()); 
		creatureList.add(new Ranger());
		creatureList.add(new Cleric());
		
		creatureList.add(new Zombie());
		
	}
	
	public Creature getCreature(String name) {
		for (Creature c : creatureList) {
			if(c.getClass().getSimpleName().equals(name)) return c;
		}
		return null;
	}
	
}