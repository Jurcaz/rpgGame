package main;

import java.util.ArrayList;
import java.util.List;

import creatures.Crusader;
import gui.Test;
import persistence.DamageCSVImpl;
import persistence.EffectCSVImpl;
import persistence.HealCSVImpl;
import source.*;
import util.BattleArena;
import util.Catalogue;

public class Main {

	public static void main(String[] args) {
		
		BattleArena ba = BattleArena.getInstance();
		Catalogue cat = Catalogue.getInstance();
		
		cat.instanceCatalog();

		Hero h1 = cat.getHero(HeroType.CRUSADER, 1);
						
		Hero h2 = cat.getHero(HeroType.HIGHWAYMAN, 1);
			
		Hero h3 = cat.getHero(HeroType.VESTAL, 1);
			
		
		Enemy e1 = new Enemy(EnemyType.BONESOLDIER, CategorieType.UNHOLY, 10, 0, 15, 2, 25, 20, 10, 200, 15, null, 0, true);
		Enemy e2 = new Enemy(EnemyType.BONESOLDIER, CategorieType.UNHOLY, 10, 0, 15, 2, 25, 20, 10, 200, 15, null, 0, true);
		Enemy e3 = new Enemy(EnemyType.BONESOLDIER, CategorieType.UNHOLY, 10, 0, 15, 2, 25, 20, 10, 200, 15, null, 0, true);
		
		ba.CreateArena(h1, h2, h3, e1, e2, e3);
		
//		Hero c1 = cat.getHero(HeroType.CRUSADER, 1);
//		Hero h1 = cat.getHero(HeroType.HIGHWAYMAN, 1);
//		Hero v1 = cat.getHero(HeroType.VESTAL, 1);
//		
//		c1.setAbility(cat.getDamage(DamageType.SMITE));
//		c1.setAbility(cat.getDamage(DamageType.ZEALOUSACCUSATION));
//		c1.setAbility(cat.getDamage(DamageType.STUNNINGBLOW));
//		c1.setAbility(cat.getEffect(EffectType.BULWARKOFFAITH));
//		
//		h1.setAbility(cat.getDamage(DamageType.WICKEDSLICE));
//		h1.setAbility(cat.getDamage(DamageType.OPENVEIN));
//		h1.setAbility(cat.getDamage(DamageType.PISTOLSHOT));
//		h1.setAbility(cat.getDamage(DamageType.GRAPESHOTBLAST));
//		
//		v1.setAbility(cat.getDamage(DamageType.JUDGEMENT));
//		v1.setAbility(cat.getDamage(DamageType.DAZZLINGLIGHT));
//		v1.setAbility(cat.getHeal(HealType.DIVINEGRACE));
//		v1.setAbility(cat.getHeal(HealType.DIVINECOMFORT));
		
//		for (Hero h : cat.getHeroList()) {
//			System.out.println(h.toString());
//		}
//		
//		System.out.println(cat.getHero(HeroType.VESTAL, 2));
//		
//		for (Armor a : cat.getArmorList()) {
//			System.out.println(a.getName());
//		}
//		
//		System.out.println(cat.getArmor(ArmorType.CHAINANDPLATE, 3));
//		
//		for (Weapon w: cat.getWeaponList()) {
//			System.out.println(w.getName());
//		}
//		
//		System.out.println(cat.getWeapon(WeaponType.GREATSWORD, 4));
//	
//		for (Damage d : cat.getDamageList()) {
//			System.out.println(d.getSkillName());
//		}
//		
//		System.out.println(cat.getDamage(DamageType.SMITE).getSkillName());
				
//		ba.CreateArena(new TeamCreatures(new Fighter(),new Ranger(),new Cleric()),	new TeamCreatures(new Zombie(),new Zombie(),new Zombie()));
		
		Test windowBattle = new Test();
		windowBattle.setVisible(true);
		
	}
}
