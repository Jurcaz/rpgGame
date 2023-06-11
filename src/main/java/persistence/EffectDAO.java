package persistence;

import java.util.List;

public interface EffectDAO {

	void startEffectDB();
	EffectDTO getInfoEffect(String skillName);
	List<EffectDTO> getInfoEffectList();
	
}
