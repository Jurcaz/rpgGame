package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import creatures.Cleric;
import creatures.Fighter;
import creatures.Ranger;
import source.Creature;
import util.IniciativeComparator;

public class Main {

	public static void main(String[] args) {
		
		Fighter f1 = new Fighter();
		Ranger r1 = new Ranger();
		Cleric c1 = new Cleric();
		
		f1.rollIniciative();
		r1.rollIniciative();
		c1.rollIniciative();
		
//		System.out.println(f1.getIniciative() + " " + r1.getIniciative() + " " + c1.getIniciative());
		
		ArrayList<Creature> iniciativeList = new ArrayList<Creature>();   
		
		iniciativeList.add(f1);
		iniciativeList.add(r1);
		iniciativeList.add(c1);
		
		iniciativeList.sort(new IniciativeComparator());
		
		for (Creature c : iniciativeList) {
			System.out.println(c.getIniciative());
		}
		
		
		
	}

}
