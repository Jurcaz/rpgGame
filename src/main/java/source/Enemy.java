package source;

import java.util.List;

public class Enemy implements Creature{
	
	private EnemyType name;
	private CategorieType categorie;
	
	private int maxHp;
	private int actualHp;
	private int dodge;
	private int protc;
	private int speed;
	private int stunRes;
	private int moveRes;
	private int blightRes;
	private int bleedRes;
	private int debufRes;
	
	private List<Ability> abilityList;
	
	private double initiative;
	private boolean alive;
	
	
	

	public Enemy(EnemyType name, CategorieType categorie, int maxHp, int dodge, int protc, int speed,
			int stunRes, int moveRes, int blightRes, int bleedRes, int debufRes, List<Ability> abilityList,
			double initiative, boolean alive) {
		super();
		this.name = name;
		this.categorie = categorie;
		this.maxHp = maxHp;
		this.actualHp = maxHp;
		this.dodge = dodge;
		this.protc = protc;
		this.speed = speed;
		this.stunRes = stunRes;
		this.moveRes = moveRes;
		this.blightRes = blightRes;
		this.bleedRes = bleedRes;
		this.debufRes = debufRes;
		this.abilityList = abilityList;
		this.initiative = initiative;
		this.alive = alive;
	}



	public int getDmgMin() {
		
		return 0;
	}



	public double getInitiative() {
		return this.initiative;
	}



	public Ability getAblility(int i) {
		if(abilityList.get(i) != null && i <= 4) return abilityList.get(i);
		return null;
	}



	public int getMaxHp() {
		return this.maxHp;
	}



	public int getActualHp() {
		return this.actualHp;
	}



	public int getSpeed() {
		return this.speed;
	}



	public void setActualHp(int i) {
		this.actualHp = i;
	}



	public void setInitiative(double i) {
		this.initiative = i;
	}



	public boolean isAlive() {
		return alive;
	}



	public void setAlive(boolean b) {
		this.alive = b;
	}
	
}
