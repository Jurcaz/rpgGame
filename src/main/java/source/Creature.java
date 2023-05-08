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
	
	public void setIniciative(double iniP) {
		this.iniciative = iniP;
	}
	
	public double getIniciative() {
		return this.iniciative;
	}
	
	public void rollIniciative() {
		this.iniciative = UtilBattle.dVeinte()+UtilBattle.obtenBon(this.dexPunt)+(UtilBattle.obtenBon(this.dexPunt)*0.1)+(UtilBattle.dDiez()*0.01);
	}
	
}
