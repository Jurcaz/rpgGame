package creatures;

import items.LightArmor;
import items.LongBow;
import source.Creature;

public class Ranger extends Creature {
	
	public Ranger() {
		super(30, 12, 18, 14, 12, 16, 10, new LongBow(), new LightArmor(), "C:\\Users\\jmdin\\eclipse-workspace\\rpgGame\\src\\main\\resources\\icons\\wizard-staff.png", true);
	}

}
