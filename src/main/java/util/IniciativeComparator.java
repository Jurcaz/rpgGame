package util;

import java.util.Comparator;

import source.Creature;

public class IniciativeComparator implements Comparator<Creature> {

	public int compare(Creature o1, Creature o2) {
		return -1 * (Double.compare(o1.getInitiative(), o2.getInitiative()));
	}

}
