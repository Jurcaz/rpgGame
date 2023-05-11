package util;

import java.util.ArrayList;

import source.Creature;
import source.TeamCreatures;

public class BattleArena {
	
	private static BattleArena instance;
	
	private BattleArena() {
		
	}
	
	public static BattleArena getInstance() {
		if(instance==null) instance = new BattleArena();
		return instance;
	}
	
	//------------------------------Atributos------------------------------//
	
	private int turn;
	private ArrayList<Creature> listIniciative = new ArrayList<Creature>();
	
	private Creature[] heros = {null,null,null};
	private Creature[] mobs = {null,null,null};
	
	//------------------------------Constructor------------------------------//
	
	public void BattleArena(TeamCreatures pHeros, TeamCreatures pMobs) {
	
		this.heros = pHeros.getList();
		this.mobs = pMobs.getList();
		
		listIniciative.add(pHeros.getPos1());
		listIniciative.add(pHeros.getPos2());
		listIniciative.add(pHeros.getPos3());
		listIniciative.add(pMobs.getPos1());
		listIniciative.add(pMobs.getPos2());
		listIniciative.add(pMobs.getPos3());
		
		for (Creature c : listIniciative) {
			c.rollIniciative();
		}
		
		listIniciative.sort(new IniciativeComparator());
	
	}
	
	//------------------------------Metodos------------------------------//
	
	public void showList() {
		for (Creature c : listIniciative) {
			System.out.println(c.getClass().toString() +": "+ c.getIniciative());
		}
	}
	
	public String getSpriteHeros(int p) {
		return heros[p].getSprite();
	}
	
	public String getSpriteMobs(int p) {
		return mobs[p].getSprite();
	}
	
}
