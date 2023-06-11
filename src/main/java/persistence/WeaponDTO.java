package persistence;

import source.WeaponType;

public class WeaponDTO {
	
	private WeaponType type;
	private int tier;
	private String name;
	private int damageMin;
	private int damageMax;
	private int critMod;
	private int speedMod;	

	public WeaponDTO(WeaponType type, int tier, String name, int damageMin, int damageMax, int critMod, int speedMod) {
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

	public int getTier() {
		return tier;
	}
	
	public String getName() {
		return name;
	}

	public int getDamageMin() {
		return damageMin;
	}

	public int getDamageMax() {
		return damageMax;
	}

	public int getCritMod() {
		return critMod;
	}

	public int getSpeedMod() {
		return speedMod;
	}

}
