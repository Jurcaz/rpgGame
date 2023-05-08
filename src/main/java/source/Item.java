package source;

public abstract class Item {

	int itemId;
	
	boolean heal;
	
	StatUsed sUsed;
	DamageDice dDice;
	
	public Item() {
		
	}

	public Item(boolean heal, StatUsed sUsed, DamageDice dDice) {
		super();
		this.heal = heal;
		this.sUsed = sUsed;
		this.dDice = dDice;
	}
	
}
