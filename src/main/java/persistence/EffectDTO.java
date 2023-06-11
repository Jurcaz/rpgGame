package persistence;

import source.EffectType;
import source.HeroType;

public class EffectDTO {

	private EffectType skillName;
	private HeroType heroType;
	private boolean rank[] = new boolean[4];
	private boolean target[] = new boolean[4];
	private boolean allObjetives;
	private String effect;
	private String self;
	
	public EffectDTO(EffectType skillName, HeroType heroType, boolean[] rank, boolean[] target, boolean allObjetives,
			String effect, String self) {
		super();
		this.skillName = skillName;
		this.heroType = heroType;
		this.rank = rank;
		this.target = target;
		this.allObjetives = allObjetives;
		this.effect = effect;
		this.self = self;
	}

	public EffectType getSkillName() {
		return skillName;
	}

	public HeroType getHeroType() {
		return heroType;
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

	public String getEffect() {
		return effect;
	}

	public String getSelf() {
		return self;
	}
	
}
