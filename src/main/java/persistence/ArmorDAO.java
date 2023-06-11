package persistence;

import java.util.List;

import source.WeaponType;

public interface ArmorDAO {

	public void startArmorBD();
	public ArmorDTO getInfoArmor(WeaponType type, int tier);
	public List<ArmorDTO> getInfoArmorList();
	
}
