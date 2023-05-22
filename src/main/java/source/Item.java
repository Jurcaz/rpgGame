
package source;

import util.UtilBattle;

public abstract class Item {

	private int itemId;
	
	private boolean heal;
	private int ac;
	
	private StatUsed sUsed;
	private DamageDice dDice;
	
	public Item() {
		
	}

	public Item(boolean heal, int acP, StatUsed sUsed, DamageDice dDice) {
		super();
		this.heal = heal;
		this.ac = acP;
		this.sUsed = sUsed;
		this.dDice = dDice;
	}

	public int getItemId() {
		return itemId;
	}

	public boolean isHeal() {
		return heal;
	}

	public int getAc() {
		return ac;
	}

	public StatUsed getsUsed() {
		return sUsed;
	}

	public DamageDice getdDice() {
		return dDice;
	}
	
	public int rollDice() {
		switch (this.dDice) {
		case D4:
			return UtilBattle.dCuatro();
		case D6:
			return UtilBattle.dSeis();
		case D8:
			return UtilBattle.dOcho();
		case D10:
			return UtilBattle.dDiez();
		case D12:
			return UtilBattle.dDoce();
		case D20:
			return UtilBattle.dVeinte();
		}
		return 0;
	}
	
}
