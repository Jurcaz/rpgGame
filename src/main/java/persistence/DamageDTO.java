package persistence;

import source.DamageType;
import source.HeroType;
import source.Range;

public class DamageDTO {

	private DamageType skillName;
	private HeroType heroType;
	private Range range;
	private boolean rank[] = new boolean[4];
	private boolean target[] = new boolean[4];
	private boolean allObjetives;
	private int damageMod;
	private int accuracy;
	private int critMod;
	
	private String effect;
	private String self;
	
	public DamageDTO(DamageType skillName, HeroType heroType, Range range, boolean[] rank, boolean[] target, boolean allObjetives, int damageMod, int accuracy, int critMod, String effect, String self) {
		super();
		this.skillName = skillName;
		this.heroType = heroType;
		this.range = range;
		this.rank = rank;
		this.target = target;
		this.allObjetives = allObjetives;
		this.damageMod = damageMod;
		this.accuracy = accuracy;
		this.critMod = critMod;
		this.effect = effect;
		this.self = self;
	}

	public DamageType getSkillName() {
		return skillName;
	}

	public HeroType getHeroType() {
		return heroType;
	}

	public Range getRange() {
		return range;
	}

	public boolean[] getRank() {
		return rank;
	}

	public boolean[] getTarget() {
		return target;
	}

	public boolean isAllObjetives() {
		return allObjetives;
	}

	public int getDamageMod() {
		return damageMod;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public int getCritMod() {
		return critMod;
	}

	public String getEffect() {
		return effect;
	}

	public String getSelf() {
		return self;
	}
}
