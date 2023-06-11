package source;

public abstract class Armor {

	private String name;
	private int tier;
	private int dodge;
	private int hp;
	
	public Armor(String name, int tier, int dodge, int hp) {
		super();
		this.name = name;
		this.tier = tier;
		this.dodge = dodge;
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTier() {
		return tier;
	}

	public void setTier(int tier) {
		this.tier = tier;
	}

	public int getDodge() {
		return dodge;
	}

	public void setDodge(int dodge) {
		this.dodge = dodge;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
}
