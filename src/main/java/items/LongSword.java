package items;

import source.DamageDice;
import source.Item;
import source.StatUsed;

public class LongSword extends Item {

	public LongSword() {
		super(false, 0, StatUsed.STR, DamageDice.D8);
	}
	
}
