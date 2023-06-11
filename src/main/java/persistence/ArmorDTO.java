package persistence;

import source.ArmorType;

public class ArmorDTO {
	
	private ArmorType type;
	private int tier;
	private String name;
	private int dodge;
	private int hp;
	
	public ArmorDTO(ArmorType type, int tier, String name, int dodge, int hp) {
		super();
		this.type = type;
		this.tier = tier;
		this.name = name;
		this.dodge = dodge;
		this.hp = hp;
	}

	public ArmorType getType() {
		return type;
	}

	public int getTier() {
		return tier;
	}

	public String getName() {
		return name;
	}

	public int getDodge() {
		return dodge;
	}

	public int getHp() {
		return hp;
	}
	
}
