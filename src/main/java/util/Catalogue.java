package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import creatures.Cleric;
import creatures.Fighter;
import creatures.Ranger;
import creatures.Zombie;
import items.GreatSword;
import items.Mace;
import items.PistonAndBlade;
import persistence.WeaponCSVImpl;
import persistence.WeaponDTO;
import source.Creature;
import source.Weapon;
import source.WeaponType;

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
	
	private List<Weapon> weaponList = new ArrayList<Weapon>();
			
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
	
	//-----------------------//
	
	public void instanceWeapon() {
		WeaponCSVImpl.getInstance().startWeaponBD();
		
		for (WeaponDTO w : WeaponCSVImpl.getInstance().getInfoWeaponList()) {
			switch (w.getType()) {
				case GREATSWORD: 
					weaponList.add(new GreatSword(w.getName(), w.getTier(), w.getDamageMin(), w.getDamageMax(), w.getCritMod(), w.getSpeedMod()));	
					break;
				case PISTOLANDBLADE:
					weaponList.add(new PistonAndBlade(w.getName(), w.getTier(), w.getDamageMin(), w.getDamageMax(), w.getCritMod(), w.getSpeedMod()));
					break;
				case MACE:
					weaponList.add(new Mace(w.getName(), w.getTier(), w.getDamageMin(), w.getDamageMax(), w.getCritMod(), w.getSpeedMod()));
					break;
			}
		}
		
	}
	
	public Weapon getWeapon(WeaponType type, int tier) {
		for (Weapon w : weaponList) {
			if(w.getClass().getSimpleName().toUpperCase().equals(type) && w.getTier() == tier) return w;
		}
		return null;
	}
	
	public List<Weapon> getWeaponList(){
		return weaponList;
	}
	
}