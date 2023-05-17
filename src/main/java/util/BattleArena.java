package util;

import java.util.ArrayList;

import source.Creature;
import source.TeamCreatures;

public class BattleArena implements Runnable{
	
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
	
	private boolean finishGame;
	
	//------------------------------Constructor------------------------------//
	
	public void CreateArena(TeamCreatures pHeros, TeamCreatures pMobs) {
	
		this.finishGame = false;
		
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
	
	public boolean getFinishGame() {
		return finishGame;
	}

	public void setFinishGame(boolean finishGame) {
		this.finishGame = finishGame;
	}
	
	private boolean heroesAlive() {
		if( heros[0].alive() || heros[1].alive() || heros[2].alive() ) return true;
		
		return false;
	}
	
	private boolean mobsAlive() {
		if( mobs[0].alive() || mobs[1].alive() || mobs[2].alive() ) return true;
		
		return false;
	}
	
	public void showHp() {
		System.out.println("Fighter HP - " + heros[0].getActualHp() +"/"+ heros[0].getMaxHp()+"\n"+
				"Ranger HP - " + heros[1].getActualHp() +"/"+ heros[1].getMaxHp()+"\n"+
				"Cleric HP - " + heros[2].getActualHp() +"/"+ heros[2].getMaxHp()+"\n"+
				"Zombie 1 HP - " + mobs[0].getActualHp() +"/"+ mobs[0].getMaxHp()+"\n"+
				"Zombie 2 HP - " + mobs[1].getActualHp() +"/"+ mobs[1].getMaxHp()+"\n"+
				"Zombie 3 HP - " + mobs[2].getActualHp() +"/"+ mobs[2].getMaxHp()+"\n");
	}

	public void run() {
		
		while (getFinishGame()) {
			showHp();
			System.out.println("Heroes alive - "+heroesAlive());
			System.out.println("Mobs alive - "+mobsAlive());
			
			UtilBattle.attackCreature(heros[0], mobs[0]);
			UtilBattle.attackCreature(heros[0], mobs[1]);
			UtilBattle.attackCreature(heros[0], mobs[2]);

			UtilBattle.attackCreature(heros[1], mobs[0]);
			UtilBattle.attackCreature(heros[1], mobs[1]);
			UtilBattle.attackCreature(heros[1], mobs[2]);
			
			if(heroesAlive() && mobsAlive()) setFinishGame(true);
			
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
		
	}

	
	
}
