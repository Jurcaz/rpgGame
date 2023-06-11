package source;

public class TeamCreatures {
	
	private Hero[] hero = {null,null,null};
	
	public TeamCreatures(Hero c1, Hero c2, Hero c3) {
		hero[0] = c1;
		hero[1] = c2;
		hero[2] = c3;
	}

	public Hero getPos1() {
		return hero[0];
	}
	
	public Hero getPos2() {
		return hero[1];
	}
	
	public Hero getPos3() {
		return hero[2];
	}
	
	public Hero[] getList(){
		return hero;
	}
}
