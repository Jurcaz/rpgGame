package abilities;

import source.Damage;
import source.Range;

public class Smite extends Damage{

	public Smite() {
		range = Range.MELEE;
		rank[0] = true;
		rank[1] = true;
		rank[2] = false;
		rank[3] = false;
		target[0] = true;
		target[1] = true;
		target[2] = false;
		target[3] = false;
		damageMod = 0;
		accuracy = 85;
		critMod = 0;
		//effect.add(new dmgBon(15))
		
	}

}
