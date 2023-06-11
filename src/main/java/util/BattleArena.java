package util;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;

import gui.Test;
import source.Creature;
import source.Enemy;
import source.Hero;
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
	
	private List<Creature> listIniciative = new ArrayList<Creature>();
		
	private List<Hero> herosList = new ArrayList<Hero>();
	private List<Enemy> enemyList = new ArrayList<Enemy>();
	
	private int turn;
	
	private int objetiveHeros;
	private int objetiveMobs;
	
	private boolean finishGame;
	
	private boolean switchRequest;
	
	//------------------------------Constructor------------------------------//
	
	public void CreateArena(Hero h1, Hero h2, Hero h3, Enemy e1, Enemy e2, Enemy e3) {
	
		this.finishGame = false;
		this.turn = 0;
		this.objetiveHeros = 0;
		this.objetiveMobs = 0;
		this.switchRequest = false;
		
		listIniciative.add(h1);
		listIniciative.add(h2);
		listIniciative.add(h3);
		listIniciative.add(e1);
		listIniciative.add(e1);
		listIniciative.add(e1);
		
		herosList.add(h1);
		herosList.add(h2);
		herosList.add(h3);
		
		enemyList.add(e1);
		enemyList.add(e2);
		enemyList.add(e3);
			
		for (Creature c : listIniciative) {
			UtilBattle.rollIniciative(0, c);
		}
		
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
	
	/*
	public String metodoSpriteBotonHero(int aux) {
		return herosList.get(aux).getSprite();
	}
	
	public String metodoSpriteBotonMob(int aux) {
		return enemyList.get(aux).getSprite();
	}
	
	public void setSwingHero(JButton b, JPanel p, int aux) {
		this.herosList.get(aux).setBttn(b);
		this.herosList.get(aux).setPanel(p);
	}
	
	public void setSwingMob(JButton b, JPanel p, int aux) {
		this.enemyList.get(aux).setBttn(b);
		this.enemyList.get(aux).setPanel(p);
	}
	*/
	
	private boolean heroesAlive() {
		if( herosList.get(0).isAlive() || herosList.get(1).isAlive() || herosList.get(2).isAlive() ) return true;
		
		return false;
	}
	
	private boolean mobsAlive() {
		if( enemyList.get(0).isAlive() || enemyList.get(1).isAlive() || enemyList.get(2).isAlive() ) return true;
		
		return false;
	}
	
	public String showHp() {
		return "Fighter HP - " + herosList.get(0).getActualHp() +"/"+ herosList.get(0).getMaxHp()+"\n"+
				"Ranger HP - " + herosList.get(1).getActualHp() +"/"+ herosList.get(1).getMaxHp()+"\n"+
				"Cleric HP - " + herosList.get(2).getActualHp() +"/"+ herosList.get(2).getMaxHp()+"\n"+
				"Zombie 1 HP - " + enemyList.get(0).getActualHp() +"/"+ enemyList.get(0).getMaxHp()+"\n"+
				"Zombie 2 HP - " + enemyList.get(1).getActualHp() +"/"+ enemyList.get(1).getMaxHp()+"\n"+
				"Zombie 3 HP - " + enemyList.get(2).getActualHp() +"/"+ enemyList.get(2).getMaxHp()+"\n";
	}
	
	public void setObjetiveHeros(int i) {
		this.objetiveHeros = i;
	}
	
	public void setObjetiveMobs(int i) {
		this.objetiveMobs = i;
	}
	
	public void markCreatureOnTurn() {
		
	}
	
	public void unmarkCreatureOnTurn() {
		
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
		case 1: return enemyList.get(0).getActualHp() +"/"+ enemyList.get(0).getMaxHp();
		case 2:	return enemyList.get(1).getActualHp() +"/"+ enemyList.get(1).getMaxHp();
		case 3:	return enemyList.get(2).getActualHp() +"/"+ enemyList.get(2).getMaxHp();
		}
		return "";
	}
	
	public String getNameHero(int i) {
		return herosList.get(i-1).getClass().getSimpleName();
	}
	
	public String getNameEnemy(int i) {
		return enemyList.get(i-1).getClass().getSimpleName();
	}
	
	public void changeRequest() {
		this.switchRequest = true;
	}
	
	public void changePositions(int x) {
		if(this.switchRequest) { 
			herosList.add(x, herosList.remove(herosList.lastIndexOf(getCreatureOnTurn())));
			
			this.switchRequest = false;
		} 
		
		Test.setSprites();
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
	
	/*
	public void endTurn() {
		//variable para los monstruos
		int aux = 0;
		//turno de los heroes
		if(getCreatureOnTurn().isPj() && getCreatureOnTurn().alive()) {
			//heroes curan
			if(getCreatureOnTurn().getWeapon().isHeal()) {
				UtilBattle.attackCreature(getCreatureOnTurn(), herosList.get(objetiveHeros));
				herosList.get(objetiveHeros).updateHpBar();
			//heroes atacan
			} else {
				UtilBattle.attackCreature(getCreatureOnTurn(), mobsList.get(objetiveMobs));
				mobsList.get(objetiveMobs).updateHpBar();
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
		if(!mobsList.get(objetiveMobs).alive()) {
			listIniciative.remove(mobsList.get(objetiveMobs));
		}
		
		//pasa el turno y marca a la siguiente criatura
		//es importante que se realice en este orden para que si a muerto una criatura se retire antes de marcarla
		nextTurn();
		markCreatureOnTurn();
		
	}
	*/

	//-----------------------GettersSetters------------------------//
	
	public List<Creature> getListIniciative() {
		return listIniciative;
	}

	public void setListIniciative(List<Creature> listIniciative) {
		this.listIniciative = listIniciative;
	}

	public List<Hero> getHeros() {
		return herosList;
	}

	public void setHeros(List<Hero> heros) {
		this.herosList = heros;
	}

	public List<Enemy> getEnemies() {
		return enemyList;
	}

	public void setEnemy(List<Enemy> mobs) {
		this.enemyList = mobs;
	}

	public boolean isFinishGame() {
		return finishGame;
	}

	public void setFinishGame(boolean finishGame) {
		this.finishGame = finishGame;
	}

	public int getObjetiveHero() {
		return objetiveHeros;
	}
	
	public int getObjetiveMob() {
		return objetiveMobs;
	}
	
	public void setTurn(int turn) {
		this.turn = turn;
	}
	
	public int buildHpBar() {
		return 0;
	}
	
}
