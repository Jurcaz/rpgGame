package creatures;

import items.MediumArmor;
import items.Staf;
import source.Creature;

public class Cleric extends Creature {

	public Cleric() {
		super(30, 14, 10, 14, 16, 18, 12, new Staf(), new MediumArmor(), "C:\\Users\\jmdin\\eclipse-workspace\\rpgGame\\src\\main\\resources\\icons\\wizard-staff.png", true);
	}
}
