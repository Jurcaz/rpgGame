package persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import source.HeroType;

public class HeroCVSImpl implements HeroDAO {

	private static HeroCVSImpl instance;
	
	private HeroCVSImpl() {
		
	}
	
	private static ArrayList<HeroDTO> infoHeroList = new ArrayList<HeroDTO>();
	private final static String FILE_PATH = "src\\main\\resources\\data\\character\\character.csv";
	
	public static HeroCVSImpl getInstance() {
		if(instance==null) instance = new HeroCVSImpl();
		return instance;
	}
	
	public void startHeroBD() {
		
		File file = null;
		FileReader fr = null;
		BufferedReader br = null;

		String[] aux = null; 
		
		try {
			
			file = new File(FILE_PATH);
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String linea;
			linea=br.readLine();
			
			while ((linea=br.readLine())!=null) {

				aux = linea.split(";");
				HeroDTO auxCharacter = new HeroDTO(HeroType.valueOf(aux[0].toUpperCase()), Integer.parseInt(aux[1]), Integer.parseInt(aux[2]), Integer.parseInt(aux[3]), Integer.parseInt(aux[4]), Integer.parseInt(aux[5]), Integer.parseInt(aux[6]), Integer.parseInt(aux[7]), Integer.parseInt(aux[8]), Integer.parseInt(aux[9]), Integer.parseInt(aux[10]), aux[11], Boolean.parseBoolean(aux[12]), aux[13]);
				infoHeroList.add(auxCharacter);
				
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	public HeroDTO getInfoHero(HeroType type, int tier) {
		for (HeroDTO c : infoHeroList) {
			if(c.getType().equals(type) && c.getTier() == tier) return c;
		}
		return null;
	}

	public List<HeroDTO> getListInfoHero() {
		return infoHeroList;
	}

}
