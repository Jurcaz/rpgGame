package source;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

import util.UtilBattle;

public abstract class Creature {
	
	private int id;
	
	private int maxHp;
	private int actualHp;
	
	private double iniciative;
	
	private int strPunt;
	private int dexPunt;
	private int conPunt;
	private int intPunt;
	private int sabPunt;
	private int chaPunt;
	
	private Item weapon;
	private Item armor;
	
	protected String sprite;
	
	private boolean turn;
	
	private boolean pj;
	
	private JButton bttn;
	private JPanel panel;

	public Creature() {
	}

	public Creature(int id, int maxHp, int strPunt, int dexPunt, int conPunt, int intPunt,	int sabPunt, int chaPunt, Item weapon, Item armor, String sprite, boolean pj) {
		super();
		this.id = id;
		this.maxHp = maxHp;
		this.actualHp = maxHp;
		this.iniciative = 0;
		this.strPunt = strPunt;
		this.dexPunt = dexPunt;
		this.conPunt = conPunt;
		this.intPunt = intPunt;
		this.sabPunt = sabPunt;
		this.chaPunt = chaPunt;
		this.weapon = weapon;
		this.armor = armor;
		this.sprite = sprite;
		this.turn = false;
		this.pj = pj;
	}

	public void rollIniciative() {
		this.iniciative = UtilBattle.dVeinte()+UtilBattle.obtenBon(this.dexPunt)+(UtilBattle.obtenBon(this.dexPunt)*0.1)+(UtilBattle.dDiez()*0.01);
	}
	
	public int hit() {
		switch (this.weapon.getsUsed()) {
		case STR:
			return UtilBattle.dVeinte()+UtilBattle.obtenBon(strPunt);
		case DEX:
			return UtilBattle.dVeinte()+UtilBattle.obtenBon(dexPunt);
		case CON:
			return UtilBattle.dVeinte()+UtilBattle.obtenBon(conPunt);
		case INT:
			return UtilBattle.dVeinte()+UtilBattle.obtenBon(intPunt);
		case SAB:
			return UtilBattle.dVeinte()+UtilBattle.obtenBon(sabPunt);
		case CHA:
			return UtilBattle.dVeinte()+UtilBattle.obtenBon(chaPunt);
		}
		return 0;
	}
	
	public int attack() {
		switch (this.weapon.getsUsed()) {
		case STR:
			if(this.weapon.isHeal()) {
				return UtilBattle.obtenBon(strPunt)+this.weapon.rollDice();
			} else {
				return -1*(UtilBattle.obtenBon(strPunt)+this.weapon.rollDice());
			}
		case DEX:
			if(this.weapon.isHeal()) {
				return UtilBattle.obtenBon(dexPunt)+this.weapon.rollDice();
			} else {
				return -1*(UtilBattle.obtenBon(dexPunt)+this.weapon.rollDice());
			}
		case CON:
			if(this.weapon.isHeal()) {
				return UtilBattle.obtenBon(conPunt)+this.weapon.rollDice();
			} else {
				return -1*(UtilBattle.obtenBon(conPunt)+this.weapon.rollDice());
			}
		case INT:
			if(this.weapon.isHeal()) {
				return UtilBattle.obtenBon(intPunt)+this.weapon.rollDice();
			} else {
				return -1*(UtilBattle.obtenBon(intPunt)+this.weapon.rollDice());
			}
		case SAB:
			if(this.weapon.isHeal()) {
				return UtilBattle.obtenBon(sabPunt)+this.weapon.rollDice();
			} else {
				return -1*(UtilBattle.obtenBon(sabPunt)+this.weapon.rollDice());
			}
		case CHA:
			if(this.weapon.isHeal()) {
				return UtilBattle.obtenBon(chaPunt)+this.weapon.rollDice();
			} else {
				return -1*(UtilBattle.obtenBon(chaPunt)+this.weapon.rollDice());
			}
		}
		return 0;
	}
	
	public int getId() {
		return id;
	}

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
		
		if(this.actualHp + actualHp <= 0) {
			this.actualHp = 0;
		} else if(this.actualHp + actualHp >= this.maxHp) {
			this.actualHp = this.maxHp;
		} else {
			this.actualHp = this.actualHp + actualHp;
		}
	}

	public double getIniciative() {
		return iniciative;
	}

	public void setIniciative(double iniciative) {
		this.iniciative = iniciative;
	}

	public int getStrPunt() {
		return strPunt;
	}

	public void setStrPunt(int strPunt) {
		this.strPunt = strPunt;
	}

	public int getDexPunt() {
		return dexPunt;
	}

	public void setDexPunt(int dexPunt) {
		this.dexPunt = dexPunt;
	}

	public int getConPunt() {
		return conPunt;
	}

	public void setConPunt(int conPunt) {
		this.conPunt = conPunt;
	}

	public int getIntPunt() {
		return intPunt;
	}

	public void setIntPunt(int intPunt) {
		this.intPunt = intPunt;
	}

	public int getSabPunt() {
		return sabPunt;
	}

	public void setSabPunt(int sabPunt) {
		this.sabPunt = sabPunt;
	}

	public int getChaPunt() {
		return chaPunt;
	}

	public void setChaPunt(int chaPunt) {
		this.chaPunt = chaPunt;
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
	
	public boolean isTurn() {
		return turn;
	}

	public void setTurn(boolean turn) {
		this.turn = turn;
	}
	
	public String getSprite() {
		return this.sprite;
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
	
	public boolean alive() {
		if(this.actualHp > 0) return true;
		return false;
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

	public void markButton() {
		this.bttn.setBackground(new Color(255, 0, 0));
	}
	
	public void unmarkButton() {
		this.bttn.setBackground(null);
	}
	
	public void updateHpBar() {
		this.panel.setBounds(this.panel.getX(), this.panel.getY(), (this.actualHp * 90) / this.maxHp, this.panel.getHeight());
	}
	
	public int compareTo(Creature o) {
		if (this.iniciative > o.iniciative) {
			return -1;
		} else if (this.iniciative < o.iniciative) {
			return 1;
		}
		return 0;
	}
	
}
