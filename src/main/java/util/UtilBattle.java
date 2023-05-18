package util;

import source.Creature;

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
	public static int randomTarget() {
		return (int) (Math.random()*3);
	}
	
	//calcula el bonificador de una abilidad
	public static int obtenBon(int pBase) {
		switch(pBase) {
			case 1:
				return -5;
			case 2:
				return -4;
			case 3:
				return -4;
			case 4:
				return -3;
			case 5:
				return -3;
			case 6:
				return -2;
			case 7:
				return -2;
			case 8:
				return -1;
			case 9:
				return -1;
			case 10:
				return 0;
			case 11:
				return 0;
			case 12:
				return +1;
			case 13:
				return +1;
			case 14:
				return +2;
			case 15:
				return +2;
			case 16:
				return +3;
			case 17:
				return +3;
			case 18:
				return +4;
			case 19:
				return +4;
			case 20:
				return +5;
			case 21:
				return +5;
			case 22:
				return +6;
			case 23:
				return +6;
			case 24:
				return +7;
			case 25:
				return +7;
			case 26:
				return +8;
			case 27:
				return +8;
			case 28:
				return +9;
			case 29:
				return +9;
			case 30:
				return +10;
			default: return 0;
		} 
	}
	
	public static void attackCreature(Creature c1, Creature c2) {
		if(c1.hit() >= c2.getArmor().getAc()) c2.setActualHp(c1.attack());
	}
}
