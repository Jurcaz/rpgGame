package items;

import source.DamageDice;
import source.Item;
import source.StatUsed;

public class LongBow extends Item {

	public LongBow() {
		super(false, 0, StatUsed.DEX, DamageDice.D8);
	}	
	
}
