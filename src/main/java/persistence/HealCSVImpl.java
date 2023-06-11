package persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import source.HealType;
import source.HeroType;

public class HealCSVImpl implements HealDAO{

	private static HealCSVImpl instance;
	
	public HealCSVImpl() {
	
	}
	
	public static HealCSVImpl getInstance() {
		if(instance == null) instance = new HealCSVImpl();
		return instance;
	}
	

	private static ArrayList<HealDTO> infoHealList = new ArrayList<HealDTO>();
	private final static String FILE_PATH = "src\\main\\resources\\data\\ability\\heal\\heal.csv";
	
	public void startHealDB() {
		
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
				boolean[] auxRank = {Boolean.parseBoolean(aux[2]),Boolean.parseBoolean(aux[3]),Boolean.parseBoolean(aux[4]),Boolean.parseBoolean(aux[5])};
				boolean[] auxTarget = {Boolean.parseBoolean(aux[6]),Boolean.parseBoolean(aux[7]),Boolean.parseBoolean(aux[8]),Boolean.parseBoolean(aux[9])};
				HealDTO auxHeal = new HealDTO(HealType.valueOf(aux[0].toUpperCase()), HeroType.valueOf(aux[1].toUpperCase()), auxRank, auxTarget, Boolean.parseBoolean(aux[10]), Integer.parseInt(aux[11]), Integer.parseInt(aux[12]), aux[13], aux[14]);
				infoHealList.add(auxHeal);
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

	public HealDTO getInfoHeal(String skillName) {
		for (HealDTO h : infoHealList) {
			if(h.getSkillName().equals(skillName)) return h;
		}
		return null;
	}

	public List<HealDTO> getInfoHealList() {
		return infoHealList;
	}

}
