package persistence;

import java.util.List;

public interface DamageDAO {

	void startDamageBD();
	DamageDTO getInfoDamage(String name);
	List<DamageDTO> getInfoDamageList();

}
