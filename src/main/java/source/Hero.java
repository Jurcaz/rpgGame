package source;

import java.util.List;

public class Hero implements Creature{
	
	private int maxHp;
	private int actualHp;
	private int dodge;
	private int protc;
	private int speed;
	private int accuracy;
	private int critic;
	private int dmgMin;
	private int dmgMax;
	private int stunRes;
	private int moveRes;
	private int blightRes;
	private int bleedRes;
	private int diseaseRes;
	private int debufRes;
	private int deathBlow;
	private int trapDisarm;
	private int movement;
	private String critBuf;
	private boolean religious;
	private String provisions;
	private Weapon weapon;
	private Armor armor;
	private List<Ability> abilityList;
	
	private double initiative;
	private boolean alive;
	private int tier;
	
	public Hero(int tier, int stunRes, int moveRes, int blightRes, int bleedRes, int diseaseRes, int debufRes, int deathBlow, int trapDisarm, int movement, String critBuf, boolean religious, String provisions, Weapon weapon, Armor armor, List<Ability> abilityList) {
		this.tier = tier;
		this.maxHp = armor.getHp();
		this.actualHp = armor.getHp();
		this.dodge = 0;
		this.protc = 0;
		this.speed = 0;
		this.accuracy = 0;
		this.critic = 0;
		this.dmgMin = 0;
		this.dmgMax = 0;
		this.stunRes = stunRes;
		this.moveRes = moveRes;
		this.blightRes = blightRes;
		this.bleedRes = bleedRes;
		this.diseaseRes = diseaseRes;
		this.debufRes = debufRes;
		this.deathBlow = deathBlow;
		this.trapDisarm = trapDisarm;
		this.movement = movement;
		this.critBuf = critBuf;
		this.religious = religious;
		this.provisions = provisions;
		this.weapon = weapon;
		this.armor = armor;
		this.abilityList = abilityList;
	}

	public Ability getAblility(int i) {
		if(abilityList.get(i) != null && i <= 4) return abilityList.get(i);
		return null;
	}

	public double getInitiative() {
		return this.initiative;
	}

	public int getMaxHp() {
		return this.maxHp;
	}

	public int getActualHp() {
		return this.actualHp;
	}

	public int getSpeed() {
		return this.speed + this.weapon.getSpeedMod();
	}

	public void setActualHp(int i) {
		this.actualHp = i;
	}

	public void setInitiative(double i) {
		this.initiative = i;
	}

	public boolean isAlive() {
		return this.alive;
	}

	public void setAlive(boolean b) {
		this.alive = b;
	}

	public int getTier() {
		return this.tier;
	}
	
	public Weapon getWeapon() {
		return this.weapon;
	}

	public Armor getArmor() {
		return armor;
	}

	public void setArmor(Armor armor) {
		this.armor = armor;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public String cuentame() {
		return actualHp+"/"+maxHp+" "+weapon+" "+armor.getDodge();
	}
	
}
