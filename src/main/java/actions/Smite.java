package actions;

import source.Abilities;
import source.Creature;

public class Smite implements Abilities{

	public void doAbility(Creature cAttacker, Creature... csTargeted) {
		for (Creature c : csTargeted) {
			c.setActualHp(0);
		}
	
	}

}
