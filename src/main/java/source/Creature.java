package source;

public interface Creature {

	int getMaxHp();
	int getActualHp();
	int getSpeed();
	void setActualHp(int i);
	double getInitiative();
	void setInitiative(double i);
	Ability getAblility(int i);
	boolean isAlive();
	void setAlive(boolean b);
	String cuentame();
	
}
