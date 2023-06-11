package source;

public class Heal implements Ability {

	private HealType skillName;
	private HeroType heroType;
	private boolean rank[] = new boolean[4];
	private boolean target[] = new boolean[4];
	private boolean allObjetives;
	private int healMin;
	private int healMax;
	
	private String effet;
	private String self;
	
	public Heal(HealType skillName, HeroType heroType, boolean[] rank, boolean[] target, boolean allObjetives, int healMin, int healMax, String effet, String self) {
		super();
		this.skillName = skillName;
		this.heroType = heroType;
		this.rank = rank;
		this.target = target;
		this.allObjetives = allObjetives;
		this.healMin = healMin;
		this.healMax = healMax;
		this.effet = effet;
		this.self = self;
	}

	public HealType getSkillName() {
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

	public int getHealMin() {
		return healMin;
	}

	public int getHealMax() {
		return healMax;
	}

	public String getEffet() {
		return effet;
	}

	public String getSelf() {
		return self;
	}
	
}
