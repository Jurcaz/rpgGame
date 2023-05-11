package source;

public class TeamCreatures {
	
	private Creature[] creatures = {null,null,null};
	
	public TeamCreatures(Creature c1, Creature c2, Creature c3) {
		creatures[0] = c1;
		creatures[1] = c2;
		creatures[2] = c3;
	}

	public Creature getPos1() {
		return creatures[0];
	}
	
	public Creature getPos2() {
		return creatures[1];
	}
	
	public Creature getPos3() {
		return creatures[2];
	}
	
	public Creature[] getList(){
		return creatures;
	}
}
