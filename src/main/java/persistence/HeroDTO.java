package persistence;

import source.HeroType;

public class HeroDTO {

	private HeroType type;
	private int tier;
	private int stunRes;
	private int moveRes;
	private int blightRes;
	private int bleedRes;
	private int diseaseRes;
	private int debufRes;
	private int deathBlow;
	private int trapDisarm;
	private int movement;
	private String critBuf;
	private boolean religious;
	private String provisions;
	
	public HeroDTO(HeroType type, int tier, int stunRes, int moveRes, int blightRes, int bleedRes,
			int diseaseRes, int debufRes, int deathBlow, int trapDisarm, int movement, String critBuf,
			boolean religious, String provisions) {
		super();
		this.type = type;
		this.tier = tier;
		this.stunRes = stunRes;
		this.moveRes = moveRes;
		this.blightRes = blightRes;
		this.bleedRes = bleedRes;
		this.diseaseRes = diseaseRes;
		this.debufRes = debufRes;
		this.deathBlow = deathBlow;
		this.trapDisarm = trapDisarm;
		this.movement = movement;
		this.critBuf = critBuf;
		this.religious = religious;
		this.provisions = provisions;
	}

	public HeroType getType() {
		return type;
	}

	public int getTier() {
		return tier;
	}

	public int getStunRes() {
		return stunRes;
	}

	public int getMoveRes() {
		return moveRes;
	}

	public int getBlightRes() {
		return blightRes;
	}

	public int getBleedRes() {
		return bleedRes;
	}

	public int getDiseaseRes() {
		return diseaseRes;
	}

	public int getDebufRes() {
		return debufRes;
	}

	public int getDeathBlow() {
		return deathBlow;
	}

	public int getTrapDisarm() {
		return trapDisarm;
	}

	public int getMovement() {
		return movement;
	}

	public String getCritBuf() {
		return critBuf;
	}

	public boolean isReligious() {
		return religious;
	}

	public String getProvisions() {
		return provisions;
	}
	
}

