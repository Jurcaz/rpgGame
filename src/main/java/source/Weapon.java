package source;

public abstract class Weapon {
	
	protected String name;
	protected int tier;
	protected int damageMin;
	protected int damageMax;
	protected double critMod;
	protected int speedMod;	

	public Weapon(String name, int tier, int damageMin, int damageMax, double critMod, int speedMod) {
		super();
		this.name = name;
		this.tier = tier;
		this.damageMin = damageMin;
		this.damageMax = damageMax;
		this.critMod = critMod;
		this.speedMod = speedMod;
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

	public int getDamageMin() {
		return damageMin;
	}

	public void setDamageMin(int damageMin) {
		this.damageMin = damageMin;
	}

	public int getDamageMax() {
		return damageMax;
	}

	public void setDamageMax(int damageMax) {
		this.damageMax = damageMax;
	}

	public double getCritMod() {
		return critMod;
	}

	public void setCritMod(double critMod) {
		this.critMod = critMod;
	}

	public int getSpeedMod() {
		return speedMod;
	}

	public void setSpeedMod(int speedMod) {
		this.speedMod = speedMod;
	}

}
