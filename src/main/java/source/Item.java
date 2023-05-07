package source;

public abstract class Item {

	int itemId;
	
	DamageDice dDice;
	
	public Item(DamageDice pD) {
		dDice = pD;
	}
	
}
