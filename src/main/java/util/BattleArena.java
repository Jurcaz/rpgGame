package util;

import java.util.ArrayList;

import gui.Test;
import source.Creature;
import source.TeamCreatures;

public class BattleArena{
	
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
	
	private int objetive;
	
	private boolean finishGame;
	
	//------------------------------Constructor------------------------------//
	
	public void CreateArena(TeamCreatures pHeros, TeamCreatures pMobs) {
	
		this.finishGame = false;
		this.turn = 0;
		
		for(int i = 0 ; i<3 ; i++) {
			this.heros[i] = pHeros.getList()[i];
			this.mobs[i] = pMobs.getList()[i];
			listIniciative.add(pHeros.getList()[i]);
			listIniciative.add(pMobs.getList()[i]);
		}
				
		for (Creature c : listIniciative) {
			c.rollIniciative();
		}
		
		listIniciative.sort(new IniciativeComparator());
		
	}
	
	//-----------------------Lista iniciativa metodos--------------------//
	
	public Creature getCreatureOnTurn() {
		return listIniciative.get(turn);
	}
	
	public void nextTrun() {
		if(turn >= (listIniciative.size()-1)) { turn=0; } else { turn++; }
	}
	
	public int getTurn() {
		return turn;
	}
	
	//------------------------------Metodos------------------------------//
	
	public void showIniciativeList() {
		for (Creature c : listIniciative) {
			System.out.println(c.getClass().toString() +": "+ c.getIniciative());
		}
	}
	
	public void showHeroesList() {
		for(int i = 0 ; i<3 ; i++) {
			System.out.println(this.heros[i].getClass().toString());
		}
	}
	
	public void showMobsList() {
		for(int i = 0 ; i<3 ; i++) {
			System.out.println(this.mobs[i].getClass().toString());
		}
	}
	
	public ArrayList<Creature> getIniciativeList() {
		return listIniciative;
	}
	
	public String getSpriteHeros(int p) {
		return heros[p].getSprite();
	}
	
	public String getSpriteMobs(int p) {
		return mobs[p].getSprite();
	}
	
	public Creature getHero(int p) {
		return heros[p];
	}
	
	public Creature getMob(int p) {
		return mobs[p];
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
	
	public String showHp() {
		return "Fighter HP - " + heros[0].getActualHp() +"/"+ heros[0].getMaxHp()+"\n"+
				"Ranger HP - " + heros[1].getActualHp() +"/"+ heros[1].getMaxHp()+"\n"+
				"Cleric HP - " + heros[2].getActualHp() +"/"+ heros[2].getMaxHp()+"\n"+
				"Zombie 1 HP - " + mobs[0].getActualHp() +"/"+ mobs[0].getMaxHp()+"\n"+
				"Zombie 2 HP - " + mobs[1].getActualHp() +"/"+ mobs[1].getMaxHp()+"\n"+
				"Zombie 3 HP - " + mobs[2].getActualHp() +"/"+ mobs[2].getMaxHp()+"\n";
	}
	
	public void setObjetive(int i) {
		this.objetive = i;
	}
	
	public void markCreatureOnTurn() {
		getCreatureOnTurn().markButton();
	}
	
	public void unmarkCreatureOnTurn() {
		getCreatureOnTurn().unmarkButton();
	}

	//----------------------------Turn-----------------------------//
	
	public void endTurn() {
		
		// resaltar a la criatura en turno
		// 
		
		if(getCreatureOnTurn().isPj()) {
			UtilBattle.attackCreature(getCreatureOnTurn(), mobs[objetive]);
		} else {
			UtilBattle.attackCreature(getCreatureOnTurn(), heros[UtilBattle.randomTarget()]);
		}
		
		Test.setHpContextual(showHp());
		
		unmarkCreatureOnTurn();
		nextTrun();
		markCreatureOnTurn();
	}

	
	
}
