package util;

import java.util.ArrayList;
import javax.swing.JButton;

import gui.Test;
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
	
	private ArrayList<Creature> listIniciative = new ArrayList<Creature>();
		
	private ArrayList<Creature> herosList = new ArrayList<Creature>();
	private ArrayList<Creature> mobsList = new ArrayList<Creature>();
	
	private int turn;
	
	private int objetive;
	
	private int auxHero;
	private int auxMob;
	
	private boolean finishGame;
	
	//------------------------------Constructor------------------------------//
	
	public void CreateArena(TeamCreatures pHeros, TeamCreatures pMobs) {
	
		this.finishGame = false;
		this.turn = 0;
		this.objetive = 0;
		this.auxHero = 0;
		this.auxMob = 0;
		
		for(int i = 0 ; i<3 ; i++) {
			this.herosList.add(pHeros.getList()[i]);
			this.mobsList.add(pMobs.getList()[i]);
			listIniciative.add(pHeros.getList()[i]);
			listIniciative.add(pMobs.getList()[i]);
		}
				
		for (Creature c : listIniciative) {
			c.rollIniciative();
		}
		
		herosList.sort(new IniciativeComparator());
		mobsList.sort(new IniciativeComparator());
		listIniciative.sort(new IniciativeComparator());
		
	}
	
	//-----------------------Lista iniciativa metodos--------------------//
	
	public Creature getCreatureOnTurn() {
		return listIniciative.get(turn);
	}
	
	public void nextTurn() {
		if(turn >= (listIniciative.size()-1)) { turn=0; } else { turn++; }
	}
	
	public int getTurn() {
		return turn;
	}
	
	//------------------------------Metodos------------------------------//
	
	public ArrayList<Creature> getIniciativeList() {
		return listIniciative;
	}
	
	public String metodoSpriteBotonHero() {
		return herosList.get(auxHero).getSprite();
	}
	
	public String metodoSpriteBotonMob() {
		return mobsList.get(auxMob).getSprite();
	}
	
	public void setJbuttonHero(JButton b) {
		this.herosList.get(auxHero).setBttn(b);
		auxHero++;
	}
	
	public void setJbuttonMob(JButton b) {
		this.mobsList.get(auxMob).setBttn(b);
		auxMob++;
	}
	
	private boolean heroesAlive() {
		if( herosList.get(0).alive() || herosList.get(1).alive() || herosList.get(2).alive() ) return true;
		
		return false;
	}
	
	private boolean mobsAlive() {
		if( mobsList.get(0).alive() || mobsList.get(1).alive() || mobsList.get(2).alive() ) return true;
		
		return false;
	}
	
	public String showHp() {
		return "Fighter HP - " + herosList.get(0).getActualHp() +"/"+ herosList.get(0).getMaxHp()+"\n"+
				"Ranger HP - " + herosList.get(1).getActualHp() +"/"+ herosList.get(1).getMaxHp()+"\n"+
				"Cleric HP - " + herosList.get(2).getActualHp() +"/"+ herosList.get(2).getMaxHp()+"\n"+
				"Zombie 1 HP - " + mobsList.get(0).getActualHp() +"/"+ mobsList.get(0).getMaxHp()+"\n"+
				"Zombie 2 HP - " + mobsList.get(1).getActualHp() +"/"+ mobsList.get(1).getMaxHp()+"\n"+
				"Zombie 3 HP - " + mobsList.get(2).getActualHp() +"/"+ mobsList.get(2).getMaxHp()+"\n";
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
	
	public Creature getHero(int i) {
		return this.herosList.get(i);
	}
	
	public Creature getMob(int i) {
		return this.mobsList.get(i);
	}

	//----------------------------Turn-----------------------------//
	
	public void endTurn() {
		
		if(getCreatureOnTurn().isPj()) {
			if(getCreatureOnTurn().getWeapon().isHeal()) {
				UtilBattle.attackCreature(getCreatureOnTurn(), herosList.get(objetive));
			} else {
				UtilBattle.attackCreature(getCreatureOnTurn(), mobsList.get(objetive));
			}
			
		} else {
			UtilBattle.attackCreature(getCreatureOnTurn(), herosList.get(UtilBattle.randomTarget()));
		}
		
		Test.setHpContextual(showHp());
		
		unmarkCreatureOnTurn();
		nextTurn();
		markCreatureOnTurn();
	}

	//-----------------------GettersSetters------------------------//
	
	public ArrayList<Creature> getListIniciative() {
		return listIniciative;
	}

	public void setListIniciative(ArrayList<Creature> listIniciative) {
		this.listIniciative = listIniciative;
	}

	public ArrayList<Creature> getHeros() {
		return herosList;
	}

	public void setHeros(ArrayList<Creature> heros) {
		this.herosList = heros;
	}

	public ArrayList<Creature> getMobs() {
		return mobsList;
	}

	public void setMobs(ArrayList<Creature> mobs) {
		this.mobsList = mobs;
	}

	public boolean isFinishGame() {
		return finishGame;
	}

	public void setFinishGame(boolean finishGame) {
		this.finishGame = finishGame;
	}

	public int getObjetive() {
		return objetive;
	}

	public static void setInstance(BattleArena instance) {
		BattleArena.instance = instance;
	}

	public void setTurn(int turn) {
		this.turn = turn;
	}
	
}
