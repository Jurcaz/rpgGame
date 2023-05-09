package source;

import util.UtilBattle;

public abstract class Creature {
	
	//vida max, vida actual, iniciativa, estadisticas, armadura, armas
	
	int maxHp;
	int actualHp;
	
	double iniciative;
	
	int strPunt;
	int dexPunt;
	int conPunt;
	int intPunt;
	int sabPunt;
	int chaPunt;
	
	Item weapon;
	Item armor;

	public Creature(int maxHp, int strPunt, int dexPunt, int conPunt, int intPunt,	int sabPunt, int chaPunt) {
		super();
		this.maxHp = maxHp;
		this.actualHp = maxHp;
		this.iniciative = 0;
		this.strPunt = strPunt;
		this.dexPunt = dexPunt;
		this.conPunt = conPunt;
		this.intPunt = intPunt;
		this.sabPunt = sabPunt;
		this.chaPunt = chaPunt;
	}
	
	public Creature(int maxHp, int strPunt, int dexPunt, int conPunt, int intPunt,	int sabPunt, int chaPunt, Item weapon, Item armor) {
		super();
		this.maxHp = maxHp;
		this.actualHp = maxHp;
		this.iniciative = 0;
		this.strPunt = strPunt;
		this.dexPunt = dexPunt;
		this.conPunt = conPunt;
		this.intPunt = intPunt;
		this.sabPunt = sabPunt;
		this.chaPunt = chaPunt;
		this.weapon = weapon;
		this.armor = armor;
	}
	
	public void rollIniciative() {
		this.iniciative = UtilBattle.dVeinte()+UtilBattle.obtenBon(this.dexPunt)+(UtilBattle.obtenBon(this.dexPunt)*0.1)+(UtilBattle.dDiez()*0.01);
	}
	
	public int hit() {
		switch (this.weapon.getsUsed()) {
		case STR:
			return UtilBattle.dVeinte()+UtilBattle.obtenBon(strPunt);
		case DEX:
			return UtilBattle.dVeinte()+UtilBattle.obtenBon(dexPunt);
		case CON:
			return UtilBattle.dVeinte()+UtilBattle.obtenBon(conPunt);
		case INT:
			return UtilBattle.dVeinte()+UtilBattle.obtenBon(intPunt);
		case SAB:
			return UtilBattle.dVeinte()+UtilBattle.obtenBon(sabPunt);
		case CHA:
			return UtilBattle.dVeinte()+UtilBattle.obtenBon(chaPunt);
		}
		return 0;
	}
	
	public int attack() {
		switch (this.weapon.getsUsed()) {
		case STR:
			if(this.weapon.isHeal()) {
				return UtilBattle.obtenBon(strPunt)+this.weapon.rollDice();
			} else {
				return -1*(UtilBattle.obtenBon(strPunt)+this.weapon.rollDice());
			}
		case DEX:
			if(this.weapon.isHeal()) {
				return UtilBattle.obtenBon(dexPunt)+this.weapon.rollDice();
			} else {
				return -1*(UtilBattle.obtenBon(dexPunt)+this.weapon.rollDice());
			}
		case CON:
			if(this.weapon.isHeal()) {
				return UtilBattle.obtenBon(conPunt)+this.weapon.rollDice();
			} else {
				return -1*(UtilBattle.obtenBon(conPunt)+this.weapon.rollDice());
			}
		case INT:
			if(this.weapon.isHeal()) {
				return UtilBattle.obtenBon(intPunt)+this.weapon.rollDice();
			} else {
				return -1*(UtilBattle.obtenBon(intPunt)+this.weapon.rollDice());
			}
		case SAB:
			if(this.weapon.isHeal()) {
				return UtilBattle.obtenBon(sabPunt)+this.weapon.rollDice();
			} else {
				return -1*(UtilBattle.obtenBon(sabPunt)+this.weapon.rollDice());
			}
		case CHA:
			if(this.weapon.isHeal()) {
				return UtilBattle.obtenBon(chaPunt)+this.weapon.rollDice();
			} else {
				return -1*(UtilBattle.obtenBon(chaPunt)+this.weapon.rollDice());
			}
		}
		return 0;
	}
	

	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public int getActualHp() {
		return actualHp;
	}

	public void setActualHp(int actualHp) {
		this.actualHp = this.actualHp + actualHp;
	}

	public double getIniciative() {
		return iniciative;
	}

	public void setIniciative(double iniciative) {
		this.iniciative = iniciative;
	}

	public int getStrPunt() {
		return strPunt;
	}

	public void setStrPunt(int strPunt) {
		this.strPunt = strPunt;
	}

	public int getDexPunt() {
		return dexPunt;
	}

	public void setDexPunt(int dexPunt) {
		this.dexPunt = dexPunt;
	}

	public int getConPunt() {
		return conPunt;
	}

	public void setConPunt(int conPunt) {
		this.conPunt = conPunt;
	}

	public int getIntPunt() {
		return intPunt;
	}

	public void setIntPunt(int intPunt) {
		this.intPunt = intPunt;
	}

	public int getSabPunt() {
		return sabPunt;
	}

	public void setSabPunt(int sabPunt) {
		this.sabPunt = sabPunt;
	}

	public int getChaPunt() {
		return chaPunt;
	}

	public void setChaPunt(int chaPunt) {
		this.chaPunt = chaPunt;
	}

	public Item getWeapon() {
		return weapon;
	}

	public void setWeapon(Item weapon) {
		this.weapon = weapon;
	}

	public Item getArmor() {
		return armor;
	}

	public void setArmor(Item armor) {
		this.armor = armor;
	}

	

	
}
