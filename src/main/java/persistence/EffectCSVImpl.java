package persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import source.EffectType;
import source.HeroType;

public class EffectCSVImpl implements EffectDAO{

	private static EffectCSVImpl instance;
	
	public EffectCSVImpl() {
	
	}
	
	public static EffectCSVImpl getInstance() {
		if(instance == null) instance = new EffectCSVImpl();
		return instance;
	}
	
	private static ArrayList<EffectDTO> infoEffectList = new ArrayList<EffectDTO>();
	private final static String FILE_PATH = "src\\main\\resources\\data\\ability\\effect\\effect.csv";
	
	public void startEffectDB() {

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
				EffectDTO auxEffect = new EffectDTO(EffectType.valueOf(aux[0].toUpperCase()), HeroType.valueOf(aux[1].toUpperCase()), auxRank, auxTarget, Boolean.parseBoolean(aux[10]), aux[11], aux[12]);
				infoEffectList.add(auxEffect);
				
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

	public EffectDTO getInfoEffect(String skillName) {
		for (EffectDTO e : infoEffectList) {
			if(e.getSkillName().equals(skillName)) return e;
		}
		return null;
	}

	public List<EffectDTO> getInfoEffectList() {
		return infoEffectList;
	}

}
