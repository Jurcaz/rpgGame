package creatures;

import items.Claw;
import source.Creature;

public class Zombie extends Creature {

	public Zombie() {
		super(20, 14, 8, 16, 4, 8, 4, new Claw(), null);
	}

}
