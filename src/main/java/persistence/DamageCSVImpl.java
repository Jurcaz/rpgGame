package persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import source.DamageType;
import source.HeroType;
import source.Range;

public class DamageCSVImpl implements DamageDAO{

	private static DamageCSVImpl instance;
	
	private DamageCSVImpl() {
		
	}
	
	public static DamageCSVImpl getInstance() {
		if(instance==null) instance = new DamageCSVImpl();
		return instance;
	}
	
	private static ArrayList<DamageDTO> infoDamageList = new ArrayList<DamageDTO>();
	private final static String FILE_PATH = "src\\main\\resources\\data\\ability\\damage\\damage.csv";
	
	public void startDamageBD() {

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
				boolean[] auxRank = {Boolean.parseBoolean(aux[3]),Boolean.parseBoolean(aux[4]),Boolean.parseBoolean(aux[5]),Boolean.parseBoolean(aux[6])};
				boolean[] auxTarget = {Boolean.parseBoolean(aux[7]),Boolean.parseBoolean(aux[8]),Boolean.parseBoolean(aux[9]),Boolean.parseBoolean(aux[10])};
				DamageDTO auxDamage = new DamageDTO(DamageType.valueOf(aux[0].toUpperCase()), HeroType.valueOf(aux[1].toUpperCase()), Range.valueOf(aux[2].toUpperCase()),  auxRank, auxTarget, Boolean.parseBoolean(aux[11]), Integer.parseInt(aux[12]), Integer.parseInt(aux[13]), Integer.parseInt(aux[14]), aux[15], aux[16]);
				infoDamageList.add(auxDamage);
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

	public DamageDTO getInfoDamage(String skillName) {
		for (DamageDTO d : infoDamageList) {
			if(d.getSkillName().equals(skillName)) return d;
		}
		return null;
	}

	public List<DamageDTO> getInfoDamageList() {
		return infoDamageList;
	}

}
