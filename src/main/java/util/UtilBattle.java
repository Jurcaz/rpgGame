package util;

import source.Creature;
import source.Hero;

public class UtilBattle {
	
	//dados para rolar
	public static int dCien() {						
		return (int) (Math.random()*100+1); 
	}
	public static int dVeinte() {
		return (int) (Math.random()*20)+1;
	}
	public static int dDoce() {
		return (int) (Math.random()*12)+1;
	}
	public static int dDiez() {
		return (int) (Math.random()*10)+1;
	}
	public static int dOcho() {
		return (int) (Math.random()*8)+1;
	}
	public static int dSeis() {
		return (int) (Math.random()*6)+1;
	}
	public static int dCuatro() {
		return (int) (Math.random()*4)+1;
	}
	public static int randomTarget(int aux) {
		return (int) (Math.random()*aux)+1;
	}
	public static int damageCalc(int min, int max) {
		return min + (int)(Math.random() * ((max - min) + 1));
	}
	
	public static void rollIniciative(int x, Creature c) {
		switch (x) {
		case -1:
			c.setInitiative(((Math.min(dOcho(), dOcho()))+c.getSpeed())*(0.1 * dDiez()));
			break;
		case 0:
			c.setInitiative((UtilBattle.dOcho()+c.getSpeed())*(0.1 * UtilBattle.dDiez()));
			break;
		case 1:
			c.setInitiative(((Math.max(dOcho(), dOcho()))+c.getSpeed())*(0.1 * dDiez()));
			break;
		}
	}
	
	public static void modHp(Creature c, int x) {
		if(c.getActualHp() + x <= 0) {
			c.setActualHp(0);
		} else if(c.getActualHp() + x >= c.getMaxHp()) {
			c.setActualHp(c.getMaxHp());
		} else {
			c.setActualHp(c.getActualHp() + x);
		}
	}
	
}
