package util;

import java.util.ArrayList;
import java.util.List;

import creatures.*;
import items.*;
import persistence.*;
import source.*;

public class Catalogue {

	private static Catalogue instance;
	
	private Catalogue() {
		
	}
	
	public static Catalogue getInstance() {
		if(instance==null) instance = new Catalogue();
		return instance;
	}
	
	//-------------------------------Starter-------------------------------//
	
	public void instanceCatalog() {
		instanceWeapon();
		instanceArmor();
		instanceDamage();
		instanceHeal();
		instanceEffect();
		instanceHero();
	}
	
	//-------------------------------Weapons-------------------------------//

	private List<Weapon> weaponList = new ArrayList<Weapon>();
	
	private void instanceWeapon() {
		WeaponCSVImpl.getInstance().startWeaponBD();
		
		for (WeaponDTO w : WeaponCSVImpl.getInstance().getInfoWeaponList()) {
			switch (w.getType()) {
				case GREATSWORD: 
					weaponList.add(new GreatSword(w.getName(), w.getTier(), w.getDamageMin(), w.getDamageMax(), w.getCritMod(), w.getSpeedMod()));	
					break;
				case PISTOLANDBLADE:
					weaponList.add(new PistolAndBlade(w.getName(), w.getTier(), w.getDamageMin(), w.getDamageMax(), w.getCritMod(), w.getSpeedMod()));
					break;
				case MACE:
					weaponList.add(new Mace(w.getName(), w.getTier(), w.getDamageMin(), w.getDamageMax(), w.getCritMod(), w.getSpeedMod()));
					break;
			}
		}
	}
	
	public Weapon getWeapon(WeaponType type, int tier) {
		for (Weapon w : weaponList) {
			if(w.getClass().getSimpleName().toUpperCase().equals(type.toString()) && w.getTier() == tier) return w;
		}
		return null;
	}
	
	public List<Weapon> getWeaponList(){
		return weaponList;
	}
	
	//-------------------------------Armors--------------------------------//
	
	private List<Armor> armorList = new ArrayList<Armor>();
	
	private void instanceArmor() {
		ArmorCSVImpl.getInstance().startArmorBD();
		
		for (ArmorDTO a : ArmorCSVImpl.getInstance().getInfoArmorList()) {
			switch (a.getType()) {
			case CHAINANDPLATE:
				armorList.add(new ChainAndPlate(a.getName(), a.getTier(), a.getDodge(), a.getHp()));
				break;
			case BANDITSOVERCOAT:
				armorList.add(new BanditsOvercoat(a.getName(), a.getTier(), a.getDodge(), a.getHp()));
				break;
			case SILKANDPLATE:
				armorList.add(new SilkAndPlate(a.getName(), a.getTier(), a.getDodge(), a.getHp()));
				break;	
			}
		}
	}
	
	public Armor getArmor(ArmorType type, int tier) {
		for (Armor a : armorList) {
			if(a.getClass().getSimpleName().toUpperCase().equals(type.toString()) && a.getTier() == tier) return a;
		}
		return null;
	}
	
	public List<Armor> getArmorList(){
		return armorList;
	}
	
	//------------------------------Characters-----------------------------//
	
	private List<Hero> heroList = new ArrayList<Hero>();
		
	private void instanceHero() {
		HeroCVSImpl.getInstance().startHeroBD();
		
		for (HeroDTO h : HeroCVSImpl.getInstance().getListInfoHero()) {
			switch (h.getType()) {
			case CRUSADER:
				heroList.add(new Crusader(h.getTier(), h.getStunRes(), h.getMoveRes(), h.getBlightRes(), h.getBleedRes(), h.getDiseaseRes(), h.getDebufRes(), h.getDeathBlow(), h.getTrapDisarm(), h.getMovement(), h.getCritBuf(), h.isReligious(), h.getProvisions(), getWeapon(WeaponType.GREATSWORD, 1), getArmor(ArmorType.CHAINANDPLATE, 1), null));
						break;
			case HIGHWAYMAN:
				heroList.add(new Highwayman(h.getTier(), h.getStunRes(), h.getMoveRes(), h.getBlightRes(), h.getBleedRes(), h.getDiseaseRes(), h.getDebufRes(), h.getDeathBlow(), h.getTrapDisarm(), h.getMovement(), h.getCritBuf(), h.isReligious(), h.getProvisions(), getWeapon(WeaponType.PISTOLANDBLADE, 1), getArmor(ArmorType.BANDITSOVERCOAT, 1), null));
				break;
			case VESTAL:
				heroList.add(new Vestal(h.getTier(), h.getStunRes(), h.getMoveRes(), h.getBlightRes(), h.getBleedRes(), h.getDiseaseRes(), h.getDebufRes(), h.getDeathBlow(), h.getTrapDisarm(), h.getMovement(), h.getCritBuf(), h.isReligious(), h.getProvisions(), getWeapon(WeaponType.MACE, 1), getArmor(ArmorType.SILKANDPLATE, 1), null));
				break;
				}
		}
	}
	
	public Hero getHero(HeroType type, int tier) {
		for (Hero h : heroList) {
			if(h.getClass().getSimpleName().toUpperCase().equals(type.toString()) && h.getTier() == tier) return h;
		}
		return null;
	}
	
	public List<Hero> getHeroList(){
		return heroList;
	}
	
	//--------------------------------Damage-------------------------------//
	
	private List<Damage> damageList = new ArrayList<Damage>();
	
	private void instanceDamage() {
		DamageCSVImpl.getInstance().startDamageBD();
		
		for (DamageDTO d : DamageCSVImpl.getInstance().getInfoDamageList()) {
			damageList.add(new Damage(d.getSkillName(), d.getHeroType(), d.getRange(), d.getRank(), d.getTarget(), d.isAllObjetives(), d.getDamageMod(), d.getAccuracy(), d.getCritMod(), d.getEffect(), d.getSelf()));
		}
	}
	
	public Damage getDamage(DamageType skillName) {
		for (Damage d : damageList) {
			if(d.getSkillName().equals(skillName)) return d;
		}
		return null;
	}
	
	public List<Damage> getDamageList(){
		return damageList;
	}
	
	//---------------------------------Heal--------------------------------//
	
	private List<Heal> healList = new ArrayList<Heal>();
	
	private void instanceHeal() {
		HealCSVImpl.getInstance().startHealDB();
		
		for (HealDTO h : HealCSVImpl.getInstance().getInfoHealList()) {
			healList.add(new Heal(h.getSkillName(), h.getHeroType(), h.getRank(), h.getTarget(), h.isAllObjetives(), h.getHealMin(), h.getHealMax(), h.getEffect(), h.getSelf()));
		}
	}
	
	public Heal getHeal(HealType skillName) {
		for (Heal h : healList) {
			if(h.getSkillName().equals(skillName)) return h;
		}
		return null;
	}
	
	public List<Heal> getHealList(){
		return healList;
	}
	
	//--------------------------------Effect-------------------------------//
	
	private List<Effect> effectList = new ArrayList<Effect>();
	
	private void instanceEffect() {
		EffectCSVImpl.getInstance().startEffectDB();
		
		for (EffectDTO e : EffectCSVImpl.getInstance().getInfoEffectList()) {
			effectList.add(new Effect(e.getSkillName(), e.getHeroType(), e.getRank(), e.getTarget(), e.isAllObjetives(), e.getEffect(), e.getSelf()));
		}
	}

	public Effect getEffect(EffectType skillName) {
		for (Effect e : effectList) {
			if(e.getSkillName().equals(skillName)) return e;
		}
		return null;
	}
	
	public List<Effect> getEffeList(){
		return effectList;
	}
	
}