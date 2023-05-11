package creatures;

import items.HeavyArmor;
import items.LongSword;
import source.Creature;

public class Fighter extends Creature {

	public Fighter() {
		super(50,16,12,16,10,12,12,new LongSword(), new HeavyArmor(), "C:\\Users\\jmdin\\eclipse-workspace\\rpgGame\\src\\main\\resources\\icons\\wizard-staff.png", true);
	}

}
