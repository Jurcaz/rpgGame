package creatures;

import items.HeavyArmor;
import items.LongSword;
import source.Creature;

public class Fighter extends Creature {

	public Fighter() {
		super(1,50,16,12,16,10,12,12,new LongSword(), new HeavyArmor(), "src\\main\\resources\\creatures\\crusader.png", true);
	}

}
