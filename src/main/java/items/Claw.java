package items;

import source.DamageDice;
import source.Item;
import source.StatUsed;

public class Claw extends Item {

	public Claw() {
		super(false, 0, StatUsed.STR, DamageDice.D6);
	}
}
