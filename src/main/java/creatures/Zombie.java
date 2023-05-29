package creatures;

import items.Claw;
import items.HeavyArmor;
import items.LightArmor;
import source.Creature;

public class Zombie extends Creature {

	public Zombie() {
		super(4,20, 14, 8, 16, 4, 8, 4, new Claw(), new LightArmor(),"src\\main\\resources\\creatures\\skeleton.png", false);
	}

}
