package persistence;

import java.util.List;

public interface HealDAO {

	void startHealDB();
	HealDTO getInfoHeal(String skillName);
	List<HealDTO> getInfoHealList();
	
}
