package items;

import source.DamageDice;
import source.Item;
import source.StatUsed;

public class Staf extends Item {

	public Staf() {
		super(true, 0, StatUsed.SAB, DamageDice.D6);
	}
}
