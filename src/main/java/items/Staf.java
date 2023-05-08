package items;

import source.DamageDice;
import source.Item;
import source.StatUsed;

public class Staf extends Item {

	public Staf() {
		super(true, StatUsed.SAB, DamageDice.D6);
	}
}
