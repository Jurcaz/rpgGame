package source;

import java.util.List;

public abstract class Damage implements Ability{

	protected Range range;
	protected boolean rank[] = new boolean[4];
	protected boolean target[] = new boolean[4];
	protected int damageMod;
	protected int accuracy;
	protected int critMod;
	protected List<Object> effect;
	protected List<Object> self;
	
}
