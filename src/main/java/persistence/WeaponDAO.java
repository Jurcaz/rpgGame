package persistence;

import java.util.List;

import source.WeaponType;

public interface WeaponDAO {

	public void startWeaponBD();
	public WeaponDTO getInfoWeapon(WeaponType type, int tier);
	public List<WeaponDTO> getInfoWeaponList();

}
