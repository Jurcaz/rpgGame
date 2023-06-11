package persistence;

import java.util.List;
import source.HeroType;

public interface HeroDAO {

	public void startHeroBD();
	public HeroDTO getInfoHero(HeroType type, int tier);
	public List<HeroDTO> getListInfoHero();
	
}
