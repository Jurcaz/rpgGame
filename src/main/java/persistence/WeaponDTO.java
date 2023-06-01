package persistence;

import source.WeaponType;

public class WeaponDTO {
	
	protected WeaponType type;
	protected int tier;
	protected String name;
	protected int damageMin;
	protected int damageMax;
	protected double critMod;
	protected int speedMod;	

	public WeaponDTO(WeaponType type, int tier, String name, int damageMin, int damageMax, double critMod, int speedMod) {
		super();
		this.type = type;
		this.tier = tier;
		this.name = name;
		this.damageMin = damageMin;
		this.damageMax = damageMax;
		this.critMod = critMod;
		this.speedMod = speedMod;
	}

	public WeaponType getType() {
		return type;
	}

	public void setType(WeaponType type) {
		this.type = type;
	}

	public int getTier() {
		return tier;
	}

	public void setTier(int tier) {
		this.tier = tier;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
