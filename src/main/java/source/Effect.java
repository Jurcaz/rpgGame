package source;

public class Effect implements Ability {

	private EffectType skillName;
	private HeroType heroType;
	private boolean rank[] = new boolean[4];
	private boolean target[] = new boolean[4];
	private boolean allObjetives;
	
	private String effet;
	private String self;
	public Effect(EffectType skillName, HeroType heroType, boolean[] rank, boolean[] target, boolean allObjetives, String effet, String self) {
		super();
		this.skillName = skillName;
		this.heroType = heroType;
		this.rank = rank;
		this.target = target;
		this.allObjetives = allObjetives;
		this.effet = effet;
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
	
	public String getEffet() {
		return effet;
	}
	
	public String getSelf() {
		return self;
	}
	
}
