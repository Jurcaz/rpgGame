package util;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;

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
	
	private boolean finishGame;
	
	private boolean switchRequest;
	
	//------------------------------Constructor------------------------------//
	
	public void CreateArena(TeamCreatures pHeros, TeamCreatures pMobs) {
	
		this.finishGame = false;
		this.turn = 0;
		this.objetive = 0;
		this.switchRequest = false;
		
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
	
	private Creature getCreatureOnTurn() {
		return listIniciative.get(turn);
	}
	
	private void nextTurn() {
		if(turn >= (listIniciative.size()-1)) { turn=0; } else { turn++; }
	}
	
	private int getTurn() {
		return turn;
	}
	
	//------------------------------Metodos------------------------------//
	
	public String metodoSpriteBotonHero(int aux) {
		return herosList.get(aux).getSprite();
	}
	
	public String metodoSpriteBotonMob(int aux) {
		return mobsList.get(aux).getSprite();
	}
	
	public void setSwingHero(JButton b, JPanel p, int aux) {
		this.herosList.get(aux).setBttn(b);
		this.herosList.get(aux).setPanel(p);
	}
	
	public void setSwingMob(JButton b, JPanel p, int aux) {
		this.mobsList.get(aux).setBttn(b);
		this.mobsList.get(aux).setPanel(p);
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
	
	public String getHpStringHero(int aux) {
		switch (aux) {
		case 1: return herosList.get(0).getActualHp() +"/"+ herosList.get(0).getMaxHp();
		case 2:	return herosList.get(1).getActualHp() +"/"+ herosList.get(1).getMaxHp();
		case 3:	return herosList.get(2).getActualHp() +"/"+ herosList.get(2).getMaxHp();
		}
		return "";
	}
	
	public String getHpStringMob(int aux) {
		switch (aux) {
		case 1: return mobsList.get(0).getActualHp() +"/"+ mobsList.get(0).getMaxHp();
		case 2:	return mobsList.get(1).getActualHp() +"/"+ mobsList.get(1).getMaxHp();
		case 3:	return mobsList.get(2).getActualHp() +"/"+ mobsList.get(2).getMaxHp();
		}
		return "";
	}
	
	public void cambioPosiciones(int x, int y) {
		if(this.switchRequest) {
			herosList.set(y, herosList.get(x));
			herosList.remove(x);
			
			this.switchRequest = false;
		} else {
			this.switchRequest = true;
		}
	}
	
	public String getIniciativeOrder1() {
		return listIniciative.get(0).getClass().getSimpleName();
	}
	
	public String getIniciativeOrder2() {
		return listIniciative.get(1).getClass().getSimpleName();
	}
	
	public String getIniciativeOrder3() {
		return listIniciative.get(2).getClass().getSimpleName();
	}
	
	public String getIniciativeOrder4() {
		return listIniciative.get(3).getClass().getSimpleName();
	}
	
	public String getIniciativeOrder5() {
		return listIniciative.get(4).getClass().getSimpleName();
	}
	
	public String getIniciativeOrder6() {
		return listIniciative.get(5).getClass().getSimpleName();
	}

	//----------------------------Turn-----------------------------//
	
	public void endTurn() {
		//variable para los monstruos
		int aux = 0;
		//turno de los heroes
		if(getCreatureOnTurn().isPj() && getCreatureOnTurn().alive()) {
			//heroes curan
			if(getCreatureOnTurn().getWeapon().isHeal()) {
				UtilBattle.attackCreature(getCreatureOnTurn(), herosList.get(objetive));
				herosList.get(objetive).updateHpBar();
			//heroes atacan
			} else {
				UtilBattle.attackCreature(getCreatureOnTurn(), mobsList.get(objetive));
				mobsList.get(objetive).updateHpBar();
			}
		//turno de los monstruos
		//monstruos atacan
		} else if(!getCreatureOnTurn().isPj() && getCreatureOnTurn().alive()) {
			aux = UtilBattle.randomTarget();
			UtilBattle.attackCreature(getCreatureOnTurn(), herosList.get(aux));
			herosList.get(aux).updateHpBar();
		}
		
		//muestra la vida exacta 
		Test.setHp();
		
		//desmarca a la criatura 
		unmarkCreatureOnTurn();
		
		
		//si han muerto criaturas se retiran de la lista de iniciativa
		if(!herosList.get(aux).alive()) {
			listIniciative.remove(herosList.get(aux));
		}
		if(!mobsList.get(objetive).alive()) {
			listIniciative.remove(mobsList.get(objetive));
		}
		
		//pasa el turno y marca a la siguiente criatura
		//es importante que se realice en este orden para que si a muerto una criatura se retire antes de marcarla
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
	
	public int buildHpBar() {
		return 0;
	}
	
}
