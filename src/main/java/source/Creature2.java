package source;

import javax.swing.JButton;
import javax.swing.JPanel;

import util.UtilBattle;

public class Creature2 {

	private int maxHp;
	private int actualHp;
	
	private double iniciative;
	
	private int dodge;			//armor
	private int protec;			//armor
	
	private int speed;			//weapon
	
	private int accuracyMod;
	
	private int critMod;		//weapon
	private int damageMin;		//weapon
	private int damageMax;		//weapon
	
	private Item weapon;
	private Item armor;
	
	protected String sprite;
	
	private boolean pj;
	
	private JButton bttn;
	private JPanel panel;
	
	public int getMaxHp() {
		return maxHp;
	}
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}
	public int getActualHp() {
		return actualHp;
	}
	public void setActualHp(int actualHp) {
		this.actualHp = actualHp;
	}
	public double getIniciative() {
		return iniciative;
	}
	public void setIniciative(double iniciative) {
		this.iniciative = iniciative;
	}
	public int getDodge() {
		return dodge;
	}
	public void setDodge(int dodge) {
		this.dodge = dodge;
	}
	public int getProtec() {
		return protec;
	}
	public void setProtec(int protec) {
		this.protec = protec;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getAccuracyMod() {
		return accuracyMod;
	}
	public void setAccuracyMod(int accuracyMod) {
		this.accuracyMod = accuracyMod;
	}
	public int getCritMod() {
		return critMod;
	}
	public void setCritMod(int critMod) {
		this.critMod = critMod;
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
	public Item getWeapon() {
		return weapon;
	}
	public void setWeapon(Item weapon) {
		this.weapon = weapon;
	}
	public Item getArmor() {
		return armor;
	}
	public void setArmor(Item armor) {
		this.armor = armor;
	}
	public String getSprite() {
		return sprite;
	}
	public void setSprite(String sprite) {
		this.sprite = sprite;
	}
	public boolean isPj() {
		return pj;
	}
	public void setPj(boolean pj) {
		this.pj = pj;
	}
	public JButton getBttn() {
		return bttn;
	}
	public void setBttn(JButton bttn) {
		this.bttn = bttn;
	}
	public JPanel getPanel() {
		return panel;
	}
	public void setPanel(JPanel panel) {
		this.panel = panel;
	}
	
}
